package choicecolor;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class pintarConChoice implements ItemListener {
    Panel colors;
    public pintarConChoice(Panel pan) {
        this.colors = pan;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Choice fuente = (Choice)e.getSource();
        String Selecciona = (String) fuente.getSelectedItem();
        if(Selecciona.equals("Rojo")){
            colors.setBackground(Color.red);
        }else if(Selecciona.equals("Azul")){
            colors.setBackground(Color.blue);
        }else if(Selecciona.equals("Verde")){
            colors.setBackground(Color.green);
        }else if(Selecciona.equals("Amarillo")){
            colors.setBackground(Color.yellow);
        }else if(Selecciona.equals("Rosa")){
            colors.setBackground(Color.pink);
        }else if(Selecciona.equals("Blanco")){
            colors.setBackground(Color.white);
        }else if(Selecciona.equals("Negro")){
            colors.setBackground(Color.black);
        }else if(Selecciona.equals("Cyan")){
            colors.setBackground(Color.cyan);
        }else if(Selecciona.equals("Margenta")){
            colors.setBackground(Color.magenta);
        }
    }
    class Conclusion extends WindowAdapter {
    public void windowClosing( WindowEvent evt ) {
    System.exit( 0 );
    }
    }
}
