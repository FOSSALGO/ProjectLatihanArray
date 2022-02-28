package fosalgo;

import java.util.LinkedList;

public class Latihan15 {
    public static void main(String[] args) {
        LinkedList linkedLS = new LinkedList();
        
        System.out.println(linkedLS);
        
        linkedLS.add(13);
        linkedLS.add(67);
        linkedLS.add(59);
        System.out.println(linkedLS);
        
        linkedLS.addFirst(78);
        linkedLS.addFirst(32);
        System.out.println(linkedLS);
        
        
        linkedLS.addLast("Pemrograman Java");
        linkedLS.addLast(14);
        linkedLS.addLast(51);
        System.out.println(linkedLS);
        
        for(int i=0; i<linkedLS.size();i++){
            System.out.print(linkedLS.get(i)+" ");
        }
        System.out.println();
        
        System.out.println("------------------");
        System.out.println(linkedLS);
        
        Object elemen = linkedLS.peekLast();
        System.out.println("PEEK: "+elemen);
        System.out.println(linkedLS);
        
        linkedLS.push("HUJAN");
        linkedLS.push("AWAN");
        System.out.println(linkedLS);
        
        ///POLL, POP, PEEK, PUSH
        //STACK
        //QUEUE
    }
}
