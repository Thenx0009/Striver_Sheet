package Arrays;

import java.util.Scanner;

public class largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		largest(arr);
	}
	
	public static void largest(int arr[]) {
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
