import java.util.ArrayList;
public class BirdWatcher {

    private final ArrayList<Bird> birdWatch;
    private Bird bird;

    public BirdWatcher(){
        this.birdWatch=new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName){
        bird = new Bird(name,latinName);
        birdWatch.add(bird);
    }
    public ArrayList<Bird>getBirds(){
        return this.birdWatch;
    }

    public void Statistics(){
        for(Bird b : birdWatch){
            System.out.println(b);
        }
    }
}
