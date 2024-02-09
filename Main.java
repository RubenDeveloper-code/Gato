
import gato.Gatopt2;
import gato.gatopt3;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main extends JFrame{
    public static void main(String args[]){
        gatopt3 gato = new gatopt3();
        gato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gato.setSize(500,400);
        gato.setVisible(true);
        gato.pack();
    }
}
