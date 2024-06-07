package listcolor;
import java.awt.*;

public class ListColor {
    public static void main(String[] args) {
        Frame mar = new Frame("List Colores");
        Panel tod = new Panel(new GridLayout(2,1));
        
        Panel cambia = new Panel();
              
        List colores = new List();
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Blanco");
        colores.add("Cyan");
        colores.add("Negro");
        colores.add("Rojo");
        colores.add("Rosa");
        colores.add("Margenta");
        colores.add("Verde");
        
        tod.add(cambia);
        tod.add(colores);
        
        colores.addItemListener(new pintaConList(cambia));
        
        mar.add(tod);
        mar.setSize(490,355);
        mar.setVisible(true);
    }
}
