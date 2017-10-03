/**
 * Created by 216430 on 9/25/2017.
 */
public class Actor {
        String name;

        public Actor(){
            name = null;
        }

        public Actor(String name){
            this.name = name;

        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String toString(){
            return name;
        }
}
