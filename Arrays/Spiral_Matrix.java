package Arrays;
import java.util.*;

public class Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},
			      {5,6,7,8},
			     {13,14,15,16},
			     {18,19,20,21}};
		System.out.println(spiralOrder(arr));
	}
    public static List<Integer> spiralOrder(int[][] arr) {
    	List<Integer> ll = new ArrayList<>();
        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;
        int te = arr.length*arr[0].length;
        int count=0;
        while(count<te){
            for(int i=minR;i<=maxC && count<te;i++){
                ll.add(arr[minR][i]);
                count++;
            }
            minR++;
            for(int i=minR;i<=maxR && count < te;i++){
                ll.add(arr[i][maxC]);
                count++;
            }
            maxC--;
            for(int i=maxC;i>=minC && count < te;i--){
                ll.add(arr[maxR][i]);
                count++;
            }
            maxR--;
            for(int i=maxR; i>=minR && count < te; i--){
                ll.add(arr[i][minC]);
                count++;
            }
            minC++;
        }
        return ll;
    }
    

}
