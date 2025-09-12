// import java.util.*;

public class varArgsImplementation {
    //Maximum of numbers using variable Args.
    public static int max(int ...nums){
        if(nums.length == 0) return Integer.MIN_VALUE;
        int temp = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>temp) temp=nums[i];
        }
        return temp;
    }
    // Sum of all elements using variable Args.
    public static int sum(int ...nums){
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        return sum1;
    }
    public static void main(String[] args) {
        System.out.println(max());      //returns -infinity
        System.out.println(max(1,2,8,4,75,79,9,45));        //returns 79
        System.out.println(sum());     //returns 0
        System.out.println(sum(10,20,4,24,52));     //returns 110
    }
}
