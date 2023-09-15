package Arrays;

import java.util.HashMap;

public class Majority_element_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,1,1,1,2,2};
		System.out.println(majoriy(arr));
	}
	//Better Approach(Using HashMap)
//	public static int majoriy(int arr[]) {
//		
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int val:arr) {
//			if(map.containsKey(val)) {
//				int count = map.get(val);
//				map.put(val, count+1);
//			}
//			else {
//				map.put(val, 1);
//			}
//		}
//		for(int key:map.keySet()) {
//			int frequency = map.get(key);
//			if(frequency>(arr.length/2)) {
//				return key;
//			}
//		}
//		return -1;
//	}
	//Optimal Approach (Moore's Voting Algorithm)
	public static int majoriy(int arr[]) {
		int count =0;
		int el = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(count==0) {
				count=1;
				el=arr[i];
			}
			else if(arr[i]==el) {
				count++;
			}
			else {
				count--;
			}
		}
		return el;
	}

}
