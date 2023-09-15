package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Majority_Elemet_N3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,3,3,2,2,2};
		System.out.println( majority(arr));
	}
	//Better Approach
	public static List<Integer> majority(int arr[]){
		ArrayList<Integer> ll = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(ll.size()==0 || ll.get(0)!=arr[i]) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[j]==arr[i]) {
						count++;
					}
				}
				if(count>arr.length/3) {
					ll.add(arr[i]);
				}
			}
			if(ll.size()==2) {
				break;
			}
		}
		return ll;
	}

}
