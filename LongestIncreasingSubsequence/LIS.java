package sps.practice.java;

public class LIS {
	static int dp[];
	public static void main(String args[]) {
		int n = 83;
//		int arr[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
//		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		
		int arr[] = {86,177,115,193,135,186,92,49,21,162,27,90,59,163,126,140,26,172,136,11,168,167,29,182,130,62,123,67,135,129,2,22,58,69,167,193,56,11,42,29,173,21,119,184,137,198,124,115,170,13,126,91,180,156,73,62,170,196,81,105,125,84,127,136,105,46,129,113,57,124,95,182,145,14,167,34,164,43,150,87,8,76,178};
		dp = new int[n];
		int maxCount = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count = 1+findMaxSequenceLength(arr,i);
			if(count > maxCount)
				maxCount = count;
		}
		System.out.println(maxCount);
	}

	public static int findMaxSequenceLength(int arr[],int index) {
		
		if(index==arr.length)
			return 0;
		
		if(dp[index]!=0)
			return dp[index];
		
		int sum = 0;
		int maxsum=0;		
		for(int i=index+1;i<arr.length;i++) {
			if(arr[i] > arr[index]) {
				sum = 1+findMaxSequenceLength(arr,i);
				if(sum > maxsum)
					maxsum =sum;
			}
		}
		dp[index] = maxsum;
		return maxsum;
	}
	
}
