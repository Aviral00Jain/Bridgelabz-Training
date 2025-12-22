import java.util.Scanner;

class WordLengthTable {
	
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
	
	
    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) word.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] buildWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
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
	
	
    public static void main(String[] args) {
	    
		// creating scanner object
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = splitString(text);
        String[][] result = buildWordLengthTable(words);

        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}