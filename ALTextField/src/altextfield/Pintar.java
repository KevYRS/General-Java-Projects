package altextfield;
import java.awt.*;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@author Kevin
public class Pintar implements ActionListener {
    private Panel panel;
    public Pintar(Panel panel) {
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        TextField fuente = (TextField) e.getSource();
        String Seleccioncolor = fuente.getText();
        if (Seleccioncolor.equals("R")) {
            panel.setBackground(Color.red);
        }
        else if (Seleccioncolor.equals("A")) {
         panel.setBackground(Color.blue);
        }
        else if (Seleccioncolor.equals("V")) {
        panel.setBackground(Color.green);
        }
    }
}
