package gato;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;

public class Gatopt2 extends JFrame implements ActionListener {

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

    int status[][];

    private void initArray() {
        status = new int[3][3];
        int def = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                status[j][i] = def;
            }
        }
    }

    public Gatopt2() {

        initArray();
        jButton11 = new JButton("");
        jButton12 = new JButton("");
        jButton13 = new JButton("");
        jButton14 = new JButton("");
        jButton15 = new JButton("");
        jButton16 = new JButton("");
        jButton17 = new JButton("");
        jButton18 = new JButton("");
        jButton19 = new JButton("");
        label = new JLabel();
        GridLayout miLayout = new GridLayout(4, 3);
        getContentPane().setLayout(miLayout);
        getContentPane().setSize(500, 400);

        jButton11.addActionListener(this);
        getContentPane().add(jButton11);

        jButton12.addActionListener(this);
        getContentPane().add(jButton12);

        jButton13.addActionListener(this);
        getContentPane().add(jButton13);

        jButton14.addActionListener(this);
        getContentPane().add(jButton14);

        jButton15.addActionListener(this);
        getContentPane().add(jButton15);

        jButton16.addActionListener(this);
        getContentPane().add(jButton16);

        jButton17.addActionListener(this);
        getContentPane().add(jButton17);

        jButton18.addActionListener(this);
        getContentPane().add(jButton18);

        jButton19.addActionListener(this);
        getContentPane().add(jButton19);
        getContentPane().add(label);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == jButton19) {
            changeStatusBtn(jButton19, 2, 2);
            label.setText("presiono jButton19");
        }
        if (evt.getSource() == jButton18) {
            changeStatusBtn(jButton18, 1, 2);
            label.setText("presiono jButton18");
        }
        if (evt.getSource() == jButton17) {
            changeStatusBtn(jButton17, 0, 2);
            label.setText("presiono jButton17");
        }
        if (evt.getSource() == jButton16) {
            changeStatusBtn(jButton16, 2, 1);
            label.setText("presiono jButton16");
        }
        if (evt.getSource() == jButton15) {
            changeStatusBtn(jButton15, 1, 1);
            label.setText("presiono jButton15");
        }
        if (evt.getSource() == jButton14) {
            changeStatusBtn(jButton14, 0, 1);
            label.setText("presiono jButton14");
        }
        if (evt.getSource() == jButton13) {
            changeStatusBtn(jButton13, 2, 0);
            label.setText("presiono jButton13");
        }
        if (evt.getSource() == jButton12) {
            changeStatusBtn(jButton12, 1, 0);
            label.setText("presiono jButton12");
        }
        if (evt.getSource() == jButton11) {
            changeStatusBtn(jButton11, 0, 0);
            label.setText("presiono jButton11");
        }
        if (checkStatus() == 1) {
            label.setText("Jugador azul wins");
            blockAll();
        } else if (checkStatus() == -1) {
            label.setText("Jugador rojo wins");
            blockAll();
        } else if (checkStatus() == 10) {
            label.setText("Empate");
            blockAll();
        }
    }

    private void changeStatusBtn(JButton btn, int x, int y) {
        if (turno == -1) {
            btn.setBackground(Color.red);
            status[x][y] = turno;
            btn.setText("O");
            turno = -turno;
        } else {
            btn.setBackground(Color.blue);
            btn.setText("X");
            status[x][y] = turno;
            turno = -turno;
        }
        btn.setEnabled(false);
    }

    private void blockAll() {
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
    }

    private int checkStatus() {
        if (areEqual(status[0][0], status[0][1], status[0][2]) != 0) {
            return status[0][0];
        }
        if (areEqual(status[1][0], status[1][1], status[1][2]) != 0) {
            return status[1][0];
        }
        if (areEqual(status[2][0], status[2][1], status[2][2]) != 0) {
            return status[2][0];
        }

        if (areEqual(status[0][0], status[1][0], status[2][0]) != 0) {
            return status[0][0];
        }
        if (areEqual(status[0][1], status[1][1], status[2][1]) != 0) {
            return status[0][1];
        }
        if (areEqual(status[0][2], status[1][2], status[2][2]) != 0) {
            return status[0][2];
        }

        if (areEqual(status[0][0], status[1][1], status[2][2]) != 0) {
            return status[1][1];
        }
        if (areEqual(status[0][2], status[1][1], status[2][0]) != 0) {
            return status[1][1];
        }

        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (status[i][j] != 0) {
                    cont++;
                }
            }
        }
        if (cont == 9) {
            return 10;
        }

        return 0;

    }

    private int areEqual(int x, int y, int z) {
        if (x == y && y == z) {
            return x;
        }
        return 0;
    }
}
