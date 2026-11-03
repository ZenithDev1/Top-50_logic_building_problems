//package Top-50_logic_building_problems;

public class sumOfArray{
    public static void main(String[] args) {
        

        int[] nums = {10,20,30,40,50};
        int sumOfArray = 0;

        for(int i=0; i<nums.length;i++){
            sumOfArray += nums[i];
        }

        System.out.println("Sum of array is: "+sumOfArray);
    }
}