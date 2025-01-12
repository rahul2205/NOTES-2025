//Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?


class GFG {
    public static void main (String[] args) {
       
        String str= "Geeks", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Question 2 : Write a java program to check if two Strings are anagram in java?
		
public class AnagramStringExample1  
{    
//function that checks if the strings are anagram or not      
static void isAnagram(String str1, String str2)   
{    
//removes white spaces from string 1  
String s1 = str1.replaceAll("\\s", "");    
//removes white spaces from string 2  
String s2 = str2.replaceAll("\\s", "");    
boolean status = true;    
//checks the length of both the strings are equal or not  
if (s1.length() != s2.length())   
{    
//if length of strings is not equal status returns false      
status = false;    
}   
//executes if lengths of strings are equal  
else   
{    
//first converts the string 1 in lower case and then converts the string into a character array      
//final string stores in arrayS1  
char[] arrayS1 = s1.toLowerCase().toCharArray();    
//first converts the string 2 in lower case and then converts the string into a character array      
//final string stores in arrayS2  
char[] arrayS2 = s2.toLowerCase().toCharArray();    
//sorts the character array arrayS1  
Arrays.sort(arrayS1);    
//sorts the character array arrayS2  
Arrays.sort(arrayS2);    
//compares the strings  
status = Arrays.equals(arrayS1, arrayS2);    
}    
if (status)   
{    
//prints if status returns true      
System.out.println(s1 + " and " + s2 + " are anagrams");    
}   
else   
{    
//prints if status returns false      
System.out.println(s1 + " and " + s2 + " are not anagrams");    
}    
}    
//driver code  
public static void main(String args[])   
{    
//calling function      
isAnagram("HEART", "EARTH");    
isAnagram("TRIANGLE", "INTEGRAL");    
isAnagram("TOSS", "SHOT");   
}    
}    

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Question 3 : Write a program to check if String has all unique characters in java?


class GFG {
	 
    static boolean unique(String s)
    {
        Arrays.sort(s.toCharArray());
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args)
    {
        if (unique("abcdd") == true) {
            System.out.println("String is Unique");
        }
        else {
            System.out.println("String is not Unique");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Question 4 : How to check if one String is rotation of another String in java?

public class Main{

    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String concatenatedString = s1 + s1;
        return concatenatedString.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "helloeducative";
        String s2 = "educativehello";
        boolean flag = check(s1, s2);
        if(flag) System.out.println(s1 + " and " + s2 + " are rotation of each other");
        else System.out.println(s1 + " and " + s2 + " are not rotation of each other");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Question 5 : How to find duplicate characters in String in java?


class GFG {
	 
    // Function to print all duplicate
    // characters in string using HashMap
    public static void
    countDuplicateCharacters(String str)
    {
 
        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map
            = new HashMap<Character, Integer>();
 
        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();
 
        // Checking each character
        // of charArray
        for (char c : charArray) {
 
            if (map.containsKey(c)) {
 
                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            }
            else {
 
                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }
 
        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
 
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                                   + " : "
                                   + entry.getValue());
            }
        }
    }
 
    // Driver Code
    public static void
    main(String args[])
    {
        // Given String str
        String str = "geeksforgeeks";
 
        // Function Call
        countDuplicateCharacters(str);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Question 6 Program to Check for Palindrome Numbers in Java

class GFG {
    // Iterative function to
    // reverse the digits of number
    static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }
 
    // Main function
    public static void main(String[] args)
    {
        int n = 123464321;
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);
 
        // Checking if n is same
        // as reverse of n
        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Question 7 Java Program to Check Palindrome String

class Main {
	  public static void main(String[] args) {

	    String str = "Radar", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 8 : Find first non repeated character in String in java?

SOLUTION 1 : (EFFICIENT)
	
public void firstNonRepeated(String str)
    {
       int MAX = 256;
       char count[] = new char[MAX];
       for(char c : str.toCharArray())
         {
            count[c]++;
         }
         boolean flag = false;
         for(char c : str.toCharArray())
         {
            if(count[c] == 1)
            {
                System.out.println(c);
                flag = true;
                break;
                
            }
         }
         if(flag == true)
         {
             System.out.println("all repeating");
         }
         
    }

SOLUTION 2 :

public class FirstNonRepeatedCharFirst {
    public static void main(String args[]) {
     
        String inputStr ="teeter";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 9 : Find all substrings of String in java?

class SubstringsOfStringMain
{
 public static void main(String args[])
 {
  String str="abbc";
  System.out.println("All substring of abbc are:");
   for (int i = 0; i < str.length(); i++) {
   for (int j = i+1; j <= str.length(); j++) {
         System.out.println(str.substring(i,j));
 
   }
  }
 }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 10 : Find length of String without using any inbuilt method in java?

public class StringLength {
   public static void main(String args[]) throws Exception {
      String str = "sampleString";
      int i = 0;
      for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println("Length of the given string ::"+i);
   }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 11 : Write a program to print all permutations of String in java?

// Java program to print all the permutations
// of the given string
public class GFG {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans)
	{

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) +
						str.substring(i + 1);

			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		String s = "abb";
		printPermutn(s, "");
	}
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 12 String Compression using count of repeated characters - Run Length Encoding

Objective: Write an algorithm to compress the given string by using the count of repeated characters and if new compressed string length is not smaller than the original string then return the original string.

Example:

Input String : ssssuuuummmmmmiiiittttttttttttt
Compressed String : s4u4m6i4t13

Input String : Jaain
Compressed String : Jaain (Since compressed string is length is greater than original string)


public String compression(String s1){
		
		StringBuffer sb = new StringBuffer();
		int count =1;
		char prev = s1.charAt(0);
		
		for(int i=1;i<s1.length();i++)
		{
			char curr =s1.charAt(i); 
			if(prev==curr)
			{
				count++;
			}	
			else
			{
				sb.append(prev);
				sb.append(count);
				prev = curr;
				count=1;
			}
		}
		sb.append(prev);
		sb.append(count);
		
		if(s1.length()<sb.length())
		{
		return s1;
			
		}
		else{
			return sb.toString();
				
		}
			
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


Question 13 How do I convert a String to an int in Java?

SOLUTION 1 : WITHOUT USISNG INBUILT METHODS
	
//ASCII VALUE OF 0 IS 48
	
public static void convert(String s) 
{ 
      
    // Initialize a variable 
    int num = 0; 
    int n = s.length(); 
  
    // Iterate till length of the string 
    for(int i = 0; i < n; i++) 
  
        // Subtract 48 from the current digit 
        num = num * 10 + ((int)s.charAt(i) - 48); 
  
    // Print the answer 
    System.out.print(num); 
} 


SOLUTION 2 : USISNG INBUILT METHODS

class Main {

    public static void main(String[] args) {
        String validString = "123";
        String invalidString = "123x";
        int number;

        try {
            number = Integer.parseInt(validString);
            System.out.println("Converted integer: " + number);

            number = Integer.parseInt(invalidString);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 14 Longest Common Subsequence in Java


	




							A R R A Y S
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


Question 1 Write java Program to Find Smallest and Largest Element in an Array.

public class FindLargestSmallestNumberMain {

 public static void main(String[] args) {

 //array of 10 numbers
 int arr[] = new int[]{12,56,76,89,100,343,21,234};

 //assign first element of an array to largest and smallest
 int smallest = arr[0];
 int largest = arr[0];

 for(int i=1; i< arr.length; i++)
 {
    if(arr[i] > largest)
        largest = arr[i];
    else if (arr[i] < smallest)
         smallest = arr[i];

 }
 System.out.println("Smallest Number is : " + smallest);
 System.out.println("Largest Number is : " + largest); 
 }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 2  Find missing number in the array.
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element

SOLUTION 1 : (Using summation of first N natural numbers)

class Solution {
     public static int getMissingNo(int[] nums, int n)
    {
        //sum of first n natural numbers
	// ex : ((4+1) * (4+2)) / 2  = (5 * 6 ) / 2 = 15
	int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;
        System.out.println(getMissingNo(arr, N));
    }
}

SOLUTION 2 : (Using Sorting)

Eg 2,3,1,5 sort the array to 1,2,3,5 then index of array element will be equal to array value — 1 at that particular index 
so the index where this condition fails is the answer……answer can be found by returning i+1.

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int res = 0;
        
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            if(array[i] != i+1){
                res = i+1;
                break;
            }
        }
        
        if(res == 0){
            res = n;
        }
        
        return res;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 3  Search an element in rotated and sorted array.
Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.

Note: Find the element in O(logN) time and assume that all the elements are distinct.

SOLUTION 1 : (Using Finding Pivot where rotation has happened)

Explanation : 

The idea is to find the pivot point, divide the array into two sub-arrays and perform a binary search.

The main idea for finding a pivot is – 

1. For a sorted (in increasing order) and rotated array, the pivot element is the only element for which the next element to it is smaller than it.
2. Using binary search based on the above idea, pivot can be found.
3. It can be observed that for a search space of indices in range [l, r] where the middle index is mid, 
	a. If rotation has happened in the left half, then obviously the element at l will be greater than the one at mid.
	b. Otherwise the left half will be sorted but the element at mid will be greater than the one at r.
4. After the pivot is found divide the array into two sub-arrays.
5. Now the individual sub-arrays are sorted so the element can be searched using Binary Search.








////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 4  Find second largest number in an array

SOLUTION 1 : USING SORTING (EASY)
Time Complexity: O(nlogn), where n is the size of input array.
Auxiliary space: O(1), as no extra space is required.

// Java program to find second largest
// element in an array
import java.util.*;
class GFG {

	// Function to print the
	// second largest elements
	static void print2largest(Integer arr[], int arr_size)
	{
		// Sort the array in descending order
		Arrays.sort(arr, Collections.reverseOrder());
		// Start from second element as first
		// element is the largest
		//this is done because suppose sorted array comes as [9,9,9,8,8,7,1]
		//then 8 at i = 3, is the second largest element not the number at index i = 1.
		//if the sorted array is like [9,9,9,9,9] then the code will print "There is no second largest element".
		for (int i = 1; i < arr_size; i++) {
			// If the element is not
			// equal to largest element
			if (arr[i] != arr[0]) {
				System.out.printf("The second largest "
									+ "element is %d\n",
								arr[i]);
				return;
			}
		}

		System.out.printf("There is no second "
						+ "largest element\n");
	}

	// Driver code
	public static void main(String[] args)
	{
		Integer arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		print2largest(arr, n);
	}
}

SOLUTION 2 : Find Second Largest element by traversing the array twice (Two Pass) (EASY)

The approach is to traverse the array twice. In the first traversal, find the maximum element. In the second traversal, 
find the greatest element excluding the previous greatest.

Time Complexity: O(n), where n is the size of input array.
Auxiliary space: O(1), as no extra space is required.

// Java program to find second largest
// element in an array
import java.io.*;

class GFG{

// Function to print the second largest elements 
static void print2largest(int arr[], int arr_size)
{
	int i, first, second;

	// There should be atleast two elements
	if (arr_size < 2)
	{
		System.out.printf(" Invalid Input ");
		return;
	}

	int largest = second = Integer.MIN_VALUE;

	// Find the largest element
	for(i = 0; i < arr_size; i++)
	{
		largest = Math.max(largest, arr[i]);
	}

	// Find the second largest element
	for(i = 0; i < arr_size; i++)
	{
		if (arr[i] != largest)
			second = Math.max(second, arr[i]);
	}
	if (second == Integer.MIN_VALUE)
		System.out.printf("There is no second " +
						"largest element\n");
	else
		System.out.printf("The second largest " +
						"element is %d\n", second);
}

// Driver code
public static void main(String[] args)
{
	int arr[] = { 12, 35, 1, 10, 34, 1 };
	int n = arr.length;
	
	print2largest(arr, n);
}
}

SOLUTION 3 : Find Second Largest element by traversing the array once (One Pass)

The idea is to keep track of the largest and second largest element while traversing the array. 
If an element is greater than the largest element, we update the largest as well as the second largest. 
Else if an element is smaller than largest but greater than second largest, then we update the second largest only.

* Initialize the first as 0(i.e, index of arr[0] element
* Start traversing the array from array[1],
* If the current element in array say arr[i] is greater than first. Then update first and second as, second = first and first = arr[i]
* If the current element is in between first and second, then update second to store the value of current variable as second = arr[i]
* Return the value stored in second.

Time Complexity: O(n), where n is the size of input array.
Auxiliary space: O(1), as no extra space is required.

// JAVA Code for Find Second largest
// element in an array
import java.io.*;

class GFG {

	/* Function to print the second largest
	elements */
	public static void print2largest(int arr[], int arr_size)
	{
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/* If current element is greater than 
			first then update both first and second */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/* If arr[i] is in between first and 
			second then update second */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest"
							+ " element\n");
		else
			System.out.print("The second largest element"
							+ " is " + second);
	}

	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		print2largest(arr, n);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
Question 5  Find the number occurring odd number of times in an array.

Given an array of positive integers. All numbers occur an even number of times except one number which occurs an odd number of times. 
Find the number in O(n) time & constant space.

Input : arr = {1, 2, 3, 2, 3, 1, 3}
Output : 3

Input : arr = {5, 7, 2, 7, 5, 2, 5}
Output : 5

SOLUTION 1 : Brute Force

Time Complexity: O(n^2)
Auxiliary Space: O(1)

//Here note that the element that is odd is just one.

class OddOccurrence {
	
	// function to find the element occurring odd
	// number of times
	static int getOddOccurrence(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 != 0)
				return arr[i];
		}
		return -1;
	}
	
	// driver code 
	public static void main(String[] args)
	{
		int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;
		System.out.println(getOddOccurrence(arr, n));
	}
}


SOLUTION 2 : using Hashing

Time Complexity: O(n)
Auxiliary Space: O(n)


import java.io.*;
import java.util.HashMap;

class OddOccurrence 
{
	// function to find the element occurring odd
	// number of times
	static int getOddOccurrence(int arr[], int n)
	{
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
		// Putting all elements into the HashMap
		for(int i = 0; i < n; i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				int val = hmap.get(arr[i]);
						
				// If array element is already present then
				// increase the count of that element.
				hmap.put(arr[i], val + 1); 
			}
			else
				
				// if array element is not present then put
				// element into the HashMap and initialize 
				// the count to one.
				hmap.put(arr[i], 1); 
		}

		// Checking for odd occurrence of each element present
		// in the HashMap 
		for(Integer a:hmap.keySet())
		{
			if(hmap.get(a) % 2 != 0)
				return a;
		}
		return -1;
	}
		
	// driver code 
	public static void main(String[] args) 
	{
		int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int n = arr.length;
		System.out.println(getOddOccurrence(arr, n));
	}
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
Question 6  Find minimum number of platforms required for railway station

SOLUTION 1 : using Sorting

The idea is to consider all events in sorted order. Once the events are in sorted order, 
trace the number of trains at any time keeping track of trains that have arrived,but not departed.

arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

All events are sorted by time.

Total platforms at any time can be obtained by subtracting total departures from total arrivals by that time.

 Time      Event Type     Total Platforms Needed at this Time
 9:00       Arrival                      1
 9:10       Departure                	 0
 9:40       Arrival                      1
 9:50       Arrival                      2
 11:00      Arrival                      3 
 11:20      Departure               	 2
 11:30      Departure               	 1
 12:00      Departure               	 0
 15:00      Arrival                      1
 18:00      Arrival                      2 
 19:00      Departure              	 1
 20:00      Departure               	 0

Minimum Platforms needed on railway station = Maximum platforms needed at any time = 3

Note: 
This doesn’t create a single sorted list of all events, rather it individually sorts arr[] and dep[] arrays,
and then uses the merge process of merge sort to process them together as a single sorted array. 

Follow the steps mentioned below:

* Sort the arrival and departure times of trains.
* Create two pointers i=1, and j=0, and a variable to store ans and current count plat
* Run a loop while i<n and j<n and compare the ith element of arrival array and jth element of departure array.
* If the arrival time is less than or equal to departure then one more platform is needed so increase the count, i.e., plat++ and increment i
* Else if the arrival time is greater than departure then one less platform is needed to decrease the count, i.e., plat– and increment j
* Update the ans, i.e. ans = max(ans, plat).


import java.util.*;

class GFG {

	// Returns minimum number of platforms required
	static int findPlatform(int arr[], int dep[], int n)
	{
		// Sort arrival and departure arrays
		Arrays.sort(arr);
		Arrays.sort(dep);

		// plat_needed indicates number of platforms
		// needed at a time
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		// Similar to merge in merge sort to process
		// all events in sorted order
		while (i < n && j < n) {
			// If next event in sorted order is arrival,
			// increment count of platforms needed
			if (arr[i] <= dep[j]) {
				plat_needed++;
				i++;
			}

			// Else decrement count of platforms needed
			else if (arr[i] > dep[j]) {
				plat_needed--;
				j++;
			}

			// Update result if needed
			if (plat_needed > result)
				result = plat_needed;
		}

		return result;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = arr.length;
		System.out.println(
			"Minimum Number of Platforms Required = "
			+ findPlatform(arr, dep, n));
	}
}


Time Complexity: O(N * log N), One traversal O(n) of both the array is needed after sorting O(N * log N).
Auxiliary space: O(1), As no extra space is required.

SOLUTION 2 : using 





////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
Question 7  Find a Pair Whose Sum is Closest to zero in Array.

array[]={1,3,-5,7,8,20,-40,6};
The pair whose sum is closest to zero :  -5 and 6

SOLUTION 1 : using two loops


public static void findPairWithMinSumBruteForce(int arr[])
{
    if(arr.length<2)
        return;
    // Suppose 1st two element has minimum sum
    int minimumSum=arr[0]+arr[1];
    int pair1stIndex=0;
    int pair2ndIndex=1;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            int tempSum=arr[i]+arr[j];
            if(Math.abs(tempSum) < Math.abs(minimumSum))
            {
                pair1stIndex=i;
                pair2ndIndex=j;
                minimumSum=tempSum;
            }
        }
    }
    System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
}


SOLUTION 2 : using two pointers

* Sort the array.
* We will maintain two indexes one at beginning (l=0) and one at end (r=n-1)
* iterate until l <  r
* Calculate sum of arr[l] + arr[r]
* if abs (sum) < abs (minSum), then update the minimum sum and pair.
* If sum is less than 0, this means if we want to find sum close to 0, do r–
* If sum is greater than 0,this means if we want to find sum close to 0 , do l++


public static void findPairWithMinSum(int arr[]) {

        // Sort the array, you can use any sorting algorithm to sort it
        Arrays.sort(arr);
        int sum=0; 
        int minimumSum = Integer.MAX_VALUE;
        int n=arr.length;
        if(n<0)
            return;
        // left and right index variables
        int l = 0, r = n-1;

        // variables to keep track of the left and right index pair for minimumSum
        int minLeft = l, minRight = n-1;

        while(l < r)
        {
            sum = arr[l] + arr[r];

            /*If abs(sum) is less than min sum, we need to update sum and pair */
            if(Math.abs(sum) < Math.abs(minimumSum))
            {
                minimumSum = sum;
                minLeft = l;
                minRight = r;
            }
            if(sum < 0)
                l++;
            else
                r--;
        }

        System.out.println(" The pair whose sum is minimun : "+arr[minLeft]+" "+ arr[minRight]);
    }

Time complexity : O(NLogN)


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
Question 8  Given a sorted array and a number x, find the pair in array whose sum is closest to x

array[]={-40,-5,1,3,6,7,8,20};
The pair whose sum is closest to 5 :  1 and 3

Similar as above. Directly giving effecient approach.


public static void findPairWithClosestToX(int arr[],int X) {

    int minimumDiff = Integer.MAX_VALUE;
    int n=arr.length;
    if(n<0)
        return;
    // left and right index variables
    int l = 0, r = n-1;

    // variable to keep track of the left and right pair for minimumSum
    int minLeft = l, minRight = n-1;

    while(l < r)
    {

        int currentDiff= Math.abs(arr[l] + arr[r]-X);
        /*If abs(diff) is less than min dif, we need to update sum and pair */
        if(currentDiff < minimumDiff)
        {
            minimumDiff = currentDiff;
            minLeft = l;
            minRight = r;
        }
        if(arr[l] + arr[r] < X)  
            l++;
        else
            r--;
    }

    System.out.println(" The pair whose sum is closest to X : "+arr[minLeft]+" "+ arr[minRight]);
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
Question 9  Count pairs with given sum

Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.

Examples:  

Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input: arr[] = {1, 5, 7, -1, 5}, K = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).

SOLUTION 1 : Naïve Approach: 

A simple solution is to user nested loops, 
one for traversal of each element and other for checking if there’s another number in the array which can be added to it to give K.

Follow the steps below for implementation:

* Initialize the count variable with 0 which stores the result.
* Use two nested loop and check if arr[i] + arr[j] == K, then increment the count variable.
* Return the count.

public class find {
	public static void main(String args[])
	{
		int[] arr = { 1, 5, 7, -1, 5 };
		int K = 6;
	// Function Call
		getPairsCount(arr, K);
	}

	// Prints number of pairs in arr[0..n-1] with sum equal
	// to 'sum'
	public static void getPairsCount(int[] arr, int K)
	{
		// Initialize result
		int count = 0; 

		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == K)
					count++;

		System.out.printf("Count of pairs is %d", count);
	}
}

Time Complexity: O(n2), traversing the array for each element
Auxiliary Space: O(1)










	








	
	
