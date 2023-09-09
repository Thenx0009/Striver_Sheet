package Arrays;

import java.util.HashSet;

public class Remove_Duplicates {

	public static void main(String[] args) {
		//Ist Brute Force Approach
//		HashSet<Integer> set = new HashSet<>();
//		int arr[] = {4,4,5,5,5,6,6,7,7};
//		for(int i=0;i<arr.length;i++){
//		    set.add(arr[i]);
//		}
		//converting set back to array
		//int result[] = new int[set.size()];//No need to make an extra Array
//		int index=0;
//		for(int num:set) {
//			arr[index]=num;
//			index++;
//		}
//		System.out.println(index);
		
		//IInd Approach(using 2 pointers approach
		int arr[] = {4,4,5,5,5,6,6,7,7};
		
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		for(int k=0;k<i+1;k++) {
			System.out.print(arr[k]+" "); //This will print all unique elements
		}
		System.out.println();
		System.out.print(i+1);//This will print count of all unique elements
	}
}
