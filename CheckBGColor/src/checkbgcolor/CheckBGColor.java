package checkbgcolor;
import java.awt.*;

public class CheckBGColor {
    public static void main(String[] args) {
        Frame marco = new Frame("CheckBoxGroup Colores");
        Panel toda = new Panel(new GridLayout(2,1));
        
        Panel cambia = new Panel();
        Panel todos = new Panel(new GridLayout(3,3));
        
        CheckboxGroup colos = new CheckboxGroup();
        
        Checkbox az = new Checkbox("Azul",false,colos);
        Checkbox am = new Checkbox("Amarillo",false,colos);
        Checkbox bl = new Checkbox("Blanco",false,colos);
        Checkbox ros = new Checkbox("Rosa",false,colos);
        Checkbox ng = new Checkbox("Negro",false,colos);
        Checkbox roj = new Checkbox("Rojo",false,colos);
        Checkbox ve = new Checkbox("Verde",false,colos);
        Checkbox ma = new Checkbox("Margenta",false,colos);
        Checkbox ci = new Checkbox("Cyan",false,colos);
        
        az.addItemListener(new pintaCheckGroup(cambia));
        am.addItemListener(new pintaCheckGroup(cambia));
        bl.addItemListener(new pintaCheckGroup(cambia));
        ci.addItemListener(new pintaCheckGroup(cambia));
        ma.addItemListener(new pintaCheckGroup(cambia));
        ng.addItemListener(new pintaCheckGroup(cambia));
        roj.addItemListener(new pintaCheckGroup(cambia));
        ros.addItemListener(new pintaCheckGroup(cambia));
        ve.addItemListener(new pintaCheckGroup(cambia));
        
        toda.add(cambia);
        toda.add(todos);
        
        todos.add(am);
        todos.add(az);
        todos.add(bl);
        todos.add(ci);
        todos.add(ma);
        todos.add(ng);
        todos.add(roj);
        todos.add(ros);
        todos.add(ve);
        
        marco.add(toda);
        marco.setSize(420, 410);
        marco.setVisible(true); 
    }
}