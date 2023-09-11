package Arrays;

import java.util.*;

public class Find_The_Number_That_Appears_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};

		System.out.println(Ones(arr));

	}

	public static int Ones(int arr[]) {
		int XOR = 0;
		for (int i = 0; i < arr.length; i++) {
			XOR = XOR ^ arr[i];
		}
		return XOR;
	}

}
