/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package backup;

import student_management_system.*;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import student_management_system.body.Login;
import student_management_system.body.add_course;
import student_management_system.body.add_student;
import student_management_system.body.course_offer;
import student_management_system.body.course_registretion;
import student_management_system.body.studentlist;
import student_management_system.body.menu_frame;
import student_management_system.body.my;
import student_management_system.body.result_sumission;
import student_management_system.body.studentlist;

/**
 *
 * @author sdddd
 */
public class menu extends javax.swing.JFrame {
    boolean m=false;
        
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        //result_sumission home= new result_sumission(body);
        user u=null;
        Login home= new Login(body,menu_button,u);
        body.removeAll();
        body.add(home).setVisible(true);
        menu_hide();
        ////////////
        option2.setText("Student");
        option3.setText("Course Offer");
        option4.setText("Course");
        option5.setText("");
        option6.setText("");
        option7.setText("");
        option8.setText("");
        menu_button.setVisible(false);
    }
    void menu_hide()
    {
        menu_body.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        student = new javax.swing.JMenuItem();
        department = new javax.swing.JMenuItem();
        add_course = new javax.swing.JMenuItem();
        course_offer = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menu_button = new javax.swing.JButton();
        body = new javax.swing.JDesktopPane();
        menu_body = new javax.swing.JPanel();
        menu_open = new javax.swing.JPanel();
        option2 = new student_management_system.option();
        option3 = new student_management_system.option();
        option4 = new student_management_system.option();
        option5 = new student_management_system.option();
        option6 = new student_management_system.option();
        option7 = new student_management_system.option();
        option8 = new student_management_system.option();
        jButton2 = new javax.swing.JButton();

        student.setText("jMenuItem1");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        popup.add(student);

        department.setText("jMenuItem2");
        popup.add(department);

        add_course.setText("jMenuItem3");
        popup.add(add_course);

        course_offer.setText("jMenuItem4");
        popup.add(course_offer);

        jMenuItem5.setText("jMenuItem5");
        popup.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1000, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("North East University Bangladesh");

        menu_button.setFont(my.font);
        menu_button.setText("MENU");
        menu_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_buttonMouseExited(evt);
            }
        });
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        body.setBackground(new java.awt.Color(153, 153, 255));
        body.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                bodyComponentResized(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu_body.setBackground(menu_open.getBackground());

        menu_open.setBackground(new java.awt.Color(0, 153, 153));
        menu_open.setMaximumSize(new java.awt.Dimension(180, 50));
        menu_open.setMinimumSize(new java.awt.Dimension(1, 1));
        menu_open.setPreferredSize(new java.awt.Dimension(180, 422));
        menu_open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_openMouseEntered(evt);
            }
        });

        option2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option2MouseExited(evt);
            }
        });

        option3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option3MouseExited(evt);
            }
        });

        option4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option4MouseExited(evt);
            }
        });

        option5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option5MouseExited(evt);
            }
        });

        option6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option6MouseExited(evt);
            }
        });

        option7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option7MouseExited(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(my.font);
        jButton2.setText("Hide");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_openLayout = new javax.swing.GroupLayout(menu_open);
        menu_open.setLayout(menu_openLayout);
        menu_openLayout.setHorizontalGroup(
            menu_openLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_openLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menu_openLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(menu_openLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_openLayout.setVerticalGroup(
            menu_openLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_openLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menu_bodyLayout = new javax.swing.GroupLayout(menu_body);
        menu_body.setLayout(menu_bodyLayout);
        menu_bodyLayout.setHorizontalGroup(
            menu_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_bodyLayout.createSequentialGroup()
                .addComponent(menu_open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        menu_bodyLayout.setVerticalGroup(
            menu_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_open, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(menu_body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(body)
                .addContainerGap())
            .addComponent(menu_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentActionPerformed

    private void bodyComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_bodyComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyComponentResized

    private void menu_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_buttonMouseEntered

    }//GEN-LAST:event_menu_buttonMouseEntered

    private void menu_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_buttonMouseExited

            // TODO add your handling code here:
    }//GEN-LAST:event_menu_buttonMouseExited

    private void menu_openMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_openMouseEntered
        // TODO add your handling code here:
        System.out.println("2");
        m=true;
        menu_body.setVisible(true);
    }//GEN-LAST:event_menu_openMouseEntered

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        // TODO add your handling code here:
        menu_button.setVisible(false);
        menu_body.setVisible(true);
    }//GEN-LAST:event_menu_buttonActionPerformed

    private void option2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseEntered
        // TODO add your handling code here:
        option2.setBackground(Color.BLUE);
    }//GEN-LAST:event_option2MouseEntered

    private void option2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseExited
        // TODO add your handling code here:
        option2.setBackground(menu_open.getBackground());
    }//GEN-LAST:event_option2MouseExited

    private void option3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseEntered
        // TODO add your handling code here:
        option3.setBackground(Color.BLUE);
    }//GEN-LAST:event_option3MouseEntered

    private void option3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseExited
        // TODO add your handling code here:
        option3.setBackground(menu_open.getBackground());
    }//GEN-LAST:event_option3MouseExited

    private void option4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseEntered
        // TODO add your handling code here:
        option4.setBackground(Color.BLUE);
    }//GEN-LAST:event_option4MouseEntered

    private void option4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseExited
        // TODO add your handling code here:
        option4.setBackground(menu_open.getBackground());
    }//GEN-LAST:event_option4MouseExited

    private void option5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseEntered
        // TODO add your handling code here:
        option5.setBackground(Color.BLUE);
    }//GEN-LAST:event_option5MouseEntered

    private void option5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseExited
        // TODO add your handling code here:
        option5.setBackground(menu_open.getBackground());
    }//GEN-LAST:event_option5MouseExited

    private void option6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseEntered
        // TODO add your handling code here:
        option6.setBackground(Color.BLUE);
    }//GEN-LAST:event_option6MouseEntered

    private void option6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseExited
        // TODO add your handling code here:
        option6.setBackground(menu_open.getBackground());
    }//GEN-LAST:event_option6MouseExited

    private void option7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseEntered
        // TODO add your handling code here:
        option7.setBackground(Color.BLUE);
    }//GEN-LAST:event_option7MouseEntered

    private void option7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseExited
        // TODO add your handling code here:
        option7.setBackground(menu_open.getBackground());
    }//GEN-LAST:event_option7MouseExited

    private void option2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseClicked
        // TODO add your handling code here:
        body.add(new studentlist(body)).setVisible(true);
    }//GEN-LAST:event_option2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menu_body.setVisible(false);
        menu_button.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void option3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseClicked
        // TODO add your handling code here:
        body.add(new course_offer(body)).setVisible(true);
    }//GEN-LAST:event_option3MouseClicked


    void student_list()
    {
        studentlist std = new studentlist(body);
        body.removeAll();
        body.add(std).setVisible(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_course;
    public static javax.swing.JDesktopPane body;
    private javax.swing.JMenuItem course_offer;
    private javax.swing.JMenuItem department;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel menu_body;
    private javax.swing.JButton menu_button;
    private javax.swing.JPanel menu_open;
    private student_management_system.option option2;
    private student_management_system.option option3;
    private student_management_system.option option4;
    private student_management_system.option option5;
    private student_management_system.option option6;
    private student_management_system.option option7;
    private student_management_system.option option8;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JMenuItem student;
    // End of variables declaration//GEN-END:variables
}
