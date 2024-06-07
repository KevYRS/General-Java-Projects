package jslidercolor;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class PintaConJSlider implements ChangeListener {
    
        TextField posicion;
        JPanel panelcolor;
        JSlider scr;
        JSlider scv;
        JSlider sca;
        
    public PintaConJSlider(JPanel pan,JSlider rojo,JSlider verde,JSlider azul) {
        this.panelcolor=pan;
        this.scr=rojo;
        this.scv=verde;
        this.sca=azul;
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        int rojo=scr.getValue();
        int verde=scv.getValue();
        int azul=sca.getValue();
        panelcolor.setBackground(new Color(rojo,verde,azul));
    }
}