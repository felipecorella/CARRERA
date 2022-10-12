package carrera;
public class Carrera {
    static Tortuga tort = new Tortuga(1);
    static Liebre lie = new Liebre(1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicio");

        boolean fin = false;
        while(!fin){
            int turno1 = (int) Math.floor(Math.random()*(100)+1);
            int turno2 = (int) Math.floor(Math.random()*(100)+1);
            liebreTurno(turno1);
            tortugaTurno(turno2);
            int p1 = (int) lie.get();
            int p2 = (int) tort.get();

            for(int i = 0; i < p1; i++){
                System.out.print(" ");
            }
            System.out.println("L");
            for(int i = 0; i < p2; i++){
                System.out.print(" ");
            }
            System.out.println("T");

            boolean ganador1 = (boolean)lie.getWinner();
            boolean ganador2 = (boolean)tort.getWinner();
            if(ganador1 && ganador2){
                System.out.println("Empate");
                fin = true;
            }
            else if(ganador1){
                System.out.println("Ganó liebre");
                fin = true;
            }
            else if(ganador2){
                System.out.println("Ganó tortuga");
                fin = true;
            }
        }
    }
    public static void liebreTurno(int valor) throws InterruptedException {
        if(0 < valor && valor < 21){
            lie.duerme();
        }
        else if(21 < valor && valor < 41){
            lie.granSalto();
        }
        else if(41 < valor && valor < 51){
            lie.resbalonGrande();
        }
        else if(51 < valor && valor < 81){
            lie.saltoChico();
        }
        else{
            lie.resbalonChico();
        }
    }
    public static void tortugaTurno(int valor) throws InterruptedException{
        if(0 < valor && valor < 51){
            tort.avanceRapido();
        }
        else if(51 < valor && valor < 71) {
            tort.resbalon();
        }
        else{
            tort.avanceLento();
        }
    }
}