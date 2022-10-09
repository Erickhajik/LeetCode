/*
Runtime: 30ms
9. Palindrome Number

*/
class Solution {
public static bool isPalindrome(int x) {
    int check=0;
    string name=to_string(x);
    string e=name;
    int m=name.length()-1;
    if(m != 0)
    { 
    for(int i=0;i<name.length();i++)
    {
      e[m] =name[i];
      m--;
    }
    }
    for(int i=0;i<name.length();i++)
    {
    if(name[i]==e[i])
    {
       check++;
    }
    }
    if(check==name.length())
    {
        return true;
    }
        return false;
    }
}