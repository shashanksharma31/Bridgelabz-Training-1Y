package MapInterface;
import java.util.*;

public class VotingCountInElection{
    public static void main(String[] args){

        Map<String,Integer> votes=new HashMap<>();

        String[] voteStream={
                "Amit","Ravi","Neha","Amit","Ravi",
                "Amit","Sita","Neha","Amit","Ravi"
        };

        for(String name:voteStream){
            if(votes.containsKey(name)){
                votes.put(name,votes.get(name)+1);
            }else{
                votes.put(name,1);
            }
        }

        String winner="";
        int max=0;

        System.out.println("Vote Count:");
        for(String name:votes.keySet()){
            int count=votes.get(name);
            System.out.println(name+" "+count);

            if(count>max){
                max=count;
                winner=name;
            }
        }

        System.out.println("\nWinner: "+winner);
    }
}