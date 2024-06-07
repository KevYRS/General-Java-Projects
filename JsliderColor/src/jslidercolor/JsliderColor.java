package jslidercolor;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class JsliderColor {
    public static void main(String[] args) {
        JFrame mar = new JFrame("Jslider Colores");
        
        JPanel panel = new JPanel(new GridLayout(2,1));
        JPanel panelcolor=new JPanel();
        panelcolor.setBackground(Color.white);
        panel.add(panelcolor);
        JPanel panelescalas=new JPanel(new GridLayout(2,3));
        panel.add(panelescalas);
        
        JSlider rojo = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        JSlider verde = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        JSlider azul = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        
        rojo.setInverted(false);
        rojo.setPaintTicks(true);
        rojo.setMajorTickSpacing(50);
        rojo.setMinorTickSpacing(10);
        rojo.setPaintLabels(true);
        verde.setInverted(false);
        verde.setPaintTicks(true);
        verde.setMajorTickSpacing(50);
        verde.setMinorTickSpacing(10);
        verde.setPaintLabels(true);
        azul.setInverted(false);
        azul.setPaintTicks(true);
        azul.setMajorTickSpacing(50);
        azul.setMinorTickSpacing(10);
        azul.setPaintLabels(true);
        
        Label lr=new Label("Rojo");
        Label lv=new Label("Verde");
        Label la=new Label("Azul");
        
        panelescalas.add(lr);
        panelescalas.add(lv);
        panelescalas.add(la);
        panelescalas.add(rojo);
        panelescalas.add(verde);
        panelescalas.add(azul);
        
        mar.setSize(450, 395);
        mar.add(panel);
        mar.setVisible(true);
        
        rojo.addChangeListener(new PintaConJSlider(panelcolor,rojo,verde,azul));
        verde.addChangeListener(new PintaConJSlider(panelcolor,rojo,verde,azul));
        azul.addChangeListener(new PintaConJSlider(panelcolor,rojo,verde,azul));
    }
}
