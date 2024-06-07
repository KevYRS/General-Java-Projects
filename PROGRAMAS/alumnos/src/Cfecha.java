public class Cfecha {
private int dia;
private int mes;
private int anio;

public Cfecha(int dia, int mes, int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
}

public Cfecha(int dia, int mes){
    this.dia=dia;
    this.mes=mes;
}

public Cfecha(int dia){
    this.dia=dia;
}


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws CfechaExcepcion{
        switch (mes){
            case 1:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Enero solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 2:
                if(dia<1 || dia>29){
                    if(anio== 1992 ||anio==1996 || anio==2000 || anio==2004||anio==2008||anio==2012||anio==2016||anio==2020){
                        throw new CfechaExcepcion("Febero solo tiene 29 dias, es bisiesto");
                    }
                    else{
                        throw new CfechaExcepcion("Febero solo tiene 28 días, NO es bisiesto");
                    }
                }
                else{
                    this.dia = dia;
                }
                break;

            case 3:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Marzo solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 4:
                if(dia<1 || dia>30){
                    throw new CfechaExcepcion("Abril solo tiene 30 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 5:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Mayo solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 6:
                if(dia<1 || dia>30){
                    throw new CfechaExcepcion("Junio solo tiene 30 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 7:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Julio solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 8:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Agosto solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 9:
                if(dia<1 || dia>30){
                    throw new CfechaExcepcion("Septiembre solo tiene 30 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 10:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Octubre solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 11:
                if(dia<1 || dia>30){
                    throw new CfechaExcepcion("Noviembre solo tiene 30 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
                
            case 12:
                if(dia<1 || dia>31){
                    throw new CfechaExcepcion("Diciembre solo tiene 31 dias");
                }
                else{
                    this.dia = dia;
                }
                break;
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws CfechaExcepcion {
        if (mes<0 || mes>12){
            throw new CfechaExcepcion("Los meses son válidos de Enero(1) a Diciembre(12)");
        }
        else{
        this.mes = mes;    
        }        
    }

    public int getAnio () {
        return anio;
    }

    public void setAnio(int anio)throws CfechaExcepcion{
        
        if (anio<1990 || anio>2020){
            throw new CfechaExcepcion("Año fuera de rango");
        }
        else{
        this.anio = anio;    
        }
        
    }

public String toString(){
    String mensaje=dia+"/"+mes+"/"+anio;
    return mensaje;
}
    
}
