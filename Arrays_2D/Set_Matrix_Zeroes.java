package Arrays_2D;

public class Set_Matrix_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 1, 1 }, 
				        { 1, 0, 1 }, 
				        { 1, 1, 1 } };
		int ans[][] = setZeroes(arr);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static  int[][] setZeroes(int[][] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					//marks the row -1
					markRow(i,arr);
					//mark the column -1
					markCol(j,arr);
				}
			}
		}
		//Finally mark all -1 as 0
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr[0].length;l++) {
				if(arr[k][l]==-1) {
					arr[k][l]=0;
				}
			}
		}
		return arr;
	}
	public static void markRow(int i,int arr[][]) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]!=0) {
				arr[i][j]=-1;
			}
		}
	}
	private static void markCol(int j, int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i][j]!=0) {
				arr[i][j]=-1;
			}
		}
	}
}
