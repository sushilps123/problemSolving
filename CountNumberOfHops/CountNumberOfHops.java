package sps.practice.java;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfHops {
	public static void main(String args[]) {
		int n = 5;  // size of Hop
		HashMap map = new HashMap<Integer,Integer>();
		int ways = CountNumberOfWaysDp(n,map);	
		System.out.println(ways);
	}
	
	public static int CountNumberOfWaysDp(int n,HashMap map) {
		if(n==0)
			return 1;
		
		if(map!=null && map.containsKey(n))
			return (int) (map.get(n));
		
		int sum1 =0;
		int sum2=0;
		int sum3=0;
		
		if(n>=1) {
			sum1 = CountNumberOfWays(n-1);
			map.put(n-1,sum1);
		}
		if(n>=2) {
			sum2 = CountNumberOfWays(n-2);
			map.put(n-2,sum2);
		}
		if(n>=3) {
			sum3 = CountNumberOfWays(n-3);
			map.put(n-3,sum3);
		}
		return (sum1+sum2+sum3);
	}
	
	
	
	
	
	// Recursive
	public static int CountNumberOfWays(int n) {
		if(n==0)
			return 1;
		
		int sum1 =0;
		int sum2=0;
		int sum3=0;
		
		if(n>=1) {
			sum1 = CountNumberOfWays(n-1);
		}
		if(n>=2) {
			sum2 = CountNumberOfWays(n-2);
		}
		if(n>=3)
			sum3 = CountNumberOfWays(n-3);
		return (sum1+sum2+sum3);
	}
		
}
