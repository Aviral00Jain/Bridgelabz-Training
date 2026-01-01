import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        // Creating scanner class object
        Scanner sc = new Scanner(System.in);

        // String array
        String question[] = {"A. Which  player has more centuries in one-day International?"+
                             " \n1. Rickky Ponting \n2. Sachin Tendulkar \n3. Virat Kohli" +
                              "\n4. Rohit Sharma" ,"B. Who is the most successful test captain the world  ?" +
                             "\n1. Virat KOhli \n2. Rickky Ponting \n3.Grame Smith \n4. Alestair cook", "C. Which team has won the world cup on the basis of 'boundary count in finals' " +
                             "\n1. Australia \n2. England \n3. India \n4. New Zealand ", "D. Which of the following Cricket is known as 'Universe Boss' ?" +
                             "\n1. Ab Devilliers \n2. Chris Gayle \n3. Keiron Pollard \n4. Shahid Afridi" ,"E. who wil be the defending champion in IPl 2026" +
                             "\n1. MI \n2. PBKS \n3.GT \n4. RCB"};

        // Answer array
        int arr[] = {3, 3, 2, 2, 4};
        // Score
        int score =0;
        for(int i=0;i<5;i++){
            System.out.println(question[i]);

            // Taking user input
            System.out.println("Enter choice : ");
            int ans = sc.nextInt();

            switch (ans){
                case 1 ->{
                    if(arr[i]==1){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }
                case 2 ->{
                    if(arr[i]==2){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }
                case 3 ->{
                    if(arr[i]==3){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }
                case 4 ->{
                    if(arr[i]==4){
                        System.out.println("Right answer");
                        score++;
                    }
                    else System.out.println("Wrong answer");
                }

            }

        }
        System.out.println("Scored marks : "+score);
    }
}