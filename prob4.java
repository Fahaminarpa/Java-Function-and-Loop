import java.util.ArrayList;
 import java.util.Arrays;
public class prob4 {
  public static void  main(String[] args) 
  {
  String[]  my_array = new String[] {"Oil", "Salt", "Tomato",  "Onion", "Ginger#", "Egg"};
  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
  
  System.out.println(list);
  }
}