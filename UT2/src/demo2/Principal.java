package demo2;


/**
 *
 * @author CFGS
 */

public class Principal {
    public static void main(String[] args) {
        NombreHilos hilo1=new NombreHilos("Hilo 1",3);
        NombreHilos hilo2=new NombreHilos("Hilo 2",4);
        NombreHilos hilo3=new NombreHilos("Hilo 3",5);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    } //Fin del main

} //Fin de la clase Principal
