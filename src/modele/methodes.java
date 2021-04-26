/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.text.*;
import java.util.EventObject;
import java.util.Hashtable;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author alexj
 */
public class methodes extends javax.swing.JFrame {

//Méthode permettant de calculer la hauteur sans tampon
    public static String hauteurST(javax.swing.JTextField TextField1, javax.swing.JTextField TextField2) {

        String hST;
        double total;
        double tampon;
        double resultat;

        if (TextField1.getText().isEmpty()) {
            total = 0;
        } else {
            total = Double.parseDouble(TextField1.getText());
        }

        if (TextField2.getText().isEmpty()) {
            tampon = 0;
        } else {
            tampon = Double.parseDouble(TextField2.getText());
        }

        resultat = total - (tampon / 1000);
        if (resultat < 0) {
            resultat = 0;
        }

        hST = String.valueOf((Math.round(resultat * 100.0) / 100.0));
        return hST;
    }

//Méthode permettant de calculer la hauteur totale entre le TN et le Fe
    public static String hauteurTotale(javax.swing.JTextField TextField1, javax.swing.JTextField TextField2) {

        String hT;
        double Tn;
        double Fe;
        double resultat;

        if (TextField1.getText().isEmpty()) {
            Tn = 0;
        } else {
            Tn = Double.parseDouble(TextField1.getText());
        }

        if (TextField2.getText().isEmpty()) {
            Fe = 0;
        } else {
            Fe = Double.parseDouble(TextField2.getText());
        }

        resultat = Tn - Fe;
        if (resultat < 0) {
            resultat = 0;
        }

        hT = String.valueOf((Math.round(resultat * 100.0) / 100.0));
        return hT;
    }
}
