package Arrays;

import java.util.Arrays;

public class Max_Number_of_K_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4};
		int k = 5;
		System.out.println(maxOperations(nums,k));
	}
	public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count = 0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                i++;
                j--;
                count++;
            }
            else if(nums[i]+nums[j]<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }

}
