package datos.escolares;
import java.awt.*;

public class DatosEscolares {
    public static void main(String[] args) {
        Frame Marco = new Frame();
        Panel EntraDato =new Panel(new GridLayout(4,3));
        Label NombreL = new Label("Nombre");
        TextField NombreT = new TextField(20);
        Label ApellidoL = new Label("Apellido");
        TextField ApellidoT = new TextField(40);
        Label CarreraL = new Label("Carrera");
        TextField CarreraT = new TextField(50);
        Label SemestreL = new Label("Semestre");
        TextField SemestreT = new TextField(2);
        Button boton = new Button("Aceptar");
        Panel vacio1 = new Panel();
        Panel vacio2 = new Panel();
        Panel vacio3 = new Panel();
        //espacio
        EntraDato.add(NombreL);
        EntraDato.add(NombreT);
        EntraDato.add(vacio1);
        EntraDato.add(ApellidoL);
        EntraDato.add(ApellidoT);
        EntraDato.add(vacio2);
        EntraDato.add(CarreraL);
        EntraDato.add(CarreraT);
        EntraDato.add(vacio3);
        EntraDato.add(SemestreL);
        EntraDato.add(SemestreT);
        EntraDato.add(boton);
        //Espacio
        Marco.add(EntraDato);
        Marco.setSize(500,210);
        Marco.setTitle("Datos Escolares");
        Marco.setVisible(true);
    }    
}
