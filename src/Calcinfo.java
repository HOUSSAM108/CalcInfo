
 
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class Calcinfo extends javax.swing.JFrame {
  //hacemos una instancia del motor de java script
   ScriptEngineManager sem = new ScriptEngineManager();
   ScriptEngine se = sem.getEngineByName("JavaScript");
   //variable del resultado en string
   String resultado;
    public Calcinfo() {
        initComponents();
        //centrar el programa en el centro de la pantalla
        setLocationRelativeTo(null);
        //esconder el texto (bin,dec,hex,oct)
        jLabel_info_bin_resultado.hide();
        jLabel_info_bin_texto.hide();
        jLabel_info_dec_resultado.hide();
        jLabel_info_dec_texto.hide();
        jLabel_info_hex_resultado.hide();
        jLabel_info_hex_texto.hide();
        jLabel_info_oct_resultado.hide();
        jLabel_info_oct_texto.hide();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_pantalla_segundaria = new javax.swing.JLabel();
        jLabel_pantalla_resultado = new javax.swing.JLabel();
        jLabel_info_bin_texto = new javax.swing.JLabel();
        jLabel_info_oct_texto = new javax.swing.JLabel();
        jLabel_info_dec_texto = new javax.swing.JLabel();
        jLabel_info_hex_texto = new javax.swing.JLabel();
        jLabel_info_hex_resultado = new javax.swing.JLabel();
        jLabel_info_dec_resultado = new javax.swing.JLabel();
        jLabel_info_oct_resultado = new javax.swing.JLabel();
        jLabel_info_bin_resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_opracion_suma = new javax.swing.JButton();
        jButton_opracion_igual = new javax.swing.JButton();
        jButton_numero_2 = new javax.swing.JButton();
        jButton_numero_3 = new javax.swing.JButton();
        jButton_numero_5 = new javax.swing.JButton();
        jButton_numero_1 = new javax.swing.JButton();
        jButton_numero_4 = new javax.swing.JButton();
        jButton_numero_7 = new javax.swing.JButton();
        jButtonCalcIInfoPro_Ver = new javax.swing.JButton();
        jButton_opracion_quitar = new javax.swing.JButton();
        jButton_opracion_porciento = new javax.swing.JButton();
        jButton_opracion_dividir = new javax.swing.JButton();
        jButton_opracion_multiplicacion = new javax.swing.JButton();
        jButton_opracion_resta = new javax.swing.JButton();
        jButton_numero_6 = new javax.swing.JButton();
        jButton_numero_9 = new javax.swing.JButton();
        jButton_numero_8 = new javax.swing.JButton();
        jButton_numero_0 = new javax.swing.JButton();
        jButton_punto = new javax.swing.JButton();
        jButton_borrar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jButtonCalcInfo_Ocultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 242, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_pantalla_segundaria.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel_pantalla_segundaria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_pantalla_segundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 30));

        jLabel_pantalla_resultado.setFont(new java.awt.Font("Courier New", 0, 48)); // NOI18N
        jLabel_pantalla_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_pantalla_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 60));

        jLabel_info_bin_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_bin_texto.setText("BIN");
        jPanel1.add(jLabel_info_bin_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel_info_oct_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_oct_texto.setText("OCT");
        jPanel1.add(jLabel_info_oct_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel_info_dec_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_dec_texto.setText("DEC");
        jPanel1.add(jLabel_info_dec_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel_info_hex_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_hex_texto.setText("HEX");
        jPanel1.add(jLabel_info_hex_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_info_hex_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_hex_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 30, 70, -1));

        jLabel_info_dec_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_dec_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 60, 70, -1));

        jLabel_info_oct_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_oct_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 90, 70, -1));

        jLabel_info_bin_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_bin_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_opracion_suma.setText("+");
        jButton_opracion_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 50, 40));

        jButton_opracion_igual.setText("=");
        jButton_opracion_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_igualActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 130, 40));

        jButton_numero_2.setText("2");
        jButton_numero_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 50, 40));

        jButton_numero_3.setText("3");
        jButton_numero_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 50, 40));

        jButton_numero_5.setText("5");
        jButton_numero_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 40));

        jButton_numero_1.setText("1");
        jButton_numero_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 40));

        jButton_numero_4.setText("4");
        jButton_numero_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 40));

        jButton_numero_7.setText("7");
        jButton_numero_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 40));

        jButtonCalcIInfoPro_Ver.setText("CalcInfo PRO");
        jButtonCalcIInfoPro_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcIInfoPro_VerActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCalcIInfoPro_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        jButton_opracion_quitar.setText("<--");
        jButton_opracion_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_quitarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 40));

        jButton_opracion_porciento.setText("%");
        jButton_opracion_porciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_porcientoActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_porciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 40));

        jButton_opracion_dividir.setText("/");
        jButton_opracion_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_dividirActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 50, 40));

        jButton_opracion_multiplicacion.setText("X");
        jButton_opracion_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 50, 40));

        jButton_opracion_resta.setText("-");
        jButton_opracion_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_restaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 40));

        jButton_numero_6.setText("6");
        jButton_numero_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 40));

        jButton_numero_9.setText("9");
        jButton_numero_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, 40));

        jButton_numero_8.setText("8");
        jButton_numero_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, 40));

        jButton_numero_0.setText("0");
        jButton_numero_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_numero_0ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_numero_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 40));

        jButton_punto.setText(".");
        jButton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 50, 40));

        jButton_borrar.setText("C");
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 40));

        jButton_salir.setText("Salir");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 40));

        jButtonCalcInfo_Ocultar.setText("CalcInfo PRO");
        jButtonCalcInfo_Ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcInfo_OcultarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCalcInfo_Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_opracion_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_sumaActionPerformed
        addnumero("+");
        
    }//GEN-LAST:event_jButton_opracion_sumaActionPerformed

    private void jButton_opracion_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_igualActionPerformed
//el motor de javascript va ha evaular nuestra operacion que saldra en la parte arriba 
       try{
            resultado = se.eval(jLabel_pantalla_segundaria.getText()).toString();    
           jLabel_pantalla_resultado.setText(resultado);
        
       }catch(Exception e){
           //jButton_borrar.doClick();
       }
        
    }//GEN-LAST:event_jButton_opracion_igualActionPerformed

    private void jButton_numero_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_2ActionPerformed
        addnumero("2");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_2ActionPerformed

    private void jButton_numero_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_3ActionPerformed
        addnumero("3");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_3ActionPerformed

    private void jButton_numero_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_5ActionPerformed
        addnumero("5");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_5ActionPerformed

    private void jButton_numero_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_1ActionPerformed
        addnumero("1");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_1ActionPerformed

    private void jButton_numero_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_4ActionPerformed
        addnumero("4");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_4ActionPerformed

    private void jButton_numero_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_7ActionPerformed
        addnumero("7");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_7ActionPerformed

    private void jButtonCalcIInfoPro_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcIInfoPro_VerActionPerformed
      //Mostrar eltexto (bin,dec,hex,oct)
        jButtonCalcIInfoPro_Ver.setVisible(false);
        jButtonCalcInfo_Ocultar.setVisible(true);
        jLabel_info_bin_resultado.setVisible(true);
        jLabel_info_bin_texto.setVisible(true);
        jLabel_info_dec_resultado.setVisible(true);
        jLabel_info_dec_texto.setVisible(true);
        jLabel_info_hex_resultado.setVisible(true);
        jLabel_info_hex_texto.setVisible(true);
        jLabel_info_oct_resultado.setVisible(true);
        jLabel_info_oct_texto.setVisible(true);
        
        //convertir el resultado de la operacion a binario 
        //coje la variable resultado y la convierte en integer
        int resbin = Integer.parseInt(resultado);
        //convierte el resultado(resbin) a binario y luego se guarda en un string(bin)
        String bin = Integer.toBinaryString(resbin);
        //muestra el resulta en la labe(jLabel_info_bin_resultado)
        jLabel_info_bin_resultado.setText(bin);
        
        //mostrar el resultado  
        jLabel_info_dec_resultado.setText(resultado);
        
        //convertir el resultado de la operacion a hexadecimal 
        int reshex = Integer.parseInt(resultado);
        String hex = Integer.toHexString(reshex);
        jLabel_info_hex_resultado.setText(hex);
        
        //convertir el resultado de la operacion a octal 
        int resoct = Integer.parseInt(resultado);
        String oct = Integer.toOctalString(resoct);
        jLabel_info_oct_resultado.setText(oct);
        
    }//GEN-LAST:event_jButtonCalcIInfoPro_VerActionPerformed

    private void jButton_opracion_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_quitarActionPerformed
//borrar un digito solo
        String texto = jLabel_pantalla_segundaria.getText().substring(0,jLabel_pantalla_segundaria.getText().length()-1);
        jLabel_pantalla_segundaria.setText(texto);
    }//GEN-LAST:event_jButton_opracion_quitarActionPerformed

    private void jButton_opracion_porcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_porcientoActionPerformed
        addnumero("%");
        
    }//GEN-LAST:event_jButton_opracion_porcientoActionPerformed

    private void jButton_opracion_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_dividirActionPerformed
        addnumero("/");
       
    }//GEN-LAST:event_jButton_opracion_dividirActionPerformed

    private void jButton_opracion_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_multiplicacionActionPerformed
        addnumero("*");
       
    }//GEN-LAST:event_jButton_opracion_multiplicacionActionPerformed

    private void jButton_opracion_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_restaActionPerformed
       addnumero("-");
      
    }//GEN-LAST:event_jButton_opracion_restaActionPerformed

    private void jButton_numero_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_6ActionPerformed
        addnumero("6");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_6ActionPerformed

    private void jButton_numero_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_9ActionPerformed
        addnumero("9");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_9ActionPerformed

    private void jButton_numero_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_8ActionPerformed
        addnumero("8");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_8ActionPerformed

    private void jButton_numero_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_numero_0ActionPerformed
        addnumero("0");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_numero_0ActionPerformed

    private void jButton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_puntoActionPerformed
        addnumero(".");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_puntoActionPerformed

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
      //borrar texto
        jLabel_pantalla_resultado.setText("");
        jLabel_pantalla_segundaria.setText("");
        jLabel_info_bin_resultado.setText("");
        jLabel_info_dec_resultado.setText("");
        jLabel_info_hex_resultado.setText("");
        jLabel_info_oct_resultado.setText("");
       
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jButtonCalcInfo_OcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcInfo_OcultarActionPerformed
       try{
       jButtonCalcIInfoPro_Ver.setVisible(true);
       jButtonCalcInfo_Ocultar.setVisible(false);
        jLabel_info_bin_resultado.hide();
        jLabel_info_bin_texto.hide();
        jLabel_info_dec_resultado.hide();
        jLabel_info_dec_texto.hide();
        jLabel_info_hex_resultado.hide();
        jLabel_info_hex_texto.hide();
        jLabel_info_oct_resultado.hide();
        jLabel_info_oct_texto.hide();
        }catch(Exception a){
        }
        
    }//GEN-LAST:event_jButtonCalcInfo_OcultarActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcinfo().setVisible(true);
            }
        });
    }
    
    public void addnumero(String numero){ 
        //muestra el numero en la parte superior.
        jLabel_pantalla_segundaria.setText(jLabel_pantalla_segundaria.getText()+numero);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcIInfoPro_Ver;
    private javax.swing.JButton jButtonCalcInfo_Ocultar;
    private javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_numero_0;
    private javax.swing.JButton jButton_numero_1;
    private javax.swing.JButton jButton_numero_2;
    private javax.swing.JButton jButton_numero_3;
    private javax.swing.JButton jButton_numero_4;
    private javax.swing.JButton jButton_numero_5;
    private javax.swing.JButton jButton_numero_6;
    private javax.swing.JButton jButton_numero_7;
    private javax.swing.JButton jButton_numero_8;
    private javax.swing.JButton jButton_numero_9;
    private javax.swing.JButton jButton_opracion_dividir;
    private javax.swing.JButton jButton_opracion_igual;
    private javax.swing.JButton jButton_opracion_multiplicacion;
    private javax.swing.JButton jButton_opracion_porciento;
    private javax.swing.JButton jButton_opracion_quitar;
    private javax.swing.JButton jButton_opracion_resta;
    private javax.swing.JButton jButton_opracion_suma;
    private javax.swing.JButton jButton_punto;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JLabel jLabel_info_bin_resultado;
    private javax.swing.JLabel jLabel_info_bin_texto;
    private javax.swing.JLabel jLabel_info_dec_resultado;
    private javax.swing.JLabel jLabel_info_dec_texto;
    private javax.swing.JLabel jLabel_info_hex_resultado;
    private javax.swing.JLabel jLabel_info_hex_texto;
    private javax.swing.JLabel jLabel_info_oct_resultado;
    private javax.swing.JLabel jLabel_info_oct_texto;
    private javax.swing.JLabel jLabel_pantalla_resultado;
    private javax.swing.JLabel jLabel_pantalla_segundaria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
