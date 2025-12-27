import java.util.Scanner;

class FrequencyNestedLoop {

    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (inti=0;i<chars.length;i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count * 2];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = String.valueOf(chars[i]);
                result[index++] = String.valueOf(freq[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		// taking user input
        System.out.print("Enter text ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("Char\tCount");
        for (int i=0;i<result.length; i += 2) {
            System.out.println(result[i] + "\t" + result[i + 1]);
        }
    }
}
