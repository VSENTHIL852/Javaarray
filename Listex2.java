import java.util.ArrayList;
public class Listex2{
  public static void main(String[] args)
  {
    ArrayList<String> list=new ArrayList<>();
    list.add("Red");
    list.add("Green");
    list.add("Orange");
    list.add("White");
    list.add("Black");
    for(String lists: list){
      System.out.println(lists);
    }
    
  }
}
