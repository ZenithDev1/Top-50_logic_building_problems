public class productOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,30,4,5};
        long productOfArray = 1;

        if (nums == null || nums.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        for(int i = 0; i < nums.length;i++){
            productOfArray *= nums[i];
        }

        System.out.println("Product of the array: "+productOfArray);
    }  
}
