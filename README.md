
# Dynamic Programming | Building Bridges

Consider a 2-D map with a horizontal river passing through its center. 
There are n cities on the southern bank with x-coordinates a(1) … a(n) and n cities on the northern bank with x-coordinates b(1) … b(n).
You want to connect as many north-south pairs of cities as possible with bridges such that no two bridges cross.
When connecting cities, you can only connect city a(i) on the northern bank to city b(i) on the southern bank.
Maximum number of bridges that can be built to connect north-south pairs with the aforementioned constraints.

Input : 6 4 2 1
        2 3 6 5
Output : Maximum number of bridges = 2

# MagicVowels
Consider a string s, consisting of one or more of the following letters: a, e, i, o, and u.

We define a magical subsequence of s to be a sequence of letters derived from s that contains all five vowels in order. This means a magical subsequence will have one or more a's followed by one or more e's followed by one or more i's followed by one or more o's followed by one or more u's. For example, if s = "aeeiooua", then "aeiou" and "aeeioou" are magical subsequences but "aeio" and "aeeioua" are not.

Write a function to find length of longest magical subsequence with parameter string s.

Input Format String s composed of English vowels (i.e., a, e, i, o, and u).

Output Format Count denoting the length of the longest magical subsequence in s.

Sample Input 1 aeiaaioooaauuaeiou

Sample Output 1 : 10

Explanation 1 In the table below, the component characters of the longest magical subsequence are bold:

aeiaaioooaauuaeiou

Sample Input 2 aeiaaioooaa

Sample Output 2 : 0

Explanation 2 String s does not contain the letter u, so it is not possible to construct a magical subsequence




