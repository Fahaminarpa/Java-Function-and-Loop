import java.util.Arrays; 
 public class prob5 {
 public static void main(String[] args)
 {
    int[] array_nums = {2, 3, 4, 8, 9};
	int sum = 0;
       for(int i=0; i < array_nums.length ; i++)
        sum = sum + array_nums[i];
       //calculate average value
        double average = sum / array_nums.length;
        System.out.println("Average value of the array elements is : " + average); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Number of even numbers : "+ctr);
	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
 }
}