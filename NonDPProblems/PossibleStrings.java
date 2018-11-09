package sps.practice.NonDPProblems;

/*
 * Print all possible strings of length k that can be formed from a set of n characters
 * Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.
 * Input: set[] = {'a', 'b'}, k = 3
 * Output:
 * 	aaa
	aab
	aba
	abb
	baa
	bab
	bba
	bbb
 */


public class PossibleStrings {
	
	
	public static void main(String args[]) {
		char set[] = {'a','b'};
		int k=4;
		possiblepermutations(set,k,"");
	}
	
	public static void possiblepermutations(char set[],int k,String str) {
		
		if(str.length()==k) {
			System.out.println(str);
			return;
		}
		
		for(int i=0;i<set.length;i++) {
			possiblepermutations(set,k,str+set[i]);
		}
		
		
	}
}
