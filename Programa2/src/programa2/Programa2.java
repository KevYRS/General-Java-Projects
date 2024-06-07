import java.awt.*;

public class Programa2{ //Campo de texto
    public static void main(){
        Frame Marco = new Frame();
        Panel EntradaDatos = new Panel(new FlowLayout());
        TextField Nombre = new TextField(20);
        TextField Apellidos = new TextField(70);
        TextField Nacionalidad = new TextField("Mexicana",15);
        
        EntradaDatos.add(Nombre);
        EntradaDatos.add(Apellidos);
        EntradaDatos.add(Nacionalidad);
    }
        
    
}