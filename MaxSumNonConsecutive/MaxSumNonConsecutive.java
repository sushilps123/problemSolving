package sps.practice.java;

import java.util.Arrays;

public class MaxSumNonConsecutive {
	private static int LEASTCOUNT = -9999;

	public static void main (String args[]) {
		
		int a[] = {-1,-2,-5,-9,0,1,-77,-9,-8,-7};
		int size = a.length;
		int [] b = new int[size];

		for(int i=0;i<size;i++) {
			b[i] = -9999;
		}
		int sum_local;
		for(int i=size-1;i>=0;i--) {
			sum_local = a[i];
			for(int j=i+2;j<=size-1;j++) {

				// For nth element
				if(j==size-1) {
					if(b[j] != LEASTCOUNT) {
						if(a[i]+b[j] > sum_local) {
							if(b[j] < a[i]+b[j]) {
								b[i] = a[i]+b[j];
								break;
							}
							else if(b[j] > a[i]+b[j]){
								b[i] = b[j];
								break;
							}
						}
						else if(a[i]+b[j] < sum_local && b[j] > a[i]) {
							b[i] =b[j];
							break;
						}
					}
				}		

				else if(b[j] != LEASTCOUNT && b[j+1] != LEASTCOUNT) {

					if(b[j+1] > b[j]) {
						if(a[i]+b[j+1]>sum_local && b[j+1] < a[i]+b[j+1]) {
							b[i] = a[i]+b[j+1];
							break;
						}
						if(a[i]+b[j+1]>sum_local && b[j+1] > a[i]+b[j+1]) {
							b[i] = b[j+1];
							break;
						}
					}

					else if(b[j+1] < b[j]) {
						if(a[i]+b[j]>sum_local && b[j] < a[i]+b[j]) {
							b[i] = a[i]+b[j];
							break;
						}
						if(a[i]+b[j]>sum_local && b[j] > a[i]+b[j]) {
							b[i] = b[j];
							break;
						}
					}
				}

				else if(a[i]+a[j] > sum_local && a[j] < a[j]+a[i]) {
					b[i] =a[i]+a[j];
				}
				else if(a[i]+a[j] > sum_local && a[j] > a[j]+a[i]) {
					b[i] =a[j];
				}
				else if(a[i]+a[j] < sum_local && a[j] > a[i]) {
					b[i] =a[j];
				}

			}
			if(b[i]==LEASTCOUNT)
				b[i]=sum_local;
		}

		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(b[size-1]);
	}
}

