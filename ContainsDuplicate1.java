import java.util.*;

public class ContainsDuplicate1{
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>();
        boolean contains=false;
        for (int i=0;i<nums.length;i++){
            
            if(set.contains(nums[i])){
                contains=true;
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        if(contains){
            System.out.println("true");
        }
        else{
            System.out.println(false);;
        }
        
    }
}