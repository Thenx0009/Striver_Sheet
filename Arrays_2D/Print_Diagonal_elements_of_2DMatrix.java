package Arrays_2D;

import java.util.Scanner;

public class Print_Diagonal_elements_of_2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Diagonal(arr);
	}
	public static void Diagonal(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i==j) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}

}
