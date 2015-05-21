package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int [] answer= new int[2];
		Map<Integer,Integer> swap = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			swap.put(nums[i], i);
		}
       
		for(int z = 0;z<nums.length;z++){
			if(swap.containsKey(target-nums[z])){
				int index = swap.get(target-nums[z]);
				if(index != z){//证明不是同一个值
					if(z < index){
						answer[0] = z+1;
						answer[1] = index+1;
					}else{
						answer[0] = index+1;
						answer[1] = z+1;
					}
				}
			}
		}
		return answer;
    }

	public static void main(String[] args) {
		  int ques [] = {0,4,3,0};
		  int target = 0;
		  int [] answer = twoSum(ques,target);
		  System.out.println(answer[0]+">>>" +answer[1]);
	}
}
