package MapInterface;
import java.util.*;
import java.util.Map.Entry;

public class BankingSystemCustomerBalanceTracker{
    public static void main(String[] args){

        Map<String,Double> map=new HashMap<>();

        map.put("A101",5000.0);
        map.put("A102",12000.0);
        map.put("A103",8000.0);
        map.put("A104",15000.0);
        map.put("A105",3000.0);
        map.put("A106",10000.0);

        String depositAcc="A101";
        double depositAmt=2000.0;

        if(map.containsKey(depositAcc)){
            map.put(depositAcc,map.get(depositAcc)+depositAmt);
        }

        String withdrawAcc="A103";
        double withdrawAmt=9000.0;

        if(map.containsKey(withdrawAcc)){
            double bal=map.get(withdrawAcc);
            if(withdrawAmt<=bal){
                map.put(withdrawAcc,bal-withdrawAmt);
            }else{
                System.out.println("Insufficient balance for "+withdrawAcc);
            }
        }

        List<Entry<String,Double>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list,new Comparator<Entry<String,Double>>(){
            public int compare(Entry<String,Double> a,Entry<String,Double> b){
                return Double.compare(b.getValue(),a.getValue());
            }
        });

        System.out.println("Customers by Descending Balance:");
        for(Entry<String,Double> e:list){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("\nTop 3 Customers:");
        for(int i=0;i<3 && i<list.size();i++){
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
        }
    }
}