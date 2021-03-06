/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertRemoveArrayList;

import static InsertRemoveArrayList.Personlist.logicalSize;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author ajdy5510
 */
public class PersonArrayGUI extends javax.swing.JFrame {
ArrayList<Person> people= new ArrayList();
DefaultListModel list= new DefaultListModel();
    public PersonArrayGUI() {
        initComponents();
        people.add((new Person("A,A",25,"M")));
        people.add(new Person("Africa,Toto",37,"M"));
        people.add(new Person("E,e",1400,"F"));
        people.add(new Person("Lmao,Lmao",25,"F"));
        lstnames.setModel(list);
        for (Person p:people) {
            list.addElement(p.getName());
        }
    }
    public void clearForm(){
        txtName.setText("");
        txtAge.setText("");
        buttonGroup1.clearSelection();
        lstnames.clearSelection();
        
    }
public static int search (ArrayList <Object> array, Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)array.get(midpoint)).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}

//////////////////////////////////////////////////////////////////////////////////

public static boolean insert(ArrayList <Object> array, Object newItem, int targetIndex)
{
	// Check for a full array and return false if full
	if (logicalSize == array.size())
	   return false;
	// Check for valid target index or return false 
	if (targetIndex < 0 || targetIndex > logicalSize)
	   return false;
	// Shift items down by one position
	for (int i = logicalSize; i > targetIndex; i--)      
	   array.set(i, array.get(i - 1));
	// Add new item, increment logical size,return true                       
        array.set(targetIndex, newItem); 
	logicalSize++;
	return true; 
}

//////////////////////////////////////////////////////////////////////////////////
	
public static boolean delete(ArrayList <Object> array, int targetIndex)
{
	if (targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
		 
		// Shift items up by one position
		for (int i = targetIndex; i < logicalSize - 1; i++)       
		   array.set(i, array.get(i + 1));
		 
		// Decrement logical size and return true 
		logicalSize--; 
		return true;                                   
}

/////////////////////////////////////////////////////////////////////////////////
	
public static int findInsertPoint (ArrayList <Object> array, Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   int midpoint=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	   
	      int result = ((Comparable)array.get(midpoint)).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)array.get(midpoint)).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstnames = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menfile = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        menedit = new javax.swing.JMenu();
        Clear = new javax.swing.JMenuItem();
        Add = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();
        menfilt = new javax.swing.JMenu();
        All = new javax.swing.JMenuItem();
        Male = new javax.swing.JMenuItem();
        Female = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(btnMale);
        btnMale.setText("Male");

        buttonGroup1.add(btnFemale);
        btnFemale.setText("Female");

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        jScrollPane2.setViewportView(lstnames);

        menfile.setText("File");

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/exit.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        menfile.add(Exit);

        jMenuBar1.add(menfile);

        menedit.setText("Edit");

        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/exit.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        menedit.add(Clear);

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/insert.png"))); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        menedit.add(Add);

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/delete.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        menedit.add(Delete);

        jMenuBar1.add(menedit);

        menfilt.setText("Filter");

        All.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/all.png"))); // NOI18N
        All.setText("Show All");
        All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllActionPerformed(evt);
            }
        });
        menfilt.add(All);

        Male.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/male.png"))); // NOI18N
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        menfilt.add(Male);

        Female.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemoveArrayList/female.png"))); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        menfilt.add(Female);

        jMenuBar1.add(menfilt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMale)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnFemale))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMale)
                    .addComponent(btnFemale))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
   System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
       clearForm();
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       String w=txtName.getText();
       Search(people,w);
       list.remove(lstnames.getSelectedIndex());
       
       
       
    }//GEN-LAST:event_DeleteActionPerformed

    private void AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed
public void show(Person p){
    txtName.setText(p.getName());
    txtAge.setText(p.getName());
    if(p.getGender()=="M")
        btnMale.setSelected(true);
    else 
        btnFemale.setSelected(true);
}
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
            java.util.logging.Logger.getLogger(PersonArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonArrayGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add;
    private javax.swing.JMenuItem All;
    private javax.swing.JMenuItem Clear;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Female;
    private javax.swing.JMenuItem Male;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> lstnames;
    private javax.swing.JMenu menedit;
    private javax.swing.JMenu menfile;
    private javax.swing.JMenu menfilt;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void Search(ArrayList<Person> people, String w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
