package carrera;
 public class Tortuga {
    private int position;
    private boolean winner = false;
    public Tortuga(int position){
        this.position = position;
    }
    public synchronized void avanceRapido() throws InterruptedException{
        Thread.sleep(1000);
        position = position + 3;
        notifyAll();
    }
    public synchronized void resbalon() throws InterruptedException{
        Thread.sleep(1000);
        position = position - 6;
        if(position < 1){
            position = 1;
        }
        notifyAll();
    }
    public synchronized void avanceLento() throws InterruptedException{
        Thread.sleep(1000);
        position = position + 3;
        notifyAll();
    }
    public synchronized int get() {
        notifyAll();
        return position;
    }
    public synchronized boolean getWinner(){
        if(position >= 70){
            winner = true;
        }
        return winner;
    }
}