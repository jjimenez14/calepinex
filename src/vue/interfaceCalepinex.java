/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.text.*;
import modele.methodes;
import bdd.bdd;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import static com.itextpdf.text.pdf.codec.BmpImage.getImage;
import com.sun.scenario.effect.ImageData;
import java.awt.*;
import static java.awt.Frame.NORMAL;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.TextAlignment;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import static javax.swing.text.StyleConstants.FontFamily;
import modele.metier.*;

/**
 *
 * @author alexj
 */
public class interfaceCalepinex extends javax.swing.JFrame {

    private final bdd bdd;
    private Affaire affaireSelect;
    private Regard1 regardSelect;

    /**
     * Creates new form Onglet1
     */
    public interfaceCalepinex() {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/calepinex_logo.png")).getImage());
        bdd = new bdd();
        resetAffaire();
        resetRegard();
        resetElement();
        resetPrevisualisation();
        setupListeAffaires();

        JComboBox c = new JComboBox(modelElementsD);
        jTableElements.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(c));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jTabbedPaneTarif = new javax.swing.JTabbedPane();
        PanelDonneesAffaire = new javax.swing.JPanel();
        PanelInfosChantier = new javax.swing.JPanel();
        LabelClient = new javax.swing.JLabel();
        TextFieldClient = new javax.swing.JTextField();
        LabelNomChantier = new javax.swing.JLabel();
        TextFieldNomChantier = new javax.swing.JTextField();
        LabelVilleChantier = new javax.swing.JLabel();
        TextFieldVilleChantier = new javax.swing.JTextField();
        LabelDate = new javax.swing.JLabel();
        TextFieldATC = new javax.swing.JTextField();
        TextFieldDate = new javax.swing.JTextField();
        LabelATC = new javax.swing.JLabel();
        LabelNumAffaire = new javax.swing.JLabel();
        TextFieldCodeAffaire = new javax.swing.JTextField();
        ScrollPaneListeAffaires = new javax.swing.JScrollPane();
        ListListeAffaires = new javax.swing.JList<>();
        LabelListeAffaires = new javax.swing.JLabel();
        ButtonSupprimer = new javax.swing.JButton();
        ButtonCreer = new javax.swing.JButton();
        ButtonNouveau1 = new javax.swing.JButton();
        jTextFieldChercher = new javax.swing.JTextField();
        ButtonChercher = new javax.swing.JButton();
        PanelInfosRegards = new javax.swing.JPanel();
        ComboBoxListeRegards = new javax.swing.JComboBox<>();
        LabelListeRegards = new javax.swing.JLabel();
        PanelInfosGenerales = new javax.swing.JPanel();
        LabelNumRegard = new javax.swing.JLabel();
        TextFieldRegard = new javax.swing.JTextField();
        LabelTn = new javax.swing.JLabel();
        TextFieldTn = new javax.swing.JTextField();
        LabelFe = new javax.swing.JLabel();
        TextFieldFe = new javax.swing.JTextField();
        LabelHauteurTotale = new javax.swing.JLabel();
        TextFieldHauteurTotale = new javax.swing.JTextField();
        TextFieldHauteurE = new javax.swing.JTextField();
        LabelHauteurE = new javax.swing.JLabel();
        LabelEpaisseurTampon = new javax.swing.JLabel();
        TextFieldEpaisseurTampon = new javax.swing.JTextField();
        CheckBoxCone = new javax.swing.JCheckBox();
        ComboBoxTypeEffluant = new javax.swing.JComboBox<>();
        LabelTypeEffluant = new javax.swing.JLabel();
        ButtonCreer1 = new javax.swing.JButton();
        ButtonSupprimer2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelFond = new javax.swing.JLabel();
        ComboBoxFond = new javax.swing.JComboBox<>();
        TextFieldEcart = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxDalleCone = new javax.swing.JComboBox<>();
        LabelEcart = new javax.swing.JLabel();
        LabelRehausse = new javax.swing.JLabel();
        ComboBoxRehausse = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableElements = new javax.swing.JTable();
        ButtonAjoutElem = new javax.swing.JButton();
        ButtonSupprElem = new javax.swing.JButton();
        LabelJointBut = new javax.swing.JLabel();
        TextFieldJointBut = new javax.swing.JTextField();
        LabelJointFor = new javax.swing.JLabel();
        TextFieldJointFor = new javax.swing.JTextField();
        ButtonNouveau = new javax.swing.JButton();
        jPanelTarif = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        TextFieldAchatReg = new javax.swing.JTextField();
        TextFieldMargeReg = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        TextFieldAchatBut = new javax.swing.JTextField();
        TextFieldMargeBut = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        TextFieldPrixTot = new javax.swing.JTextField();
        LabelListeRegards1 = new javax.swing.JLabel();
        ComboBoxListeRegards1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        TextFieldAchatFor = new javax.swing.JTextField();
        TextFieldMargeFor = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        PanelPrevisu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabelVente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ButtonPdf = new javax.swing.JButton();
        PanelParamRegards = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanelElemD = new javax.swing.JPanel();
        TextFieldRefElemD = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        TextFieldFournElemD = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        TextFieldPrixElemD = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        ComboBoxTypeElem1 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        TextFieldHautElemD = new javax.swing.JTextField();
        ButtonCreerElemD = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxElements = new javax.swing.JComboBox<>();
        ComboBoxTypeElem = new javax.swing.JComboBox<>();
        ButtonNewElemD = new javax.swing.JButton();
        ButtonSupprElemD = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calepinex - Logiciel de calepinage de regards");

        jTabbedPaneTarif.setMinimumSize(new java.awt.Dimension(600, 148));

        PanelInfosChantier.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Infos affaire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        PanelInfosChantier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        LabelClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelClient.setText("Client");

        TextFieldClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelNomChantier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNomChantier.setText("Nom chantier");

        TextFieldNomChantier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelVilleChantier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelVilleChantier.setText("Ville chantier");

        TextFieldVilleChantier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelDate.setText("Date");

        TextFieldATC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextFieldDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelATC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelATC.setText("Nom ATC");

        LabelNumAffaire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNumAffaire.setText("Code affaire");

        TextFieldCodeAffaire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelInfosChantierLayout = new javax.swing.GroupLayout(PanelInfosChantier);
        PanelInfosChantier.setLayout(PanelInfosChantierLayout);
        PanelInfosChantierLayout.setHorizontalGroup(
            PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfosChantierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNumAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelClient)
                    .addComponent(LabelNomChantier)
                    .addComponent(LabelVilleChantier)
                    .addComponent(LabelATC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldClient, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(TextFieldNomChantier)
                    .addComponent(TextFieldVilleChantier)
                    .addComponent(TextFieldATC)
                    .addComponent(TextFieldDate)
                    .addComponent(TextFieldCodeAffaire, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PanelInfosChantierLayout.setVerticalGroup(
            PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfosChantierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumAffaire)
                    .addComponent(TextFieldCodeAffaire))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldClient)
                    .addComponent(LabelClient))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNomChantier)
                    .addComponent(LabelNomChantier))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldVilleChantier)
                    .addComponent(LabelVilleChantier))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldATC)
                    .addComponent(LabelATC))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosChantierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldDate)
                    .addComponent(LabelDate))
                .addGap(31, 31, 31))
        );

        TextFieldVilleChantier.getAccessibleContext().setAccessibleName("jTextField4");

        ListListeAffaires.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ListListeAffaires.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListListeAffairesMouseClicked(evt);
            }
        });
        ScrollPaneListeAffaires.setViewportView(ListListeAffaires);

        LabelListeAffaires.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelListeAffaires.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelListeAffaires.setText("Liste des affaires");

        ButtonSupprimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        ButtonSupprimer.setText("Supprimer");
        ButtonSupprimer.setToolTipText("");
        ButtonSupprimer.setIconTextGap(35);
        ButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprimerActionPerformed(evt);
            }
        });

        ButtonCreer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCreer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yes.png"))); // NOI18N
        ButtonCreer.setText("Créer");
        ButtonCreer.setIconTextGap(35);
        ButtonCreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreerActionPerformed(evt);
            }
        });

        ButtonNouveau1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonNouveau1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        ButtonNouveau1.setText("Nouveau");
        ButtonNouveau1.setIconTextGap(35);
        ButtonNouveau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNouveau1ActionPerformed(evt);
            }
        });

        jTextFieldChercher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldChercher.setToolTipText("");

        ButtonChercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        ButtonChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChercherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDonneesAffaireLayout = new javax.swing.GroupLayout(PanelDonneesAffaire);
        PanelDonneesAffaire.setLayout(PanelDonneesAffaireLayout);
        PanelDonneesAffaireLayout.setHorizontalGroup(
            PanelDonneesAffaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDonneesAffaireLayout.createSequentialGroup()
                .addGroup(PanelDonneesAffaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDonneesAffaireLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelInfosChantier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(PanelDonneesAffaireLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(ButtonCreer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelDonneesAffaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldChercher, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollPaneListeAffaires, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(ButtonNouveau1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelListeAffaires, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonChercher)
                .addContainerGap())
        );
        PanelDonneesAffaireLayout.setVerticalGroup(
            PanelDonneesAffaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDonneesAffaireLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LabelListeAffaires)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDonneesAffaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDonneesAffaireLayout.createSequentialGroup()
                        .addComponent(PanelInfosChantier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCreer)
                        .addGap(255, 255, 255))
                    .addGroup(PanelDonneesAffaireLayout.createSequentialGroup()
                        .addGroup(PanelDonneesAffaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDonneesAffaireLayout.createSequentialGroup()
                                .addComponent(jTextFieldChercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ScrollPaneListeAffaires, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonChercher))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonNouveau1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSupprimer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        ButtonSupprimer.getAccessibleContext().setAccessibleName("jButton2");
        ButtonCreer.getAccessibleContext().setAccessibleName("jButton1");

        jTabbedPaneTarif.addTab("Données Affaire", PanelDonneesAffaire);

        ComboBoxListeRegards.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxListeRegards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxListeRegardsActionPerformed(evt);
            }
        });

        LabelListeRegards.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelListeRegards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelListeRegards.setText("Liste des regards");

        PanelInfosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informations générales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        LabelNumRegard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNumRegard.setText("Code regard");

        TextFieldRegard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelTn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTn.setText("Terrain naturel (m)");

        TextFieldTn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldTn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldTnKeyReleased(evt);
            }
        });

        LabelFe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelFe.setText("Fil d'eau (m)");

        TextFieldFe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldFe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldFeKeyReleased(evt);
            }
        });

        LabelHauteurTotale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelHauteurTotale.setText("Hauteur totale (m)");

        TextFieldHauteurTotale.setEditable(false);
        TextFieldHauteurTotale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextFieldHauteurE.setEditable(false);
        TextFieldHauteurE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldHauteurE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldHauteurEActionPerformed(evt);
            }
        });

        LabelHauteurE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelHauteurE.setText("Hauteur sans tampon (m)");

        LabelEpaisseurTampon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEpaisseurTampon.setText("Epaisseur du tampon (mm)");

        TextFieldEpaisseurTampon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldEpaisseurTampon.setText("120");
        TextFieldEpaisseurTampon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldEpaisseurTamponKeyReleased(evt);
            }
        });

        CheckBoxCone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxCone.setText("Cône de fermeture                ");
        CheckBoxCone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CheckBoxCone.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        CheckBoxCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxConeActionPerformed(evt);
            }
        });

        ComboBoxTypeEffluant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxTypeEffluant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eaux usées", "Eaux pluviales" }));
        ComboBoxTypeEffluant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeEffluantActionPerformed(evt);
            }
        });

        LabelTypeEffluant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTypeEffluant.setText("Type d'effluent");

        javax.swing.GroupLayout PanelInfosGeneralesLayout = new javax.swing.GroupLayout(PanelInfosGenerales);
        PanelInfosGenerales.setLayout(PanelInfosGeneralesLayout);
        PanelInfosGeneralesLayout.setHorizontalGroup(
            PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfosGeneralesLayout.createSequentialGroup()
                        .addComponent(CheckBoxCone)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfosGeneralesLayout.createSequentialGroup()
                        .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNumRegard)
                            .addComponent(LabelTypeEffluant))
                        .addGap(92, 92, 92)
                        .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxTypeEffluant, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldRegard)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfosGeneralesLayout.createSequentialGroup()
                        .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTn)
                            .addComponent(LabelHauteurE)
                            .addComponent(LabelFe)
                            .addComponent(LabelEpaisseurTampon)
                            .addComponent(LabelHauteurTotale))
                        .addGap(16, 16, 16)
                        .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldHauteurTotale, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextFieldEpaisseurTampon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextFieldFe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextFieldTn)
                            .addComponent(TextFieldHauteurE))))
                .addContainerGap())
        );
        PanelInfosGeneralesLayout.setVerticalGroup(
            PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumRegard)
                    .addComponent(TextFieldRegard))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxTypeEffluant)
                    .addComponent(LabelTypeEffluant))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTn)
                    .addComponent(LabelTn))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldFe)
                    .addComponent(LabelFe))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEpaisseurTampon)
                    .addComponent(LabelEpaisseurTampon))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldHauteurTotale)
                    .addComponent(LabelHauteurTotale))
                .addGap(18, 18, 18)
                .addGroup(PanelInfosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldHauteurE)
                    .addComponent(LabelHauteurE))
                .addGap(18, 18, 18)
                .addComponent(CheckBoxCone)
                .addGap(35, 35, 35))
        );

        ButtonCreer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCreer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yes.png"))); // NOI18N
        ButtonCreer1.setText("Créer");
        ButtonCreer1.setIconTextGap(35);
        ButtonCreer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreer1ActionPerformed(evt);
            }
        });

        ButtonSupprimer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSupprimer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        ButtonSupprimer2.setText("Supprimer");
        ButtonSupprimer2.setIconTextGap(35);
        ButtonSupprimer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprimer2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Éléments du regard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        LabelFond.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelFond.setText("Fond");

        ComboBoxFond.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxFond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFondActionPerformed(evt);
            }
        });

        TextFieldEcart.setEditable(false);
        TextFieldEcart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dalle sous chaussée");

        ComboBoxDalleCone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxDalleCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDalleConeActionPerformed(evt);
            }
        });

        LabelEcart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEcart.setText("Ecart (cm)");

        LabelRehausse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRehausse.setText("Réhausse sous cadre");

        ComboBoxRehausse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxRehausse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRehausseActionPerformed(evt);
            }
        });
        //ComboBoxRehausse.setSelectedIndex(0);

        jTableElements.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableElements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Elements droits", "Quantité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableElements.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableElementsKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableElements);

        ButtonAjoutElem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonAjoutElem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        ButtonAjoutElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjoutElemActionPerformed(evt);
            }
        });

        ButtonSupprElem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSupprElem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        ButtonSupprElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprElemActionPerformed(evt);
            }
        });

        LabelJointBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelJointBut.setText("Nb joints butyl");

        TextFieldJointBut.setEditable(false);
        TextFieldJointBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LabelJointFor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelJointFor.setText("Nb joints forsheda");

        TextFieldJointFor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelFond)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxFond, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonSupprElem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAjoutElem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelRehausse)
                            .addComponent(LabelEcart)
                            .addComponent(LabelJointBut)
                            .addComponent(LabelJointFor)
                            .addComponent(jLabel2))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldJointBut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextFieldEcart, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxRehausse, 0, 211, Short.MAX_VALUE)
                            .addComponent(TextFieldJointFor)
                            .addComponent(ComboBoxDalleCone, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxFond)
                    .addComponent(LabelFond))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonAjoutElem)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSupprElem))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxDalleCone)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxRehausse)
                    .addComponent(LabelRehausse))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEcart)
                    .addComponent(LabelEcart))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldJointBut)
                    .addComponent(LabelJointBut))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldJointFor)
                    .addComponent(LabelJointFor))
                .addContainerGap())
        );

        ButtonNouveau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        ButtonNouveau.setText("Nouveau ");
        ButtonNouveau.setIconTextGap(35);
        ButtonNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNouveauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInfosRegardsLayout = new javax.swing.GroupLayout(PanelInfosRegards);
        PanelInfosRegards.setLayout(PanelInfosRegardsLayout);
        PanelInfosRegardsLayout.setHorizontalGroup(
            PanelInfosRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfosRegardsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfosRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInfosRegardsLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(ButtonCreer1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelInfosRegardsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelInfosRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelListeRegards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelInfosRegardsLayout.createSequentialGroup()
                                .addComponent(ButtonNouveau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonSupprimer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ComboBoxListeRegards, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addComponent(PanelInfosGenerales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelInfosRegardsLayout.setVerticalGroup(
            PanelInfosRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfosRegardsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelListeRegards)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfosRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfosRegardsLayout.createSequentialGroup()
                        .addComponent(ComboBoxListeRegards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelInfosRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonNouveau)
                            .addComponent(ButtonSupprimer2))
                        .addGap(38, 38, 38)
                        .addComponent(PanelInfosGenerales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ButtonCreer1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jTabbedPaneTarif.addTab("Infos Regards", PanelInfosRegards);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Regard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Achat (€)");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Marge (%)");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Vente (€)");

        TextFieldAchatReg.setEditable(false);
        TextFieldAchatReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextFieldMargeReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldMargeReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldMargeRegKeyReleased(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldMargeReg, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(TextFieldAchatReg))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TextFieldAchatReg))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMargeReg)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3)
                    .addComponent(jLabel38))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Joint butyl", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Achat (€)");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Marge (%)");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Vente (€)");

        TextFieldAchatBut.setEditable(false);
        TextFieldAchatBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextFieldMargeBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldMargeBut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldMargeButKeyReleased(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel39))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldMargeBut, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(TextFieldAchatBut)
                    .addComponent(jTextField6))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(TextFieldAchatBut))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMargeBut)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6)
                    .addComponent(jLabel41))
                .addContainerGap())
        );

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("Total (€ H.T)");

        TextFieldPrixTot.setEditable(false);
        TextFieldPrixTot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldPrixTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPrixTotActionPerformed(evt);
            }
        });

        LabelListeRegards1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelListeRegards1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelListeRegards1.setText("Liste des regards");

        ComboBoxListeRegards1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxListeRegards1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxListeRegards1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yes.png"))); // NOI18N
        jButton3.setText("Valider");
        jButton3.setIconTextGap(35);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Joint forsheda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Achat (€)");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Marge (%)");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Vente (€)");

        TextFieldAchatFor.setEditable(false);
        TextFieldAchatFor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextFieldMargeFor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextFieldMargeFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldMargeForKeyReleased(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel50))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldMargeFor, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(TextFieldAchatFor)
                    .addComponent(jTextField13))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(TextFieldAchatFor))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMargeFor)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13)
                    .addComponent(jLabel52))
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Total enregistré:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelTarifLayout = new javax.swing.GroupLayout(jPanelTarif);
        jPanelTarif.setLayout(jPanelTarifLayout);
        jPanelTarifLayout.setHorizontalGroup(
            jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarifLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTarifLayout.createSequentialGroup()
                        .addGroup(jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelListeRegards1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxListeRegards1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(397, 397, 397))
                    .addGroup(jPanelTarifLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelTarifLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldPrixTot, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanelTarifLayout.setVerticalGroup(
            jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarifLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LabelListeRegards1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxListeRegards1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(38, 38, 38)
                .addGroup(jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldPrixTot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTarifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(jButton3)))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jTabbedPaneTarif.addTab("Tarif", jPanelTarif);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Affaire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(586, 168));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Code affaire:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Client:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Chantier:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Date:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ATC:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ville:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addGap(42, 42, 42))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Regard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Code regard:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("1/3");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Type effluent:");

        jScrollPane2.setBorder(null);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hauteur totale (m)", "Hauteur utile (m)", "Fond", "Fermeture", "Réhausse", "Elements droits", "Qté élem. droits"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Joints butyl:");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("Joints forsheda:");

        jLabelVente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelVente.setText("Prix de vente:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelVente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVente)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(12, 12, 12))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        ButtonPdf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        ButtonPdf.setText("Exporter");
        ButtonPdf.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ButtonPdf.setIconTextGap(15);
        ButtonPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrevisuLayout = new javax.swing.GroupLayout(PanelPrevisu);
        PanelPrevisu.setLayout(PanelPrevisuLayout);
        PanelPrevisuLayout.setHorizontalGroup(
            PanelPrevisuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrevisuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrevisuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrevisuLayout.createSequentialGroup()
                        .addComponent(ButtonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelPrevisuLayout.createSequentialGroup()
                        .addGroup(PanelPrevisuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        PanelPrevisuLayout.setVerticalGroup(
            PanelPrevisuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrevisuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ButtonPdf)
                .addGap(285, 285, 285))
        );

        jTabbedPaneTarif.addTab("Prévisualisation", PanelPrevisu);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion des éléments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jPanelElemD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextFieldRefElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Désignation");

        TextFieldFournElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Prix (€)");
        jLabel45.setToolTipText("");

        TextFieldPrixElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Fournisseur");

        ComboBoxTypeElem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxTypeElem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fond (EP)", "Fond (EU)", "Élément droit", "Dalle sous chaussée", "Réduction à cône", "Rehausse" }));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Type d'élément");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Hauteur (mm)");

        TextFieldHautElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ButtonCreerElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCreerElemD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yes.png"))); // NOI18N
        ButtonCreerElemD.setText("Créer");
        ButtonCreerElemD.setIconTextGap(35);
        ButtonCreerElemD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreerElemDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelElemDLayout = new javax.swing.GroupLayout(jPanelElemD);
        jPanelElemD.setLayout(jPanelElemDLayout);
        jPanelElemDLayout.setHorizontalGroup(
            jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElemDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldFournElemD, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldRefElemD, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldHautElemD)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldPrixElemD))
                .addGap(18, 18, 18)
                .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelElemDLayout.createSequentialGroup()
                        .addComponent(ComboBoxTypeElem1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelElemDLayout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElemDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonCreerElemD)
                        .addGap(99, 99, 99))))
        );
        jPanelElemDLayout.setVerticalGroup(
            jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElemDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelElemDLayout.createSequentialGroup()
                        .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldRefElemD)
                            .addComponent(TextFieldPrixElemD)))
                    .addGroup(jPanelElemDLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxTypeElem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelElemDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldFournElemD)
                    .addComponent(TextFieldHautElemD)
                    .addComponent(ButtonCreerElemD))
                .addGap(130, 130, 130))
        );

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Type d'élément");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Element");

        ComboBoxElements.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxElements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxElementsActionPerformed(evt);
            }
        });

        ComboBoxTypeElem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxTypeElem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fond (EP)", "Fond (EU)", "Élément droit", "Dalle sous chaussée", "Réduction à cône", "Rehausse" }));
        ComboBoxTypeElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeElemActionPerformed(evt);
            }
        });

        ButtonNewElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonNewElemD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        ButtonNewElemD.setText("Nouveau");
        ButtonNewElemD.setIconTextGap(35);
        ButtonNewElemD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNewElemDActionPerformed(evt);
            }
        });

        ButtonSupprElemD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSupprElemD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        ButtonSupprElemD.setText("Supprimer");
        ButtonSupprElemD.setIconTextGap(35);
        ButtonSupprElemD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprElemDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanelElemD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxTypeElem, 0, 193, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(ButtonNewElemD, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonSupprElemD, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                    .addComponent(ComboBoxElements, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)))
                        .addGap(272, 272, 272))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxTypeElem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxElements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNewElemD)
                    .addComponent(ButtonSupprElemD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelElemD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Joints", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Prix d'achat joint butyl (€)");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Prix d'achat joint forsheda (€)");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonValider.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yes.png"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.setIconTextGap(35);
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10)))
                .addGap(98, 98, 98)
                .addComponent(jButtonValider)
                .addGap(118, 118, 118))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField8))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField10)
                    .addComponent(jButtonValider))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout PanelParamRegardsLayout = new javax.swing.GroupLayout(PanelParamRegards);
        PanelParamRegards.setLayout(PanelParamRegardsLayout);
        PanelParamRegardsLayout.setHorizontalGroup(
            PanelParamRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelParamRegardsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelParamRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        PanelParamRegardsLayout.setVerticalGroup(
            PanelParamRegardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParamRegardsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPaneTarif.addTab("Paramètres", PanelParamRegards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneTarif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneTarif, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTarif.getAccessibleContext().setAccessibleName("onglets");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void ButtonCreer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreer1ActionPerformed

        if (!verifyFormRegard()) {
            JOptionPane.showMessageDialog(this, "Merci de bien mettre toutes les informations du regard", "", JOptionPane.WARNING_MESSAGE);
        } else if (ListListeAffaires.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Aucune affaire selectionnée!", "", JOptionPane.WARNING_MESSAGE);
        } else if (!verifyNumericRegard()) {
            JOptionPane.showMessageDialog(this, "Une des valeurs est incorrecte", "", JOptionPane.WARNING_MESSAGE);
        } else {

            regard2.setCodeRegard(TextFieldRegard.getText());
            regard2.setCodeAffaire(TextFieldCodeAffaire.getText());
            regard2.setEpaisseurTampon(Double.parseDouble(TextFieldEpaisseurTampon.getText()));
            regard2.setTerrainNaturel(Double.parseDouble(TextFieldTn.getText()));
            regard2.setHauteurT(Double.parseDouble(TextFieldHauteurTotale.getText()));
            regard2.setHauteurU(Double.parseDouble(TextFieldHauteurE.getText()));
            regard2.setFildEau(Double.parseDouble(TextFieldFe.getText()));
            regard2.setNbButyl(Integer.parseInt(TextFieldJointBut.getText()));
            regard2.setNbForsheda(Integer.parseInt(TextFieldJointFor.getText()));
            regard2.setTypeEffluant(String.valueOf(ComboBoxTypeEffluant.getSelectedItem()));

            if (ButtonCreer1.getText().equals("Créer")) {
                if (regardExists(regard2.getCodeRegard(), ListListeAffaires.getSelectedValue())) {
                    JOptionPane.showMessageDialog(this, "Ce regard existe déjà pour cette affaire!", "", JOptionPane.WARNING_MESSAGE);
                } else {
                    bdd.addRegard(regard2);
                    bdd.addElementsDRegard(jTableElements, regard2.getCodeAffaire(), regard2.getCodeRegard());
                    bdd.addElementRegard((String) ComboBoxFond.getSelectedItem(), ListListeAffaires.getSelectedValue(), regard2.getCodeRegard());
                    bdd.addElementRegard((String) ComboBoxDalleCone.getSelectedItem(), ListListeAffaires.getSelectedValue(), regard2.getCodeRegard());
                    if (!"Aucun".equals(ComboBoxRehausse.getSelectedItem())) {
                        bdd.addElementRegard((String) ComboBoxRehausse.getSelectedItem(), ListListeAffaires.getSelectedValue(), regard2.getCodeRegard());
                    }

                    Tarif unTarif = new Tarif();
                    unTarif.setCodeRegard(regard2.getCodeRegard());
                    unTarif.setCodeAffaire(ListListeAffaires.getSelectedValue());
                    bdd.addTarif(unTarif);

                    rafraichirListeRegards();
                    ComboBoxListeRegards.setSelectedItem(regard2.getCodeRegard());
                    rafraichirTarif();
                    calculPrix();
                    majTarif();
                    rafraichirTarif();
                    setPrevisualisation(0);
                }
            }
            if (ButtonCreer1.getText().equals("Modifier")) {
                bdd.updateRegard(regard2);
                bdd.delElementsRegard(regard2.getCodeRegard(), regard2.getCodeAffaire());
                bdd.addElementsDRegard(jTableElements, regard2.getCodeAffaire(), regard2.getCodeRegard());
                bdd.addElementRegard((String) ComboBoxFond.getSelectedItem(), regard2.getCodeAffaire(), regard2.getCodeRegard());
                bdd.addElementRegard((String) ComboBoxDalleCone.getSelectedItem(), regard2.getCodeAffaire(), regard2.getCodeRegard());
                if (!"Aucun".equals(ComboBoxRehausse.getSelectedItem())) {
                    bdd.addElementRegard((String) ComboBoxRehausse.getSelectedItem(), regard2.getCodeAffaire(), regard2.getCodeRegard());
                }
                rafraichirListeRegards();
                ComboBoxListeRegards.setSelectedItem(regard2.getCodeRegard());
                rafraichirTarif();
                calculPrix();
                majTarif();
                rafraichirTarif();
                setPrevisualisation(0);
            }
            JOptionPane.showMessageDialog(this, "Informations enregistrées");
        }
    }//GEN-LAST:event_ButtonCreer1ActionPerformed


    private void ComboBoxDalleConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDalleConeActionPerformed
        reducHaut = bdd.getElementByRef((String) ComboBoxDalleCone.getSelectedItem()).getMesureElement();

        calculEcart();
    }//GEN-LAST:event_ComboBoxDalleConeActionPerformed

    private void ComboBoxRehausseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRehausseActionPerformed

        if (("Aucun").equals(ComboBoxRehausse.getSelectedItem())) {
            rehausseHaut = 0;
        } else {
            rehausseHaut = bdd.getElementByRef((String) ComboBoxRehausse.getSelectedItem()).getMesureElement();
        }

        calculEcart();
    }//GEN-LAST:event_ComboBoxRehausseActionPerformed

    private void ComboBoxFondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFondActionPerformed
        hauteurFond = bdd.getElementByRef((String) ComboBoxFond.getSelectedItem()).getMesureElement();

        calculEcart();
    }//GEN-LAST:event_ComboBoxFondActionPerformed

    private void ComboBoxTypeEffluantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeEffluantActionPerformed
        ComboBoxFond.setModel(modeleFond);
        if (ComboBoxTypeEffluant.getSelectedIndex() == 0)
            rafraichirListeElements(modeleFond, "Fond (EU)");
        else
            rafraichirListeElements(modeleFond, "Fond (EP)");
    }//GEN-LAST:event_ComboBoxTypeEffluantActionPerformed

    private void CheckBoxConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxConeActionPerformed
        setCone();
    }//GEN-LAST:event_CheckBoxConeActionPerformed

    private void TextFieldEpaisseurTamponKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldEpaisseurTamponKeyReleased
        if (isNumeric(TextFieldEpaisseurTampon.getText())) {
            TextFieldHauteurE.setText(methodes.hauteurST(TextFieldHauteurTotale, TextFieldEpaisseurTampon));

            hauteurT = Double.parseDouble(methodes.hauteurST(TextFieldHauteurTotale, TextFieldEpaisseurTampon));

            calculEcart();
        } else { 
            TextFieldHauteurE.setText("0.0");
        }
        erreurCouleur();
    }//GEN-LAST:event_TextFieldEpaisseurTamponKeyReleased

    private void TextFieldFeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldFeKeyReleased
        if (isNumeric(TextFieldFe.getText()) && isNumeric(TextFieldTn.getText())) {
            TextFieldHauteurTotale.setText(methodes.hauteurTotale(TextFieldTn, TextFieldFe));
            TextFieldHauteurE.setText(methodes.hauteurST(TextFieldHauteurTotale, TextFieldEpaisseurTampon));

            hauteurT = Double.parseDouble(methodes.hauteurST(TextFieldHauteurTotale, TextFieldEpaisseurTampon));

            calculEcart();
               } else { 
            TextFieldHauteurTotale.setText("0.0");
            TextFieldHauteurE.setText("0.0");
        }
        erreurCouleur();
    }//GEN-LAST:event_TextFieldFeKeyReleased

    private void TextFieldTnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldTnKeyReleased
        if (isNumeric(TextFieldFe.getText()) && isNumeric(TextFieldTn.getText())) {
            TextFieldHauteurTotale.setText(methodes.hauteurTotale(TextFieldTn, TextFieldFe));
            TextFieldHauteurE.setText(methodes.hauteurST(TextFieldHauteurTotale, TextFieldEpaisseurTampon));

            hauteurT = Double.parseDouble(methodes.hauteurST(TextFieldHauteurTotale, TextFieldEpaisseurTampon));

            calculEcart();
                       } else { 
            TextFieldHauteurTotale.setText("0.0");
            TextFieldHauteurE.setText("0.0");
        }
        erreurCouleur();
    }//GEN-LAST:event_TextFieldTnKeyReleased

    private void ButtonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreerActionPerformed

        if (!verifyFormAffaire()) {
            JOptionPane.showMessageDialog(this, "Merci de bien renseigner toutes les informations de l'affaire", "", JOptionPane.WARNING_MESSAGE);
        } else {
            
            affaire1.setCodeAffaire(TextFieldCodeAffaire.getText());
            affaire1.setClient(TextFieldClient.getText().replace("'", "''"));
            affaire1.setNomChantier(TextFieldNomChantier.getText().replace("'", "''"));
            affaire1.setVilleChantier(TextFieldVilleChantier.getText().replace("'", "''"));
            affaire1.setNomATC(TextFieldATC.getText().replace("'", "''"));
            affaire1.setDate(TextFieldDate.getText());

            if (ButtonCreer.getText().equals("Créer")) {
                if (affaireExists(affaire1.getCodeAffaire())) {
                    JOptionPane.showMessageDialog(this, "Cette affaire existe déjà!", "", JOptionPane.WARNING_MESSAGE);
                } else {
                    bdd.addAffaire(affaire1);
                    rafraichirListeAffaires();
                    ListListeAffaires.setSelectedValue(affaire1.getCodeAffaire(), true);
                    setModifierAffaire();
                    setupListeRegards();

                    if (ComboBoxListeRegards.getItemCount() != 0) {
                        ComboBoxListeRegards.setSelectedIndex(0);
                    } else {
                        resetRegard();
                    }

                }
            }
            if (ButtonCreer.getText().equals("Modifier")) {
                bdd.updateAffaire(affaire1);
                int nbRegards = bdd.getAllRegardsAffaire(ListListeAffaires.getSelectedValue()).size();
                if (nbRegards != 0) {
                    setPrevisualisation(0);
                }
            }
            JOptionPane.showMessageDialog(this, "Informations enregistrées");
        }          
    }//GEN-LAST:event_ButtonCreerActionPerformed

    private void ListListeAffairesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListListeAffairesMouseClicked
        setModifierAffaire();

        setupListeRegards();

        if (ComboBoxListeRegards.getItemCount() != 0) {
            ComboBoxListeRegards.setSelectedIndex(0);
        } else {
            resetRegard();
        }


    }//GEN-LAST:event_ListListeAffairesMouseClicked

    private void ButtonNouveau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNouveau1ActionPerformed
        rafraichirListeAffaires();
        resetAffaire();
        modelRegards.removeAllElements();
        resetRegard();
        rafraichirTarif();
        resetPrevisualisation();
    }//GEN-LAST:event_ButtonNouveau1ActionPerformed

    private void ButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprimerActionPerformed
        if (ListListeAffaires.isSelectionEmpty()) {
                JOptionPane.showMessageDialog(this, "Aucune affaire selectionnée", "", JOptionPane.WARNING_MESSAGE);
        } else {
        
        int input = JOptionPane.showConfirmDialog(null, "Êtes vous sûr de vouloir supprimer l'affaire?");
        if (input == 0) {
                bdd.delAffaire(ListListeAffaires.getSelectedValue());
                rafraichirListeAffaires();
                resetAffaire();
                rafraichirListeRegards();
                resetRegard();
                resetPrevisualisation();
            }
        }
    }//GEN-LAST:event_ButtonSupprimerActionPerformed

    private void ButtonChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChercherActionPerformed
        if (affaireExists(jTextFieldChercher.getText())) {
            ListListeAffaires.setSelectedValue(jTextFieldChercher.getText(), true);
            setModifierAffaire();
            setupListeRegards();
            if (ComboBoxListeRegards.getItemCount() != 0) {
                ComboBoxListeRegards.setSelectedIndex(0);
            } else {
                resetRegard();
            }
        } else
            JOptionPane.showMessageDialog(this, "Cette affaire n'existe pas", "", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_ButtonChercherActionPerformed

    private void ButtonSupprimer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprimer2ActionPerformed
        if (ComboBoxListeRegards.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Aucun regard selectionné", "", JOptionPane.WARNING_MESSAGE);
        } else {

            int input = JOptionPane.showConfirmDialog(null, "Êtes vous sûr de vouloir supprimer ce Regard?");
            if (input == 0) {

                bdd.delAllElementsDRegard(String.valueOf(ComboBoxListeRegards.getSelectedItem()), ListListeAffaires.getSelectedValue());
                bdd.delRegard(String.valueOf(ComboBoxListeRegards.getSelectedItem()), ListListeAffaires.getSelectedValue());
                rafraichirListeRegards();
                resetRegard();

                if (bdd.getAllRegardsAffaire(ListListeAffaires.getSelectedValue()).size() != 0) {
                    setPrevisualisation(0);
                } else {
                    resetPrevisualisation();
                }
            }
        }
    }//GEN-LAST:event_ButtonSupprimer2ActionPerformed

    private void ButtonAjoutElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjoutElemActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableElements.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_ButtonAjoutElemActionPerformed

    private void ButtonSupprElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprElemActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableElements.getModel();
        if (model.getRowCount() != 0) {
            model.removeRow(model.getRowCount() - 1);
        }
        calculEcart();
    }//GEN-LAST:event_ButtonSupprElemActionPerformed

    private void ButtonNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNouveauActionPerformed
        resetRegard();
    }//GEN-LAST:event_ButtonNouveauActionPerformed

    private void ComboBoxListeRegardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxListeRegardsActionPerformed
        setModifierRegard();
        ComboBoxListeRegards1.setSelectedItem(ComboBoxListeRegards.getSelectedItem());
    }//GEN-LAST:event_ComboBoxListeRegardsActionPerformed

    private void ButtonCreerElemDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreerElemDActionPerformed

        if (!verifyFormElement()) {
            JOptionPane.showMessageDialog(this, "Merci de bien rensigner toutes les informations pour cet élément", "", JOptionPane.WARNING_MESSAGE);
        } else if (!verifyNumericElement()) {
            JOptionPane.showMessageDialog(this, "Une des valeurs est incorrecte", "", JOptionPane.WARNING_MESSAGE);
        } else {

            element1.setRefElement(TextFieldRefElemD.getText());
            element1.setTypeElement((String) ComboBoxTypeElem1.getSelectedItem());
            element1.setMesureElement(Double.parseDouble(TextFieldHautElemD.getText()));
            element1.setPrix(Double.parseDouble(TextFieldPrixElemD.getText()));
            element1.setFournisseur(TextFieldFournElemD.getText());

            if (ButtonCreerElemD.getText().equals("Créer")) {
                if (elementExists(element1.getRefElement())) {
                    JOptionPane.showMessageDialog(this, "Cet élément existe déjà!", "", JOptionPane.WARNING_MESSAGE);
                } else {
                    bdd.addElement(element1);

                }
            }
            if (ButtonCreerElemD.getText().equals("Modifier")) {
                bdd.updateElement(element1);
            }

            rafraichirListeElements(modelElementsD, "Élément droit");
            ComboBoxTypeEffluant.setSelectedIndex(ComboBoxTypeEffluant.getSelectedIndex());
            setCone();
            rafraichirListeElements(modelElements, (String) ComboBoxTypeElem1.getSelectedItem());
            ComboBoxTypeElem.setSelectedItem((String) ComboBoxTypeElem1.getSelectedItem());
            ComboBoxElements.setSelectedItem(element1.getRefElement());
            rafraichirTarif();
            calculPrix();
            rafraichirTarif();
            JOptionPane.showMessageDialog(this, "Informations enregistrées");
        }

    }//GEN-LAST:event_ButtonCreerElemDActionPerformed

    private void ComboBoxTypeElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeElemActionPerformed
        ComboBoxElements.setModel(modelElements);
        rafraichirListeElements(modelElements, (String) ComboBoxTypeElem.getSelectedItem());

    }//GEN-LAST:event_ComboBoxTypeElemActionPerformed

    private void ButtonNewElemDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNewElemDActionPerformed
        resetElement();
    }//GEN-LAST:event_ButtonNewElemDActionPerformed

    private void ComboBoxElementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxElementsActionPerformed
        setModifierElem();
    }//GEN-LAST:event_ComboBoxElementsActionPerformed

    private void ButtonSupprElemDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprElemDActionPerformed
        if (ComboBoxElements.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Aucun élément selectionné", "", JOptionPane.WARNING_MESSAGE);
        } else {

            int input = JOptionPane.showConfirmDialog(null, "L'élément sera supprimé de tous les regards enregistrés.\n Êtes-vous sûr de vouloir continuer?");
            if (input == 0) {
                bdd.delElement((String) ComboBoxElements.getSelectedItem());

                rafraichirListeElements(modelElementsD, "Élément droit");
                ComboBoxTypeEffluant.setSelectedIndex(ComboBoxTypeEffluant.getSelectedIndex());
                setCone();
                rafraichirListeElements(modelElements, (String) ComboBoxTypeElem1.getSelectedItem());
                ComboBoxTypeElem.setSelectedItem((String) ComboBoxTypeElem1.getSelectedItem());
                resetElement();
                resetRegard();
                resetPrevisualisation();
            }
        }
    }//GEN-LAST:event_ButtonSupprElemDActionPerformed

    private void jTableElementsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableElementsKeyReleased
        calculEcart();
    }//GEN-LAST:event_jTableElementsKeyReleased

    private void TextFieldHauteurEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldHauteurEActionPerformed

    }//GEN-LAST:event_TextFieldHauteurEActionPerformed

    private void ComboBoxListeRegards1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxListeRegards1ActionPerformed
        rafraichirTarif();
        calculPrix();
    }//GEN-LAST:event_ComboBoxListeRegards1ActionPerformed

    private void TextFieldMargeRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldMargeRegKeyReleased
        calculPrix();
    }//GEN-LAST:event_TextFieldMargeRegKeyReleased

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
if (!verifyNumericJoint()){
   JOptionPane.showMessageDialog(this, "Une des valeurs est incorrecte", "", JOptionPane.WARNING_MESSAGE); 
} else {

        double butyl, forsheda;
        if (!jTextField8.getText().isEmpty()) {
            butyl = Double.parseDouble(jTextField8.getText());
        } else {
            butyl = 0;
        }
        if (!jTextField10.getText().isEmpty()) {
            forsheda = Double.parseDouble(jTextField10.getText());
        } else {
            forsheda = 0;
        }

        if (butyl != bdd.getPrixJoint("Butyl")) {
            bdd.updateJoint(butyl, "Butyl");
        }
        if (forsheda != bdd.getPrixJoint("Forsheda")) {
            bdd.updateJoint(forsheda, "Forsheda");
        }
        resetJoint();
        rafraichirTarif();
        calculPrix();
        rafraichirTarif();
        
        JOptionPane.showMessageDialog(this, "Informations enregistrées");
}
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void TextFieldMargeButKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldMargeButKeyReleased
        calculPrix();
    }//GEN-LAST:event_TextFieldMargeButKeyReleased

    private void TextFieldMargeForKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldMargeForKeyReleased
        calculPrix();
    }//GEN-LAST:event_TextFieldMargeForKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ListListeAffaires.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Aucune affaire selectionnée!", "", JOptionPane.WARNING_MESSAGE);
        } else if (ComboBoxListeRegards.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Aucun regard selectionné!", "", JOptionPane.WARNING_MESSAGE);
        } else if (!verifyNumericTarif()) {
            JOptionPane.showMessageDialog(this, "Une des valeurs est incorrecte", "", JOptionPane.WARNING_MESSAGE);
        } else {

            int input = JOptionPane.showConfirmDialog(null, "Appliquer cette marge à tous les regards de l'affaire?");

            if (input == 0) {

                majAllTarifs();
                rafraichirTarif();
                setPrevisualisation(0);

            } else if (input == 1) {

                majTarif();
                rafraichirTarif();
                setPrevisualisation(0);

            }
            JOptionPane.showMessageDialog(this, "Les informations du tarif ont bien été mises à jour");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!jLabel18.getText().isEmpty()) {
            String[] pages = jLabel18.getText().split("/");
            int page = Integer.parseInt(pages[0]) - 1;
            int max = Integer.parseInt(pages[1]);

            if (page + 1 != max) {
                setPrevisualisation(page + 1);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jLabel18.getText().isEmpty()) {
            String[] pages = jLabel18.getText().split("/");
            int page = Integer.parseInt(pages[0]) - 1;

            if (!(page - 1 < 0)) {
                setPrevisualisation(page - 1);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPdfActionPerformed

        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);

        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }

        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + ".pdf"));

            doc.open();

            Affaire uneAffaire = bdd.getAffaireByCode(ListListeAffaires.getSelectedValue());
            ArrayList<Regard1> listeRegards = bdd.getAllRegardsAffaire(ListListeAffaires.getSelectedValue());

            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

//String chemin = classLoader.getResource("/images/entete.png").getPath();
            Image img = Image.getInstance(getClass().getResource("/images/entete.png"));

            img.scaleAbsoluteWidth(550);
            img.scaleAbsoluteHeight(110);
            img.setAlignment(Image.ALIGN_CENTER);
            doc.add(img);

            Paragraph affaire = new Paragraph("Affaire " + ((uneAffaire.getCodeAffaire())), FontFactory.getFont("Tahoma", 18, Font.BOLD));
            affaire.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(affaire);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));

            Phrase chant1 = new Phrase("Chantier: ", FontFactory.getFont("Tahoma", 14));
            Phrase chant2 = new Phrase(uneAffaire.getNomChantier() + ", " + uneAffaire.getVilleChantier(), FontFactory.getFont("Tahoma", 14, Font.BOLD));

            Phrase cli1 = new Phrase("Client: ", FontFactory.getFont("Tahoma", 14));
            Phrase cli2 = new Phrase(uneAffaire.getClient(), FontFactory.getFont("Tahoma", 14, Font.BOLD));

            Phrase atc1 = new Phrase("Etudiée par ", FontFactory.getFont("Tahoma", 14));
            Phrase atc2 = new Phrase(uneAffaire.getNomATC() + " ", FontFactory.getFont("Tahoma", 14, Font.BOLD));

            Phrase date1 = new Phrase("le ", FontFactory.getFont("Tahoma", 14));
            Phrase date2 = new Phrase(uneAffaire.getDate(), FontFactory.getFont("Tahoma", 14, Font.BOLD));

            Paragraph infosChantier = new Paragraph();
            Paragraph infosClient = new Paragraph();
            Paragraph infosATC = new Paragraph();

            infosChantier.add(chant1);
            infosChantier.add(chant2);

            infosClient.add(cli1);
            infosClient.add(cli2);

            infosATC.add(atc1);
            infosATC.add(atc2);
            infosATC.add(date1);
            infosATC.add(date2);

            doc.add(infosChantier);
            doc.add(new Paragraph(" "));
            doc.add(infosClient);
            doc.add(new Paragraph(" "));
            doc.add(infosATC);

            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));

            for (int i = 0; i < listeRegards.size(); i++) {
                Paragraph regard = new Paragraph("Regard " + (String.valueOf((listeRegards.get(i).getCodeRegard()))), FontFactory.getFont("Tahoma", 16, Font.BOLD));
                regard.setAlignment(Paragraph.ALIGN_CENTER);
                doc.add(regard);
                doc.add(new Paragraph(" "));

                Phrase te1 = new Phrase("Type effluant: ", FontFactory.getFont("Tahoma", 14));
                Phrase te2 = new Phrase(String.valueOf(listeRegards.get(i).getTypeEffluant()), FontFactory.getFont("Tahoma", 14, Font.BOLD));

                Phrase jb1 = new Phrase("                 Joints butyl: ", FontFactory.getFont("Tahoma", 14));
                Phrase jb2 = new Phrase(String.valueOf((listeRegards.get(i).getNbButyl())), FontFactory.getFont("Tahoma", 14, Font.BOLD));

                Phrase jf1 = new Phrase("                 Joints forsheda: ", FontFactory.getFont("Tahoma", 14));
                Phrase jf2 = new Phrase(String.valueOf((listeRegards.get(i).getNbForsheda())), FontFactory.getFont("Tahoma", 14, Font.BOLD));

                Paragraph infosRegard = new Paragraph();

                infosRegard.add(te1);
                infosRegard.add(te2);
                infosRegard.add(jb1);
                infosRegard.add(jb2);
                infosRegard.add(jf1);
                infosRegard.add(jf2);

                doc.add(infosRegard);
                doc.add(new Paragraph(" "));

                PdfPTable tbl = new PdfPTable(7);
                tbl.setWidthPercentage(100);

                tbl.addCell("Hauteur totale (m)");
                tbl.addCell("Hauteur utile (m)");
                tbl.addCell("Fond");
                tbl.addCell("Fermeture");
                tbl.addCell("Réhausse");
                tbl.addCell("Elements droits");
                tbl.addCell("Qté élem. droits");

                Element fond = bdd.getFondRegard(String.valueOf((listeRegards.get(i).getCodeRegard())), uneAffaire.getCodeAffaire());
                Element reduction = bdd.getReductionRegard(String.valueOf((listeRegards.get(i).getCodeRegard())), uneAffaire.getCodeAffaire());
                Element rehausse = bdd.getRehausseRegard(String.valueOf((listeRegards.get(i).getCodeRegard())), uneAffaire.getCodeAffaire());
                Tarif tarif = bdd.getTarifOfRegard(String.valueOf((listeRegards.get(i).getCodeRegard())), uneAffaire.getCodeAffaire());

                tbl.addCell((String.valueOf(listeRegards.get(i).getHauteurT())));
                tbl.addCell((String.valueOf(listeRegards.get(i).getHauteurU())));
                tbl.addCell((String.valueOf(fond.getRefElement())));
                tbl.addCell((String.valueOf(reduction.getRefElement())));
                if (rehausse.getRefElement() == null) {
                    tbl.addCell("0");
                } else {
                    tbl.addCell((String.valueOf(rehausse.getRefElement())));
                }

                ArrayList<ElementDuRegard> listeElementsD = bdd.getAllElementsDRegard((listeRegards.get(i).getCodeRegard()), uneAffaire.getCodeAffaire());

                if (listeElementsD.size() > 0) {
                    for (int a = 0; a < listeElementsD.size(); a++) {
                        tbl.addCell((String.valueOf(listeElementsD.get(a).getRefElement())));
                        tbl.addCell((String.valueOf(listeElementsD.get(a).getQuantite())));
                        tbl.addCell("");
                        tbl.addCell("");
                        tbl.addCell("");
                        tbl.addCell("");
                        tbl.addCell("");
                    }
                } else {
                    tbl.addCell("0");
                    tbl.addCell("0");
                }
                doc.add(tbl);
                doc.add(new Paragraph(" "));

                Phrase pv1 = new Phrase("Prix de vente: ", FontFactory.getFont("Tahoma", 14));
                Phrase pv2 = new Phrase(String.valueOf((tarif.getPrixTotal())) + " € H.T", FontFactory.getFont("Tahoma", 14, Font.BOLD));

                Paragraph prixVente = new Paragraph();

                prixVente.add(pv1);
                prixVente.add(pv2);

                doc.add(new Paragraph(prixVente));
                doc.add(new Paragraph(" "));
                doc.add(new Paragraph(" "));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(methodes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(methodes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(methodes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(methodes.class.getName()).log(Level.SEVERE, null, ex);
        }

        doc.close();
        JOptionPane.showMessageDialog(this, "L'affaire a bien été exportée au format pdf");
    }//GEN-LAST:event_ButtonPdfActionPerformed

    private void TextFieldPrixTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPrixTotActionPerformed

    }//GEN-LAST:event_TextFieldPrixTotActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceCalepinex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceCalepinex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceCalepinex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceCalepinex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceCalepinex().setVisible(true);
            }
        });
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public void erreurCouleur() {
        if (TextFieldHauteurTotale.getText().equals("0.0")) {
            TextFieldHauteurTotale.setForeground(Color.red);
        } else {
            TextFieldHauteurTotale.setForeground(Color.black);
        }

        if (TextFieldHauteurE.getText().equals("0.0")) {
            TextFieldHauteurE.setForeground(Color.red);
        } else {
            TextFieldHauteurE.setForeground(Color.black);
        }
    }

    private boolean verifyFormAffaire() {
        return !((TextFieldCodeAffaire.getText().isEmpty()) || (TextFieldClient.getText().isEmpty()) || (TextFieldNomChantier.getText().isEmpty())
                || (TextFieldVilleChantier.getText().isEmpty()) || (TextFieldATC.getText().isEmpty())
                || (TextFieldDate.getText().isEmpty()));
    }

    private boolean verifyFormRegard() {
        return !((TextFieldRegard.getText().isEmpty()) || (TextFieldTn.getText().isEmpty()) || (TextFieldFe.getText().isEmpty())
                || (TextFieldEpaisseurTampon.getText().isEmpty()));
    }

    private boolean verifyFormElement() {
        return !((TextFieldRefElemD.getText().isEmpty()) || (TextFieldHautElemD.getText().isEmpty()) || (TextFieldPrixElemD.getText().isEmpty())
                || (TextFieldFournElemD.getText().isEmpty()));

    }

    private boolean verifyNumericRegard() {
        if ((!isNumeric(TextFieldTn.getText())) || (!isNumeric(TextFieldFe.getText()) || !isNumeric(TextFieldJointFor.getText()))) {
            return false;
        } else {
            return true;
        }
    }
    
       private boolean verifyNumericTarif() {
        if ((!isNumeric(TextFieldMargeReg.getText())) || (!isNumeric(TextFieldMargeBut.getText()) || (!isNumeric(TextFieldMargeFor.getText())))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean verifyNumericElement() {
        if ((!isNumeric(TextFieldPrixElemD.getText())) || (!isNumeric(TextFieldHautElemD.getText()))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean verifyNumericJoint() {
        if ((!isNumeric(jTextField8.getText())) || (!isNumeric(jTextField10.getText()))) {
            return false;
        } else {
            return true;
        }
    }
    
    public void majTarif() {
        Tarif unTarif = new Tarif();
        unTarif.setCodeRegard((String) ComboBoxListeRegards1.getSelectedItem());
        unTarif.setCodeAffaire(ListListeAffaires.getSelectedValue());
        unTarif.setMargeButyl(Double.parseDouble(TextFieldMargeBut.getText()));
        unTarif.setMargeForsheda(Double.parseDouble(TextFieldMargeFor.getText()));
        unTarif.setMargeRegard(Double.parseDouble(TextFieldMargeReg.getText()));
        unTarif.setPrixTotal(Double.parseDouble(TextFieldPrixTot.getText()));

        bdd.updateTarif(unTarif);
    }
    
        public void majAllTarifs() {
        Tarif unTarif = new Tarif();
        unTarif.setCodeAffaire(ListListeAffaires.getSelectedValue());
        unTarif.setMargeButyl(Double.parseDouble(TextFieldMargeBut.getText()));
        unTarif.setMargeForsheda(Double.parseDouble(TextFieldMargeFor.getText()));
        unTarif.setMargeRegard(Double.parseDouble(TextFieldMargeReg.getText()));

        bdd.updateAllTarifs(unTarif);
    }

    public void calculPrix() {

        prixRegard();
        prixButyl();
        prixForsheda();
        double total = Double.parseDouble(jTextField3.getText()) + Double.parseDouble(jTextField6.getText()) + Double.parseDouble(jTextField13.getText());
        TextFieldPrixTot.setText(String.valueOf(Math.round(total * 100.0) / 100.0));
    }

    public void prixRegard() {
        double marge = 0;

        if (!TextFieldMargeReg.getText().isEmpty() && isNumeric(TextFieldMargeReg.getText())) {
            marge = (Double.parseDouble(TextFieldMargeReg.getText()));
        }
        double achat = Double.parseDouble(TextFieldAchatReg.getText());

        double pourcent = (achat * marge) / 100;

        double vente = achat + pourcent;

        jTextField3.setText((String.valueOf((Math.round(vente * 100.0) / 100.0))));
    }

    public void prixButyl() {
        double marge = 0;

        if (!TextFieldMargeBut.getText().isEmpty() && isNumeric(TextFieldMargeBut.getText())) {
            marge = (Double.parseDouble(TextFieldMargeBut.getText()));
        }
        double achat = Double.parseDouble(TextFieldAchatBut.getText());

        double pourcent = (achat * marge) / 100;

        double vente = achat + pourcent;

        jTextField6.setText((String.valueOf((Math.round(vente * 100.0) / 100.0))));
    }

    public void prixForsheda() {
        double marge = 0;

        if (!TextFieldMargeFor.getText().isEmpty() && isNumeric(TextFieldMargeFor.getText())) {
            marge = (Double.parseDouble(TextFieldMargeFor.getText()));
        }
        double achat = Double.parseDouble(TextFieldAchatFor.getText());

        double pourcent = (achat * marge) / 100;

        double vente = achat + pourcent;

        jTextField13.setText((String.valueOf((Math.round(vente * 100.0) / 100.0))));
    }

    public void calculEcart() {

        totalElemD = 0;
        for (int row = 0; row < jTableElements.getRowCount(); row++) {

            double hauteurElementD = 0;
            int quantite = 0;

            if (jTableElements.getValueAt(row, 0) != null) {
                hauteurElementD = bdd.getElementByRef((String) jTableElements.getValueAt(row, 0)).getMesureElement();
                if (jTableElements.getValueAt(row, 1) == null) {
                    quantite = 1;

                } else {
                    quantite = (Integer) jTableElements.getValueAt(row, 1);
                }
            }
            double total1 = hauteurElementD * quantite;
            totalElemD = totalElemD + total1;
        }

        calcul = (hauteurT - (((hauteurFond + rehausseHaut + reducHaut + totalElemD) / 1000))) * 100;
        TextFieldEcart.setText(String.valueOf((Math.round(calcul * 100.0) / 100.0)));
        
        if (Double.parseDouble(TextFieldEcart.getText()) < 0) {
            TextFieldEcart.setForeground(Color.red);
        } else {
            TextFieldEcart.setForeground(Color.black);
        }

        calculNbJoints();
    }

    public void calculNbJoints() {
        int nbjoint = 0;

        if (ComboBoxDalleCone.getSelectedItem() != null) {
            nbjoint++;
        }

        if (ComboBoxRehausse.getSelectedItem() != "Aucun" && ComboBoxRehausse.getSelectedItem() != null) {
            nbjoint++;
        }

        for (int row = 0; row < jTableElements.getRowCount(); row++) {

            int quantite = 0;

            if (jTableElements.getValueAt(row, 0) != null) {
                if (jTableElements.getValueAt(row, 1) != null) {

                    quantite = quantite + (Integer) jTableElements.getValueAt(row, 1);
                } else {
                    quantite = quantite + 1;
                }
            }
            nbjoint = nbjoint + quantite;
        }
        TextFieldJointBut.setText(String.valueOf(nbjoint));
    }

    private boolean affaireExists(String codeAffaire) {
        ArrayList<Affaire> listAffaires = bdd.getAllAffaires();
        for (Affaire uneAffaire : listAffaires) {
            if (codeAffaire.equals(uneAffaire.getCodeAffaire())) {
                return true;
            }
        }
        return false;
    }

    private boolean regardExists(String codeRegard, String codeAffaire) {
        ArrayList<Regard1> listRegards = bdd.getAllRegards();
        for (Regard1 unRegard : listRegards) {
            if (codeRegard.equals(unRegard.getCodeRegard()) && codeAffaire.equals(unRegard.getCodeAffaire())) {
                return true;
            }
        }
        return false;
    }

    private boolean elementExists(String refElem) {
        ArrayList<Element> listElements = bdd.getAllElements();
        for (Element unElement : listElements) {
            if (refElem.equals(unElement.getRefElement())) {
                return true;
            }
        }
        return false;
    }

    private void setModifierAffaire() {
        affaireSelect = bdd.getAffaireByCode(ListListeAffaires.getSelectedValue());
        ButtonCreer.setText("Modifier");
        TextFieldCodeAffaire.setEnabled(false);

        TextFieldCodeAffaire.setText(affaireSelect.getCodeAffaire());
        TextFieldClient.setText(affaireSelect.getClient());
        TextFieldNomChantier.setText(affaireSelect.getNomChantier());
        TextFieldVilleChantier.setText(affaireSelect.getVilleChantier());
        TextFieldATC.setText(affaireSelect.getNomATC());
        TextFieldDate.setText(affaireSelect.getDate());

        int nbRegards = bdd.getAllRegardsAffaire(ListListeAffaires.getSelectedValue()).size();
        if (nbRegards != 0) {
            setPrevisualisation(0);
        }
    }

    private void setModifierRegard() {
        Regard1 regardSelect = bdd.getRegardByCode(String.valueOf((ComboBoxListeRegards.getSelectedItem())), ListListeAffaires.getSelectedValue());
        Element fond = bdd.getFondRegard(String.valueOf((ComboBoxListeRegards.getSelectedItem())), ListListeAffaires.getSelectedValue());
        Element reduction = bdd.getReductionRegard(String.valueOf((ComboBoxListeRegards.getSelectedItem())), ListListeAffaires.getSelectedValue());
        Element rehausse = bdd.getRehausseRegard(String.valueOf((ComboBoxListeRegards.getSelectedItem())), ListListeAffaires.getSelectedValue());

        ButtonCreer1.setText("Modifier");
        TextFieldRegard.setEnabled(false);

        TextFieldRegard.setText(regardSelect.getCodeRegard());
        TextFieldEpaisseurTampon.setText(String.valueOf(regardSelect.getEpaisseurTampon()));
        TextFieldTn.setText(String.valueOf(regardSelect.getTerrainNaturel()));
        TextFieldFe.setText(String.valueOf(regardSelect.getFildEau()));
        TextFieldHauteurTotale.setText(String.valueOf(regardSelect.getHauteurT()));
        TextFieldHauteurE.setText(String.valueOf(regardSelect.getHauteurU()));
        TextFieldJointBut.setText(String.valueOf(regardSelect.getNbButyl()));
        TextFieldJointFor.setText(String.valueOf(regardSelect.getNbForsheda()));
        ComboBoxTypeEffluant.setSelectedItem(regardSelect.getTypeEffluant());

        ComboBoxFond.setSelectedItem(fond.getRefElement());

        if ("Réduction à cône".equals(reduction.getTypeElement())) {
            CheckBoxCone.setSelected(true);
        } else {
            CheckBoxCone.setSelected(false);
        }

        setCone();

        if (rehausse.getRefElement() != null) {
            ComboBoxRehausse.setSelectedItem(rehausse.getRefElement());
        } else {
            ComboBoxRehausse.setSelectedItem("Aucun");
        }

        ComboBoxDalleCone.setSelectedItem(reduction.getRefElement());

        ((DefaultTableModel) jTableElements.getModel()).setRowCount(0);

        bdd.dispElementsD(jTableElements, regardSelect.getCodeRegard(), regardSelect.getCodeAffaire());

        hauteurT = Double.parseDouble(TextFieldHauteurE.getText());

        calculEcart();
    }

    private void setModifierElem() {
        Element elemSelect = bdd.getElementByRef(String.valueOf((ComboBoxElements.getSelectedItem())));

        TextFieldRefElemD.setEnabled(false);

        TextFieldRefElemD.setText(elemSelect.getRefElement());
        TextFieldFournElemD.setText(elemSelect.getFournisseur());
        TextFieldPrixElemD.setText(String.valueOf(elemSelect.getPrix()));
        TextFieldHautElemD.setText(String.valueOf(elemSelect.getMesureElement()));
        ComboBoxTypeElem1.setSelectedItem(String.valueOf(elemSelect.getTypeElement()));

        ButtonCreerElemD.setText("Modifier");
    }

    private void rafraichirTarif() {

        Tarif unTarif = bdd.getTarifOfRegard((String) ComboBoxListeRegards1.getSelectedItem(), ListListeAffaires.getSelectedValue());

        TextFieldAchatReg.setText((String.valueOf((bdd.getPrixRegard((String) ComboBoxListeRegards1.getSelectedItem(), ListListeAffaires.getSelectedValue())))));

        TextFieldAchatBut.setText((String.valueOf((bdd.getRegardByCode((String) ComboBoxListeRegards1.getSelectedItem(),ListListeAffaires.getSelectedValue()).getNbButyl() * bdd.getPrixJoint("Butyl")))));

        TextFieldAchatFor.setText((String.valueOf((bdd.getRegardByCode((String) ComboBoxListeRegards1.getSelectedItem(),ListListeAffaires.getSelectedValue()).getNbForsheda() * bdd.getPrixJoint("Forsheda")))));

        TextFieldMargeReg.setText(String.valueOf(unTarif.getMargeRegard()));
        TextFieldMargeBut.setText(String.valueOf(unTarif.getMargeButyl()));
        TextFieldMargeFor.setText(String.valueOf(unTarif.getMargeForsheda()));

        jLabel24.setText(String.valueOf(bdd.getTarifOfRegard((String) ComboBoxListeRegards1.getSelectedItem(), ListListeAffaires.getSelectedValue()).getPrixTotal()) + " € H.T");

        if (!(TextFieldPrixTot.getText() + " € H.T").equals(jLabel24.getText())) {
            jLabel24.setForeground(Color.red);

        } else {
            jLabel24.setForeground(Color.black);
        }

    }

    private void setCone() {
        if (CheckBoxCone.isSelected()) {
            ComboBoxDalleCone.setModel(modeleCombo1);
            rafraichirListeElements(modeleCombo1, "Réduction à cône");
            jLabel2.setText("Cône");
        } else {
            ComboBoxDalleCone.setModel(modeleCombo2);
            rafraichirListeElements(modeleCombo2, "Dalle sous chaussée");
            jLabel2.setText("Dalle sous chaussée");
        }
        if (!(ComboBoxDalleCone.getItemCount() < 1)) {
            ComboBoxDalleCone.setSelectedIndex(0);
        }
    }

    private void setPrevisualisation(int index) {
        Affaire uneAffaire = bdd.getAffaireByCode(ListListeAffaires.getSelectedValue());
        ArrayList<Regard1> listeRegards = bdd.getAllRegardsAffaire(ListListeAffaires.getSelectedValue());

        Element fond = bdd.getFondRegard(String.valueOf((listeRegards.get(index).getCodeRegard())), uneAffaire.getCodeAffaire());
        Element reduction = bdd.getReductionRegard(String.valueOf((listeRegards.get(index).getCodeRegard())), uneAffaire.getCodeAffaire());
        Element rehausse = bdd.getRehausseRegard(String.valueOf((listeRegards.get(index).getCodeRegard())), uneAffaire.getCodeAffaire());

        ArrayList<ElementDuRegard> listeElementsD = bdd.getAllElementsDRegard((listeRegards.get(index).getCodeRegard()), uneAffaire.getCodeAffaire());

        jLabel18.setText(String.valueOf(index + 1) + "/" + String.valueOf(listeRegards.size()));

        jLabel9.setText(uneAffaire.getCodeAffaire());
        jLabel15.setText(uneAffaire.getClient());
        jLabel13.setText(uneAffaire.getNomChantier());
        jLabel12.setText(String.valueOf(uneAffaire.getDate()));
        jLabel14.setText(uneAffaire.getNomATC());
        jLabel16.setText(uneAffaire.getVilleChantier());

        jLabel17.setText(listeRegards.get(index).getCodeRegard());
        jLabel19.setText(listeRegards.get(index).getTypeEffluant());
        jLabel20.setText(String.valueOf(listeRegards.get(index).getNbButyl()));
        jLabel21.setText(String.valueOf(listeRegards.get(index).getNbForsheda()));

        Tarif leTarif = bdd.getTarifOfRegard(listeRegards.get(index).getCodeRegard(), ListListeAffaires.getSelectedValue());
        jLabel22.setText(String.valueOf(leTarif.getPrixTotal()) + " € H.T");

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(1);

        jTable2.setValueAt(listeRegards.get(index).getHauteurT(), 0, 0);
        jTable2.setValueAt(listeRegards.get(index).getHauteurU(), 0, 1);
        jTable2.setValueAt(fond.getRefElement(), 0, 2);
        jTable2.setValueAt(reduction.getRefElement(), 0, 3);
        if (rehausse.getRefElement() == null) {
            jTable2.setValueAt("0", 0, 4);
        } else {
            jTable2.setValueAt(rehausse.getRefElement(), 0, 4);
        }
        if (listeElementsD.size() > 0) {
            for (int i = 0; i < listeElementsD.size(); i++) {
                model.setRowCount(listeElementsD.size());
                jTable2.setValueAt(listeElementsD.get(i).getRefElement(), i, 5);
                jTable2.setValueAt(listeElementsD.get(i).getQuantite(), i, 6);
            }
        } else {
            jTable2.setValueAt("", 0, 5);
            jTable2.setValueAt("", 0, 6);
        }

    }

    private void resetPrevisualisation() {
        ((DefaultTableModel) jTable2.getModel()).setRowCount(0);

        jLabel18.setText("");

        jLabel9.setText("");
        jLabel15.setText("");
        jLabel13.setText("");
        jLabel12.setText("");
        jLabel14.setText("");
        jLabel16.setText("");

        jLabel17.setText("");
        jLabel19.setText("");
        jLabel20.setText("");
        jLabel21.setText("");

        jLabel22.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjoutElem;
    private javax.swing.JButton ButtonChercher;
    private javax.swing.JButton ButtonCreer;
    private javax.swing.JButton ButtonCreer1;
    private javax.swing.JButton ButtonCreerElemD;
    private javax.swing.JButton ButtonNewElemD;
    private javax.swing.JButton ButtonNouveau;
    private javax.swing.JButton ButtonNouveau1;
    private javax.swing.JButton ButtonPdf;
    private javax.swing.JButton ButtonSupprElem;
    private javax.swing.JButton ButtonSupprElemD;
    private javax.swing.JButton ButtonSupprimer;
    private javax.swing.JButton ButtonSupprimer2;
    private javax.swing.JCheckBox CheckBoxCone;
    private javax.swing.JComboBox<String> ComboBoxDalleCone;
    private javax.swing.JComboBox<String> ComboBoxElements;
    private javax.swing.JComboBox<String> ComboBoxFond;
    private javax.swing.JComboBox<String> ComboBoxListeRegards;
    private javax.swing.JComboBox<String> ComboBoxListeRegards1;
    private javax.swing.JComboBox<String> ComboBoxRehausse;
    private javax.swing.JComboBox<String> ComboBoxTypeEffluant;
    private javax.swing.JComboBox<String> ComboBoxTypeElem;
    private javax.swing.JComboBox<String> ComboBoxTypeElem1;
    private javax.swing.JLabel LabelATC;
    private javax.swing.JLabel LabelClient;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelEcart;
    private javax.swing.JLabel LabelEpaisseurTampon;
    private javax.swing.JLabel LabelFe;
    private javax.swing.JLabel LabelFond;
    private javax.swing.JLabel LabelHauteurE;
    private javax.swing.JLabel LabelHauteurTotale;
    private javax.swing.JLabel LabelJointBut;
    private javax.swing.JLabel LabelJointFor;
    private javax.swing.JLabel LabelListeAffaires;
    private javax.swing.JLabel LabelListeRegards;
    private javax.swing.JLabel LabelListeRegards1;
    private javax.swing.JLabel LabelNomChantier;
    private javax.swing.JLabel LabelNumAffaire;
    private javax.swing.JLabel LabelNumRegard;
    private javax.swing.JLabel LabelRehausse;
    private javax.swing.JLabel LabelTn;
    private javax.swing.JLabel LabelTypeEffluant;
    private javax.swing.JLabel LabelVilleChantier;
    private javax.swing.JList<String> ListListeAffaires;
    private javax.swing.JPanel PanelDonneesAffaire;
    private javax.swing.JPanel PanelInfosChantier;
    private javax.swing.JPanel PanelInfosGenerales;
    private javax.swing.JPanel PanelInfosRegards;
    private javax.swing.JPanel PanelParamRegards;
    private javax.swing.JPanel PanelPrevisu;
    private javax.swing.JScrollPane ScrollPaneListeAffaires;
    private javax.swing.JTextField TextFieldATC;
    private javax.swing.JTextField TextFieldAchatBut;
    private javax.swing.JTextField TextFieldAchatFor;
    private javax.swing.JTextField TextFieldAchatReg;
    private javax.swing.JTextField TextFieldClient;
    private javax.swing.JTextField TextFieldCodeAffaire;
    private javax.swing.JTextField TextFieldDate;
    private javax.swing.JTextField TextFieldEcart;
    private javax.swing.JTextField TextFieldEpaisseurTampon;
    private javax.swing.JTextField TextFieldFe;
    private javax.swing.JTextField TextFieldFournElemD;
    private javax.swing.JTextField TextFieldHautElemD;
    private javax.swing.JTextField TextFieldHauteurE;
    private javax.swing.JTextField TextFieldHauteurTotale;
    private javax.swing.JTextField TextFieldJointBut;
    private javax.swing.JTextField TextFieldJointFor;
    private javax.swing.JTextField TextFieldMargeBut;
    private javax.swing.JTextField TextFieldMargeFor;
    private javax.swing.JTextField TextFieldMargeReg;
    private javax.swing.JTextField TextFieldNomChantier;
    private javax.swing.JTextField TextFieldPrixElemD;
    private javax.swing.JTextField TextFieldPrixTot;
    private javax.swing.JTextField TextFieldRefElemD;
    private javax.swing.JTextField TextFieldRegard;
    private javax.swing.JTextField TextFieldTn;
    private javax.swing.JTextField TextFieldVilleChantier;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelVente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelElemD;
    private javax.swing.JPanel jPanelTarif;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneTarif;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableElements;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldChercher;
    // End of variables declaration//GEN-END:variables

    public double hauteurT;
    public double hauteurFond;
    public double calcul;
    public double rehausseHaut;
    public double reducHaut;
    public double totalElemD;

    public Regard1 regard2 = new Regard1();
    public Affaire affaire1 = new Affaire();

    public Element element1 = new Element();

    DefaultComboBoxModel modeleCombo1 = new DefaultComboBoxModel();
    DefaultComboBoxModel modeleCombo2 = new DefaultComboBoxModel();

    public DefaultListModel<String> modelAffaires = new DefaultListModel();

    public DefaultComboBoxModel<String> modelRegards = new DefaultComboBoxModel();

    public DefaultComboBoxModel<String> modelElementsD = new DefaultComboBoxModel();

    public DefaultComboBoxModel<String> modelElements = new DefaultComboBoxModel();

    public DefaultComboBoxModel<String> modeleFond = new DefaultComboBoxModel();
    public DefaultComboBoxModel<String> modeleRehausse = new DefaultComboBoxModel();

    public final void setupListeAffaires() {

        ListListeAffaires.setModel(modelAffaires);
        rafraichirListeAffaires();
    }

    public final void setupListeRegards() {

        ComboBoxListeRegards.setModel(modelRegards);
        ComboBoxListeRegards1.setModel(modelRegards);
        rafraichirListeRegards();
    }

    private void rafraichirListeAffaires() {

        modelAffaires.clear();
        ArrayList<Affaire> listAffaires = bdd.getAllAffaires();

        for (int i = 0; i < listAffaires.size(); i++) {
            modelAffaires.addElement(listAffaires.get(i).toString());
        }
    }

    private void rafraichirListeRegards() {

        modelRegards.removeAllElements();
        ArrayList<Regard1> listRegards = bdd.getAllRegardsAffaire(ListListeAffaires.getSelectedValue());
        for (int i = 0; i < listRegards.size(); i++) {
            modelRegards.addElement(listRegards.get(i).toString());
        }
    }

    private void rafraichirListeElements(DefaultComboBoxModel model, String typeElem) {

        model.removeAllElements();
        ArrayList<Element> listElements = bdd.getAllElementsByType(typeElem);

        for (int i = 0; i < listElements.size(); i++) {
            model.addElement(listElements.get(i).getRefElement());
        }
    }

    private void resetAffaire() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date date = new Date();

        TextFieldCodeAffaire.setText("");
        TextFieldClient.setText("");
        TextFieldNomChantier.setText("");
        TextFieldVilleChantier.setText("");
        TextFieldATC.setText("");
        TextFieldDate.setText(dateFormat.format(date));
        ButtonCreer.setText("Créer");
        TextFieldCodeAffaire.setEnabled(true);
    }

    private void resetRegard() {

        ComboBoxListeRegards.setSelectedItem(null);
        TextFieldRegard.setEnabled(true);
        ButtonCreer1.setText("Créer");
        TextFieldRegard.setText("");
        TextFieldTn.setText("");
        TextFieldFe.setText("");
        TextFieldEpaisseurTampon.setText("120");
        TextFieldHauteurTotale.setText("");
        TextFieldHauteurE.setText("");
        CheckBoxCone.setSelected(false);

        setCone();

        jLabel2.setText("Dalle sous chaussée");

        ((DefaultTableModel) jTableElements.getModel()).setRowCount(0);
        TextFieldEcart.setText("");

        ComboBoxTypeEffluant.setSelectedIndex(0);

        rafraichirListeElements(modelElementsD, "Élément droit");

        ComboBoxRehausse.setModel(modeleRehausse);

        rafraichirListeElements(modeleRehausse, "Rehausse");
        modeleRehausse.insertElementAt("Aucun", 0);
        ComboBoxRehausse.setSelectedIndex(0);

    }

    private void resetElement() {

        ComboBoxTypeElem.setSelectedIndex(0);

        ComboBoxElements.setSelectedItem(null);

        TextFieldRefElemD.setEnabled(true);

        TextFieldRefElemD.setText("");
        TextFieldFournElemD.setText("");
        TextFieldPrixElemD.setText("");
        TextFieldHautElemD.setText("");

        ButtonCreerElemD.setText("Créer");

        resetJoint();

    }

    private void resetJoint() {
        jTextField8.setText(String.valueOf(bdd.getPrixJoint("Butyl")));
        jTextField10.setText(String.valueOf(bdd.getPrixJoint("Forsheda")));
    }

}
