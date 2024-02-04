package Main.Queue;

public class Main {

    public static void main(String[] args){

         Queue fila = new Queue();

             fila.enqueue("primeiro");
             fila.enqueue("segundo");
             fila.enqueue("terceiro");

             System.out.println(fila);

             System.out.println(fila.dequeue());

             System.out.println(fila);
    }
}
