/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 ///*////sss
package com.interfaces;

import com.methods.Methods;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bnieto
 */
public class Oden extends javax.swing.JFrame {

    int v1[], v2[], vcache[];

    /**
     * Creates new form Oden
     */
    public Oden() {
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

        Principal = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnAction = new javax.swing.JButton();
        cmb1 = new javax.swing.JComboBox<>();
        btnClean = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos iniciales"));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tamaño vector 2:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel2.setText("Tamaño vector 1:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });
        panel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 60, 30));

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });
        panel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 60, 30));

        Principal.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 210));

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setText("LLenar");
        btnCreate.setEnabled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        panel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, -1));

        btnAction.setText("Mostrar");
        btnAction.setEnabled(false);
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });
        panel2.add(btnAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 190, -1));

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Llenar Vector 1 Automático", "Llenar Vector 2 Automático", "Llenar Vector 1 Manual", "Llenar Vector 2 Manual", "Promedio Elementos V1", "Mayor Valor V2", "Sumatoria V1", "Productoria V2", "Mayor elemento V1", "Menor elemento V2", "Elementos pares V1", "Elementos impares V2", "Elementos primos V2", "Suma de un vector1 y vector2", "Resta de un vector1 y vector2", "Valor que mas se repite V1", "Union de dos vectores", "Interseccion de los dos conjuntos de vectores", "Diferencia de vector 1 con vector2", "Diferencia de vector 2 con vector 1" }));
        cmb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb1ItemStateChanged(evt);
            }
        });
        cmb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb1MouseClicked(evt);
            }
        });
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });
        cmb1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmb1PropertyChange(evt);
            }
        });
        panel2.add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, -1));

        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        panel2.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, -1));

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, -1));

        Principal.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 270, 210));

        lb1.setText("Vectores");
        Principal.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        area1.setEditable(false);
        area1.setColumns(20);
        area1.setRows(5);
        area1.setEnabled(false);
        jScrollPane1.setViewportView(area1);

        jPanel3.add(jScrollPane1);

        Principal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 500, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            int tv1, tv2;

            tv1 = Integer.parseInt(txt1.getText());
            tv2 = Integer.parseInt(txt2.getText());

            v1 = new int[tv1];
            v2 = new int[tv2];

            if (v1 != null && v2 != null) {
                btnAction.setEnabled(true);
            }
            int op2 = cmb1.getSelectedIndex();
            switch (op2) {
                case 0: // Llenar Vector 1 Automático
                    v1 = Methods.llenar_automatico(v1);
                    valida_vector(v1);
                    break;
                case 1:
                    v2 = Methods.llenar_automatico(v2);
                    valida_vector(v2);
                    break;
                case 2: // Llenar Vector 1 manual
                    v1 = Methods.llenar_manual(v1);
                    valida_vector(v1);
                    break;
                case 3: // Llenar Vector 2 Manual
                    v2 = Methods.llenar_manual(v2);
                    valida_vector(v2);
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valide valores de los vectores");
            txt1.requestFocus();
        }


    }//GEN-LAST:event_btnCreateActionPerformed

    public void valida_filds(JTextField fild) {
        int tv1;
        StringBuffer aux = new StringBuffer(); // requerido para convertir array to string
        try {
            tv1 = Integer.parseInt(fild.getText()); // si valor es numero, bien
        } catch (NumberFormatException e) { // si no es numero, entonces
            JOptionPane.showMessageDialog(this, "Valor no valido solo numeros"); // mensaje de error y
            fild.requestFocus();
            String s = fild.getText(); // luego de poner el foco busco el texto
            String[] ray = s.split("([Aa-zZ])", -1); // valido las letras en el texto y las inserto en ARRAY[]
            for (int i = 0; i < ray.length; i++) { // recorro array sin letras para insertarlo en variable STRINGBUFFER
                aux = aux.append(ray[i]); // variable llena
            }
            fild.setText(aux.toString()); // variable devuelta al field
        }

    }

    public void valida_vector(int[] v) {
        if (v == null) {
            btnCreate.setEnabled(true);
            btnAction.setEnabled(false);

        } else {
            if (v.length == 0) {
                btnCreate.setEnabled(true);
                btnAction.setEnabled(false);

            } else {
                btnCreate.setEnabled(true);
                btnAction.setEnabled(true);
            }

        }
    }
    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        // TODO add your handling code here:
        int op;

        op = cmb1.getSelectedIndex();

        switch (op) {
            /*VECTORES LLENOS*/
            case 0:  // Llenar Vector 1 Automático
                area1.append("VECTOR 1 \n");
                vcache = v1;
                area1.append(Methods.mostrar(v1) + "\n");
                break;
            case 1: // Llenar Vector 2 Automático
                area1.append("VECTOR 2 \n");
                area1.append(Methods.mostrar(v2) + "\n");
                break;
            case 2: // Llenar Vector 1 Manual
                // v1 = Methods.llenar_manual(v1);
                area1.append("VECTOR MANUAL 1 \n");
                vcache = v1;
                area1.append(Methods.mostrar(v1) + "\n");
                break;
            case 3: // Llenar Vector 2 Manual
                //v2 = Methods.llenar_manual(v2);
                area1.append("VECTOR MANUAL 2 \n");
                area1.append(Methods.mostrar(v2) + "\n");
                break;
            /*VECTORES LLENOS*/
            case 4: // Promedio Elementos V1
                area1.append("PROMEDIO ELEMENTOS VECTOR 1 \n");
                vcache = v1;
                area1.append("" + Methods.promedio(v1) + "\n");
                System.out.println(v1[0]);
                break;
            case 5: // Mayor Valor V2
                area1.append("MAYOR VALOR VECTOR 2 \n");
                area1.append("" + Methods.mayor_valor(v2) + "\n");
                break;
            case 6: // Sumatoria V1
                area1.append("SUMATORIA VECTOR 1 \n");
                vcache = v1;
                area1.append("" + Methods.sumatoria(v1) + "\n");
                break;
            case 7: // Productoria V2
                area1.append("PRODUCTORIA VECTOR 2 \n");
                area1.append("" + Methods.productoria(v2) + "\n");
                break;

            case 8: // Mayor elemento V1
                area1.append("MAYOR ELEMENTO DEL VECTOR 1 \n");
                vcache = v1;
                area1.append("" + Methods.mayor_valor(v1) + "\n");
                break;
            case 9: // Menor Valor V2
                area1.append("MENOR VALOR VECTOR 2 \n");
                area1.append("" + Methods.menor_q(v2) + "\n");
                break;
            case 10: // Pares V1
                area1.append("CANTIDAD DE ELEMENTOS PARES DEL VECTOR 1 \n");
                vcache = v1;
                area1.append("" + Methods.par(v1) + "\n");
                break;
            case 11: // Impares V2
                area1.append("CANTIDAD DE ELEMENTOS IMPARES DEL VECTOR 2 \n");
                area1.append("" + Methods.impar(v2) + "\n");
                break;
            case 12: // Primos V1
                area1.append("CANTIDAD DE ELEMENTOS PRIMOS DEL VECTOR 1 \n");
                vcache = v1;
                area1.append("" + Methods.primos(v1) + "\n");
                break;

            case 13: // // SUMA DE VECTOR 1 + VECTOR 2
                if (v1 == null || v1.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 1 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt1.requestFocus();
                } else if (v2 == null || v2.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 2 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt2.requestFocus();
                } else {
                    if (v1.length != v2.length) {
                        JOptionPane.showMessageDialog(this, "El tamaño del los vectores deben ser iguales", "Error", JOptionPane.ERROR_MESSAGE);
                        limiar_e();
                        txt1.requestFocus();

                    } else {
                        area1.append("LA SUMA DE LOS VECTORES 1 Y 2 ES:"); // QUE ENPANADA
                        area1.append("" + Arrays.toString(Methods.sumvectors(vcache, v2)) + "\n");
                        break;
                    }

                }
            case 14: // RESTA DE VECTOR 1 - VECTOR 2
                if (v1 == null || v1.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 1 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt1.requestFocus();
                } else if (v2 == null || v2.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 2 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt2.requestFocus();
                } else {
                    if (v1.length != v2.length) {
                        JOptionPane.showMessageDialog(this, "El tamaño del los vectores deben ser iguales", "Error", JOptionPane.ERROR_MESSAGE);
                        limiar_e();
                        txt1.requestFocus();
                    } else {
                        area1.append("LA RESTA DE LOS VECTORES 1 Y 2 ES: "); // QUE ENPANADA
                        area1.append("" + Arrays.toString(Methods.restvectors(vcache, v2)) + "\n");
                        break;
                    }

                }
                break;
            case 15: // EL VALOR QUE MAS SE REPITE DEL VECTOR 1 Y CUANTAS VECES SE REPITE

                if (Methods.cual_repite(v1) != 0) {
                    area1.append("EL VALOR QUE MAS SE REPITE DEL VECTOR 1 ES: ");
                    area1.append("" + Methods.cual_repite(v1) + "");
                    area1.append("Y SE REPITE " + Methods.cuantas_repite(v1, Methods.cual_repite(v1)) + " VECES \n");
                    vcache = v1;
                } else {
                    area1.append("NINGUN VALOR SE REPITE DEL VECTOR 1");
                }

                break;
            case 16: // Union de dos vectores                          
                if (v1 == null || v1.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 1 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt1.requestFocus();
                } else if (v2 == null || v2.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 2 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt2.requestFocus();
                } else {
                    area1.append("LA UNION DE LOS VECTORES 1 Y 2 ES: "); // QUE ENPANADA
                    area1.append("" + Arrays.toString(Methods.union_nrepeat(Methods.union(vcache, v2))) + "\n");
                    break;

                }

            case 17: // interseccion de dos vectores                          
                if (v1 == null || v1.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 1 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt1.requestFocus();
                } else if (v2 == null || v2.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 2 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt2.requestFocus();
                } else {
                    area1.append("LA INTERSECCIÓN DE LOS VECTORES 1 Y 2 ES: \n"); // QUE ENPANADA
                    if (vcache.length >= v2.length) {
                        area1.append("" + Arrays.toString(Methods.intersection(vcache, v2)) + "\n");
                    } else {
                        area1.append("" + Arrays.toString(Methods.intersection(v2, vcache)) + "\n");
                    }
                    break;
                }
            case 18:
                if (v1 == null || v1.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 1 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt1.requestFocus();
                } else if (v2 == null || v2.length == 0) {
                    JOptionPane.showMessageDialog(this, "Vector numero 2 no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    txt2.requestFocus();
                } else {
                    area1.append("LA INTERSECCIÓN DE LOS VECTORES 1 "+Arrays.toString(v1)+" Y 2 "+Arrays.toString(v2)+" ES: \n"); // QUE ENPANADA
                    
                    
                }
                
                break;
            case 19:
                
                break;
        }


    }//GEN-LAST:event_btnActionActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        limiar_e();

    }//GEN-LAST:event_btnCleanActionPerformed

    private void cmb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cmb1MouseClicked

    private void cmb1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmb1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb1PropertyChange

    private void cmb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb1ItemStateChanged
        // TODO add your handling code he
    }//GEN-LAST:event_cmb1ItemStateChanged

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        int op2 = cmb1.getSelectedIndex();

        switch (op2) {
            case 0: // Llenar Vector 1 Automático
                valida_vector(v1);
                break;
            case 1: // Llenar Vector 2 Automático
                valida_vector(v2);
                break;
            case 2: // Llenar Vector 1 Manual
                valida_vector(v1);
                break;
            case 3: // Llenar Vector 2 Manual
                valida_vector(v2);
                break;
        }


    }//GEN-LAST:event_cmb1ActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        // TODO add your handling code h

    }//GEN-LAST:event_txt1KeyTyped

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        // TODO add your handling code here:
        valida_filds(txt1);
    }//GEN-LAST:event_txt1KeyReleased

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
        // TODO add your handling code here:
        valida_filds(txt2);
    }//GEN-LAST:event_txt2KeyReleased

    public void limiar_e() {
        txt1.setText(null);
        txt2.setText(null);
        area1.setText(null);
        cmb1.setSelectedIndex(0);
        btnAction.setEnabled(false);
        btnCreate.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Oden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JTextArea area1;
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    private char getKeyChar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
