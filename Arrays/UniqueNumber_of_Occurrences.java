package Arrays;
import java.util.*;
public class UniqueNumber_of_Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,1,1,3};
		System.out.println(unique(arr));
	}
	
	public static boolean unique(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int val:arr) {
			
			if(map.containsKey(val)) {
				int count=0;
				count=map.get(val);
				map.put(val, count+1);
			}
			else {
				map.put(val, 1);
			}
		}
		//Creating Another HashMap which Contains Map Values
		  HashMap<Integer, Boolean> occurrenceMap = new HashMap<>();

	        for (int count : map.values()) {
	            if (occurrenceMap.containsKey(count)) {
	                // If the count is not unique, return false
	                return false;
	            } else {
	                occurrenceMap.put(count, true);
	            }
	        }

	        // If all counts are unique, return true
	        return true;
	}
}
