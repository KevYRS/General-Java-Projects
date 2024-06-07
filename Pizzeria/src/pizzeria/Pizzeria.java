package pizzeria;
import java.awt.*;
/**
 *
 * @author Kevin
 */
public class Pizzeria {
    public static void main(String[] args) {
        int filas=65,colums=35;
        
        //Cascaron de la pestaña
        Frame Marco = new Frame();
        Panel Panel1 = new Panel(new GridLayout(2,0));
        Panel Panel2 = new Panel(new GridLayout(2,2));
        Panel elec1 = new Panel(new GridLayout(6,0));
        Panel elec2 = new Panel(new GridLayout(3,0));
        TextArea P = new TextArea("Todas las pizzas Grandes a $140, gigantes a $290 y pequeñas a $85 con cualquier ingrediente! *solo pizzas con un ingrediente.",filas,colums,TextArea.SCROLLBARS_VERTICAL_ONLY);
        Panel Panel3 = new Panel(new GridLayout(1,6));
        Panel Panel4 = new Panel(new GridLayout(1,1));
        
        //Etiquetas y más cascarones en cada espacio de la paestaña
        Label Franq = new Label(" Jessy´s Pizza ");
        Label Ing = new Label("Ingredientes: ");
        Label Tam = new Label("Tamaño: ");
        Label Precio = new Label("Precio: ");
        Label Datos = new Label("Datos del cliente: ");
        Label Total = new Label("Total: ");
        
        TextField Tot = new TextField("$1000");
        TextField Dat = new TextField("Mariano");
        
        //Lista de checkbox
        Checkbox Pepperoni = new Checkbox("Pepperoni",false);
        Checkbox Mexicana = new Checkbox("Mexicana",false);
        Checkbox Hawaiiana = new Checkbox("Hawaiiana",false);
        Checkbox Carnes = new Checkbox("Carnes Frías",false);
        Checkbox Queso = new Checkbox("Queso",false);
        Checkbox Especial = new Checkbox("Especial",false);
        
        CheckboxGroup T = new CheckboxGroup();
       
        //Panel central de la pestaña
        Panel2.add(Panel3);
        Panel2.add(Panel4);
        
        //Panel con las casillas a seleccionar
        Panel3.add(Ing);
        Panel3.add(elec1);
        Panel3.add(Tam);
        Panel3.add(elec2);
        Panel3.add(Precio);
        Panel3.add(P);
        
        //Paneles para los checkbox
        elec1.add(Pepperoni);
        elec1.add(Hawaiiana);
        elec1.add(Mexicana);
        elec1.add(Carnes);
        elec1.add(Queso);
        elec1.add(Especial);
        elec2.add(new Checkbox("Pequeña.",false,T));
        elec2.add(new Checkbox("Grande.",false,T));
        elec2.add(new Checkbox("Gigante.",false,T));
        
        //Panel para la parte inferior de la pestaña
        Panel4.add(Datos);
        Panel4.add(Dat);
        Panel4.add(Total);
        Panel4.add(Tot);
        
        //Panel principal de la pestaña.
        Panel1.add(Franq);
        Panel1.add(Panel2);
        
        //Producto final
        Marco.add(Panel1);        
        Marco.setSize(950,700);
        Marco.setTitle("A ver ese ULTRA PAQUETE UwU");
        Marco.setVisible(true);
    } 
}
