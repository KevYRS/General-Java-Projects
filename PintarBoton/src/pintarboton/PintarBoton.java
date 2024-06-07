package pintarboton;
import java.awt.*;

public class PintarBoton {

    public static void main(String[] args) {
        Frame marco = new Frame("Paneles y Botones colores");
        Panel inicio = new Panel(new GridLayout(2,3));
        
        Panel P1 = new Panel();
        Panel P2 = new Panel();
        Panel P3 = new Panel();
        
        Button r = new Button("Rojo");
        Button a = new Button("Azul");
        Button v = new Button("Verde");
        
        inicio.add(P1);
        inicio.add(P2);
        inicio.add(P3);
        inicio.add(a);
        inicio.add(r);
        inicio.add(v);
        
        r.addActionListener(new pintarPaneles(P2));
        a.addActionListener(new pintarPaneles(P1));
        v.addActionListener(new pintarPaneles(P3));
        
        marco.add(inicio);
        marco.setSize(400,200);
        marco.setVisible(true);
    }
}