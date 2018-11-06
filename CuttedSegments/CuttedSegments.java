package sps.practice.java;

import java.util.HashMap;

public class CuttedSegments {
	static int MIN_VAL = -9999;
	static java.util.Map Map;
	public static void main(String args[]) {
		int n = 4;
		int arr[] = {2,1,1};
		Map = new HashMap<Integer,Integer>();
		int max_ways = findmax(arr,n);
		System.out.println(max_ways);
	}
	public static int findmax(int arr[],int n) {

		int max = 0;
		int sum = 0;

		if(n==0)
			return 0;
		
		if(Map.get(n)!=null){
		    return (int) Map.get(n);
		}

		for(int i=0;i<arr.length;i++) {
			if(arr[i] <= n) {
				sum = 1+findmax(arr,n-arr[i]);
				if(sum > max)
					max = sum;
			}
		}
		
		if(max==0) {
			Map.put(n,MIN_VAL);
			return MIN_VAL;
		}
		Map.put(n,max);
		return max;
	}
}
