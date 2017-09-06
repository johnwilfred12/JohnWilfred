package StudentProfileDetails;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class JInternalFrameStudentYear extends javax.swing.JInternalFrame implements MouseListener {

    StudentYear sy = new StudentYear();
    /** Creates new form JInternalFrameStudentYear */
    public JInternalFrameStudentYear() {
        initComponents();
        setStudentYearTable();
        selectAllStudent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldStudentYear = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldStudentDescription = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPaneStudentYear = new javax.swing.JScrollPane();
        jTableStudentYear = new javax.swing.JTable();

        setName("Form"); // NOI18N

        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(christopher_quilaton_student_profile.Christopher_Quilaton_Student_ProfileApp.class).getContext().getResourceMap(JInternalFrameStudentYear.class);
        jButtonNew.setText(resourceMap.getString("jButtonNew.text")); // NOI18N
        jButtonNew.setFocusable(false);
        jButtonNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNew.setName("jButtonNew"); // NOI18N
        jButtonNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonNew);

        jButtonSave.setText(resourceMap.getString("jButtonSave.text")); // NOI18N
        jButtonSave.setFocusable(false);
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setName("jButtonSave"); // NOI18N
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSave);

        jButtonUpdate.setText(resourceMap.getString("jButtonUpdate.text")); // NOI18N
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUpdate.setName("jButtonUpdate"); // NOI18N
        jButtonUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonUpdate);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(3, 0));

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel4.add(jLabel1);

        jPanel7.setName("jPanel7"); // NOI18N
        jPanel4.add(jPanel7);

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel4.add(jLabel2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(3, 0));

        jTextFieldStudentYear.setText(resourceMap.getString("jTextFieldStudentYear.text")); // NOI18N
        jTextFieldStudentYear.setName("jTextFieldStudentYear"); // NOI18N
        jPanel5.add(jTextFieldStudentYear);

        jPanel6.setName("jPanel6"); // NOI18N
        jPanel5.add(jPanel6);

        jTextFieldStudentDescription.setText(resourceMap.getString("jTextFieldStudentDescription.text")); // NOI18N
        jTextFieldStudentDescription.setName("jTextFieldStudentDescription"); // NOI18N
        jTextFieldStudentDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentDescriptionActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldStudentDescription);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPaneStudentYear.setName("jScrollPaneStudentYear"); // NOI18N

        jTableStudentYear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableStudentYear.setName("jTableStudentYear"); // NOI18N
        jScrollPaneStudentYear.setViewportView(jTableStudentYear);

        jPanel3.add(jScrollPaneStudentYear, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        
        newData();
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
try{
     insertStudentYear();
    JOptionPane.showMessageDialog(null,"Successfully Saved!");
}catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        try{
            updateStudentYear();
            JOptionPane.showMessageDialog(null,"Successfully Updated!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldStudentDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStudentDescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPaneStudentYear;
    private javax.swing.JTable jTableStudentYear;
    private javax.swing.JTextField jTextFieldStudentDescription;
    private javax.swing.JTextField jTextFieldStudentYear;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    
    public void insertStudentYear(){
    sy.setStudentYear(jTextFieldStudentYear.getText().trim());
    sy.setStudentDescription(jTextFieldStudentDescription.getText().trim());
    sy.add();
    selectAllStudent();

    }
    public void newData(){
     sy.setId(0);
     jTextFieldStudentYear.setText("");
     jTextFieldStudentDescription.setText("");
     selectAllStudent();
    }
    public void updateStudentYear(){
     sy.setStudentYear(jTextFieldStudentYear.getText().trim());
     sy.setStudentDescription(jTextFieldStudentDescription.getText().trim());
     sy.update();
     selectAllStudent();

    }
    private void selectAllStudent() {
        studentYearTable.setRowCount(0);
        sy.select();
        for (int i = 0; i < sy.getData().size(); i++) {
            studentYearTable.addRow((Vector) sy.getData().get(i));
        }
    }
DefaultTableModel studentYearTable = new DefaultTableModel() {

        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 3) {
                return Boolean.class;
            } else {
                return Object.class;
            }
        }
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.

        public boolean isCellEditable(int row, int col) {
            if (col <3) {
                return false;
            } else {
                return true;
            }
        }
    }; //end of Instantiation

private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(studentYearTable);

private void setStudentYearTable() {
        //
        String[] columnNames = {
            "id",
            "Student Year",
            "Student Description",
           // "Deleted"
           };
        jTableStudentYear = new javax.swing.JTable(studentYearTable);
        jTableStudentYear.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableStudentYear.setShowGrid(false);
        jTableStudentYear.setFillsViewportHeight(true);
        jTableStudentYear.getTableHeader().setReorderingAllowed(false);
        jTableStudentYear.addMouseListener(this);
        jTableStudentYear.setColumnSelectionAllowed(true);
        jTableStudentYear.setAutoCreateRowSorter(true);
        jTableStudentYear.setRowSorter(sorter);
        jScrollPaneStudentYear.setViewportView(jTableStudentYear);
        JTableHeader header =jTableStudentYear.getTableHeader();
        header.setBackground(Color.ORANGE);
        //...set columnNames in table columns
        for (int i = 0; i < columnNames.length;) {
            studentYearTable.addColumn(columnNames[i]);
            i++;
        }

        TableColumn[] column = new TableColumn[100];
        //...
        column[0] = jTableStudentYear.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(50);

        column[1] = jTableStudentYear.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(80);

        column[2] = jTableStudentYear.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(100);

        

}

    public void mouseClicked(MouseEvent e) {
          if (e.getSource() == jTableStudentYear) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                if (e.getClickCount() == 2) {
                    int row = jTableStudentYear.getSelectedRow();
                    if (row != -1) {
                        Object id = jTableStudentYear.getValueAt(row, 0);
                        Object studentYear = jTableStudentYear.getValueAt(row, 1);
                        Object studentDescription = jTableStudentYear.getValueAt(row, 2);

                        //...Cast to String below
                        sy.setId(Integer.parseInt(id.toString().trim()));
                        jTextFieldStudentYear.setText(studentYear.toString());
                        jTextFieldStudentDescription.setText(studentDescription.toString());

    }
    }
    }
    }       
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
       
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }
}


