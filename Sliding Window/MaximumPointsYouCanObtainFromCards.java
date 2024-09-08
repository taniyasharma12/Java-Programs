package SlidingWindowFixedSize;

public class MaximumPointsYouCanObtainFromCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
		
	int[]	cardPoints = {1,2,3,4,5,6,1};
	
	int k = 3;
		
		System.out.println(maxScore(cardPoints,k));
		
		
	}
	
/*
 1. Take two variables leftSum and rightSum as 0
 2. Take sum of first k elements as leftSum
 3. assign value of leftSum to maxSum
 4. take another pointer j which points at last element
 5. iterate loop from k-1 to 0
 6. one by one remove left element from leftSum and add right most element to rightSum
 7. take max value of maxSum and leftSum + rightSum;
 */
	public static  int maxScore(int[] cardPoints, int k) {
		
		int leftSum=0;
		int rightSum=0;
		int maxSum=0;
		
		for(int i=0; i<k; i++) {
			
			leftSum+=cardPoints[i];
		}
		
		maxSum = leftSum;
		int j = cardPoints.length-1;
		
		for(int i=k-1; i>=0; i--) {
			
			leftSum -= cardPoints[i];
			rightSum +=cardPoints[j];
			j--;
			maxSum = Math.max(maxSum, leftSum+rightSum);
		}
		return maxSum;

	}
}
