package leboutique;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

//@author Kevin
public class AddPren implements ActionListener, ItemListener {
    
    Label tf,l6,l7,l8;
    List car; //carrito xd
    Choice ch1;
    CheckboxGroup cbg;
    Checkbox o=null;
    double PrecioFinal=0, Iva, Final;
        
    public AddPren(Label tf) {
        this.tf=tf;
    }    
    
    public AddPren(List car, CheckboxGroup cbg, Choice ch1, Label l6, Label l7, Label l8) {
	this.car=car;
	this.cbg=cbg;
	this.ch1=ch1;
	this.l6=l6;
	this.l7=l7;
	this.l8=l8;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
	double descuento=0, Pantalon=800, Camisa=850, Blusa=600;
	String articulo="";
	o=cbg.getSelectedCheckbox();
	if(ch1.getSelectedItem().equals("Pantalon")) {
            if((o.getLabel()).equals("30%") ) {
                descuento= Pantalon * 0.7;
            }else if((o.getLabel()).equals("50%") == true) {
                descuento= Pantalon * 0.5;
            }else if((o.getLabel()).equals("70%") == true) {
                descuento= Pantalon * 0.3;
            }else {
                descuento=Pantalon;
            }
	articulo += "Pantalon";
	}
	if(ch1.getSelectedItem().equals("Camisa")) {
            if((o.getLabel()).equals("30%") ) {
                descuento= Camisa * 0.7;
            }else if((o.getLabel()).equals("50%") == true) {
                descuento= Camisa * 0.5;
            }else if((o.getLabel()).equals("70%") == true) {
                descuento= Camisa * 0.3;
            }else {
                descuento=Camisa;
	}
	articulo += "Camisa";
	}
	if(ch1.getSelectedItem().equals("Blusa")) {
            if((o.getLabel()).equals("30%") ) {
                descuento= Blusa * 0.7;
            }else if((o.getLabel()).equals("50%") == true) {
                descuento= Blusa * 0.5;
            }else if((o.getLabel()).equals("70%") == true) {
                descuento= Blusa * 0.3;
            }else {
                descuento=Blusa;
	}
	articulo += "Blusa";
	}
        
	articulo += " $"+ descuento;
	car.add(articulo);
	PrecioFinal+=descuento;
	l6.setText("$"+PrecioFinal);	
	Iva=PrecioFinal*0.165;
	Final=PrecioFinal + Iva;
	l7.setText("$"+Iva);		
	l8.setText("$"+Final);
			
	if(Final>=100000 && Final<=101000) {
            JOptionPane.showMessageDialog(null, "Ya me dejaste sin mercancia largo de aqui");
	}else if(Final>=50000) {
            JOptionPane.showMessageDialog(null, "GRACIAS...por gastar mucho dinero aui jajaja");
	}else if(Final>=30000) {
            JOptionPane.showMessageDialog(null, "WOW si que tienes mcuho dinero");
	}else if(Final>=10000) {
            JOptionPane.showMessageDialog(null, "DETENTE, no te lleves gran parte de mi mercancia");
	}	
    }
	@Override
	public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            Choice l=(Choice)e.getSource();
            String seleccion=(String) l.getSelectedItem();
            switch(seleccion) {
            case "Pantalon":
                tf.setText("Pantalon: $ 800.00");
            break;
            case "Blusa":
                tf.setText("Blusa: $ 600.00");
            break;
            case "Camisa":
                tf.setText("Camisa: $ 850.00");
            break;
	}
    }
}