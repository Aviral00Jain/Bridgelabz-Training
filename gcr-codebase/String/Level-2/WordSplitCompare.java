import java.util.*;

public class WordSplitCompare{

   // method for string length;
    public static int stringLength(String str){
       int count=0;
	   try{
	       while(true){
		   str.charAt(count);
		   count++;
		   }
		}   
		catch(Exception e){
		   return count;
		}   
	}	
	
	public static int countingWords(String str){
	
	    int count=1;
		
	    for(int i=0;i<stringLength(str);i++){
		    if(str.charAt(i)==' '){
			   count++;
			}
	    }
	    return count;
	}

    // method to split string
    public static String [] splitString(String str){
	    
		String arr[] = new String[countingWords(str)];
        String str1 ="";
		int index =0;
		for(int i=0;i<stringLength(str);i++){
		    if(str.charAt(i)!=' '){
			  str1+=str.charAt(i);
			}	
            else{
		      arr[index]=str1;
              str1 ="";
			  index++;
            }			
        }   
		arr[index] = str1;
        return arr;
	}	
		
	public static boolean compareMethod(String arr[], String arr1[]){
        
		for(int i=0;i<arr1.length;i++){
		    if(!arr1[i].equals(arr[i])){
			   return false;
			}
      	}
        return true;
    }		
	
	
    public static void main(String[] args){
       
	   // creating scanner object
	   Scanner input = new Scanner(System.in);
	   
	   //Taking input from user
	   System.out.println("Enter string");
	   String stringUser= input.nextLine();
	   
	   String arrayBuiltIn[] = stringUser.split("\\s+");
	   System.out.println(Arrays.toString(arrayBuiltIn));
	   String arrayUserDef[] = splitString(stringUser);
	   System.out.println(Arrays.toString(arrayUserDef));
	   
	   // comapring result
	   System.out.println(compareMethod(arrayBuiltIn ,arrayUserDef));
	   
	}
}	