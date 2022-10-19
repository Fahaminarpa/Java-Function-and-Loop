import java.util.ArrayList;

public class prob1 {
   public static void main(String[] args) {
      ArrayList<String> arrlist = new ArrayList<String>(10);
      arrlist.add("1");
      arrlist.add("3");
      arrlist.add("5");
      arrlist.add("7");
	  arrlist.add("2");
      arrlist.add("4");
      arrlist.add("6");
      arrlist.add("8");
      System.out.println("Size of list: " + arrlist.size());
      for (String value : arrlist) {
         System.out.println("Value = " + value);
      }
      int retval=arrlist.indexOf("7");
      System.out.println("The element 7 is at index " + retval);
	  
      int retval=arrlist.indexOf("9");
      System.out.println("The element is not found" + retval);
   }
}