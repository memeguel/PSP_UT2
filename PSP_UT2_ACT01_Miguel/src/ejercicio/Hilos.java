package ejercicio;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CFGS
 */

public class Hilos extends Thread{
    
    private static int hilosCreados=0;
    private int prioridad;
    private String nombre;

    public Hilos(String nombre) {
        prioridad=(int) (Math.random()*9)+1;
        setPriority(prioridad);
        this.nombre=nombre;
        setName(nombre);
        hilosCreados++;
    }
    
    public static int getHilosCreados(){
        return hilosCreados;
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Dentro del hilo  : "+Thread.currentThread().getName()
        +"\n\tPrioridad\t: "+Thread.currentThread().getPriority()
        +"\n\tID\t\t: "+Thread.currentThread().getId());
        System.out.println();
    }
    
}//Fin class
