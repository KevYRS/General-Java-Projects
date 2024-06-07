package campodtexto;
import java.awt.*;

public class CampoDTexto {
    public static void main(String[] args) {
        Frame Marco = new Frame();
        Panel EntraDato = new Panel(new FlowLayout());
        TextField Nombre = new TextField(20);
        TextField Apellido = new TextField(30);
        TextField Nacionalidad = new TextField("Mexicana",15);
        
        EntraDato.add(Nombre);
        EntraDato.add(Apellido);
        EntraDato.add(Nacionalidad);
        
        Marco.add(EntraDato);
        Marco.setSize(510,140);
        Marco.setTitle("Ventana CampoDTexto");
        Marco.setVisible(true);
    }    
}
