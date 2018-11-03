package sps.practice.java;
public class ValidDigitKNumber {
	public static int sum;
	public static int count;
	public static void main(String args[]) {
	//	int arr[] = {1,1,0,1,0};
		int arr[] = {0,1,0,2};
		int n = arr.length;
		int k = 3;
		int l = k;
		int j=1;
		while(j<=n-k+1) {
			count += Recursive(arr,n-j,k);
			j++;
		}
		System.out.println(count);
		
		
	}

	public static int Recursive(int arr[],int n,int k){
		int sum1 = 0;
		if(k==1) {
			if(arr[n]!=0)
				return 1;
			else
				return 0;
		}
		for(int i=n-1;i>=k-2;i--) {
			if(k>1)
			sum1 += Recursive(arr,i,k-1);
		}
		return sum1;
	}

}
