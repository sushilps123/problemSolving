Yor are given an array A of N integers. Each integer is a single digit number in the range[0 9]. You are given a number K. Now, you need to count how many subsequences of the array A ecist such that they form a K digit valid number

A subsequence of size K is called a valid digit number if therea are no leading zeros in the number formed.

# Notes

1) A Subsequence of an array is not necessarily contigous

2) Suppose the given array is 0 1 0 2 then if you choose subsequence to be 002,then it is not valid 3 digit number.Also,it will not be considered as a single digit number. A valid 3 digit number in tarray is 102. Please go through same I/O For better understanding.

# Input Format

The first line contains an Integer N as input denoting the size of the array. Next Line contains N space separated integers that denotes elements of the array. Next line contains an integer K

# Output Format

In the output, you need to print the count of valid K digit numbers


#Sample Input
N = 4
arr = {0,1,0,2}
output 0

N = 5 
arr = {1,1,0,1,0}

#Sample Output 
9

#Explaination

In the given sample following are the posssible subsequences that form a valid 3 digit number

[1,2,3] = 110

[1,2,4] = 111

[1,2,5] = 110

[1,3,4] = 101

[1,3,5] = 100

[1,4,5] = 110

[2,3,4] = 101

[2,3,5] = 100

[2,4,5] = 110























