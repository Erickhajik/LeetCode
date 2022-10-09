/*
Runtime: 0 ms
28. Find the Index of the First Occurrence in a String
*/
class Solution 
{
    public static int strStr(String haystack, String needle) 
    {
   	if(haystack.contains(needle))
   	{
       return haystack.indexOf(needle);  
   	}
   	return -1;
	}
}