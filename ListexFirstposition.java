import java.util.ArrayList;
public class ListexFirstposition{
  public static void main(String[] args){
    ArrayList<String> list=new ArrayList<>();
    list.add("red");
    list.add("green");
    list.add("orange");
    list.add("white");
    list.add("Black");
    System.out.println(list);
    list.add(0,"yellow");
    System.out.println(list);
  }
}
