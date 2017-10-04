/**
 * Created by 216430 on 9/27/2017.
 */

import java.util.*;
import java.io.*;
public class ListTester {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(new File("input.txt"));
        /*
        PART 1/2/3
        LinkedList list = new LinkedList();
        while (in.hasNext()){
            list.add(new Actor(in.nextLine().trim()));
        }

        System.out.println(list);
        System.out.println(list.get(0) + "\n");
        */
        LinkedList movies = new LinkedList();
        while (in.hasNext()){
            String input = in.nextLine();
            int year = Integer.parseInt(input.substring(0,4));
            input = input.substring(5);
            String title = input.substring(0,33).trim();
            input = input.substring(33);
            String[] actors = input.substring(0,46).trim().split(",");
            LinkedList actorList = new LinkedList();
            for (int i = 0; i < actors.length; i++){
                actorList.add(actors[i]);
            }
            input = input.substring(46).trim();
            String[] directors = input.split(",");
            LinkedList directorsList = new LinkedList();
            for (int i = 0; i < directors.length; i++){
                directorsList.add(directors[i]);
            }
            movies.add(new Movie(year, title, actorList, directorsList));
        }


        /*
        PART 4/5/6
        movies.add(new Movie(1990, "Movie 1", list, list));
        movies.add(new Movie(1990, "Movie 2", list, list));
        movies.add(new Movie(1990, "Movie 3", list, list));
        movies.add(new Movie(1990, "Movie 4", list, list));
        movies.add(new Movie(1990, "Movie 5", list, list));

        System.out.println(movies);

        System.out.println(movies.get(0));
        */
    }
}
