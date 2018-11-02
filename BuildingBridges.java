package sps.practice.java;

import java.util.Arrays;

public class BuildingBridges {

	static int tempTable[];
	public static void main(String args[]) {
		int n= 8;
		int arr1[] = {1,2,3,4,5,6,7,8};
		int arr2[] = {8,1,4,3,5,2,6,7};
		
		tempTable = new int[n];
		
		int maxTable[] = new int[arr1.length]; 
		for(int i=0;i<arr1.length;i++)
			maxTable[i] = 1+findmax(arr1,arr2,i);
		Arrays.sort(maxTable);
		System.out.println(maxTable[arr1.length-1]);
	}
	
	public static int findmax(int arr1[],int arr2[],int index) {
		
		int xindex = arr1[index];
		int yindex = arr2[index];
		int maxSum = 0;
		int sum = 0;
		
		if(index==arr1.length)
			return 0;
		
		if(tempTable[index]!=0)
			return tempTable[index];
		
		for(int i=index+1;i<arr1.length;i++) {
			if(arr2[i] > yindex) {
				
			    sum = 1+findmax(arr1,arr2,i);
			    tempTable[i] = sum-1;
				if(sum > maxSum)
					maxSum = sum;
			}
		}
		return maxSum;	
	}
}
