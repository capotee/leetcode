package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	
	public static String convert(String s, int numRows) {
		int count = 0;
		String swap = s;
		String answer = "";
		List<String> list = new ArrayList<String>();
		while(swap.length() > 0){
			if(numRows == 1){
				answer = s;
				break;
			}
			if(numRows > 2){
				if(swap.length() > numRows){
					String sub = swap.substring(0, numRows);
					list.add(sub);
					count = count + 1;
				}else{
					String sub = swap;
					for(int i = 0 ; i < numRows - swap.length();i++){
						sub = sub + " ";
					}
					list.add(sub);
					count = count + 1;
					break;
				}
			
				swap = swap.substring(numRows);
				int re = 0;
			
				re = numRows - 2;
				
				if(swap.length() > re){
					String sub2 = swap.substring(0, re);
					String reverse2 = "";
					for(int r = sub2.length() ; r > 0; r--){
						reverse2 = reverse2 + sub2.charAt(r-1);
					}
					reverse2 = " " + reverse2 + " ";
					list.add(reverse2);
					count = count + 1;
				}else{
					String sub2 = swap;
					String reverse2 = "";
					for(int r = sub2.length()-1 ; r >= 0; r--){
						reverse2 = reverse2 + sub2.charAt(r);
					}
					reverse2 = reverse2 + " ";
					for(int p = 0; p < numRows - 1 - swap.length();p++){
						reverse2 = " " + reverse2 ;
					}
					
					list.add(reverse2);
					count = count + 1;
					break;
					
				}
				swap = swap.substring(numRows - 2);
			}
			
			if(numRows == 2){
				if(swap.length() > numRows){
					String sub = swap.substring(0, numRows);
					list.add(sub);
					count = count + 1;
					swap = swap.substring(numRows);
				}else{
					String sub = swap;
					list.add(sub+" ");
					count = count + 1;
					break;
				}
			}
		}
		System.out.println(list);
		
		for(int z = 0 ; z < numRows; z++){
			for(int x=0;x<count;x++){
				answer =answer + list.get(x).charAt(z);
			}
		}
		answer = answer.replace(" ", "");
		System.out.println(list);
		System.out.println(answer);
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(convert("ABCD",1));
		//P   A   H   N
		//A P L S I I G
		//Y   I   R
		
	}
}
