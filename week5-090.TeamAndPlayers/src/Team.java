import java.sql.SQLOutput;
import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private String name;
    private int maxSize=16;

    public Team(String name){
        this.name=name;
        this.players=new ArrayList<Player>();


    }
    public String getName(){
        return this.name;
    }


    public void addPlayer(Player player){
        if(players.size()>maxSize-1){

        } else
        this.players.add(player);
    }


    public void printPlayers(){
        for(Player teamPlayers : players){
            System.out.println(teamPlayers);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;

    }
    public int size(){
        return this.players.size();
    }
    public int goals(){
        int totalGoals=0;
        for(Player goals : players){
            totalGoals+=goals.getGoals();
        }
        return totalGoals;
    }


}
