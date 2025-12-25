import java.util.Scanner;
public class VowelConsonants{
	public static int vowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' 
				|| s.charAt(i)=='o' || s.charAt(i)=='u'){
				count++;
			}	
		}
		return count;
	}
	public static int consonants(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!='a' || s.charAt(i)!='e' || s.charAt(i)!='i' 
				|| s.charAt(i)!='o' || s.charAt(i)!='u'){
				count++;
			}	
		}
		return count;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		System.out.println(vowels(s));
		System.out.println(consonants(s));
		
		
	}
}