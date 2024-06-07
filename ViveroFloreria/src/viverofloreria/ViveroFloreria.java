package viverofloreria;
import java.awt.*;
import javax.swing.*;
//@author Kevin

public class ViveroFloreria {

    public static void main(String[] args) {
        JFrame Marco = new JFrame();
        JPanel inicio = new JPanel(new BorderLayout());
        Marco.add(inicio);
        Marco.setSize(1200,730);
        Marco.setVisible(true);       
    
        //Parte Arriba
        JPanel arr = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel Bienv = new JLabel("Vivero y Florería");
        arr.add(Bienv);
        inicio.add(arr,BorderLayout.NORTH);
        
        //Parte Abajo
        JPanel aba = new JPanel(new FlowLayout());
        JLabel pago = new JLabel("Pago con: ");
        JLabel tot = new JLabel("Total: ");
        JTextField to = new JTextField("$$$$");
        ButtonGroup bg = new ButtonGroup();
        JCheckBox efect = new JCheckBox("Con Efectivo",false);
        JCheckBox tarje = new JCheckBox("Con Tarjeta",false);
        bg.add(efect);
        bg.add(tarje);
        aba.add(pago);
        aba.add(efect);
        aba.add(tarje);
        aba.add(tot);
        aba.add(to);
        inicio.add(aba,BorderLayout.SOUTH);
        
        //Parte Centro
        String[] arboles = {"Manzano  $500","Roble  $300","Naranjo $600","Acacia  $1000","Abedúl  $800"};
        String[] arbustos = {"Abelia  $100","Boina de vasco  $150","Cotoneaster  $300","Arbusto comun  $200"};
        String[] flores = {"Rosa  $10","Girasol  $30","Tulipán  $50","Clavel  $50","Pansies  $30","Lilie  $20"};
        JPanel cen = new JPanel(new GridLayout(2,3));
        JLabel ar = new JLabel("Selecciona el árbol:");
        JList arbo = new JList(arboles);
        JLabel arbu = new JLabel("Selecciona el arbusto:");
        JList arbus = new JList(arbustos);
        JLabel fl = new JLabel("Selecciona la flor:");
        JList flo = new JList(flores);
        cen.add(ar);
        cen.add(arbu);
        cen.add(fl);
        cen.add(arbo);
        cen.add(arbus);        
        cen.add(flo);
        inicio.add(cen,BorderLayout.CENTER);
        
        //Parte Izquierda
        JPanel izq = new JPanel(new GridLayout(2,0));
        JLabel or = new JLabel("Ornamentas: ");
        Choice orna = new Choice();
        orna.add("Maceta $100");
        orna.add("Piedras $80");
        orna.add("Fertilizante $230");
        orna.add("Fuente $500");
        orna.add("Colibri falso $350");
        izq.add(or);
        izq.add(orna);
        inicio.add(izq,BorderLayout.WEST);
        
        //Parte Derecha
        JPanel der = new JPanel(new GridLayout(8,0));
        JLabel datos = new JLabel("Datos: ");
        JLabel nom = new JLabel("Nombre: ");
        JLabel tel = new JLabel("Teléfono: ");        
        JLabel dir = new JLabel("Dirección: ");        
        JTextField n = new JTextField("");
        JTextField t = new JTextField("");
        JTextField d = new JTextField("");
        JButton Env = new JButton("Envíar");
        der.add(datos);
        der.add(nom);
        der.add(n);
        der.add(tel);
        der.add(t);
        der.add(dir);
        der.add(d);
        der.add(Env);
        inicio.add(der,BorderLayout.EAST);
    }
    
}
