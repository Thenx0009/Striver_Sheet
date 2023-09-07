package Arrays;

import java.util.Scanner;

public class Check_array_is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(sorted(arr));
	}
	public static boolean sorted(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1]) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
