package Arrays;

import java.util.*;

public class my {
	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		greater(arr);
		
	}

	public static void greater(int arr[]){
        int arr2[] = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            arr2[i] = arr[i+1];
        }  
        arr2[arr2.length-1]=-1; 
        for(int j=0;j<arr2.length;j++) {
        	System.out.print(arr2[j]+" ");
        }
    }
}
