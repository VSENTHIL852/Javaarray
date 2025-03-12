import java.util.*;
public class Arraysum{
    public static void main(String[] args){
        int[] arr1={10,9,8,7,6,5,4,2,3,1,0};
        int sum=0;
        for(int i: arr1)
          sum+=i;
        System.out.println(sum);
    }
}
