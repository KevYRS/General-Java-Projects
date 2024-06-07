package ContaZorrosA;

/**
 *
 * @author Kevin
 */
public class Ccuenta {
    private double saldo;
    private String nombre;
    private String tipo_cuenta;
    private String cve_cuenta;
    
    public void haber(double cantidad){
    }
    public void debe(double cantidad){
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public String getCve_cuenta() {
        return cve_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public void setCve_cuenta(String cve_cuenta) throws ContaException{
        Integer.parseInt(cve_cuenta);
        if (cve_cuenta.length()!=4)
            throw new ContaException("La clave de cuenta debe de ser de 4 digitos");
        else
        this.cve_cuenta = cve_cuenta;
    }
    public String toString(){
        String cadena;
        cadena=this.cve_cuenta+""+this.nombre+""+this.tipo_cuenta+""+this.saldo+"\n";
        return cadena;
    }
    public String[] ordenburbuja(int limite, Ccuenta[] cuenta){
        String[] nom=new String[14];
        for(int i=0;i<cuenta.length;i++){
            nom[i]=cuenta[i].nombre;            
        }        
        String aux;
        for(int i=1;i<nom.length;i++){
            for(int k=0;k<nom.length-i;k++){
                if(nom[k].compareTo(nom[k+1])>0){
                    aux=nom[k];
                    nom[k]=nom[k+1];
                    nom[k+1]=aux;
                }
            }
        }
        return nom;
    }    
}
