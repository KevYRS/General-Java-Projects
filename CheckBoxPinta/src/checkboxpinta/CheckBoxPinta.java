package checkboxpinta;
import java.awt.*;

public class CheckBoxPinta {
    public static void main(String[] args) {
        Frame mar = new Frame("Panel colores CheckBox");
        Panel cam = new Panel(new GridLayout(2,1));
        
        Panel cambia = new Panel();
        Panel todos = new Panel(new GridLayout(3,3));
        
        Checkbox az = new Checkbox("Azul");
        Checkbox am = new Checkbox("Amarillo");
        Checkbox bl = new Checkbox("Blanco");
        Checkbox ros = new Checkbox("Rosado");
        Checkbox ng = new Checkbox("Negro");
        Checkbox roj = new Checkbox("Rojo");
        Checkbox ve = new Checkbox("Verde");
        Checkbox ma = new Checkbox("Margenta");
        Checkbox ci = new Checkbox("Cyan");
        
        az.addItemListener(new pintaCheck(cambia));
        am.addItemListener(new pintaCheck(cambia));
        bl.addItemListener(new pintaCheck(cambia));
        ci.addItemListener(new pintaCheck(cambia));
        ma.addItemListener(new pintaCheck(cambia));
        ng.addItemListener(new pintaCheck(cambia));
        roj.addItemListener(new pintaCheck(cambia));
        ros.addItemListener(new pintaCheck(cambia));
        ve.addItemListener(new pintaCheck(cambia));
        
        cam.add(cambia);
        cam.add(todos);
        
        todos.add(am);
        todos.add(az);
        todos.add(bl);
        todos.add(ci);
        todos.add(ma);
        todos.add(ng);
        todos.add(roj);
        todos.add(ros);
        todos.add(ve);
        
        mar.add(cam);
        mar.setSize(380, 380);
        mar.setVisible(true);
    }
}
