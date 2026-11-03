public class maximumOfArray {
    public static void main(String[] args) {
        int[] nums ={66,70,292,83,02,19,44,96};
        int maximumValue =0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>maximumValue){
                maximumValue = nums[i];
            }
        }
        System.out.println("Maximum of the array is: "+maximumValue);
    }
}
