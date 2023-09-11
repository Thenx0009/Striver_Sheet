package Arrays;

public class find_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int n = arr.length - 1;
		System.out.println(missing_element(arr));
		System.out.println(missing_element(arr, n));

	}

//	Ist (BETTER APPROACH)
	public static int missing_element(int arr[]) {
		int N = arr[arr.length - 1];
		int sum1 = (N * (N + 1)) / 2; // Sum of natural numbers
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		return sum1 - sum2;
	}

//  2nd (OPTIMAL APPROACH)
	public static int missing_element(int arr[], int n) {
		int XOR1 = 0;
		int XOR2 = 0;
		for (int i = 0; i < n; i++) {
			XOR2 = XOR2 ^ arr[i];
			XOR1 = XOR1 ^ (i + 1);
		}
		XOR1 = XOR1 ^ arr.length;
		return XOR1 ^ XOR2;
	}
}
