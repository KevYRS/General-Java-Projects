package figurasaleatorias;
/**
 *
 * @author Kevin
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class FigurasAleatorias extends Applet{

    public void paint(Graphics g){
        int r,xd,xd2,col,col2,col3;
        
        int x[]=new int[3];
        int y[]=new int[3];
        
        for(int i=1;i<=100;i++){
            //circulo
            r=(int)(Math.random()*4+1);
            xd=(int)(Math.random()*1400);
            xd2=(int)(Math.random()*800);
            g.setColor(new Color(randomizarColores(),randomizarColores(),randomizarColores()));
            g.fillOval(xd,xd2,20*r,20*r);
            //Cuadrados
            r=(int)(Math.random()*4+1);
            xd=(int)(Math.random()*1400);
            xd2=(int)(Math.random()*800);
            g.setColor(new Color(randomizarColores(),randomizarColores(),randomizarColores()));
            g.fillRect(xd,xd2,20*r,20*r);
            //Rectangulos
            r=(int)(Math.random()*4+1);
            xd=(int)(Math.random()*1400);
            xd2=(int)(Math.random()*800);
            g.setColor(new Color(randomizarColores(),randomizarColores(),randomizarColores()));
            g.fillRect(xd,xd2,40*r,10*r);
            //triángulos
            xd=(int)(Math.random()*1400);
            xd2=(int)(Math.random()*800);
            x[1]=xd;
            y[1]=xd2;
            y[0]=y[2]=(((int)(Math.random()*9+1))*10)+y[1];
            x[0]=x[1]-randomizarTriangulo((y[1]-y[0]));
            x[2]=x[1]+randomizarTriangulo(y[1]-y[0]);
            g.setColor(new Color(randomizarColores(),randomizarColores(),randomizarColores()));
            g.fillPolygon(x,y,3);
        }
    }
    
    public int randomizarColores(){
        return (int)(Math.random()*255);
    }
    public int randomizarTriangulo(int altura){
        return (altura*(3/2));
    }
    
}
