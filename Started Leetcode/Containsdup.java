import java.util.Scanner;

public class Containsdup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        int[] nums = {1,2,3,1};

        for (int i = 0; i < nums.length; i++){
          int dup = nums[0];
          for (int j = 1; j < nums.length+1; j++){
            if(dup == nums[j]){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
          }  
        }
    }
    
}
