package leboutique;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//@author Kevin
public class LeBoutique {
    //hon hon baguette torre eiffel Jesuis Christ
    public static void main(String[] args) {

        Frame f=new Frame("HONHON LE BOUTIQUE");
        Panel p1=new Panel(new GridLayout(2,2));
	p1.setBackground(Color.cyan);
	Panel p2=new Panel(new GridLayout(2,1));
	Label l1=new Label("Artículo");
	Choice ch1=new Choice();
	Label l2=new Label("Precio unitario");
	Label l3=new Label("");
	Panel p3=new Panel(new GridLayout(2,1));
	Label l4=new Label("DESCUENTOS DISPONIBLES :0");
	Panel p3_1=new Panel();
	Panel p3_2=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel(new GridLayout(3,1));
	Panel p5_1=new Panel();
	Panel p5_2=new Panel();
	Panel p5_3=new Panel();
	Label l6=new Label("Sub-total");
	Label l7=new Label("I.V.A.");
	Label l8=new Label("Total");
	Button b1=new Button("Añadir al carrito");
	List car=new List();
	f.add(p1);
        
	//Panel lado S-Izq
	p1.add(p2);
	p2.add(l1);
	p2.add(ch1);
	ch1.add("Seleccione un artículo");
	ch1.add("Pantalon");
	ch1.add("Camisa");
	ch1.add("Blusa");
	p2.add(l2);
	p2.add(l3);
	ch1.addItemListener(new AddPren(l3));
        
        //Panel lado S-Derecho
	p1.add(p3);
	p3.add(p3_1);
	p3.add(p3_2);
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox cb1=new Checkbox("30%",cbg,false);
	Checkbox cb2=new Checkbox("50%",cbg,false);
	Checkbox cb3=new Checkbox("70%",cbg,false);
	Checkbox cb4=new Checkbox("0%",cbg,false);
	p3_1.add(l4);
	p3_2.add(cb4);
	p3_2.add(cb1);
	p3_2.add(cb2);
	p3_2.add(cb3);
	p3_2.add(b1);
	
        //Panel lado I-Izq
	car.setBounds(0,0,300,200);
	p1.add(p4);
	p4.add(car);
	
        //Panel lado I-Derecho
	p1.add(p5);
	p5.add(p5_1);
	p5_1.add(l6);
	p5.add(p5_2);
	p5_2.add(l7);
	p5.add(p5_3);
	p5_3.add(l8);
	b1.addActionListener(new AddPren(car,cbg, ch1, l6, l7, l8));
		
	f.setVisible(true);
	f.setSize(550,550);
	f.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	}); 
    }
}