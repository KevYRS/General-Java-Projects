package choicecolor;
import java.awt.*;

public class ChoiceColor {
    public static void main(String[] args) {
        Frame marco = new Frame("Choice Colores");
        Panel toda = new Panel(new GridLayout(2,1));
        
        Panel cambia = new Panel();
              
        Choice colores = new Choice();
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Blanco");
        colores.add("Cyan");
        colores.add("Negro");
        colores.add("Rojo");
        colores.add("Rosa");
        colores.add("Margenta");
        colores.add("Verde");
        
        toda.add(cambia);
        toda.add(colores);
        
        colores.addItemListener(new pintarConChoice(cambia));
        
        marco.add(toda);
        marco.setSize(500,300);
        marco.setVisible(true);
    }
}
