package seleccioncolor;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

//@author Kevin
public class pinta implements TextListener {
    Panel panel;
    public pinta(Panel panel) {
        this.panel=panel;
    }
    @Override
    public void textValueChanged(TextEvent e){
        TextField fuente=(TextField)e.getSource();
        String Seleccionarcolor=fuente.getText();   
        if(Seleccionarcolor.equals("R")){
            panel.setBackground(Color.red);
        }else if(Seleccionarcolor.equals("A")){
            panel.setBackground(Color.blue);
        }else if(Seleccionarcolor.equals("V")){
            panel.setBackground(Color.green);
        }
    }
}