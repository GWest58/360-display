/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grant_000
 */
public class DoctorUI extends javax.swing.JFrame {

    /**
     * Creates new form DoctorUI
     */
    public DoctorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoctorUI = new javax.swing.JTabbedPane();
        viewPatientListTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nonSeverePatientList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        mildlySeverePatientList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        severePatientList = new javax.swing.JList();
        removePatientButton = new javax.swing.JButton();
        addPatientButton = new javax.swing.JButton();
        nonSeverePatientLabel = new javax.swing.JLabel();
        mildlySeverePatientLabel = new javax.swing.JLabel();
        severePatientLabel = new javax.swing.JLabel();
        editProfileTab = new javax.swing.JPanel();
        doctorNameLabel = new javax.swing.JLabel();
        doctorEmailLabel = new javax.swing.JLabel();
        doctorAddressLabel = new javax.swing.JLabel();
        doctorPhoneLabel = new javax.swing.JLabel();
        doctorHospitalLabel = new javax.swing.JLabel();
        doctorSecretLabel = new javax.swing.JLabel();
        doctorAnswerLabel = new javax.swing.JLabel();
        doctorPassLabel = new javax.swing.JLabel();
        doctorConfirmLabel = new javax.swing.JLabel();
        doctorNameField = new javax.swing.JTextField();
        doctorEmailField = new javax.swing.JTextField();
        doctorStreetField = new javax.swing.JTextField();
        doctorPhoneField = new javax.swing.JTextField();
        doctorHospitalField = new javax.swing.JTextField();
        doctorEditProfileHeader = new javax.swing.JLabel();
        doctorSecretField = new javax.swing.JTextField();
        doctorAnswerField = new javax.swing.JTextField();
        doctorSubmitButton = new javax.swing.JButton();
        doctorPassField = new javax.swing.JPasswordField();
        doctorConfirmField = new javax.swing.JPasswordField();
        doctorCurrentName = new javax.swing.JLabel();
        doctorCurrentEmail = new javax.swing.JLabel();
        doctorCurrentStreetAddress = new javax.swing.JLabel();
        doctorCurrentPhone = new javax.swing.JLabel();
        doctorCurrentHospital = new javax.swing.JLabel();
        doctorCurrentSecret = new javax.swing.JLabel();
        doctorCurrentAnswer = new javax.swing.JLabel();
        doctorCurrentCityStateAddress = new javax.swing.JLabel();
        doctorCityStateField = new javax.swing.JTextField();
        doctorCurrentCityState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DoctorUI.setBackground(new java.awt.Color(0, 51, 255));

        viewPatientListTab.setBackground(new java.awt.Color(204, 204, 255));

        nonSeverePatientList.setBackground(new java.awt.Color(51, 204, 0));
        nonSeverePatientList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nonSeverePatientList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(nonSeverePatientList);

        mildlySeverePatientList.setBackground(new java.awt.Color(255, 0, 0));
        mildlySeverePatientList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mildlySeverePatientList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(mildlySeverePatientList);

        severePatientList.setBackground(new java.awt.Color(255, 255, 0));
        severePatientList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        severePatientList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(severePatientList);

        removePatientButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removePatientButton.setText("Remove Patient");

        addPatientButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addPatientButton.setText("Add Patient");

        nonSeverePatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nonSeverePatientLabel.setForeground(new java.awt.Color(0, 204, 0));
        nonSeverePatientLabel.setText("Non-Severe Patients");

        mildlySeverePatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mildlySeverePatientLabel.setForeground(new java.awt.Color(255, 255, 0));
        mildlySeverePatientLabel.setText("Mildly-Severe Patients");

        severePatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        severePatientLabel.setForeground(new java.awt.Color(255, 0, 0));
        severePatientLabel.setText("Severe Patients");

        javax.swing.GroupLayout viewPatientListTabLayout = new javax.swing.GroupLayout(viewPatientListTab);
        viewPatientListTab.setLayout(viewPatientListTabLayout);
        viewPatientListTabLayout.setHorizontalGroup(
            viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPatientListTabLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(nonSeverePatientLabel)
                .addGap(226, 226, 226)
                .addComponent(mildlySeverePatientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(severePatientLabel)
                .addGap(106, 106, 106))
            .addGroup(viewPatientListTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(viewPatientListTabLayout.createSequentialGroup()
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewPatientListTabLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewPatientListTabLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(removePatientButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );

        viewPatientListTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        viewPatientListTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addPatientButton, removePatientButton});

        viewPatientListTabLayout.setVerticalGroup(
            viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addComponent(severePatientLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPatientListTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nonSeverePatientLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mildlySeverePatientLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(viewPatientListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removePatientButton)
                    .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        viewPatientListTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        viewPatientListTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addPatientButton, removePatientButton});

        DoctorUI.addTab("View Patient List", viewPatientListTab);

        editProfileTab.setBackground(new java.awt.Color(204, 204, 255));

        doctorNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorNameLabel.setText("Name");

        doctorEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorEmailLabel.setText("Email");

        doctorAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorAddressLabel.setText("Address");

        doctorPhoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorPhoneLabel.setText("Phone");

        doctorHospitalLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorHospitalLabel.setText("Hospital");

        doctorSecretLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorSecretLabel.setText("Secret Question");

        doctorAnswerLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorAnswerLabel.setText("Secret Question Answer");

        doctorPassLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorPassLabel.setText("Password");

        doctorConfirmLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorConfirmLabel.setText("Confirm Password");

        doctorEditProfileHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        doctorEditProfileHeader.setText("Edit Doctor Information");

        doctorSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doctorSubmitButton.setText("Submit");

        doctorCurrentName.setText("jLabel1");

        doctorCurrentEmail.setText("jLabel2");

        doctorCurrentStreetAddress.setText("jLabel3");

        doctorCurrentPhone.setText("jLabel4");

        doctorCurrentHospital.setText("jLabel5");

        doctorCurrentSecret.setText("jLabel6");

        doctorCurrentAnswer.setText("jLabel7");

        doctorCurrentCityStateAddress.setText("jLabel8");

        javax.swing.GroupLayout editProfileTabLayout = new javax.swing.GroupLayout(editProfileTab);
        editProfileTab.setLayout(editProfileTabLayout);
        editProfileTabLayout.setHorizontalGroup(
            editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProfileTabLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProfileTabLayout.createSequentialGroup()
                        .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorAnswerLabel)
                                .addGap(18, 18, 18)
                                .addComponent(doctorCurrentAnswer))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorHospitalLabel)
                                .addGap(18, 18, 18)
                                .addComponent(doctorCurrentHospital))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorSecretLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doctorCurrentSecret))
                            .addComponent(doctorPassLabel)
                            .addComponent(doctorConfirmLabel)
                            .addComponent(doctorCurrentCityState)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorPhoneLabel)
                                .addGap(18, 18, 18)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorCurrentCityStateAddress)
                                    .addComponent(doctorCurrentPhone))))
                        .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorAnswerField)
                                    .addComponent(doctorConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(doctorHospitalField)
                                        .addComponent(doctorPhoneField)
                                        .addComponent(doctorSecretField)))
                                .addGap(232, 232, 232))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doctorEmailField)
                                    .addComponent(doctorStreetField)
                                    .addComponent(doctorNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(doctorCityStateField))
                                .addContainerGap(232, Short.MAX_VALUE))))
                    .addGroup(editProfileTabLayout.createSequentialGroup()
                        .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addComponent(doctorAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorCurrentStreetAddress))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(doctorSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editProfileTabLayout.createSequentialGroup()
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorNameLabel)
                                    .addComponent(doctorEmailLabel))
                                .addGap(23, 23, 23)
                                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorCurrentName)
                                    .addComponent(doctorCurrentEmail))))
                        .addContainerGap())))
            .addGroup(editProfileTabLayout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(doctorEditProfileHeader)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        editProfileTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doctorAnswerField, doctorEmailField, doctorHospitalField, doctorNameField, doctorPhoneField, doctorSecretField, doctorStreetField});

        editProfileTabLayout.setVerticalGroup(
            editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProfileTabLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(doctorEditProfileHeader)
                .addGap(51, 51, 51)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorNameLabel)
                    .addComponent(doctorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorEmailLabel)
                    .addComponent(doctorEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAddressLabel)
                    .addComponent(doctorStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentStreetAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorCurrentCityStateAddress)
                    .addComponent(doctorCityStateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentCityState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorPhoneLabel)
                    .addComponent(doctorPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorHospitalLabel)
                    .addComponent(doctorHospitalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentHospital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorSecretLabel)
                    .addComponent(doctorSecretField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentSecret))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAnswerLabel)
                    .addComponent(doctorAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCurrentAnswer))
                .addGap(6, 6, 6)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorPassLabel)
                    .addComponent(doctorPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorConfirmLabel)
                    .addComponent(doctorConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(doctorSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        editProfileTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doctorAnswerField, doctorEmailField, doctorHospitalField, doctorNameField, doctorPhoneField, doctorSecretField, doctorStreetField});

        DoctorUI.addTab("Edit Profile", editProfileTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoctorUI)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoctorUI)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane DoctorUI;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JLabel doctorAddressLabel;
    private javax.swing.JTextField doctorAnswerField;
    private javax.swing.JLabel doctorAnswerLabel;
    private javax.swing.JTextField doctorCityStateField;
    private javax.swing.JPasswordField doctorConfirmField;
    private javax.swing.JLabel doctorConfirmLabel;
    private javax.swing.JLabel doctorCurrentAnswer;
    private javax.swing.JLabel doctorCurrentCityState;
    private javax.swing.JLabel doctorCurrentCityStateAddress;
    private javax.swing.JLabel doctorCurrentEmail;
    private javax.swing.JLabel doctorCurrentHospital;
    private javax.swing.JLabel doctorCurrentName;
    private javax.swing.JLabel doctorCurrentPhone;
    private javax.swing.JLabel doctorCurrentSecret;
    private javax.swing.JLabel doctorCurrentStreetAddress;
    private javax.swing.JLabel doctorEditProfileHeader;
    private javax.swing.JTextField doctorEmailField;
    private javax.swing.JLabel doctorEmailLabel;
    private javax.swing.JTextField doctorHospitalField;
    private javax.swing.JLabel doctorHospitalLabel;
    private javax.swing.JTextField doctorNameField;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JPasswordField doctorPassField;
    private javax.swing.JLabel doctorPassLabel;
    private javax.swing.JTextField doctorPhoneField;
    private javax.swing.JLabel doctorPhoneLabel;
    private javax.swing.JTextField doctorSecretField;
    private javax.swing.JLabel doctorSecretLabel;
    private javax.swing.JTextField doctorStreetField;
    private javax.swing.JButton doctorSubmitButton;
    private javax.swing.JPanel editProfileTab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mildlySeverePatientLabel;
    private javax.swing.JList mildlySeverePatientList;
    private javax.swing.JLabel nonSeverePatientLabel;
    private javax.swing.JList nonSeverePatientList;
    private javax.swing.JButton removePatientButton;
    private javax.swing.JLabel severePatientLabel;
    private javax.swing.JList severePatientList;
    private javax.swing.JPanel viewPatientListTab;
    // End of variables declaration//GEN-END:variables
}
