package Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[] = {10,15,20};
		System.out.println(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev1 = 0, prev2 = 0;

        for (int i = 2; i <= n; i++) {
            int currentCost = Math.min(prev1 + cost[i - 1], prev2 + cost[i - 2]);
            prev2 = prev1;
            prev1 = currentCost;
        }

        return prev1;
    }
}
