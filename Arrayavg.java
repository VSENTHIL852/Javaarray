import java.util.*;
public Arrayavg{
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int num: a)
        {
            sum+=num;
            
        }
        int avg=sum/a.length;
        System.out.println(avg);
    }
}
