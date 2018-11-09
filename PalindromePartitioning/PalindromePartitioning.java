package sps.practice.java;

public class PalindromePartitioning {
	static int dp[][];
	public static void main(String args[]) {

		String str = "ababbbabbababa";
//		String str = "abbabb";
		char charArr[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			charArr[i] = str.charAt(i);
		}
		dp = new int[charArr.length][charArr.length]; // store results
		System.out.println(Partitioning(charArr,0,0));
	}

	public static int Partitioning(char charArr[],int index,int startIndex) {
		
		/* if we reach end of array and next element to lastcut i.e startIndex, 
		 * if substring between startIndex and index is palindrome return 0
		 * else this is not a possibility return max number 10000
		 */
		if(index==charArr.length-1) {
			if(isPalindrome(charArr,startIndex,index))
				return 0;
			else return 10000;
		}
		
		if(dp[startIndex][index]!=0)
			return dp[startIndex][index];
		
		int count1 = 10000;
		int count2 = 0 ;
		
		/* if elements left to index are palindrome then we can make a cut 
		 * i.e 1 + Partitioning(charArr,index+1,index+1); updating element next to cut i.e startIndex = index+1
		 */
		if(isPalindrome(charArr,startIndex,index))
			count1 = 1+Partitioning(charArr,index+1,index+1);
		
		count2 = Partitioning(charArr,index+1,startIndex);
		dp[startIndex][index] = Math.min(count1, count2);
		
		// Returning minimum of the possibilities
		return Math.min(count1, count2);
	}

	public static boolean isPalindrome(char charArr[],int startindex,int endIndex) {
		
		if(startindex==endIndex)
			return true;
		
		
		boolean Flag = false;
		for(int i=startindex;i<endIndex;i++) {
			if(charArr[i]!=charArr[endIndex]) {
				Flag = false;
				break;
			}
			else {
				Flag = true;
			}
			endIndex--;
		}
		return Flag;
	}
}
