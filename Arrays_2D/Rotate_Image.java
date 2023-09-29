package Arrays_2D;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(arr);
	}

	public static void rotate(int arr[][]) {
		// transpose the matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		//reverse the array
		for (int i = 0; i < arr.length; i++) {
			reverse(arr[i]);
		}
		//print the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void reverse(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
