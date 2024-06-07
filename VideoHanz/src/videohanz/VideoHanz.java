package videohanz;
import java.awt.*;
import javax.swing.*;
 //@author Kevin
public class VideoHanz {
    public static void main(String[] args) {
        
        Frame Marco = new Frame();
        Panel Inicio = new Panel(new BorderLayout());
        Marco.add(Inicio);
        Marco.setSize(1350,740);
        Marco.setVisible(true);
        Label Vacio = new Label("");
        
        //Elementos de arriba
        Panel arriba = new Panel(new FlowLayout());
        Label Titulo = new Label("Video Club Hanz");
        arriba.add(Vacio);
        arriba.add(Titulo);
        arriba.add(Vacio);
        Inicio.add(arriba,BorderLayout.NORTH);
        
        //Elementos de abajo
        Panel abajo = new Panel(new GridLayout(0,3));
        Button Compra = new Button("Comprar");
        Button Venta = new Button("Venta");
        Button Renta = new Button("Rentar");
        Inicio.add(abajo,BorderLayout.SOUTH);
        abajo.add(Compra);
        abajo.add(Venta);
        abajo.add(Renta);
        
        //Elementos de la izquierda
        Panel izq = new Panel(new GridLayout(6,2));
        Label Datos = new Label("Datos del cliente: "); 
        Label nomb = new Label("Nombres");
        Label apell = new Label("Apellidos");
        Label corr = new Label("Correo");
        Label tel = new Label("Teléfono");
        Label tar = new Label("Tarjeta");
        TextField Nomb = new TextField();
        TextField Apell = new TextField();
        TextField Corr = new TextField();
        TextField Tel = new TextField();
        List Tar = new List(3,false);
        Tar.add("MasterCard");
        Tar.add("Visa");
        Tar.add("PayPal");
        Tar.add("Débito");
        
        izq.add(Datos);
        izq.add(Vacio);
        izq.add(nomb);
        izq.add(Nomb);
        izq.add(apell);
        izq.add(Apell);
        izq.add(corr);
        izq.add(Corr);
        izq.add(tel);
        izq.add(Tel);
        izq.add(tar);
        izq.add(Tar);
        Inicio.add(izq,BorderLayout.WEST);
        
        //Elementos de la derecha
        Panel der = new Panel(new GridLayout(6,0));
        Label dias = new Label("En el caso de renta");
        Label dia = new Label("Total de dias a rentar: ");
        Choice Dia = new Choice();
        Dia.add("1 día");
        Dia.add("2 días");
        Dia.add("3 días");
        Dia.add("4 días");
        Dia.add("5 días");
        Dia.add("6 días");
        Dia.add("7 días");
        Label precio = new Label("Precios por cantidad de días:");
        TextArea pre = new TextArea("1 día: $35\n2 días: $65\n"
                + "3 días: $100\n4 días: $150\n"
                + "5 días: $200\n6 días: $265\n7 días: $345");
        der.add(dias);
        der.add(precio);
        der.add(pre);
        der.add(dia);
        der.add(Dia);
        Inicio.add(der,BorderLayout.EAST);
        
        //Elementos en el centro
        Panel cen = new Panel(new GridLayout(0,3));
        Panel cenizq = new Panel(new GridLayout(7,0));
        Panel cencen = new Panel(new GridLayout(7,0));
        Panel cender = new Panel(new GridLayout(6,0));
        
        Label Pel = new Label("Clasificación de Películas:");
        cenizq.add(Pel);
        Checkbox terr = new Checkbox("Fantasia",false);
        Checkbox dram = new Checkbox("Infantiles",false);
        Checkbox come = new Checkbox("Comedia",false);
        Checkbox acci = new Checkbox("Acción",false);
        Checkbox ficc = new Checkbox("C. Ficción",false);
        Checkbox roma = new Checkbox("Romántica",false);
        cenizq.add(acci);
        cenizq.add(ficc);
        cenizq.add(come);
        cenizq.add(dram);       
        cenizq.add(roma);
        cenizq.add(terr);
        cen.add(cenizq);
        
        Label Ser = new Label("Clasificacion de Series:");
        cencen.add(Ser);
        Checkbox Acci = new Checkbox("Acción",false);
        Checkbox Ficc = new Checkbox("C. Ficción",false);
        Checkbox Dram = new Checkbox("Drama",false);
        Checkbox hist = new Checkbox("Histórica",false);
        Checkbox poli = new Checkbox("Infantil",false);
        cencen.add(Acci);
        cencen.add(Ficc);
        cencen.add(Dram);       
        cencen.add(hist);
        cencen.add(poli);
        cen.add(cencen);
        
        Label ViJu = new Label("Clasificacion de Videojuegos: ");
        cender.add(ViJu);
        CheckboxGroup VJ = new CheckboxGroup();
        cender.add(new Checkbox("Xbox.",false,VJ));
        cender.add(new Checkbox("Play Station.",false,VJ));
        cender.add(new Checkbox("SEGA.",false,VJ));
        cender.add(new Checkbox("Nintendo.",false,VJ));
        cen.add(cender);
        
        Inicio.add(cen,BorderLayout.CENTER);
        
    }
}
