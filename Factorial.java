import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                int Num = input.nextInt();
                int FactorialNum = 1;
                for (int i = 1; i <= Num; i++){
                    FactorialNum *= i;
                }
                System.out.println(FactorialNum);
            }
        }
    }
}
