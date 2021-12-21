package demo1;


/**
 *
 * @author CFGS
 */

public class Hilos extends Thread{
    
    private int numVeces=0;

    public Hilos(int numVeces) {
        this.numVeces=numVeces;
    }
    
    

    @Override
    public void run() {
        for (int i = 0; i <= numVeces; i++) {
            System.out.println("Mensaje.............."+i);
        }
    }
    
}//Fin class
