package etiquetas;

import java.awt.Frame;
import java.awt.Label;

public class Etiquetas {
    public static void main(String[] args) {
        Frame Marco = new Frame();
        Label Titulo = new Label("Notas de mate");
        
        Marco.add(Titulo);
        
        Marco.setSize(300,200);
        Marco.setTitle("Ventana con etiqueta");
        Marco.setVisible(true);
    } 
}
