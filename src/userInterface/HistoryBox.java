/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import applicationLogic.BoxHistory;
import applicationLogic.DonationBox;
import applicationLogicAccess.Access;

/**
 *
 * @author Timo
 */
public class HistoryBox extends javax.swing.JDialog {

    int collId;
    DefaultTableModel tableModel;
    ArrayList<BoxHistory> listBoxes;
    /**
     * Initializes the Window
     *
     * @param parent the parent
     * @param modal determines if the window should be modal or not
     * @param collID the ID of the collection supplying the BoxHistory
     */
    public HistoryBox(java.awt.Frame parent, boolean modal, int collId) {
        super(parent, modal);
        this.collId = collId;
        this.listBoxes = Access.getBoxHistoriesWithCollectionId(collId);
        initComponents();
        Collections.reverse(listBoxes);
        initTable(listBoxes);
        //added by sz
      	Image imgIcon = new ImageIcon("images/icon.png").getImage();
      	setIconImage(imgIcon);
      	//
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBoxes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Historie");

        tableBoxes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Von", "Bis", "Id", "Kommentar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBoxes.setFocusCycleRoot(true);
        tableBoxes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tableBoxes);
        if (tableBoxes.getColumnModel().getColumnCount() > 0) {
            tableBoxes.getColumnModel().getColumn(0).setMinWidth(80);
            tableBoxes.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableBoxes.getColumnModel().getColumn(0).setMaxWidth(80);
            tableBoxes.getColumnModel().getColumn(1).setMinWidth(80);
            tableBoxes.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableBoxes.getColumnModel().getColumn(1).setMaxWidth(80);
            tableBoxes.getColumnModel().getColumn(2).setMinWidth(30);
            tableBoxes.getColumnModel().getColumn(2).setPreferredWidth(30);
            tableBoxes.getColumnModel().getColumn(2).setMaxWidth(30);
        }

        jButton1.setText("Fenster schließen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(343, 343, 343))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }//</editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBoxes;
    // End of variables declaration//GEN-END:variables

    private void initTable(ArrayList<BoxHistory> list) {
        tableModel = (DefaultTableModel) tableBoxes.getModel();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String begin;
	String end;
        
        for (BoxHistory curr : list) {
            if (curr.getBeginDate() != null) {
                    begin = sdf.format(curr.getBeginDate().getTime());
            } else {
                    begin = "-";
            }

            if (curr.getEndDate() != null) {
                    end = sdf.format(curr.getEndDate().getTime());
            } else {
                    end = "-";
            }
            DonationBox box = Access.getDonationBoxById(curr.getBoxId());
            tableModel.insertRow(tableModel.getRowCount(), new Object[] {begin,end,curr.getBoxId(),box.getComment()});
        }
    }
}
