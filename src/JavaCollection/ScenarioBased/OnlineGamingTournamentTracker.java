package JavaCollection.ScenarioBased;
import java.util.*;
class Player{
    String id;
    String name;
    Player(String id,String name){
        this.id=id;
        this.name=name;
    }
    public int hashCode(){
        return id.hashCode();
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Player p=(Player)o;
        return id.equals(p.id);
    }
    public String toString(){
        return id+" "+name;
    }
}
class Match{
    Player p1;
    Player p2;
    Match(Player p1,Player p2){
        this.p1=p1;
        this.p2=p2;
    }
    public String toString(){
        return p1.name+" vs "+p2.name;
    }
}
class Result{
    String winner;
    String match;
    Result(String winner,String match){
        this.winner=winner;
        this.match=match;
    }
    public String toString(){
        return match+" -> Winner: "+winner;
    }
}
class Score{
    String player;
    int score;
    Score(String player,int score){
        this.player=player;
        this.score=score;
    }
    public String toString(){
        return player+" : "+score;
    }
}
class ScoreComparator implements Comparator<Score>{
    public int compare(Score s1,Score s2){
        return s2.score - s1.score;
    }
}
public class OnlineGamingTournamentTracker{
    public static void main(String[] args){
        Set<Player> players=new HashSet<>();
        Player a=new Player("P1","A");
        Player b=new Player("P2","B");
        Player c=new Player("P3","C");

        players.add(a);
        players.add(b);
        players.add(c);
        players.add(new Player("P1","A"));

        Queue<Match> matches=new LinkedList<>();
        matches.add(new Match(a,b));
        matches.add(new Match(b,c));

        List<Result> results=new ArrayList<>();
        TreeSet<Score> leaderboard=new TreeSet<>(new ScoreComparator());

        while(!matches.isEmpty()){
            Match m=matches.remove();
            String winner=m.p1.name;
            System.out.println("Playing: "+m);
            results.add(new Result(winner,m.toString()));

            leaderboard.add(new Score(winner,10));
        }

        System.out.println("\nResults:");
        for(Result r:results){
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for(Score s:leaderboard){
            System.out.println(s);
        }
    }
}