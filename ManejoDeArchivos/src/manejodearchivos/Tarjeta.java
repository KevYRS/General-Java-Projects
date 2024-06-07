package manejodearchivos;
import java.io.Serializable;
/**
 *
 * @author Kevin
 */
public class Tarjeta implements Serializable{
    private int Numero;
    private String Descripcion;
    private int Existencia;
    private int Stock_Minimo;
    private int Stock_Maximo;
    
    public Tarjeta(int n,String d,int e,int smin,int smax){
        Numero=n;
        Descripcion=d;
        Existencia=e;
        Stock_Minimo=smin;
        Stock_Maximo=smax;
    }
    public void setNumero(int n){
        Numero=n;
    }
    public void setDescripcion(String d){
        Descripcion=d;
    }
    public void setExistencia(int e){
        Existencia=e;
    }
    public void setStockMinimo(int smin){
        Stock_Minimo=smin;
    }
    public void setStockMaximo(int smax){
        Stock_Maximo=smax;
    }
    public int getNumero(){
        return Numero;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public int getExistencia(){
        return Existencia;
    }
    public int getStockMinimo(){
        return Stock_Minimo;
    }
    public int getStockMaximo(){
        return Stock_Maximo;
    }
    
}
