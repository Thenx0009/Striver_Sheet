package Arrays;

import java.util.*;

public class Move_all_Zeroes_to_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,2,3,2,0,0,4,5,1};
		moveZeroes(arr);
	}
	
	public static void moveZeroes(int arr[]) {
		ArrayList<Integer> ll = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				ll.add(arr[i]);
			}
		}
		for(int j=0;j<ll.size();j++) {
			arr[j]=ll.get(j);
		}
		for(int k=ll.size();k<arr.length;k++) {
			arr[k] = 0;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
