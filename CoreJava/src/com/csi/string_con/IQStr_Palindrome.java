package com.csi.string_con;

//palindrome using StringBuilder
class Palindrome {
	public static String pali(String str) {

		StringBuilder bs = new StringBuilder(str);
		String str4 = str;
		String str3 = bs.reverse().toString();
		// String str2=bs.toString();
		if (str3.equals(str4)) {
			return "String is Palindrome";
		}

		else {
			return "String is not palindrome";
		}
	}
}

// using string logic
class String_palindrome {
	public static String pali1(String s1) {
		String s2 = s1;
		int i1 = s1.length();
		int i;
		char s3[] = s1.toCharArray();
		String rev = "";
		for (i = i1 - 1; i >= 0; i--) {
			rev = rev + s3[i];
		}
return "string";
	}
}
	public class IQStr_Palindrome {
		public void main(String[] args) {
			System.out.println(Palindrome.pali("madam Madam"));
		}
	}
