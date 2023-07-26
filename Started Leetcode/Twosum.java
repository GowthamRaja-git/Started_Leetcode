import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {2,7,11,15};

        int target = 9;

        for(int i = 0; i<nums.length; i++){
            int temp = target;
            for(int j = 1; j<4; j++){
                if(temp == nums[i] + nums[j]){
                    int sum = nums[i] + nums[j];
                    System.out.println("the taget is " + sum);
                    System.out.println("");
                }

        

            }
        }

    }
}