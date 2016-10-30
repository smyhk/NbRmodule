/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamtwo.r.options;

import java.io.File;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.openide.util.NbPreferences;

final class RPanel extends javax.swing.JPanel
{

    private final ROptionsPanelController controller;
    private  String R_LIBRARY_PATH = "RScriptPath";
    private final Preferences preferences = null;

    RPanel(ROptionsPanelController controller)
    {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtExecutablePath = new javax.swing.JTextField();
        txtLibrariesPath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnOkay = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(RPanel.class, "RPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(RPanel.class, "RPanel.jLabel2.text")); // NOI18N

        txtExecutablePath.setText(org.openide.util.NbBundle.getMessage(RPanel.class, "RPanel.txtExecutablePath.text")); // NOI18N

        txtLibrariesPath.setText(org.openide.util.NbBundle.getMessage(RPanel.class, "RPanel.txtLibrariesPath.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnBrowse, org.openide.util.NbBundle.getMessage(RPanel.class, "RPanel.btnBrowse.text")); // NOI18N
        btnBrowse.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBrowseActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnOkay, org.openide.util.NbBundle.getMessage(RPanel.class, "RPanel.btnOkay.text")); // NOI18N
        btnOkay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOkayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExecutablePath)
                    .addComponent(txtLibrariesPath, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrowse)
                    .addComponent(btnOkay))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtExecutablePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtLibrariesPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOkay))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBrowseActionPerformed
    {//GEN-HEADEREND:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        String fileName = txtExecutablePath.getText();
        JFileChooser chooser = new JFileChooser(new File(fileName));
        int result = chooser.showOpenDialog(this);
        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                File selectedFile = chooser.getSelectedFile();
                txtExecutablePath.setText(selectedFile.getAbsolutePath());
                controller.changed();
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                break;
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnOkayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkayActionPerformed
    {//GEN-HEADEREND:event_btnOkayActionPerformed
        // TODO add your handling code here:
        NbPreferences.forModule(this.getClass()).put("RPanel.libpath", txtLibrariesPath.getText());
        JOptionPane.showMessageDialog(this, "Libraries paths registred");
    }//GEN-LAST:event_btnOkayActionPerformed

    void load()
    {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(RPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(RPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        txtLibrariesPath.setText(NbPreferences.forModule(this.getClass()).get("RPanel.libpath", "R librairies path"));
        txtExecutablePath.setText(NbPreferences.forModule(this.getClass()).get("RPanel.path", "R executable path"));
    }

    void store()
    {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(RPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(RPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        NbPreferences.forModule(this.getClass()).put("RPanel.path", txtExecutablePath.getText());
    }

    boolean valid()
    {
        // TODO check whether form is consistent and complete
        String path = txtExecutablePath.getText();
        return new File(path).exists();
    }
    
    public String getR_LIBRARY_PATH() {
        return NbPreferences.forModule(this.getClass()).get("RPanel.libpath", "R librairies path");
    }

    public void setR_LIBRARY_PATH(String R_LIBRARY_PATH) {
        this.R_LIBRARY_PATH = R_LIBRARY_PATH;
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnOkay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtExecutablePath;
    private javax.swing.JTextField txtLibrariesPath;
    // End of variables declaration//GEN-END:variables
}
