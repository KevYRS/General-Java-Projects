package checkbgcolor;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;

public class pintaCheckGroup implements ItemListener {
    Panel colors;
    Checkbox am,az,bl,ci,ma,ng,roj,ros,ve;
    public pintaCheckGroup(Panel pan) {
        this.colors = pan;
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        String Selecciona = (String) e.getItem();
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
}