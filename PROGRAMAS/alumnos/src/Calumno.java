import java.io.Serializable;

public class Calumno implements Serializable{
 private int nc;
 private String nombre="";
 private String ap="";
 private String am="";
 private String rfc="";
 private String fechaNacimiento="";

    Calumno(int nc, String nombre, String ap, String am, String fechaNacimiento, String rfc) { //generado
        this.nc=nc;
        this.nombre=nombre;
        this.ap=ap;
        this.am=am;
        this.fechaNacimiento=fechaNacimiento;
        this.rfc=rfc;
    }

    public String getCarrera() {
        return carrera;
    }
    
    public Calumno(){
        
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
 private String carrera="";

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
 
}
