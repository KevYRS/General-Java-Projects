package areatexto;
import java.awt.*;

public class AreaTexto {
    public static void main(String[] args) {
        int FILAS = 3;
        int COLUMNAS = 20;
        
        Frame Marco = new Frame();
        Panel Panel = new Panel();
        TextArea Comentario = new TextArea("La tarte",FILAS,COLUMNAS,TextArea.SCROLLBARS_VERTICAL_ONLY);
        
        Comentario.append(" de chocolate estaba buena");
        Comentario.insert(" muy",28);
        
    }
    
}
