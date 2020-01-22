/**
 * Created By:Ankit Rajput
 * Title:User Input and Replace String Template “Hello <<UserName>>, How are you?” 
 *			I/P -> Take User Name as Input. Ensure UserName has min 3 char
 *			O/P -> Print the String with User Name 
 * Date:16/01/2020 
 */
package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;
public class ReplaceString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter User Name");
		String s1=Utility.inputString();	//user input string
		String s2="Hello <<UserName>>,How are you?";//original String
		String s3="<<UserName>>";		//second string which is replace with//regex
		
		if(s1.length()>=3){
			String replaceString=s2.replace(s3, s1);
			System.out.println(replaceString);
		}
		else{
			System.out.println("Please Enter Valid User Name");
		}
	}
}