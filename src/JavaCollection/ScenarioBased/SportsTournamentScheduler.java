package JavaCollection.ScenarioBased;
import java.util.*;

class Team{
    String name;
    int points;

    Team(String name){
        this.name=name;
        this.points=0;
    }

    public String toString(){
        return name+" "+points;
    }

    public int hashCode(){
        return name.hashCode();
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Team t=(Team)o;
        return name.equals(t.name);
    }
}

class Matches{
    Team t1;
    Team t2;

    Matches(Team t1,Team t2){
        this.t1=t1;
        this.t2=t2;
    }

    public String toString(){
        return t1.name+" vs "+t2.name;
    }
}

class Results{
    String match;
    String winner;

    Results(String match,String winner){
        this.match=match;
        this.winner=winner;
    }

    public String toString(){
        return match+" -> "+winner;
    }
}

public class SportsTournamentScheduler{
    public static void main(String[] args){

        Set<Team> teams=new HashSet<>();
        Team a=new Team("India");
        Team b=new Team("Australia");
        Team c=new Team("England");

        teams.add(a);
        teams.add(b);
        teams.add(c);

        Queue<Matches> schedule=new LinkedList<>();
        schedule.add(new Matches(a,b));
        schedule.add(new Matches(b,c));
        schedule.add(new Matches(a,c));

        List<Result> results=new ArrayList<>();

        while(!schedule.isEmpty()){
            Matches m=schedule.remove();
            Team winner=m.t1;

            System.out.println("Playing: "+m);
            winner.points+=2;

            results.add(new Result(m.toString(),winner.name));
        }

        TreeSet<Team> leaderboard=new TreeSet<>(new Comparator<Team>(){
            public int compare(Team t1,Team t2){
                if(t2.points==t1.points){
                    return t1.name.compareTo(t2.name);
                }
                return t2.points-t1.points;
            }
        });

        leaderboard.addAll(teams);

        System.out.println("\nResults:");
        for(Result r:results){
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for(Team t:leaderboard){
            System.out.println(t);
        }
    }
}