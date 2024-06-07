package florconfiguras;
/**
 *
 * @author Kevin
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FlorConFiguras extends Frame{
    static final long serialVersionUID = 1L;
    
    @Override
    public void paint(Graphics g){
        
        //Petalo 1
        g.drawOval(135, 90, 61, 61);
            g.setColor(Color.cyan);
            g.fillOval(135, 90, 61, 61);
        //Petalo 2
        g.drawOval(90, 133, 61, 61);
            g.setColor(Color.cyan);
            g.fillOval(90, 133, 61, 61);
        //Petalo 3
        g.drawOval(180, 133, 61, 61);
            g.setColor(Color.cyan);
            g.fillOval(180, 133, 61, 61);
        //Petalo 4
        g.drawOval(135, 180, 61, 61);
            g.setColor(Color.cyan);
            g.fillOval(135, 180, 61, 61);
        //Petalo 5
        g.drawOval(105, 110, 61, 61);
            g.setColor(Color.pink);
            g.fillOval(105, 110, 61, 61);
        //Petalo 6
        g.drawOval(110, 163, 61, 61);
            g.setColor(Color.pink);
            g.fillOval(110, 163, 61, 61);
        //Petalo 7
        g.drawOval(165, 115, 61, 61);
            g.setColor(Color.pink);
            g.fillOval(165, 115, 61, 61);
        //Petalo 8
        g.drawOval(165, 165, 61, 61);
            g.setColor(Color.pink);
            g.fillOval(165, 165, 61, 61);
        //circulo centro
        g.drawOval(150, 150, 31, 31);
            g.setColor(Color.yellow);
            g.fillOval(150, 150, 30, 30);
        
        //Tallo
        g.drawRect(165, 240, 10, 80);
            g.setColor(Color.green);
            g.fillRect(165, 240, 10, 80);
        //Hoja 1
        int x [] = {120, 165, 145};
        int y [] = {240, 250, 270};
        g.drawPolygon(x, y, 3);
            g.setColor(Color.green);
            g.fillPolygon(x, y, 3);
        //Hoja 2
        int x2 [] = {175, 215, 190};
        int y2 [] = {270, 240, 285};
        g.drawPolygon(x2, y2, 3);
            g.setColor(Color.green);
            g.fillPolygon(x2, y2, 3);
            
        //Filo maceta
        g.drawRect(120, 321, 100, 20);
            g.setColor(Color.red);
            g.fillRect(120, 321, 100, 20);
        //Maceta
        g.drawRect(130, 341, 80, 90);
            g.setColor(Color.red);
            g.fillRect(130, 341, 80, 90);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        
        FlorConFiguras miFrame = new FlorConFiguras();
        
        miFrame.setTitle("Flor");
        miFrame.setSize(400, 500);
        miFrame.setVisible(true);
        
    } 
}
