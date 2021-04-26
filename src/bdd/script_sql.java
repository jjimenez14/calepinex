package bdd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alexj
 */
public class script_sql {
    
    public static final String CREATE_AFFAIRE = "CREATE TABLE IF NOT EXISTS AFFAIRE"
            + "(codeAffaire VARCHAR(30) NOT NULL PRIMARY KEY, "
            + " client VARCHAR(100), "
            + " nomChantier VARCHAR(100), "
            + " villeChantier VARCHAR(100), "
            + " nomATC VARCHAR(100), "
            + " date VARCHAR(50))";

    public static final String CREATE_REGARD = "CREATE TABLE IF NOT EXISTS REGARD "
            + "(codeRegard VARCHAR(30) NOT NULL, "
            + " codeAffaire VARCHAR(30) NOT NULL, "
            + " epaisseurTampon DOUBLE, "
            + " terrainNaturel DOUBLE, "
            + " fildEau DOUBLE, "
            + " hauteurT DOUBLE, "
            + " hauteurU DOUBLE, "
            + " nbButyl NUMBER, "
            + " nbForsheda NUMBER, "
            + " typeEffluant VARCHAR(15), "
            + " foreign key (codeAffaire) references AFFAIRE(codeAffaire))";

    public static final String CREATE_ELEMENTS = "CREATE TABLE IF NOT EXISTS ELEMENT "
            + "(refElement VARCHAR(100) NOT NULL PRIMARY KEY, "
            + " typeElement VARCHAR(30) NOT NULL, "
            + " MesureElement DOUBLE, "
            + " prix DOUBLE, "
            + " fournisseur VARCHAR(100))";

    public static final String CREATE_ELEM_REGARD = "CREATE TABLE IF NOT EXISTS ELEMENTSDUREGARD "
            + "(codeRegard VARCHAR(30) NOT NULL ,"
            + " codeAffaire VARCHAR(30) NOT NULL, "
            + " refElement VARCHAR(100) NOT NULL, "
            + " quantiteElem NUMBER,"
            + " foreign key (codeAffaire) references AFFAIRE(codeAffaire),"
            + " foreign key (refElement) references ELEMENT(refElement))";
    
    public static final String CREATE_JOINT = "CREATE TABLE IF NOT EXISTS JOINT "
            + "(typeJoint VARCHAR(30), "
            + "prixJoint DOUBLE)";
    
    public static final String CREATE_TARIF = "CREATE TABLE IF NOT EXISTS TARIF "
            + "(codeRegard VARCHAR(30) NOT NULL, "
            + " codeAffaire VARCHAR(30) NOT NULL, "
            + " margeRegard DOUBLE, "
            + " margeButyl DOUBLE, "
            + " margeForsheda DOUBLE, "
            + " prixTotal DOUBLE, "
            + " foreign key (codeAffaire) references AFFAIRE(codeAffaire))";
    
    public static final String INSERT_DONNEES
            = "INSERT INTO JOINT (typeJoint, prixJoint) VALUES ('Butyl', '7.02'); "
            + "INSERT INTO JOINT (typeJoint, prixJoint) VALUES ('Forsheda', '12.63'); "
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Rehausse HT10','Rehausse', '100', '23.87', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Rehausse HT15','Rehausse', '150', '39.42', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Rehausse HT20','Rehausse', '200', '43.48', 'Stradal');"
            
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Virole 1000 HT90','Élément droit', '900', '77.15', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Virole 1000 HT60','Élément droit', '600', '55.77', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Virole 1000 HT45','Élément droit', '450', '48.56', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Virole 1000 HT30','Élément droit', '300', '34.09', 'Stradal');"
            
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Dalle réductrice HU23','Dalle sous chaussée', '230', '60.10', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Cône 1000 HT115','Réduction à cône', '1150', '114.43', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Cône 1000 HT100','Réduction à cône', '1000', '90.79', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Cône 1000 HT70','Réduction à cône', '700', '69.11', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('Cône 1000 HT52','Réduction à cône', '450', '56.14', 'Stradal');"
            
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 2V600/2V500','Fond (EP)', '1000', '156.05', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 4V400','Fond (EP)', '680', '93.42', 'Stradal');"
            
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD PLAT 200PVC CR8 1S','Fond (EU)', '700', '112.68', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 90°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 110°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 125°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 135°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 155°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 170°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 1E1S 180°','Fond (EU)', '500', '170.47', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 2E1S 90G180°','Fond (EU)', '500', '192.10', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 2E1S 180°90D','Fond (EU)', '500', '192.10', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 3E1S 135G180°135D','Fond (EU)', '500', '192.10', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR8 3E1S 90G180°90D','Fond (EU)', '500', '192.10', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1S','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 90°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 110°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 125°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 135°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 145°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 150°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 155°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 160°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 170°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 175°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200PVC CR16 1E1S 180°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1S','Fond (EU)', '500', '180.52', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 90°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 110°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 125°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 135°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 145°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 155°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 170°','Fond (EU)', '500', '192.48', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200GRESN 1E1S 180°','Fond (EU)', '500', '192.48', 'Stradal');"            
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200SPECIAL 1E1S','Fond (EU)', '500', '231.94', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200SPECIAL 1S','Fond (EU)', '500', '226.14', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200SPECIAL 2E1S','Fond (EU)', '500', '263.25', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200SPECIAL 3E1S','Fond (EU)', '500', '292.83', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('FD 200SPECIAL 4E1S','Fond (EU)', '500', '371.10', 'Stradal');"
            + "INSERT INTO ELEMENT (refElement, typeElement, mesureElement, prix, fournisseur) VALUES ('MULTI D1000 DD 200 FTE-PVC 1S','Fond (EU)', '500', '167.89', 'Stradal');";

}
