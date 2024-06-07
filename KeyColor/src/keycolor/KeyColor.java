package keycolor;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class KeyColor extends JFrame{
    public KeyColor(){
        JPanel toda = new JPanel(new GridLayout(2,1));
        JTextField intro = new JTextField();
        JPanel cambia = new JPanel();
        toda.add(cambia);
        toda.add(intro); 
    
        KeyListener escutec = new KeyListener(){
     
            @Override
            public void keyPressed(KeyEvent e){
                if(e.VK_R== e.getKeyCode()){
                cambia.setBackground(Color.red);
                }
                else if(e.VK_A== e.getKeyCode()){
                    cambia.setBackground(Color.blue);
                }
                else if(e.VK_V== e.getKeyCode()){
                    cambia.setBackground(Color.green);
                }
                else if(114 == e.getKeyCode()){
                    cambia.setBackground(Color.pink);
                }else if(115 == e.getKeyCode()){
                    cambia.setBackground(Color.magenta);
                }
            }                   
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        };
        intro.addKeyListener(escutec);                   
        add(toda);
        setSize(400,400);       
        setVisible(true);
    }
    public static void main(String[] args) {
        KeyColor colorkey = new KeyColor();
    }  
}
