package scrollbarcolor;
import java.awt.*;
import java.awt.event.*;

public class pintaConScrollBar implements AdjustmentListener {
    TextField posicion;
    Panel panelcolor;
    Scrollbar scr, scv,sca;
    public pintaConScrollBar(Panel pan,Scrollbar rojo,Scrollbar verde,Scrollbar azul) {
        this.panelcolor=pan;
        this.scr=rojo;
        this.scv=verde;
        this.sca=azul;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int rojo=scr.getValue();
        int verde=scv.getValue();
        int azul=sca.getValue();
        panelcolor.setBackground(new Color(rojo,verde,azul));
    }
}
