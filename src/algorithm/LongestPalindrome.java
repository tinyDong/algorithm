package algorithm;
//最长回文串
public class LongestPalindrome {
	public static void main(String[] args) {
		String str = "abcddcc";
		String result = getPalindrome(str);
		System.out.println(result);
	}

	private static String getPalindrome(String str) {
		String result="";
		String s1="";
		for (int i = 0 ;i<str.length()-1;i++){
			s1=getSymmetry(str.toCharArray(),i,i);
			if (s1.length()>result.length()){
				result=s1;
			}
			s1=getSymmetry(str.toCharArray(),i,i+1);
			if (s1.length()>result.length()){
				result=s1;
			}

		}
		return result;
	}

	private static String getSymmetry(char[] chars, int i, int j) {
		while (i>=0&&j<chars.length-1&&chars[i]==chars[j]){
			i--;
			j++;
		}
		return String.valueOf(chars).substring(i+1,j);
	}

}
