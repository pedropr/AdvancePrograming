/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.AutoPart;

/**
 *
 * @author RALP
 */
public class ModifyAutoPartFrame extends javax.swing.JFrame {
    private AutoPart part;
    /**
     * Creates new form ModifyAutoPartFrame
     */
    public ModifyAutoPartFrame(AutoPart p) {

        initComponents();
        this.part = part;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchLabel = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        ModPartNameLabel = new javax.swing.JLabel();
        ModPartImgjLabel = new javax.swing.JLabel();
        ModCarModeljLabel = new javax.swing.JLabel();
        ModCarBrandjLabel = new javax.swing.JLabel();
        ModQuantityjLabel = new javax.swing.JLabel();
        ModCostjLabel = new javax.swing.JLabel();
        ModPricejLabel = new javax.swing.JLabel();
        ModPartNameTextField = new javax.swing.JTextField();
        ModPartImgTextField = new javax.swing.JTextField();
        ModCarModelTextField = new javax.swing.JTextField();
        ModCarBrandTextField = new javax.swing.JTextField();
        ModQuantityTextField = new javax.swing.JTextField();
        ModCostTextField = new javax.swing.JTextField();
        ModPriceTextField = new javax.swing.JTextField();
        ModSaveButton = new javax.swing.JButton();
        ModCancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchLabel.setText("Search Part No. :");

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });

        ModPartNameLabel.setText("Part Name:");

        ModPartImgjLabel.setText("Part Image Name:");

        ModCarModeljLabel.setText("Car Model:");

        ModCarBrandjLabel.setText("Car Brand:");

        ModQuantityjLabel.setText("Quantity:");

        ModCostjLabel.setText("Cost:");

        ModPricejLabel.setText("Price:");

        ModPartImgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModPartImgTextFieldActionPerformed(evt);
            }
        });

        ModCostTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModCostTextFieldActionPerformed(evt);
            }
        });

        ModSaveButton.setText("Save");

        ModCancelButton.setText("Cancel");
        ModCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModSaveButton)
                    .addComponent(ModPricejLabel)
                    .addComponent(ModCostjLabel)
                    .addComponent(ModQuantityjLabel)
                    .addComponent(ModCarBrandjLabel)
                    .addComponent(ModCarModeljLabel)
                    .addComponent(ModPartNameLabel)
                    .addComponent(SearchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModCancelButton)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ModPartImgjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ModPriceTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(ModCostTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ModQuantityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ModCarBrandTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ModCarModelTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ModPartImgTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ModPartNameTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchLabel)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModPartNameLabel)
                    .addComponent(ModPartNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModPartImgjLabel)
                    .addComponent(ModPartImgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModCarModeljLabel)
                    .addComponent(ModCarModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModCarBrandjLabel)
                    .addComponent(ModCarBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModQuantityjLabel)
                    .addComponent(ModQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModCostjLabel)
                    .addComponent(ModCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModPricejLabel)
                    .addComponent(ModPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModSaveButton)
                    .addComponent(ModCancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void ModCostTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModCostTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModCostTextFieldActionPerformed

    private void ModPartImgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModPartImgTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModPartImgTextFieldActionPerformed

    private void ModCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModCancelButtonActionPerformed
    System.exit(0);
    }//GEN-LAST:event_ModCancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyAutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyAutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyAutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyAutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AutoPart part = new AutoPart();
                new ModifyAutoPartFrame(part).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModCancelButton;
    private javax.swing.JTextField ModCarBrandTextField;
    private javax.swing.JLabel ModCarBrandjLabel;
    private javax.swing.JTextField ModCarModelTextField;
    private javax.swing.JLabel ModCarModeljLabel;
    private javax.swing.JTextField ModCostTextField;
    private javax.swing.JLabel ModCostjLabel;
    private javax.swing.JTextField ModPartImgTextField;
    private javax.swing.JLabel ModPartImgjLabel;
    private javax.swing.JLabel ModPartNameLabel;
    private javax.swing.JTextField ModPartNameTextField;
    private javax.swing.JTextField ModPriceTextField;
    private javax.swing.JLabel ModPricejLabel;
    private javax.swing.JTextField ModQuantityTextField;
    private javax.swing.JLabel ModQuantityjLabel;
    private javax.swing.JButton ModSaveButton;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchTextField;
    // End of variables declaration//GEN-END:variables
}
