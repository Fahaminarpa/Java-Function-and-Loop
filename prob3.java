import java.util.Arrays;
public class prob3 {
public static void main(String[] args) {
int[] my_array = {35000, 25000, 28000, 32500, 44000, 32800};
System.out.println("Original amount : "+Arrays.toString(my_array));            
Arrays.sort(my_array);
int index = my_array.length-2;
while(my_array[index]==my_array[my_array.length-2]){
index--;
}
System.out.println("Third largest salary: " + my_array[index]);
}
}