import Hijo.ScrumMaster;
import Padre.Empleado;

public class Main {
    public static void imprime(Empleado emple){
        System.out.println("Obeto.obtenerDetalles()="+emple.obtenerDetalles());
    }
    public static void prueba(int dato){
        System.out.println("nada");
    }

    public static void determinarTipo(Empleado emple){
        if (emple instanceof ScrumMaster){
            System.out.println("Esto viene de ScrumMaster");
        }else if (emple instanceof Empleado){
            System.out.println("Esto viene de Empleado");
        } else if (emple instanceof Object) {
            System.out.println("es cualquier cosa");
        }
    }
    public static void main(String[] args) {
        //prueba(20.5);
        //Object acepta cualquier cosa, es una variable, es universal
        Empleado em= new Empleado("juan",3500);
        //System.out.println("nombre="+em.getNombre());
        //em.setNombre("homero");
        //System.out.println("nombre="+em.getNombre());
        //System.out.println(em.obtenerDetalles());
        //imprime(em);
        ScrumMaster sm=new ScrumMaster("juan",3000,"desarrollo");
        //System.out.println(sm.obtenerDetalles());
        //imprime(sm);
        //determinarTipo(em);
        //determinarTipo(sm);
        System.out.println(em.toString());
        //hola
    }
}