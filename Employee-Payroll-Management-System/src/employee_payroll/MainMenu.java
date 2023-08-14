/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_payroll;

import java.awt.Dimension;
import java.awt.Toolkit;



/**
 *
 * @author ZI Zohir
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        lbl_emp.setText(String.valueOf(Emp.empName).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnupSalary = new javax.swing.JButton();
        btnEmpM = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDeduction = new javax.swing.JButton();
        btnAllow = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        lbl_emp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main_Menu");

        jPanel2.setLayout(null);

        btnupSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/Update.png"))); // NOI18N
        btnupSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupSalaryActionPerformed(evt);
            }
        });
        jPanel2.add(btnupSalary);
        btnupSalary.setBounds(510, 290, 50, 50);

        btnEmpM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/Add_Employee.png"))); // NOI18N
        btnEmpM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpMActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmpM);
        btnEmpM.setBounds(510, 220, 50, 50);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/Search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch);
        btnSearch.setBounds(570, 220, 50, 50);

        btnDeduction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/Deduction.png"))); // NOI18N
        btnDeduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeductionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeduction);
        btnDeduction.setBounds(570, 290, 50, 50);

        btnAllow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/Allowance.png"))); // NOI18N
        btnAllow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllowActionPerformed(evt);
            }
        });
        jPanel2.add(btnAllow);
        btnAllow.setBounds(630, 220, 50, 50);

        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/Payment.png"))); // NOI18N
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel2.add(btnPayment);
        btnPayment.setBounds(630, 290, 50, 50);

        lbl_emp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emp.setText("emp");
        jPanel2.add(lbl_emp);
        lbl_emp.setBounds(100, 340, 50, 14);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged in As:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 340, 65, 14);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout);
        btnLogout.setBounds(630, 10, 53, 47);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_payroll/images/bk2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 380);

        jMenu1.setText("Employee");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");

        jMenuItem1.setText("Employees Report");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Employees Total Amount Report");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Employees Total Deduction Report");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Audit");

        jMenuItem4.setText("Audit Trailer");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpMActionPerformed
        addEmployee am = new addEmployee();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmpMActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SearchEmpSalary ses = new SearchEmpSalary();
        ses.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAllowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllowActionPerformed
        Allowance allow = new Allowance();
        allow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAllowActionPerformed

    private void btnupSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupSalaryActionPerformed
        UpdateSalary us = new UpdateSalary();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnupSalaryActionPerformed

    private void btnDeductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeductionActionPerformed
        Deduction ded = new Deduction();
        ded.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeductionActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        Audit ad = new Audit();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllow;
    private javax.swing.JButton btnDeduction;
    private javax.swing.JButton btnEmpM;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnupSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_emp;
    // End of variables declaration//GEN-END:variables
}