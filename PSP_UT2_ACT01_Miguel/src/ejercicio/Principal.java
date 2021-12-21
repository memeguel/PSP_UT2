package ejercicio;


/**
 *
 * @author CFGS
 */

public class Principal {
    public static void main(String[] args) {
        Hilos hilo1=new Hilos("HILO_0");
        Hilos hilo2=new Hilos("HILO_1");
        Hilos hilo3=new Hilos("HILO_2");
        
        System.out.println("El nombre del hilo main es: "+Thread.currentThread().getName());
        
        System.out.println("Cambio el nombre del hilo main a Principal...");
        Thread.currentThread().setName("Principal");
        System.out.println("El NUEVO nombre del hilo main es: "+Thread.currentThread().getName());
        
        System.out.println("Llamada al método toString() del hilo main: "+Thread.currentThread().toString());
        
        System.out.println("Información del "+hilo1.getName()+": "+hilo1.toString());
        System.out.println("Información del "+hilo2.getName()+": "+hilo2.toString());
        System.out.println("Información del "+hilo3.getName()+": "+hilo3.toString());
        
        System.out.println(Hilos.getHilosCreados()+" HILOS CREADOS...");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        System.out.println("Hilos activos "+Thread.activeCount());
    } //Fin del main

} //Fin de la clase Principal
