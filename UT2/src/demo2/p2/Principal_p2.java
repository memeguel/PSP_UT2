package demo2.p2;

import demo2.*;


/**
 *
 * @author CFGS
 */

public class Principal_p2 {
    public static void main(String[] args) {
        System.out.println("Número de procesadores: "+Runtime.getRuntime().availableProcessors());
        
        NombreHilos_p2 hilo1=new NombreHilos_p2("Hilo 1",3);
        NombreHilos_p2 hilo2=new NombreHilos_p2("Hilo 2",4);
        NombreHilos_p2 hilo3=new NombreHilos_p2("Hilo 3",5);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        System.out.println(NombreHilos_p2.getNumHilosEjecutados()+" HILOS INICIADOS...");
    } //Fin del main

} //Fin de la clase Principal_p2
