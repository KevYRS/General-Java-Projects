package figurasapplet;

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author Kevin
 */
public class FigurasApplet extends Applet{

    public void paint(Graphics g){
        
        for(int i=0;i<10;i++){
            g.drawLine(10, 10, 250, 10*i*10);                     
        }
        for(int i=10;i>0;i--){
            g.setColor(Color.BLUE);
             g.drawOval(1150-(i*10), 150-(i*10), 50+(i*20),50+(i*20));
             //g.fillOval(1150-(i*10), 150-(i*10), 50+(i*20),50+(i*20));
        }
        for(int i=10;i>0;i--){
            g.setColor(Color.RED);
             g.drawOval(1150-(i*10), 500-(i*10), 100+(i*20),50+(i*20));
             //g.fillOval(1150-(i*10), 500-(i*10), 100+(i*20),50+(i*20));
        }
        for(int i=0;i<10;i++){
            g.setColor(Color.GREEN);
            g.drawRect(650-(i*10),150-(i*10),50+(i*20),(i*20));
            //g.fillRect(650-(i*10),150-(i*10),50+(i*20),(i*20));
        }
        for(int i=0;i<10;i++){
            g.setColor(Color.CYAN);
            g.drawRect(650-(i*10),500-(i*10),40+(i*20),40+(i*20));
            //g.fillRect(650-(i*10),500-(i*10),40+(i*20),40+(i*20));
        }
        for(int i=0;i<10;i++){ 
        int x[] = { 305+(i*10), 410+(i*10), 461+(i*10), 410+(i*10), 305+(i*10), 254+(i*10) }; 
        int y[] = { 10+(i*10), 10+(i*10), 98+(i*10), 186+(i*10), 186+(i*10), 98+(i*10) }; 
        int numberofpoints = 6;
        g.setColor(new Color(25+(i*23)+5,i*15,0));
        g.fillPolygon(x, y, numberofpoints);
    }
        for(int i=0;i<10;i++){ 
        int x[] = { 305+(i*10), 355+(i*10), 255+(i*10) }; 
        int y[] = { 300+(i*10), 412+(i*10), 412+(i*10) }; 
        int numberofpoints = 3;
        g.setColor(new Color(25+(i*23)+5,0,i*15));
        g.fillPolygon(x, y, numberofpoints);
    }
  }

    
}

//Su legado, la ecuación de Bernoulli, sigue vivo.