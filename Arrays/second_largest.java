package Arrays;

import java.util.Scanner;

public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Second_largest(arr);
	}
	public static void Second_largest(int arr[]) {
		int largest = arr[0];
		int sec_largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				sec_largest = largest;
				largest = arr[i];
			}
			else if(arr[i]>sec_largest && arr[i]!=largest){
				sec_largest = arr[i];
			}
		}
		System.out.print(sec_largest);
	}

}
