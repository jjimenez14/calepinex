package bdd;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.metier.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class bdd {

    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/calpinexDB";
    private static final String DB_USERNAME = "test";
    private static final String DB_PASSWORD = "test";
    private Connection connection;
    private Statement stmt;
    
    //METHODE DE CONNEXION
    public bdd() {
        openConnection();
    }

    public void openConnection() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            stmt = connection.createStatement();
            
            stmt.execute(script_sql.CREATE_AFFAIRE);
            stmt.execute(script_sql.CREATE_REGARD);
            stmt.execute(script_sql.CREATE_ELEMENTS);
            stmt.execute(script_sql.CREATE_ELEM_REGARD);
            stmt.execute(script_sql.CREATE_JOINT);
            stmt.execute(script_sql.CREATE_TARIF);
            
            if(tabElemVide()){
            stmt.execute(script_sql.INSERT_DONNEES);
            }

        } catch (Exception ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public double getPrixJoint(String typeJoint) {
        double prixJoint = 0;

        try {
            String sql = "SELECT prixJoint FROM JOINT WHERE typeJoint = '" + typeJoint + "'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                prixJoint = rs.getDouble("prixJoint");
            }
            return prixJoint;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prixJoint;
    }
       
           public void updateJoint(double prixJoint, String typeJoint) {
        try {
            String sql = "UPDATE JOINT set prixJoint = '" + prixJoint + "' where typeJoint =  '" + typeJoint + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
    public void addTarif(Tarif unTarif) {
        try {
            String sql = "INSERT INTO TARIF (codeRegard, codeAffaire) VALUES "
                    + "('" + unTarif.getCodeRegard() + "','" + unTarif.getCodeAffaire() + "')";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTarif(Tarif unTarif) {
        try {
            String sql = "UPDATE TARIF set margeRegard = '" + unTarif.getMargeRegard() + "' , margeButyl = '"
                    + unTarif.getMargeButyl() + "' , margeForsheda = '" + unTarif.getMargeForsheda() + "' , prixTotal = '" + unTarif.getPrixTotal() + "'"
                    + "WHERE codeRegard = '" + unTarif.getCodeRegard() + "' AND codeAffaire ='" + unTarif.getCodeAffaire() + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateAllTarifs(Tarif unTarif) {
        ArrayList<Regard1> lesRegards = getAllRegardsAffaire(unTarif.getCodeAffaire());
        for (int i = 0; i < lesRegards.size(); i++) {

            double regard = ((Math.round((getPrixRegard(lesRegards.get(i).getCodeRegard(), unTarif.getCodeAffaire()) + ((getPrixRegard(lesRegards.get(i).getCodeRegard(), unTarif.getCodeAffaire()) * unTarif.getMargeRegard()) / 100)) * 100.0)/100.0));
            double butyl = ((Math.round((lesRegards.get(i).getNbButyl() * getPrixJoint("Butyl") + ((lesRegards.get(i).getNbButyl() * getPrixJoint("Butyl") * unTarif.getMargeButyl()) / 100)) * 100.0)/100.0));
            double forsheda = ((Math.round((lesRegards.get(i).getNbForsheda() * getPrixJoint("Forsheda") + ((lesRegards.get(i).getNbForsheda() * getPrixJoint("Forsheda") * unTarif.getMargeForsheda()) / 100)) * 100.0)/100.0));
            double total = ((Math.round((regard + butyl + forsheda) * 100.0) / 100.0));

            try {
                String sql = "UPDATE TARIF set margeRegard = '" + unTarif.getMargeRegard() + "' , margeButyl = '"
                        + unTarif.getMargeButyl() + "' , margeForsheda = '" + unTarif.getMargeForsheda() + "' , prixTotal = '" + total + "'"
                        + "WHERE codeAffaire ='" + unTarif.getCodeAffaire() + "' AND codeRegard ='" + lesRegards.get(i).getCodeRegard() +"'";
                stmt.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean tabElemVide() {
        boolean vide = true;
        int nbElem = 0;
        try {
            String sql = "SELECT COUNT(*) FROM ELEMENT";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                nbElem = rs.getInt("COUNT(*)");
            }
            if (nbElem > 0) {
                vide = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vide;
    }
    
        public void delTarif(String codeRegard, String codeAffaire) {
        try {
            String sql = "DELETE FROM TARIF WHERE codeRegard = '" + codeRegard + "' AND codeAffaire ='" + codeAffaire + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public Tarif getTarifOfRegard(String codeRegard, String codeAffaire) {
        Tarif unTarif = new Tarif();

        try {
            String sql = "SELECT * FROM TARIF WHERE codeRegard =  '" + codeRegard + "' AND codeAffaire ='" + codeAffaire + "'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                unTarif.setCodeRegard(rs.getString("codeRegard"));
                unTarif.setMargeRegard(rs.getDouble("margeRegard"));
                unTarif.setMargeButyl(rs.getDouble("margeButyl"));
                unTarif.setMargeForsheda(rs.getDouble("margeForsheda"));
                unTarif.setPrixTotal(rs.getDouble("prixTotal"));
            }
            return unTarif;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unTarif;
    }

    //Méthodes DAO affaire
    public void addAffaire(Affaire uneAffaire) {
        try {
            String sql = "INSERT INTO AFFAIRE (codeAffaire, client, nomChantier, villeChantier, nomATC, date) VALUES "
                    + "('" + uneAffaire.getCodeAffaire() + "',"
                    + " '" + uneAffaire.getClient() + "', '"
                    + uneAffaire.getNomChantier() + "', '"
                    + uneAffaire.getVilleChantier() + "', '"
                    + uneAffaire.getNomATC() + "', '"
                    + uneAffaire.getDate() + "')";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateAffaire(Affaire uneAffaire) {
        try {
            String sql = "UPDATE AFFAIRE set codeAffaire = '" + uneAffaire.getCodeAffaire() + "', client = '" + uneAffaire.getClient() + "',"
                    + " nomChantier = '" + uneAffaire.getNomChantier() + "', villeChantier = '" + uneAffaire.getVilleChantier() + "',"
                    + " nomATC = '" + uneAffaire.getNomATC() + "', date = '" + uneAffaire.getDate()
                    + "' where codeAffaire =  '" + uneAffaire.getCodeAffaire() + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delAffaire(String code) {
        try {
            delTarifsAffaire(code);
            delElementsAffaire(code);
            String sql1 = "DELETE FROM REGARD WHERE codeAffaire =  '" + code + "'";
            String sql2 = "DELETE FROM AFFAIRE WHERE codeAffaire =  '" + code + "'";
            stmt.execute(sql1);
            stmt.execute(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Affaire> getAllAffaires() {
        ArrayList<Affaire> affaires = new ArrayList<>();

        try {
            String sql = "SELECT * FROM AFFAIRE ORDER BY length(codeAffaire), codeAffaire";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Affaire uneAffaire = new Affaire();
                uneAffaire.setCodeAffaire(rs.getString("codeAffaire"));
                uneAffaire.setClient(rs.getString("client"));
                uneAffaire.setNomChantier(rs.getString("nomChantier"));
                uneAffaire.setVilleChantier(rs.getString("villeChantier"));
                uneAffaire.setNomATC(rs.getString("nomATC"));
                uneAffaire.setDate(rs.getString("date"));
                affaires.add(uneAffaire);
            }
            return affaires;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return affaires;
    }

    public Affaire getAffaireByCode(String code) {
        Affaire uneAffaire = new Affaire();

        try {
            String sql = "SELECT * FROM AFFAIRE WHERE codeAffaire =  '" + code + "'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                uneAffaire.setCodeAffaire(rs.getString("codeAffaire"));
                uneAffaire.setClient(rs.getString("client"));
                uneAffaire.setNomChantier(rs.getString("nomChantier"));
                uneAffaire.setVilleChantier(rs.getString("villeChantier"));
                uneAffaire.setNomATC(rs.getString("nomATC"));
                uneAffaire.setDate(rs.getString("date"));
            }
            return uneAffaire;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uneAffaire;
    }

    //Méthodes DAO regard
    public ArrayList<Regard1> getAllRegardsAffaire(String codeAffaire) {
        ArrayList<Regard1> regards = new ArrayList<>();

        try {
            String sql = "SELECT * FROM REGARD WHERE codeAffaire = '" + codeAffaire + "' ORDER BY length(codeRegard), codeRegard";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Regard1 unRegard = new Regard1();
                unRegard.setCodeRegard(rs.getString("codeRegard"));
                unRegard.setCodeAffaire(rs.getString("codeAffaire"));
                unRegard.setEpaisseurTampon(rs.getDouble("epaisseurTampon"));
                unRegard.setTerrainNaturel(rs.getDouble("terrainNaturel"));
                unRegard.setFildEau(rs.getDouble("fildEau"));
                unRegard.setHauteurT(rs.getDouble("hauteurT"));
                unRegard.setHauteurU(rs.getDouble("hauteurU"));
                unRegard.setTypeEffluant(rs.getString("typeEffluant"));
                unRegard.setNbButyl(rs.getInt("nbButyl"));
                unRegard.setNbForsheda(rs.getInt("nbForsheda"));
                regards.add(unRegard);

            }
            return regards;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regards;
    }

    public ArrayList<Regard1> getAllRegards() {
        ArrayList<Regard1> regards = new ArrayList<>();

        try {
            String sql = "SELECT * FROM REGARD ORDER BY codeRegard";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Regard1 unRegard = new Regard1();
                unRegard.setCodeRegard(rs.getString("codeRegard"));
                unRegard.setCodeAffaire(rs.getString("codeAffaire"));
                unRegard.setEpaisseurTampon(rs.getDouble("epaisseurTampon"));
                unRegard.setTerrainNaturel(rs.getDouble("terrainNaturel"));
                unRegard.setFildEau(rs.getDouble("fildEau"));
                unRegard.setHauteurT(rs.getDouble("hauteurT"));
                unRegard.setHauteurU(rs.getDouble("hauteurU"));
                unRegard.setTypeEffluant(rs.getString("typeEffluant"));
                unRegard.setNbButyl(rs.getInt("nbButyl"));
                unRegard.setNbForsheda(rs.getInt("nbForsheda"));
                regards.add(unRegard);

            }
            return regards;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regards;
    }

    public Regard1 getRegardByCode(String codeRegard, String codeAffaire) {
        Regard1 unRegard = new Regard1();

        try {
            String sql = "SELECT * FROM REGARD WHERE codeRegard =  '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                unRegard.setCodeRegard(rs.getString("codeRegard"));
                unRegard.setCodeAffaire(rs.getString("codeAffaire"));
                unRegard.setEpaisseurTampon(rs.getDouble("epaisseurTampon"));
                unRegard.setTerrainNaturel(rs.getDouble("terrainNaturel"));
                unRegard.setFildEau(rs.getDouble("fildEau"));
                unRegard.setHauteurT(rs.getDouble("hauteurT"));
                unRegard.setHauteurU(rs.getDouble("hauteurU"));
                unRegard.setNbButyl(rs.getInt("nbButyl"));
                unRegard.setNbForsheda(rs.getInt("nbForsheda"));
                unRegard.setTypeEffluant(rs.getString("typeEffluant"));
            }
            return unRegard;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unRegard;
    }

    public void addRegard(Regard1 unRegard) {
        try {
            String sql = "INSERT INTO REGARD (codeRegard, codeAffaire, epaisseurTampon, terrainNaturel, fildEau, hauteurT, hauteurU, nbButyl, nbForsheda, typeEffluant) VALUES "
                    + "('" + unRegard.getCodeRegard() + "',"
                    + " '" + unRegard.getCodeAffaire() + "', '"
                    + unRegard.getEpaisseurTampon() + "', '"
                    + unRegard.getTerrainNaturel() + "', '"
                    + unRegard.getFildEau() + "', '"
                    + unRegard.getHauteurT() + "', '"
                    + unRegard.getHauteurU() + "', '"
                    + unRegard.getNbButyl() + "', '"
                    + unRegard.getNbForsheda() + "', '"
                    + unRegard.getTypeEffluant() + "')";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateRegard(Regard1 unRegard) {
        try {
            String sql = "UPDATE REGARD set epaisseurTampon = '" + unRegard.getEpaisseurTampon() + "',"
                    + " terrainNaturel = '" + unRegard.getTerrainNaturel() + "', fildEau = '" + unRegard.getFildEau() + "',"
                    + " hauteurT = '" + unRegard.getHauteurT() + "', hauteurU = '" + unRegard.getHauteurU() + "',"
                    + " nbButyl = '" + unRegard.getNbButyl() + "', nbForsheda = '" + unRegard.getNbForsheda() + "',"
                    + " typeEffluant = '" + unRegard.getTypeEffluant() + "' where codeRegard =  '" + unRegard.getCodeRegard() + "' and codeAffaire = '" + unRegard.getCodeAffaire() + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delRegard(String codeRegard, String codeAffaire) {
        delTarif(codeRegard, codeAffaire);
        delElementsRegard(codeRegard, codeAffaire);
        try {
            String sql = "DELETE FROM REGARD WHERE codeRegard = '" + codeRegard + "' and codeAffaire = '" + codeAffaire + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Methodes DAO éléments droits d'une affaire

        public void addElementRegard(String refElement, String codeAffaire, String codeRegard) {
            try {
                String sql = "INSERT INTO ELEMENTSDUREGARD (codeAffaire, codeRegard,refElement,quantiteElem) values ('" + codeAffaire + "','" + codeRegard + "','" + refElement + "','" + 1 + "')";
                stmt.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    
    public void addElementsDRegard(javax.swing.JTable tableau, String codeAffaire, String codeRegard) {
        for (int row = 0; row < tableau.getRowCount(); row++) {

            String elementD = (String) tableau.getValueAt(row, 0);
            int quantite = 1;
            if (tableau.getValueAt(row, 1) != null){ 
                quantite = (Integer) tableau.getValueAt(row, 1);
            }

            try {
                String sql = "INSERT INTO ELEMENTSDUREGARD (codeAffaire, codeRegard,refElement,quantiteElem) values ('" + codeAffaire + "','" + codeRegard + "','" + elementD + "','" + quantite + "')";
                stmt.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void dispElementsD(javax.swing.JTable tableau, String codeRegard, String codeAffaire) {

        ArrayList<ElementDuRegard> elementsD = getAllElementsDRegard(codeRegard, codeAffaire);

        DefaultTableModel model = (DefaultTableModel) tableau.getModel();

        for (int i = 0; i < elementsD.size(); i++) {
            model.addRow(new Object[]{});
            tableau.setValueAt(elementsD.get(i).getRefElement(), i, 0);
            tableau.setValueAt(elementsD.get(i).getQuantite(), i, 1);
        }

    }

    public ArrayList<ElementDuRegard> getAllElementsDRegard(String codeRegard, String codeAffaire) {
        ArrayList<ElementDuRegard> elementsD = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ELEMENTSDUREGARD "
                    + "JOIN ELEMENT ON ELEMENT.refElement = ELEMENTSDUREGARD.refElement "
                    + "WHERE ELEMENT.typeElement = 'Élément droit' AND codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "' ORDER BY refElement";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ElementDuRegard unElement = new ElementDuRegard();
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setQuantite(rs.getInt("quantiteElem"));
                elementsD.add(unElement);
            }
            return elementsD;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return elementsD;
    }

    public void delAllElementsDRegard(String codeRegard, String codeAffaire) {
        try {
            String sql = "DELETE FROM ELEMENTSDUREGARD "
                    + "WHERE refElement IN (SELECT refElement FROM ELEMENT WHERE typeElement = 'Élément droit') "
                    + "AND codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "'";

            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delElementsRegard(String codeRegard, String codeAffaire) {
        try {
            String sql = "DELETE FROM ELEMENTSDUREGARD "
                    + "WHERE codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "'";

            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delElementsAffaire(String codeAffaire) {
        try {
            String sql = "DELETE FROM ELEMENTSDUREGARD "
                    + "WHERE codeAffaire = '" + codeAffaire + "'";

            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void delTarifsAffaire(String codeAffaire) {
        try {
            String sql = "DELETE FROM TARIF "
                    + "WHERE codeAffaire = '" + codeAffaire + "'";

            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void addElement(Element unElement) {
        try {
            String sql = "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES "
                    + "('" + unElement.getRefElement() + "',"
                    + " '" + unElement.getTypeElement() + "', '"
                    + unElement.getMesureElement() + "', '"
                    + unElement.getPrix() + "', '"
                    + unElement.getFournisseur() + "')";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Element> getAllElements() {
        ArrayList<Element> elements = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ELEMENT ORDER BY refElement";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Element unElement = new Element();
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setTypeElement(rs.getString("typeElement"));
                unElement.setMesureElement(rs.getDouble("MesureElement"));
                unElement.setPrix(rs.getDouble("prix"));
                unElement.setFournisseur(rs.getString("fournisseur"));
                elements.add(unElement);
            }
            return elements;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return elements;
    }

    public ArrayList<Element> getAllElementsByType(String typeElem) {
        ArrayList<Element> elements = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ELEMENT WHERE typeElement = '" + typeElem + "' ORDER BY refElement, length(refElement)";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Element unElement = new Element();
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setTypeElement(rs.getString("typeElement"));
                unElement.setMesureElement(rs.getDouble("MesureElement"));
                unElement.setPrix(rs.getDouble("prix"));
                unElement.setFournisseur(rs.getString("fournisseur"));
                elements.add(unElement);
            }
            return elements;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return elements;
    }

    public Element getElementByRef(String refElem) {
        Element unElement = new Element();

        try {
            String sql = "SELECT * FROM ELEMENT WHERE refElement =  '" + refElem + "'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setTypeElement(rs.getString("typeElement"));
                unElement.setMesureElement(rs.getDouble("MesureElement"));
                unElement.setPrix(rs.getDouble("prix"));
                unElement.setFournisseur(rs.getString("fournisseur"));
            }
            return unElement;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unElement;
    }
    
        public Element getFondRegard(String codeRegard, String codeAffaire) {
        Element unElement = new Element();

        try {
            String sql = "SELECT * FROM ELEMENT "
                    + "JOIN ELEMENTSDUREGARD ON ELEMENTSDUREGARD.refElement = ELEMENT.refElement "
                    + "WHERE ELEMENT.typeElement LIKE 'Fond%' AND codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "' ORDER BY refElement";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setTypeElement(rs.getString("typeElement"));
                unElement.setMesureElement(rs.getDouble("MesureElement"));
                unElement.setPrix(rs.getDouble("prix"));
                unElement.setFournisseur(rs.getString("fournisseur"));
            }
            return unElement;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unElement;
    }
        
        
        
    public Element getReductionRegard(String codeRegard, String codeAffaire) {
        Element unElement = new Element();

        try {
            String sql = "SELECT * FROM ELEMENT "
                    + "JOIN ELEMENTSDUREGARD ON ELEMENTSDUREGARD.refElement = ELEMENT.refElement "
                    + "WHERE (ELEMENT.typeElement = 'Réduction à cône' OR ELEMENT.typeElement = 'Dalle sous chaussée') AND codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "' ORDER BY refElement";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setTypeElement(rs.getString("typeElement"));
                unElement.setMesureElement(rs.getDouble("MesureElement"));
                unElement.setPrix(rs.getDouble("prix"));
                unElement.setFournisseur(rs.getString("fournisseur"));
            }
            return unElement;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unElement;
    }

    public Element getRehausseRegard(String codeRegard, String codeAffaire) {
        Element unElement = new Element();

        try {
            String sql = "SELECT * FROM ELEMENT "
                    + "JOIN ELEMENTSDUREGARD ON ELEMENTSDUREGARD.refElement = ELEMENT.refElement "
                    + "WHERE ELEMENT.typeElement = 'Rehausse' AND codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "' ORDER BY refElement";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                unElement.setRefElement(rs.getString("refElement"));
                unElement.setTypeElement(rs.getString("typeElement"));
                unElement.setMesureElement(rs.getDouble("MesureElement"));
                unElement.setPrix(rs.getDouble("prix"));
                unElement.setFournisseur(rs.getString("fournisseur"));
            }
            return unElement;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unElement;
    }

    public void delElement(String refElem) {

        try {
            String sql = "DELETE FROM ELEMENT WHERE refElement =  '" + refElem + "'";
            String sql1 = "DELETE FROM ELEMENTSDUREGARD WHERE refElement =  '" + refElem + "'";

            stmt.execute(sql1);
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateElement(Element unElement) {
        try {
            String sql = "UPDATE ELEMENT set typeElement = '" + unElement.getTypeElement() + "',"
                    + " MesureElement = '" + unElement.getMesureElement() + "', prix = '" + unElement.getPrix() + "',"
                    + " fournisseur = '" + unElement.getFournisseur() + "' where refElement =  '" + unElement.getRefElement() + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public double getPrixRegard(String codeRegard, String codeAffaire) {
        double prix = 0;

        try {
            String sql = "SELECT SUM(element.prix * quantiteElem) as prixRegard FROM elementsduregard "
                    + "JOIN element ON element.refElement = elementsduregard.refElement "
                    + "WHERE codeRegard = '" + codeRegard + "' AND codeAffaire = '" + codeAffaire + "' "
                    + "GROUP BY codeRegard";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                prix = (Math.round(rs.getDouble("prixRegard") * 100.0) / 100.0);
            }
            return prix;
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prix;
    }
}
