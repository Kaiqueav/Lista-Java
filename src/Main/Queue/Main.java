package Main.Queue;

public class Main {

    public static void main(String[] args){

         Queue fila = new Queue();

             fila.enqueue(new No("primeiro"));
             fila.enqueue(new No("segundo"));
             fila.enqueue(new No("terceiro"));

             System.out.println(fila);

             System.out.println(fila.dequeue());

             System.out.println(fila);
    }
}
