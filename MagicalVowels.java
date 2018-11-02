package sps.practice.java;

public class MagicalVowels {
	static int table [][];
	public static void main(String args[]) {

		String s1 = "aeiaaioooaauuaeiou";
		String vowels = "aeiou";
		int length = s1.length();
		char [] stringArray = new char[length];
		char [] vowelsArray = new char[5];
		for(int i=0;i<length;i++) {
			stringArray[i] = s1.charAt(i);
		}
		for(int i=0;i<vowels.length();i++) {
			vowelsArray[i] = vowels.charAt(i);
		}
		table  = new int[length][vowelsArray.length];
		int maxCount = findmax(stringArray,vowelsArray,length-1,4,0);
		if(maxCount > 0) {
			System.out.println(maxCount);
		}
		else
			System.out.println(0);
		
	}

	public static int findmax(char [] stringArray ,char [] vowelsArray, int LastIndex , int vowelIndex , int is_complete) {
		
		int Leftsum = -9999;
		int Rightsum = -9999;	
		
		
		if(LastIndex==0 && stringArray[LastIndex]=='a' && vowelIndex==0) {
			return 1;
		}
		else if(LastIndex==0 && stringArray[LastIndex]!='a' && vowelIndex==0 && is_complete!=1)
			return -9999;
		
		if(table[LastIndex][vowelIndex]!=0)
			return table[LastIndex][vowelIndex];
		
		for(int i=LastIndex;i>=vowelIndex;i--) {
			if(stringArray[i] == vowelsArray[vowelIndex]) {
				if(vowelsArray[vowelIndex]=='a')
					is_complete=1;
				
				if(stringArray[i]=='a' && i==0) {
					table[i][vowelIndex] = 1;
					return table[i][vowelIndex];
				}
					
				
				if(is_complete!=1)
				Leftsum = 1+findmax(stringArray,vowelsArray,i-1,vowelIndex-1,is_complete);
				Rightsum = 1+findmax(stringArray,vowelsArray,i-1,vowelIndex,is_complete);
				table[i][vowelIndex] = Math.max(Leftsum,Rightsum);
				break;
			}
		}
		
		return Math.max(Leftsum,Rightsum);
	}

}
