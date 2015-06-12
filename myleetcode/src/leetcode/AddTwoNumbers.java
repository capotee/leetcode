package leetcode;

/*
 * 2 4 3
 * 5 6 4 
 * 7 0 8
 * 
 * 2 4 3
 * 5 6
 * 7 0 4
 * 
 * 2 4
 * 5 6
 * 7 0 1
 */
public class AddTwoNumbers {
	

	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode swap1 = l1;
		 ListNode swap2 = l2;
		 boolean nextAdd1 = false;
		 ListNode result = null;
		 ListNode swapResult = null;
		 while(swap1 != null || swap2 != null){
			 
			 int addresult = 0;
			 if(swap1 == null){
				 addresult = swap2.val;
			 }
			 else if(swap2 == null){
				 addresult = swap1.val;
			 }
			 else{
				 addresult = swap1.val + swap2.val;
			 }
			 if(nextAdd1){
				 addresult = addresult + 1;
			 }
			 int res = addresult % 10;
			 if(addresult / 10 == 1){
				 nextAdd1 = true;
			 }else{
				 nextAdd1 = false;
			 }
			 ListNode step = new ListNode(res);
			 if(result == null){
				 result = step;
				 swapResult = result;
			 }else{
				 swapResult.next = step;
				 swapResult = swapResult.next;
			 }
			 
			 if(swap1 !=null){
				 if(swap1.next == null){
					 swap1 = null; 
				 }else{
					 swap1 = swap1.next;
				 }
			 }
			 
			 if(swap2 != null){
				 if(swap2.next == null){
					 swap2 = null;
				 }else{
					 swap2 = swap2.next;
				 }
			 }
		 }
		 if(nextAdd1){
			 swapResult.next = new ListNode(1);
		 }
		 return result;
	 }
	
//	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		l1.next = l12;
		
//		ListNode s = null;
//		s = l1;
//		while(s.next != null){
//			s.val =100;
//			System.out.println(s.val);
//			s = s.next;
//		}
		
		ListNode l2 = new ListNode(5);
		ListNode l21 = new ListNode(6);
		//ListNode l22 = new ListNode(4);
		l2.next = l21;
		//l21.next = l22;
//		System.out.println(initNum(l1));
		ListNode result = addTwoNumbers(l1,l2);
		System.out.println(result.toString());
		
	}


	

}
