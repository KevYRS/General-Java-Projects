package pintarboton;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class pintarPaneles implements ActionListener {
    Panel panel;
    public pintarPaneles(Panel panel) {
        this.panel=panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Button fuente=(Button)e.getSource();
        String Seleccionarcolor=fuente.getActionCommand();
        
        if(Seleccionarcolor.equals("Rojo")){
            panel.setBackground(Color.red);
        }else if(Seleccionarcolor.equals("Azul")){
            panel.setBackground(Color.blue);
        }else if(Seleccionarcolor.equals("Verde")){
            panel.setBackground(Color.green);
        }
 } 
}