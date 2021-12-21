package demo2.p2;

import demo2.*;


/**
 *
 * @author CFGS
 */

public class NombreHilos_p2 extends Thread{
    
    //private String nombre;
    private int numVeces;
    
    private static int numHilosEjecutados=0;
    
    public NombreHilos_p2(String nombre,int num){
        super(nombre);
        
        System.out.println("CREANDO HILO:"+this.getName());
        this.numVeces=num;
        numHilosEjecutados++;
    }//Fin constructor con todos los parametros

    public static int getNumHilosEjecutados(){
        return numHilosEjecutados;
    }
    @Override
    public void run() {
        
        
        
        for (int i = 0; i < numVeces; i++) {
            System.out.println("Hilo:"+this.getName()+" Número del mensaje = "+i);
        }
    }
    
}//Fin class
