package robotconcomponentes;

/**
 *
 * @author Kevin
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class RobotConComponentes extends JFrame {
    public RobotConComponentes(){
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        //Cabeza
        JPanel p1 = new JPanel(new GridLayout(2,1));
            JPanel p11 = new JPanel();
                JComboBox ojo1 = new JComboBox();
                JComboBox ojo2 = new JComboBox();
            JPanel p12 = new JPanel();
                JButton boc1 = new JButton();
                JButton boc2 = new JButton();
                JButton boc3 = new JButton();
                JButton boc4 = new JButton();
                JButton boc5 = new JButton();
                    
        //Piernas   
        JPanel p2 = new JPanel(new GridLayout(2,2));
            JPanel p21 = new JPanel();
                JTextArea piernaIz = new JTextArea(10, 5); 
                piernaIz.setEditable(true);
            JPanel p22 = new JPanel();
                JTextArea piernaDer = new JTextArea(10, 5);
                piernaDer.setEditable(true);
            JPanel p23 = new JPanel();
                JTextArea pataIz = new JTextArea(3,15);
            JPanel p24 = new JPanel();
                JTextArea pataDer = new JTextArea(3, 15);
        //Brazo Derecho
        JPanel p3 = new JPanel(new GridLayout(3,1));
            JPanel p31 = new JPanel(new GridLayout(1,1));
                JButton hombroIz = new JButton("_______________________");
            JPanel p32 = new JPanel();
                JTextArea brazoIz = new JTextArea(30, 5);
            JPanel p33 = new JPanel();
                JButton puñoIz = new JButton("|_______|______|______|______|");
        //Brazo Izquierdo
        JPanel p4 = new JPanel(new GridLayout(3,1));
            JPanel p41 = new JPanel(new GridLayout(1,1));
                JButton hombroDer = new JButton("___________________________");
            JPanel p42 = new JPanel();
                JTextArea brazoDer = new JTextArea(20,5);
            JPanel p43 = new JPanel();
                JButton puñoDer = new JButton("|_____|______|_______|______|");
        JPanel p5 = new JPanel(new GridLayout(3,1));
            JPanel p51 = new JPanel();
                JTextArea pantalla = new JTextArea(2,10);
            JPanel p52 = new JPanel(new FlowLayout());
                JButton b1 = new JButton();
                JButton b2 = new JButton();
                JButton b3 = new JButton();
                JButton b4 = new JButton();
                JButton b5 = new JButton();
                JButton b6 = new JButton();
                JButton b7 = new JButton();
                JButton b8 = new JButton();
                JButton b9 = new JButton();
                JButton b10 = new JButton();
            JPanel p53 = new JPanel(new FlowLayout());
                JRadioButton bot11 = new JRadioButton();
                JRadioButton bot12 = new JRadioButton();
                JRadioButton bot13 = new JRadioButton();
                JRadioButton bot14 = new JRadioButton();
                JRadioButton bot15 = new JRadioButton();
                JRadioButton bot16 = new JRadioButton();
                JRadioButton bot17 = new JRadioButton();
                JRadioButton bot18 = new JRadioButton();
                JRadioButton bot19 = new JRadioButton();
                JRadioButton bot20 = new JRadioButton();
                
        c.add(p1, BorderLayout.NORTH);
            p1.add(p11);
                p11.add(ojo1);
                p11.add(ojo2);
            p1.add(p12);
                p12.add(boc1);
                p12.add(boc2);
                p12.add(boc3);
                p12.add(boc4);
                p12.add(boc5);
                    
        c.add(p2, BorderLayout.SOUTH);
            p2.add(p21);
                p21.add(piernaIz);
            p2.add(p22);
                p22.add(piernaDer);
            p2.add(p23);
                p23.add(pataIz);
            p2.add(p24);
                p24.add(pataDer);
        c.add(p3, BorderLayout.EAST);
            p3.add(p31);
                p31.add(hombroIz);
            p3.add(p32);
                p32.add(brazoIz);
            p3.add(p33);
                p33.add(puñoIz);
        c.add(p4, BorderLayout.WEST);
            p4.add(p41);
                p41.add(hombroDer);
            p4.add(p42);
                p42.add(brazoDer);
            p4.add(p43);
                p43.add(puñoDer);
        c.add(p5, BorderLayout.CENTER);
            p5.add(p51);
                p51.add(pantalla);
            p5.add(p52);
                p52.add(b1);
                p52.add(b2);
                p52.add(b3);
                p52.add(b4);
                p52.add(b5);
                p52.add(b6);
                p52.add(b7);
                p52.add(b8);
                p52.add(b9);
                p52.add(b10);
            p5.add(p53);
                p53.add(bot11);
                p53.add(bot12);
                p53.add(bot13);
                p53.add(bot14);
                p53.add(bot15);
                p53.add(bot16);
                p53.add(bot17);
                p53.add(bot18);
                p53.add(bot19);
                p53.add(bot20);
        
        p11.setBackground(Color.blue);
        p12.setBackground(Color.blue);
        p21.setBackground(Color.blue);
        p22.setBackground(Color.blue);
        p23.setBackground(Color.blue);
        p24.setBackground(Color.blue);
        p31.setBackground(Color.blue);
        p32.setBackground(Color.blue);
        p33.setBackground(Color.blue);
        p41.setBackground(Color.blue);
        p42.setBackground(Color.blue);
        p43.setBackground(Color.blue);
        p51.setBackground(Color.red);
        p52.setBackground(Color.red);
        p53.setBackground(Color.red);
        
                
                
        setSize(1000, 1000);
        setVisible(true);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RobotConComponentes();
        // TODO code application logic here
    }
    
}
