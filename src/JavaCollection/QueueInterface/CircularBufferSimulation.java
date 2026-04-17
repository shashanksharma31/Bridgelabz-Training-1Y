package JavaCollection.QueueInterface;
import java.util.*;
class CircularBuffer{
    int[] arr;
    int size;
    int front=0;
    int count=0;
    CircularBuffer(int size){
        this.size=size;
        arr=new int[size];
    }
    void add(int x){
        int rear=(front+count)%size;
        arr[rear]=x;
        if(count<size){
            count++;
        }else{
            front=(front+1)%size;
        }
    }
    void display(){
        for(int i=0;i<count;i++){
            System.out.print(arr[(front+i)%size]+" ");
        }
        System.out.println();
    }
}
public class CircularBufferSimulation{
    public static void main(String[] args){
        CircularBuffer cb=new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        cb.display();
    }
}