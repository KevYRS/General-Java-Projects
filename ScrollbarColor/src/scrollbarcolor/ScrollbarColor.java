package scrollbarcolor;
import java.awt.*;
import javax.swing.*;

public class ScrollbarColor {
    public static void main(String[] args) {
        JFrame marco = new JFrame("Scrollbar Colores");
        JPanel panel = new JPanel(new GridLayout(2,1));
        Panel PanelColor= new Panel();
        PanelColor.setBackground(Color.white);
        panel.add(PanelColor);
        Panel panc= new Panel(new GridLayout(1,2));
        panel.add(panc);
        Panel p1=new Panel(new GridLayout(3,1));
        panc.add(p1);
        Label etq1=new Label("Rojo:");
        Label etq2=new Label("Azul:");
        Label etq3=new Label("Verde:");
        p1.add(etq1);
        p1.add(etq2);
        p1.add(etq3);
        Panel p2=new Panel(new GridLayout(3,1));
        panc.add(p2);
        Scrollbar rojo = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,250);
        Scrollbar verde = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,250);
        Scrollbar azul = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,250);
        rojo.setBlockIncrement(15);
        rojo.addAdjustmentListener(new pintaConScrollBar(PanelColor,rojo,verde,azul));
        verde.addAdjustmentListener(new pintaConScrollBar(PanelColor,rojo,verde,azul));
        azul.addAdjustmentListener(new pintaConScrollBar(PanelColor,rojo,verde,azul));
        p2.add(rojo);
        p2.add(azul);
        p2.add(verde);
        marco.add(panel);
        marco.setSize(400,200);
        marco.setVisible(true);
    }
}
