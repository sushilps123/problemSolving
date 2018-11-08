package sps.practice.java;

import java.util.Arrays;

public class BoxStacking {
	static int dp[]; // temp table to store results
	public static void main(String args[]) {
		int n = 4;
		int arr[] = {4,6,7,1,2,3,4,5,6,10,12,32};
//		int n = 3;
//		int arr[] = {1,2, 3, 4, 5, 6, 3, 4, 1};
		
		BoxStacking classObj = new BoxStacking();
		
		/* Array of Entry class objects */
		Entry table[] = new Entry[n*6];
		int i=0;
		int index = 0;
		
		/* All Combinations of l,b,h rotations 6 possible pairs of each l,b,h*/
		
		while(i<arr.length) {
			table[index]   =  classObj.new Entry(arr[i],arr[i+1],arr[i+2]);
			table[index+1] = classObj.new Entry(arr[i],arr[i+2],arr[i+1]);
			table[index+2] = classObj.new Entry(arr[i+1],arr[i],arr[i+2]);
			table[index+3] = classObj.new Entry(arr[i+1],arr[i+2],arr[i]);
			table[index+4] = classObj.new Entry(arr[i+2],arr[i],arr[i+1]);
			table[index+5] = classObj.new Entry(arr[i+2],arr[i+1],arr[i]);
			i=i+3;
			index = index+6;
		}

		Arrays.sort(table, (a,b) -> a.length.compareTo(b.length));  // sorting based on length
		int sum[] = new int[n*6];
		dp = new int[n*6];
		for(int j=0;j<table.length;j++) {
			if(dp[j]!=0)
				sum[j] = dp[j];
			else
				sum[j] = findMaxHeight(table,j);
		}
		Arrays.sort(sum);
		System.out.println(sum[table.length-1]);
	}


	public static int findMaxHeight(Entry table[],int index) {

		if(index==table.length)
			return 0;	
		
		if(dp[index]!=0)
			return dp[index];

		int maxsum = table[index].height;

		for(int i=index+1;i<table.length;i++) {
			if((table[index].length < table[i].length) && (table[index].width < table[i].width)) {
				int sum = table[index].height+findMaxHeight(table,i);
				if(sum > maxsum)
					maxsum = sum;
			}	
		}
		dp[index] = maxsum;
		return maxsum;
	}

	class Entry{
		Integer length;
		Integer width;
		int height;
		Entry(int length,int width,int height){
			this.length = length;
			this.width = width;
			this.height = height;
		}
	}

}
