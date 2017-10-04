import java.io.*;
import java.util.*;
public class IMDb {
    public static void main (String[] args) throws IOException{
        Scanner in = new Scanner(new File("actors.txt"));
        LinkedList actors = new LinkedList();
        while (in.hasNext()){
            actors.add(new Actor(in.nextLine().trim()));
        }

        in = new Scanner(new File("movies.txt"));
        LinkedList movies = new LinkedList();
        while (in.hasNext()){
            String input = in.nextLine();
            int year = Integer.parseInt(input.substring(0,4));
            input = input.substring(5);
            String title = input.substring(0,33).trim();
            input = input.substring(33);
            String[] actorList = input.substring(0,46).trim().split(",");
            LinkedList actorsList = new LinkedList();
            for (int i = 0; i < actorList.length; i++){
                actorsList.add(actorList[i]);
            }
            input = input.substring(46).trim();
            String[] directors = input.split(",");
            LinkedList directorsList = new LinkedList();
            for (int i = 0; i < directors.length; i++){
                directorsList.add(directors[i]);
            }
            movies.add(new Movie(year, title, actorsList, directorsList));
        }

        System.out.println(actors + "\n\n");
        System.out.println(movies);

        for (int i = 0; i < actors.getCount(); i++){ //loop through the actors
            //get the actor from the actors linkedlist
            Actor currentActor = (Actor)actors.get(i);
            System.out.println(((Actor)actors.get(i)).getName()); //print out the actor's name
            for (int j = 0; j < movies.getCount(); j++){ //loop through the movies
                //get the movie from the movies linkedlist
                Movie currentMovie = (Movie)movies.get(j);
                //get the list of actors in that specific movie
                LinkedList currentActorsList = (currentMovie.getActors());
                for (int k = 0; k < currentActorsList.getCount(); k++){ //loop through the actors in the actors list
                    //get a specific actor's name from the list
                    String currentActorFromList = currentActorsList.get(k).toString().trim();
                    //check if the actor's name matches the current actor's name
                    if (currentActor.getName().equals(currentActorFromList)){
                        System.out.println(currentActor.getName() + " appears in " + currentMovie.getTitle() + ", " + currentMovie.getDate());
                    }
                }
            }
            System.out.println();
        }
    }
}
