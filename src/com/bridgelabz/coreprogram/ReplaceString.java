package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;
public class ReplaceString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter User Name");
		
		String s1=Utility.inputString();
		String s2="Hello <<UserName>>,How are you?";
		String s3="<<UserName>>";
		if(s1.length()>=3){
			String replaceString=s2.replace(s3, s1);
			System.out.println(replaceString);
		}
		else
		{
			System.out.println("Please Enter Valid User Name");
		}

	}
}
