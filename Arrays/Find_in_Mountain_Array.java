package Arrays;

 // This is MountainArray's API interface.
 // You should not implement it, or speculate about its implementation
 interface MountainArray {
     public default int get(int index) {
		return index;}
     public default int length() {
		return 0;}
 }

public class Find_in_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array = [1,2,3,4,5,3,1];
//		int target = 3;
//		findInMountainArray(target,mountainArr);
	}

	public static int findInMountainArray(int target, MountainArray mountainArr) {
		// Binary search to find peak - find last element that is greater than prev
		int lo = 0, hi = mountainArr.length() - 1;
		int cand = -1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (mid == 0 || mountainArr.get(mid) > mountainArr.get(mid - 1)) {
				cand = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		// Binary search for target
		lo = 0;
		hi = cand;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (mountainArr.get(mid) == target) {
				return mid;
			} else if (mountainArr.get(mid) < target) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		lo = cand + 1;
		hi = mountainArr.length() - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (mountainArr.get(mid) == target) {
				return mid;
			} else if (mountainArr.get(mid) < target) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		return -1;
	}

}
