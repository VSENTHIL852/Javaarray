import java.util.ArrayList;
import java.util.Collections;
public class ListexCopy{
  public static void main(String[] args){
    ArrayList<String> list1=new ArrayList<>();
    list1.add("3");
    list1.add("4");
    list1.add("5");
    list1.add("6");
    list1.add("7");
    System.out.println("List1 is:"+list1);
    ArrayList<String> list2=new ArrayList<>();
    list2.add("1");
    list2.add("2");
    list2.add("3");
    list2.add("4");
    list2.add("5");
    System.out.println("List2 is:"+list2);
    
    Collections.copy(list1,list2);
 System.out.println("List1 is:"+list1);
  System.out.print("List2 is:"+list2);
  }
}
