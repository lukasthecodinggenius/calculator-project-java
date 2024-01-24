import java.awt.TextArea;  
import java.lang.Math; //import the math class in order to use square root

public class calculatorgui extends javax.swing.JFrame {

    
    public calculatorgui() {
        initComponents();
    }

float value1; //declaring the values in the class so they can be used everywhere
 float value2;
 String operator;
 float memoryvalue;
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();  
        output = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Simple Calculator", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        output.setBackground(new java.awt.Color(129, 149, 126));
        output.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        output.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        output.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });
        output.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outputKeyTyped(evt);
            }
        });
        jPanel2.add(output, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 33, 250, -1));

        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 136, 57, 33));

        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 178, 57, 33));

        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 217, 57, 33));

        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 136, 57, 33));

        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 178, 57, 33));

        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 217, 57, 33));

        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 136, 57, 33));

        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 178, 57, 33));

        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 217, 57, 33));

        jButton10.setText("0");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 256, 57, 33));

        jButton12.setText("Clear");
        jButton12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 256, 126, 33));

        jButton13.setBackground(new java.awt.Color(255, 204, 102));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton13.setText("÷");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 136, 57, 33));

        jButton14.setBackground(new java.awt.Color(255, 204, 102));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton14.setText("+");
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 175, 57, 33));

        jButton15.setBackground(new java.awt.Color(255, 204, 102));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton15.setText("*");
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 217, 57, 33));

        jButton16.setBackground(new java.awt.Color(255, 204, 102));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton16.setText("=");
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 217, 57, 72));

        jButton17.setBackground(new java.awt.Color(255, 204, 102));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton17.setText("%");
        jButton17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 177, 57, 33));

        jButton18.setBackground(new java.awt.Color(255, 204, 102));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton18.setText("-");
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 136, 57, 33));

        jButton19.setBackground(new java.awt.Color(255, 204, 102));
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton19.setText("MR");
        jButton19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 97, 57, 33));

        jButton20.setBackground(new java.awt.Color(255, 204, 102));
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton20.setText("MC");
        jButton20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 97, 57, 33));

        jButton21.setBackground(new java.awt.Color(255, 204, 102));
        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton21.setText("M+");
        jButton21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 97, 57, 33));

        jButton22.setBackground(new java.awt.Color(255, 204, 102));
        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton22.setText("√");
        jButton22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 97, 57, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          if(output.getText().isEmpty()) { //if the screen is empty, it sets the output to 9
          output.setText(jButton9.getText());
          value1 = 9;
      } else {
          output.setText(output.getText() + "" + jButton9.getText()); //if there are already numbers on the screen, it appends the 9 to the output
          value2 = 9;
      }
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
      if(output.getText().isEmpty()) { //if the screen is empty, it sets the output to 0
          output.setText(jButton10.getText());
          value1 = 0;
      } else {
          output.setText(output.getText() + "" + jButton10.getText()); //if there are already numbers on the screen ,it appends the 9 to the output
          value2 = 0;
      }
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         
        output.setText(""); //sets the output to blank if the clear button is pressed 
        value1 = 0; //resets the value of value1 and value2 
        value2 = 0;
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
          if(output.getText().isEmpty()) { //doesn't allow an operator to be outputted if there is nothing in the output screen
            return;
        } else {
            value1 = Integer.parseInt(output.getText()); //if there is already numbers on the screen , it adds the operator to the output and sets the value of 'operator' to the corresponding word
            output.setText(output.getText() + " " + jButton18.getText());
            operator = "minus";
        }
    }                                         

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      if(output.getText().isEmpty()) { //if the output screen is empty, it adds 1 to the screen
          output.setText(jButton1.getText());
          value1 = 1;
      } else { //if there are already numbers on the screen, 
          output.setText(output.getText() + "" + jButton1.getText());
          value2 = 1;
      }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if(output.getText().isEmpty()) {
          output.setText(jButton2.getText());
          value1 = 2;
      } else {
          output.setText(output.getText() + "" + jButton2.getText());
          value2 = 2;
      }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            if(output.getText().isEmpty()) {
          output.setText(jButton3.getText());
          value1 = 3;
      } else {
          output.setText(output.getText() + "" + jButton3.getText());
          value2 = 3;
      }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           if(output.getText().isEmpty()) {
          output.setText(jButton4.getText());
          value1 = 4;
      } else {
          output.setText(output.getText() + "" + jButton4.getText());
          value2 = 4;
      }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         if(output.getText().isEmpty()) {
          output.setText(jButton5.getText());
          value1 = 5;
      } else {
          output.setText(output.getText() + "" + jButton5.getText());
          value2 = 5;
      }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            if(output.getText().isEmpty()) {
          output.setText(jButton6.getText());
          value1 = 6;
      } else {
          output.setText(output.getText() + "" + jButton6.getText());
          value2 = 6;
      }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           if(output.getText().isEmpty()) {
          output.setText(jButton7.getText());
          value1 = 7;
      } else {
          output.setText(output.getText() + "" + jButton7.getText());
          value2 = 7;
      }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
              if(output.getText().isEmpty()) {
          output.setText(jButton8.getText());
          value1 = 8;
      } else {
          output.setText(output.getText() + "" + jButton8.getText());
          value2 = 8;
      }
    }                                        

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(output.getText().isEmpty()) {
            return;
        } else {
            value1 = Integer.parseInt(output.getText());
            output.setText(output.getText() + " " + jButton14.getText());
            operator = "plus";
        }
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
            if(output.getText().isEmpty()) {
            return;
        } else {
            value1 = Integer.parseInt(output.getText());
            output.setText(output.getText() + " " + "% of");
            operator = "plus";
        }
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(output.getText().isEmpty()) {
            return;
        } else {
            value1 = Integer.parseInt(output.getText());
            output.setText(output.getText() + " " + jButton13.getText());
            operator = "division";
        }
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
           if(output.getText().isEmpty()) {
            return;
        } else {
            value1 = Integer.parseInt(output.getText());
            output.setText(output.getText() + " " + jButton15.getText());
            operator = "multiplication";
        }
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double answer = 0;
       
        if(operator == "plus")
            answer = value1 + value2;
        else if(operator=="minus") 
            answer = value1 - value2;
        else if(operator=="multiplication")
            answer = value1 * value2;
        else if(operator == "division")
            answer = value1 / value2;
        else if (operator == "percent")
            answer = (value1 * value2) / 100;
        else if (operator == "squareroot")
            answer = Math.sqrt(value1);
       
        String result = Double.toString(answer);
                output.setText(result); 
   
    }                                         
   
   

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (output.getText().isEmpty()) {
            output.setText(Float.toString(memoryvalue));
        } else {
            output.setText(output.getText() + Float.toString(memoryvalue));
        }
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        memoryvalue = 0;
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        float f = Float.parseFloat(output.getText());
        memoryvalue = f;
    }                                         

    private void outputKeyTyped(java.awt.event.KeyEvent evt) {                                
        char c = evt.getKeyChar();
     
     if (!Character.isDigit(c)) { 
         evt.consume();
     }
    }                               

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
          if(output.getText().isEmpty()) {
            return;
        } else {
            value1 = Integer.parseInt(output.getText());
            output.setText(output.getText() + " " + jButton22.getText());
            operator = "squareroot";
        }
    }                                         



    public static void main(String args[]) {

      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculatorgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorgui().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField output;
    // End of variables declaration                   
}
