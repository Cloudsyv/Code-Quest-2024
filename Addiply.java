import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                int Num1 = Integer.parseInt(Information[0]);
                int Num2 = Integer.parseInt(Information[1]);
                
                System.out.println((Num1+Num2)+" "+(Num1*Num2));
            }
        }
    }
}
