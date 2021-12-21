package demo2;


/**
 *
 * @author CFGS
 */

public class NombreHilos extends Thread{
    
    private String nombre;
    private int numVeces;
    private static int numHilosCreados=0;
    private static int numHilosEjecutados=0;
    
    public NombreHilos(String nombre,int num){
        numHilosCreados++;
        System.out.println("CREANDO HILO:"+nombre);
        this.nombre=nombre;
        this.numVeces=num;
    }//Fin constructor con todos los parametros

    @Override
    public void run() {
        numHilosEjecutados++;
        if (numHilosEjecutados==numHilosCreados) {
            System.out.println(numHilosEjecutados+" HILOS INICIADOS...");
        }
        for (int i = 0; i < numVeces; i++) {
            System.out.println("Hilo:"+nombre+" Número del mensaje = "+i);
        }
    }
    
}//Fin class
