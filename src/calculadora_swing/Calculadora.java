/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora_swing;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
/**
 * @author Toilo
 */
public class Calculadora extends javax.swing.JFrame {
   
     Modelo modelo = new Modelo();
  public String operadores;
  public String result;
  boolean operador = false;
  float numero = 0;
  float segundonumero;
  float primernumero;
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
      this.jButton18.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("1"), "1");
this.jButton18.getActionMap().put("1", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton18.doClick();
}
});
this.jButton18.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0),"1");
this.jButton18.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton18.doClick();
            }
        });

            this.jButton17.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("2"), "2");
this.jButton17.getActionMap().put("2", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton17.doClick();
}
});

this.jButton17.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0),"2");
this.jButton17.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton17.doClick();
            }
        });

            this.jButton19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("3"), "3");
this.jButton19.getActionMap().put("3", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
    
jButton19.doClick();
}
});

this.jButton19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0),"3");
this.jButton19.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton19.doClick();
            }
        });

           this.jButton14.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("4"), "4");
this.jButton14.getActionMap().put("4", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton14.doClick();
}
});

this.jButton14.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0),"4");
this.jButton14.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton14.doClick();
            }
        });

           this.jButton13.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("5"), "5");
this.jButton13.getActionMap().put("5", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton13.doClick();
}
});

this.jButton13.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0),"5");
this.jButton18.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton18.doClick();
            }
        });

           this.jButton15.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("6"), "6");
this.jButton15.getActionMap().put("6", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton15.doClick();
}
});

this.jButton15.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0),"6");
this.jButton15.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton15.doClick();
            }
        });

            this.jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("7"), "7");
this.jButton1.getActionMap().put("7", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton1.doClick();
}
});

this.jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0),"7");
this.jButton1.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton1.doClick();
            }
        });

           this.jButton10.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("8"), "8");
this.jButton10.getActionMap().put("8", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton10.doClick();
}
});

this.jButton10.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0),"8");
this.jButton10.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton10.doClick();
            }
        });

           this.jButton11.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("9"), "9");
this.jButton11.getActionMap().put("9", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton11.doClick();
}
});

this.jButton11.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0),"9");
this.jButton11.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton11.doClick();
            }
        });

            this.jButton26.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke("0"), "0");
this.jButton26.getActionMap().put("0", new AbstractAction() {
@Override public void actionPerformed(ActionEvent ae) {
jButton26.doClick();
}
});

  this.jButton26.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0),"0");
this.jButton26.getActionMap().put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton26.doClick();
            }
        });

this.jButton12.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0),"/");
this.jButton12.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton12.doClick();
            }
        });

this.jButton12.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_7, InputEvent.SHIFT_DOWN_MASK),"/");
this.jButton12.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton12.doClick();
            }
        });

this.jButton20.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0),"-");
this.jButton20.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton20.doClick();
            }
        });

this.jButton20.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0),"-");
this.jButton20.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton20.doClick();
            }
        });

this.jButton28.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0),"+");
this.jButton28.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton28.doClick();
            }
        });

this.jButton28.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0),"+");
this.jButton28.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton28.doClick();
            }
        });

this.jButton16.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0),"*");
this.jButton16.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton16.doClick();
            }
        });

this.jButton16.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_COPY, 0),"*");
this.jButton16.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton16.doClick();
            }
        });



this.jButton27.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0),".");
this.jButton27.getActionMap().put(".", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton27.doClick();
            }
        });

this.jButton29.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),"=");
this.jButton29.getActionMap().put("=", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton29.doClick();
            }
        });

this.jButton29.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)

.put(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.SHIFT_DOWN_MASK),"=");
this.jButton29.getActionMap().put("=", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
     jButton29.doClick();
            }
        });
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton16 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        casilla = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(102, 204, 255));

        jButton16.setText("*");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton26.setText("0");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton18.setText("1");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        casilla.setBackground(new java.awt.Color(255, 255, 255));
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        casilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        casilla.setOpaque(true);

        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setText("7");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton29.setText("=");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton17.setText("2");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setText("3");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton15.setText("6");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton13.setText("5");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton27.setText(",");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton14.setText("4");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton20.setText("-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton28.setText("+");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton12.setText("/");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(casilla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        modelo.primernumero = Float.parseFloat(this.casilla.getText());
        operadores = "+";
        this.casilla.setText("");
       
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
modelo.primernumero = Float.parseFloat(this.casilla.getText());
        operadores = "-";
        this.casilla.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.casilla.setText(this.casilla.getText()+"4");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.casilla.setText(this.casilla.getText()+"5");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.casilla.setText(this.casilla.getText()+"6");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        this.casilla.setText(this.casilla.getText()+"3");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        this.casilla.setText(this.casilla.getText()+"2");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.casilla.setText(this.casilla.getText()+"9");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.casilla.setText(this.casilla.getText()+"7");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.casilla.setText(this.casilla.getText()+"8");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        this.casilla.setText(this.casilla.getText()+"1");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        this.casilla.setText(this.casilla.getText()+"0");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
modelo.primernumero = Float.parseFloat(this.casilla.getText());
        operadores = "*";
        this.casilla.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        modelo.segundonumero = Float.parseFloat(this.casilla.getText());
        switch(operadores){
            case "+":this.casilla.setText((modelo.sinCero(modelo.resultadoSuma(numero)))); break;
             case "-":this.casilla.setText((modelo.sinCero(modelo.resultadoSuma(numero)))); break;
             case "*":this.casilla.setText((modelo.sinCero(modelo.resultadoSuma(numero)))); break;
             case "/":if(modelo.segundonumero==0){this.casilla.setText("No se puede dividir entre cero");break;} 
           
             else{
                this.casilla.setText((modelo.sinCero(modelo.resultadoDividir(numero)))); break;
             }
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       modelo.primernumero = Float.parseFloat(this.casilla.getText());
        operadores = "/";
        this.casilla.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       if(!(this.casilla.getText().contains("."))){
           this.casilla.setText(this.casilla.getText()+".");
       }
    }//GEN-LAST:event_jButton27ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel casilla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
