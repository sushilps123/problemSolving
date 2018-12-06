package sps.practice.String;

public class BeautifulString {
	static int table[][];
	public static void main(String args[]) {
		
		char arr[] = {'a','e','i','o','u'};
		int n=6;
		int sum=0;
		table = new int [n+1][n+1];
		for(int i=0;i<5;i++) {
			table[i][n] = getBeautifulStringCount(arr,i,n-1);
			sum+=table[i][n];
		}
		System.out.println(sum);
	}
	
	public static int getBeautifulStringCount(char arr[],int i,int n) {
		if(table[i][n]!=0)
			return table[i][n];
		if(n==0)
			return 1;
		
		int sum = 0;
			
		for(int j=i;j<5;j++) {
			sum += getBeautifulStringCount(arr,j,n-1);
		}
		table[i][n] = sum;
		return sum;
	}
	
	
	
}
