package Padre;

public class Empleado {
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("homero")){
            this.nombre="No homeros";
        }else {
            this.nombre=nombre;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    private String nombre;
    private double sueldo;
    public String direccion;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String obtenerDetalles(){
        return "nombre: "+this.getNombre()+" Sueldo:"+this.getSueldo();
    }
    //@Override
    //public String toString(){
      //  return "su nombre es="+this.getNombre()+" sueldo: "+this.getSueldo();
    //}
}
