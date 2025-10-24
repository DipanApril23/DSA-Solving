// Longest Substring Without Repeating Characters

import java.util.HashMap;

class Problem4{
	public int lengthOfLongestSubstring(String s){
		int n = s.length();
		int i = 0, j = 0, maxLen = 0;
		
		if(n<=1) return n;
		
		HashMap <Character, Integer> map = new HashMap<>();
		
		while(j<n){
			char ch = s.charAt(j);
			if(map.containsKey(ch) && map.get(ch)>=i){
				int len = j - i;
				maxLen = Math.max(maxLen , len);
				
				while(s.charAt(i) != ch) i++;
				i++;
			}
			
			map.put(ch , j);
			j++;
		}
		
		int len = j-i;
		maxLen = Math.max(maxLen , len);
		return maxLen;
		
	}
	
	public static void main(String[] args){
		Problem4 sol = new Problem4();
		String str = "pwwkew";
		int result = sol.lengthOfLongestSubstring(str);
		System.out.println("Length Of Longest Substring: "+result);
	}
}