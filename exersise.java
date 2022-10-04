import java.util.*;
public class exersise {
  public static void main(String[] args) 
    {
      Integer nums[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
      int sum = 0;
	  System.out.println("Original Array: ");
	  System.out.println(Arrays.toString(nums)); //toString(): Returns a string representation of the contents of the specified array.
    

    for (int i=0; i<nums.length; i++)
    {
        sum=sum+nums[i];
       
    }

    double avg=sum/nums.length;
    System.out.println("The average of the said array is:"+avg);
    System.out.println("The numbers in the said array that are greater than the average are:");
    for(int i=0; i<nums.length; i++){
    if(nums[i]>avg)
    {
        System.out.println("The numbers in the said array that are greater than the average are:"+nums[i]);

    }
}
}
}