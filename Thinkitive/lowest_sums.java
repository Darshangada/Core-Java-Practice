package Thinkitive;

import java.util.Arrays;

public class lowest_sums {

	  public static int minIntegersSum(int[] nums, int target) {
	        Arrays.sort(nums); 
	        int count = 0;
	        int sum = 0;
	        int index = nums.length - 1;

	        while (sum < target && index >= 0) {
	            sum =sum+ nums[index];
	            count++;
	            index--;
	        }

	        if (sum < target) {
	            return -1;
	        } else {
	            return count; 
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1,3,5,7,9};
	        int target = 10;
	        int number = minIntegersSum(nums, target);
	        
	        if(number== -1) {
	        	System.out.println("no found");
	        	
	        }
	        else {
	        	System.out.println(number);
	        }
	    }
}
