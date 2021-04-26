/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author alexj
 */
public class metier {

    public static class Affaire {

        private String codeAffaire;
        private String client;
        private String nomChantier;
        private String villeChantier;
        private String nomATC;
        private String date;

        public String getCodeAffaire() {
            return codeAffaire;
        }

        public void setCodeAffaire(String codeAffaire) {
            this.codeAffaire = codeAffaire;
        }

        public String getClient() {
            return client;
        }

        public void setClient(String client) {
            this.client = client;
        }

        public String getNomChantier() {
            return nomChantier;
        }

        public void setNomChantier(String nomChantier) {
            this.nomChantier = nomChantier;
        }

        public String getVilleChantier() {
            return villeChantier;
        }

        public void setVilleChantier(String villeChantier) {
            this.villeChantier = villeChantier;
        }

        public String getNomATC() {
            return nomATC;
        }

        public void setNomATC(String nomATC) {
            this.nomATC = nomATC;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return codeAffaire;
        }

    }

    public static class Regard1 {

        private double hauteurT;
        String codeRegard;
        private double terrainNaturel;
        private double epaisseurTampon;
        private double fildEau;
        private String typeEffluant;
        private String codeAffaire;
        private double hauteurU;
        private int nbButyl;
        private int nbForsheda;

        public void setTypeEffluant(String typeEffluant) {
            this.typeEffluant = typeEffluant;
        }

        public void setCodeRegard(String codeRegard) {
            this.codeRegard = codeRegard;
        }

        public String getCodeAffaire() {
            return codeAffaire;
        }

        public double getHauteurT() {
            return hauteurT;
        }

        public double getEpaisseurTampon() {
            return epaisseurTampon;
        }

        public void setFildEau(double fildEau) {
            this.fildEau = fildEau;
        }

        public void setHauteurT(double hauteurT) {
            this.hauteurT = hauteurT;
        }

        public String getCodeRegard() {
            return codeRegard;
        }

        public void setEpaisseurTampon(double epaisseurTampon) {
            this.epaisseurTampon = epaisseurTampon;
        }

        public double getFildEau() {
            return fildEau;
        }

        public void setHauteurU(double hauteurU) {
            this.hauteurU = hauteurU;
        }

        public double getTerrainNaturel() {
            return terrainNaturel;
        }

        public double getHauteurU() {
            return hauteurU;
        }

        public void setCodeAffaire(String codeAffaire) {
            this.codeAffaire = codeAffaire;
        }

        public String getTypeEffluant() {
            return typeEffluant;
        }

        public void setTerrainNaturel(double terrainNaturel) {
            this.terrainNaturel = terrainNaturel;
        }

        public int getNbButyl() {
            return nbButyl;
        }

        public void setNbButyl(int nbButyl) {
            this.nbButyl = nbButyl;
        }

        public int getNbForsheda() {
            return nbForsheda;
        }

        public void setNbForsheda(int nbForsheda) {
            this.nbForsheda = nbForsheda;
        }

        @Override
        public String toString() {
            return codeRegard;
        }
    }

    public static class Element {

        String refElement;
        String typeElement;
        double mesureElement;
        double prix;
        String fournisseur;

        public String getRefElement() {
            return refElement;
        }

        public void setRefElement(String refElement) {
            this.refElement = refElement;
        }

        public String getTypeElement() {
            return typeElement;
        }

        public void setTypeElement(String typeElement) {
            this.typeElement = typeElement;
        }

        public double getMesureElement() {
            return mesureElement;
        }

        public void setMesureElement(double mesureElement) {
            this.mesureElement = mesureElement;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public String getFournisseur() {
            return fournisseur;
        }

        public void setFournisseur(String fournisseur) {
            this.fournisseur = fournisseur;
        }

    }

    public static class ElementDuRegard {
        String codeAffaire;
        String codeRegard;
        String refElement;
        int quantite;

        public String getCodeAffaire() {
            return codeAffaire;
        }

        public void setCodeAffaire(String codeAffaire) {
            this.codeAffaire = codeAffaire;
        }

        public String getCodeRegard() {
            return codeRegard;
        }

        public void setCodeRegard(String codeRegard) {
            this.codeRegard = codeRegard;
        }

        public String getRefElement() {
            return refElement;
        }

        public void setRefElement(String refElement) {
            this.refElement = refElement;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }
    }
    
    public static class Tarif {
        String codeAffaire;
        String codeRegard;
        double margeRegard;
        double margeButyl;
        double margeForsheda;
        double prixTotal;

        public String getCodeAffaire() {
            return codeAffaire;
        }

        public void setCodeAffaire(String codeAffaire) {
            this.codeAffaire = codeAffaire;
        }

        public String getCodeRegard() {
            return codeRegard;
        }

        public void setCodeRegard(String codeRegard) {
            this.codeRegard = codeRegard;
        }

        public double getMargeRegard() {
            return margeRegard;
        }

        public void setMargeRegard(double margeRegard) {
            this.margeRegard = margeRegard;
        }

        public double getMargeButyl() {
            return margeButyl;
        }

        public void setMargeButyl(double margeButyl) {
            this.margeButyl = margeButyl;
        }

        public double getMargeForsheda() {
            return margeForsheda;
        }

        public void setMargeForsheda(double margeForsheda) {
            this.margeForsheda = margeForsheda;
        }

        public double getPrixTotal() {
            return prixTotal;
        }

        public void setPrixTotal(double prixTotal) {
            this.prixTotal = prixTotal;
        }

        @Override
        public String toString() {
            return "Tarif{" + "codeRegard=" + codeRegard + ", margeRegard=" + margeRegard + ", margeButyl=" + margeButyl + ", margeForsheda=" + margeForsheda + ", prixTotal=" + prixTotal + '}';
        }
        
    }
}
