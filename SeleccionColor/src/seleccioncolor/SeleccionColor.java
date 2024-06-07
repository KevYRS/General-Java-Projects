package seleccioncolor;
import java.awt.*;
//@author Kevin
public class SeleccionColor {

    public static void main(String[] args) {
        Frame marco = new Frame("Tectlistener color");
        Panel inicio = new Panel(new GridLayout(2,1));
        
        Panel P1 = new Panel();
        TextField camcolo = new TextField();
        
        inicio.add(P1);
        inicio.add(camcolo);
              
        camcolo.addTextListener(new pinta(P1));
        
        marco.add(inicio);
        marco.setSize(500,300);
        marco.setVisible(true);
    }   
}