
package gato;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Gato extends JFrame implements ActionListener {

    int turno = -1;
    JLabel label;
    JButton jButton11;
    JButton jButton12;
    JButton jButton13;
    JButton jButton14;
    JButton jButton15;
    JButton jButton16;
    JButton jButton17;
    JButton jButton18;
    JButton jButton19;
   
    public Gato() {
        
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jButton19 = new JButton();
        label = new JLabel();
        GridLayout miLayout = new GridLayout(4, 3);
        getContentPane().setLayout(miLayout);
        jButton11.setText("jButton11");
        jButton11.addActionListener(this);
        getContentPane().add(jButton11);
        jButton12.setText("jButton12");
        jButton12.addActionListener(this);
        getContentPane().add(jButton12);
        jButton13.setText("jButton13");
        jButton13.addActionListener(this);
        getContentPane().add(jButton13);
        jButton14.setText("jButton14");
        jButton14.addActionListener(this);
        getContentPane().add(jButton14);
        jButton15.setText("jButton15");
        jButton15.addActionListener(this);
        getContentPane().add(jButton15);
        jButton16.setText("jButton16");
        jButton16.addActionListener(this);
        getContentPane().add(jButton16);
        jButton17.setText("jButton17");
        jButton17.addActionListener(this);
        getContentPane().add(jButton17);
        jButton18.setText("jButton18");
        jButton18.addActionListener(this);
        getContentPane().add(jButton18);
        jButton19.setText("jButton19");
        jButton19.addActionListener(this);
        getContentPane().add(jButton19);
        getContentPane().add(label);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == jButton19) {
            if (turno == -1) {
                jButton19.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton19.setBackground(Color.blue);
                turno = -turno;
            } // Add your handling code here:
            jButton19.setEnabled(false);
            label.setText("presiono jButton19");
        }
        if (evt.getSource() == jButton18) {
            if (turno == -1) {
                jButton18.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton18.setBackground(Color.blue);
                turno = -turno;
            }
            jButton18.setEnabled(false);
            label.setText("presiono jButton18");
        }
        if (evt.getSource() == jButton17) {
            if (turno == -1) {
                jButton17.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton17.setBackground(Color.blue);
                turno = -turno;
            }
            jButton17.setEnabled(false);
            label.setText("presiono jButton17");
        }
        if (evt.getSource() == jButton16) {
            if (turno == -1) {
                jButton16.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton16.setBackground(Color.blue);
                turno = -turno;
            }
            jButton16.setEnabled(false);
            label.setText("presiono jButton16");
        }
        if (evt.getSource() == jButton15) {
            if (turno == -1) {
                jButton15.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton15.setBackground(Color.blue);
                turno = -turno;
            }
            jButton15.setEnabled(false);
            label.setText("presiono jButton15");
        }
        if (evt.getSource() == jButton14) {
            if (turno == -1) {
                jButton14.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton14.setBackground(Color.blue);
                turno = -turno;
            }
            jButton14.setEnabled(false);
            label.setText("presiono jButton14");
        }
        if (evt.getSource() == jButton13) {
            if (turno == -1) {
                jButton13.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton13.setBackground(Color.blue);
                turno = -turno;
            }
            jButton13.setEnabled(false);
            label.setText("presiono jButton13");
        }
        if (evt.getSource() == jButton12) {
            if (turno == -1) {
                jButton12.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton12.setBackground(Color.blue);
                turno = -turno;
            }
            jButton12.setEnabled(false);
            label.setText("presiono jButton12");
        }
        if (evt.getSource() == jButton11) {
            if (turno == -1) {
                jButton11.setBackground(Color.red);
                turno = -turno;
            } else {
                jButton11.setBackground(Color.blue);
                turno = -turno;
            }
            jButton11.setEnabled(false);
           label.setText("presiono jButton11");
        }
    }
}