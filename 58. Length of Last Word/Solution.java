/*
Runtime: 0 ms
58. Length of Last Word
*/
class Solution {
   public int lengthOfLastWord(String s) 
   {
    String[] sOne=s.split(" ");
    return sOne[sOne.length-1].length();
    }
}