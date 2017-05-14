/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controllers.AutoPartServices;
import Controllers.UsersServices;
import Domain.AutoPart;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 * Main AutoPart Frame
 * Here is were all frame all call for Auto Part
 * @author RALP
 */
public class AutoPartFrame extends javax.swing.JFrame {

    /**
     * Frame that will static to prevent multiple frame to be open
     */

    private static AddAutoPartFrame addAutoFrame;
    private static ModifyAutoPartFrame modifyFrame;
    private static AboutFrame aboutFrame;
    private static HelpFrame helpFrame;
    private static DisplayFrame displayFrame;


    /**
     * Default Constructore
     */
    public AutoPartFrame() {
        super("AutoParts");
        initComponents();
        setVisible(true);
        ArrayList<AutoPart> list = (ArrayList<AutoPart>) AutoPartServices.getAllAutoParts();
        addAutoPartToTable(list);
        ResetjButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchjTable.clearSelection();
                addAutoPartToTable((ArrayList<AutoPart>) AutoPartServices.getAllAutoParts());



            }
        });

        HelpC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpFrame = new HelpFrame();
                helpFrame.setVisible(true);
            }
        });
        DisplayAP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int i = SearchjTable.getSelectedRow();
                    String temp =  SearchjTable.getValueAt(i,0).toString();
                    AutoPart a = AutoPartServices.searchAutoParts(temp).get(0);
                    displayFrame = new DisplayFrame(a);

                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(SearchjTable, "No selected autopart", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                AutoPartServices.closeSession();
                dispose();
                super.windowClosing(e);
            }
        });

        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String partNo = JOptionPane.showInputDialog(SearchjTable,"Part No: ");
                ArrayList<AutoPart> result =(ArrayList<AutoPart>) AutoPartServices.searchLikeAutoParts(partNo);
                //System.out.println(result);
                if(result.isEmpty()){
                    JOptionPane.showMessageDialog(SearchjTable, "No part # found", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    addAutoPartToTable(result);
                }
            }
        });





    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private static DefaultTableModel model = new DefaultTableModel(new Object [][] {
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null}
    },
            new String [] {
                    "Part Number", "Part Name", "Car Model", "Car Brand", "Quantity", "Part Cost", "Part Price"
            }
    ) {
        boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
        };
        @Override
        public Class getColumnClass(int column) {
            return super.getColumnClass(column);
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        SearchjTable = new javax.swing.JTable(model);
        ResetjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AddAP = new javax.swing.JMenuItem();
        ModifyAP = new javax.swing.JMenuItem();
        DisplayAP = new javax.swing.JMenuItem();
        Search = new javax.swing.JMenuItem();
        Quit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        HelpC = new javax.swing.JMenuItem();
        AboutP = new javax.swing.JMenuItem();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        SearchjTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(SearchjTable);
        
        ResetjButton.setText("Reset");

        jMenu1.setText("File");

        AddAP.setText("Add Auto Part");
        AddAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAPActionPerformed(evt);
            }
        });
        jMenu1.add(AddAP);

        ModifyAP.setText("Modify Auto Part");
        ModifyAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyAPActionPerformed(evt);
            }
        });
        jMenu1.add(ModifyAP);

        DisplayAP.setText("Display Auto Part");
        jMenu1.add(DisplayAP);

        Search.setText("Search");
        jMenu1.add(Search);

        Quit.setText("Exit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        jMenu1.add(Quit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        HelpC.setText("Help Contents");
        jMenu2.add(HelpC);

        AboutP.setText("About");
        AboutP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutPActionPerformed(evt);
            }
        });
        jMenu2.add(AboutP);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResetjButton)
                                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(ResetjButton)))
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAPActionPerformed
        addAutoFrame = new AddAutoPartFrame();

        addAutoFrame.setVisible(true);
    }//GEN-LAST:event_AddAPActionPerformed

    private void AboutPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutPActionPerformed
            aboutFrame = new AboutFrame();
            aboutFrame.setVisible(true);

    }//GEN-LAST:event_AboutPActionPerformed

    private void ModifyAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyAPActionPerformed
        //Get selected auto part, of search auto part.
        try {
            int i = SearchjTable.getSelectedRow();
            String temp =  SearchjTable.getValueAt(i,0).toString();
            AutoPart a = AutoPartServices.searchAutoParts(temp).get(0);
            modifyFrame = new ModifyAutoPartFrame(a);
            modifyFrame.setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(SearchjTable, "No select Auto Part", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModifyAPActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        AutoPartServices.closeSession();

        System.exit(0);

    }//GEN-LAST:event_QuitActionPerformed

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
            java.util.logging.Logger.getLogger(AutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoPartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoPartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Search;
    private javax.swing.JMenuItem AboutP;
    private javax.swing.JMenuItem AddAP;
    private javax.swing.JMenuItem DisplayAP;
    private javax.swing.JMenuItem HelpC;
    private javax.swing.JMenuItem ModifyAP;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JButton ResetjButton;
    private javax.swing.JTable SearchjTable;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;

    private static void addAutoPartToTable(ArrayList<AutoPart> list){
        model.setRowCount(0);
        for(AutoPart a : list) {
            Object[] o  = new Object[7];
            o[0] = a.getPartno();
            o[1] = a.getPartname();
            o[2] = a.getCarmodel();
            o[3] = a.getCarbrand();
            o[4] = a.getQuantity().toString();
            o[5] = a.getPartcost().toString();
            o[6] = a.getPartprice().toString();
            model.addRow(o);


        }


    }

    private int getSelectedId(String partNo){
        return 0;
    }

    public static void update(){
        ArrayList<AutoPart> list = (ArrayList<AutoPart>) AutoPartServices.getAllAutoParts();
        addAutoPartToTable(list);
    }

    // End of variables declaration//GEN-END:variables
}
