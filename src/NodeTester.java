/**
 * Created by 216430 on 9/27/2017.
 */
import java.io.*;
import java.util.*;
        public class NodeTester {
            public static void main(String[] args ) throws IOException{
                Scanner in = new Scanner(new File("input.txt"));
                Actor[] actors = new Actor[5];
                Node[] nodes = new Node[5];
                int index = 0;
                while(in.hasNext()){
                    actors[index] = new Actor(in.nextLine());
                    nodes[index] = new Node(actors[index]);
                    index++;
                }



                Node head = nodes[0];
                for (int i = 1; i < nodes.length; i++){
                    nodes[i].setNextPtr(nodes[i-1]);
                }

                head = nodes[nodes.length-1];
                Node current = head;
        while (current != null){
            System.out.println(current);
            current = current.next;
        }

        System.out.println(( (Actor) head.get()).getName());
    }
}
