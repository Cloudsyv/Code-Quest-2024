import java.util.Scanner;

class CodeQuest {
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                int Num = input.nextInt();
                long Result = factorial(Num);
                System.out.println(factorial(Num));
            }
        }
    }
}
