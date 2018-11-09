package sps.practice.NonDPProblems;

/*
 * 	Print all permutations in sorted (lexicographic) order
 * Given a string, print all permutations of it in sorted order. 
 * For example, if the input string is “ABC”, then output should be “ABC, ACB, BAC, BCA, CAB, CBA”.
 */

public class PossibleStringslexicographic {
	
	public static void main(String args[]) {
		String Str = "ABCDEF";
		int len = Str.length();
		
		/*
		 *  Taking one character Str.charAt(i) and sending remaining substring Str.substring in printPossiblelexicographic
		 */
		
		for(int i=0;i<len;i++)
			if(i==0)
				printPossiblelexicographic(Str.substring(1),""+Str.charAt(i),len);
			else {
				if(i!=len-1)
					printPossiblelexicographic(Str.substring(0,i)+Str.substring(i+1),""+Str.charAt(i),len);
				else
					printPossiblelexicographic(Str.substring(0,i),""+Str.charAt(i),len);
					
			}
	}
	public static void printPossiblelexicographic(String Str,String str,int len) {
		
		/*
		 * when length of str becomes equal to len print str
		 */
		
		if(str.length()==len) {
			System.out.println(str);
			return;
		}
			
		for(int i=0;i<Str.length();i++)
			if(i==0)
				printPossiblelexicographic(Str.substring(1),str+Str.charAt(i),len);
			else {
				if(i!=Str.length()-1)
					printPossiblelexicographic(Str.substring(0,i)+Str.substring(i+1),str+Str.charAt(i),len);
				else
					printPossiblelexicographic(Str.substring(0,i),str+Str.charAt(i),len);
					
			}
		
		
	}
}
