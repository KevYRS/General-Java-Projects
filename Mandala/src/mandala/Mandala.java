package mandala;
//@authors Kevin & Kenet

import java.applet.Applet;
import java.awt.*;

public class Mandala extends Applet{

    public void paint(Graphics g){
        
        //Circulo 1
        g.setColor(Color.cyan);
        g.fillOval(180, 130, 550, 550);        
        //Circulo 2
        g.setColor(Color.red);
        g.fillOval(205, 155, 500, 500);

        //Estrella grande
        int puntos = 3;
        
        int a[]={455,660,250};
        int b[]={155,550,550};
        
        int c[]={625,530,210};
        int d[]={220,645,355};
        
        int e[]={700,380,285};
        int f[]={355,645,220};
        g.setColor(Color.pink);
        g.fillPolygon(a, b, puntos);
        g.fillPolygon(c, d, puntos);
        g.fillPolygon(e, f, puntos);
        
        //Estrella media       
        int a1[]={455,620,290};
        int b1[]={205,530,530};
        
        int c1[]={588,520,250};
        int d1[]={263,610,360};
        
        int e1[]={655,390,322};
        int f1[]={365,610,263};
        g.setColor(Color.magenta);
        g.fillPolygon(a1, b1, puntos);
        g.fillPolygon(c1, d1, puntos);
        g.fillPolygon(e1, f1, puntos);
        
        //Estrella media       
        int a2[]={455,600,310};
        int b2[]={235,515,515};
        
        int c2[]={580,514,269};
        int d2[]={274,593,365};
        
        int e2[]={632,400,342};
        int f2[]={372,588,282};
        g.setColor(Color.yellow);
        g.fillPolygon(a2, b2, puntos);
        g.fillPolygon(c2, d2, puntos);
        g.fillPolygon(e2, f2, puntos);
        
        //Rombo 1/9,2/9,3/9
        int rombi=4;
        int A1[]={380,425,346,320};
        int B1[]={327,395,369,325};
        
        int C1[]={445,447,398,407};
        int D1[]={293,378,312,268};
        
        int E1[]={432,370,314,350};
        int F1[]={372,438,440,400};
        g.setColor(Color.blue);
        g.fillPolygon(A1, B1, rombi);
        g.fillPolygon(C1, D1, rombi);
        g.fillPolygon(E1, F1, rombi);
        
        //Rombo 4/9,5/9,6/9
        int A2[]={345,386,260,310};
        int B2[]={235,315,315,380};
        
        int C2[]={580,514,269,210};
        int D2[]={274,593,365,210};
        
        int E2[]={632,400,342,210};
        int F2[]={372,588,282,210};
        g.setColor(Color.blue);
        //g.fillPolygon(A2, B2, rombi);
        //g.fillPolygon(C2, D2, rombi);
        //g.fillPolygon(E2, F2, rombi);
        
        //Rombo 7/9,8/9,9/9
        int A3[]={345,386,260,310};
        int B3[]={235,315,315,380};
        
        int C3[]={580,514,269,210};
        int D3[]={274,593,365,210};
        
        int E3[]={632,400,342,210};
        int F3[]={372,588,282,210};
        g.setColor(Color.blue);
        //g.fillPolygon(A3, B3, rombi);
        //g.fillPolygon(C3, D3, rombi);
        //g.fillPolygon(E3, F3, rombi);
        
      
    }

}
