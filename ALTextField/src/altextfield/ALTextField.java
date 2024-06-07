package altextfield;
import java.awt.*;
//@author Kevin 
public class ALTextField {

    
    public static void main(String[] args) {
        Frame marco = new Frame("Eventos con Text Field");
        Panel pin = new Panel();
        marco.add(pin);
        GridLayout panel = new GridLayout(2,1);
        pin.setLayout(panel);
        Panel cambia = new Panel();
        cambia.setBackground(Color.black);
        TextField color = new TextField(15);
        pin.add(cambia);
        pin.add(color);
        color.addActionListener(new Pintar(cambia));
        marco.setVisible(true);
        marco.setSize(400, 220);
    } 
}