package in.pavan;


public class TwoIndexSumEqualsTo {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,5};
        int target = 12;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println( i + ", " + j );
                    return;
                	
                }
            }
        }
        
        System.out.println("No solution found.");
    }
}

