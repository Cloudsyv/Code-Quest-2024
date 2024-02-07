import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Info = input.nextLine();
                double Total = Double.parseDouble(Info.substring(1, Info.length()))*100;
                int Q = 0;
                int D = 0;
                int N = 0;
                int P = 0;
                
                while (Total >= 1){
                    if (Total >= 25){
                        Q++;
                        Total-=25;
                    } else if (Total >= 10){
                        D++;
                        Total-=10;
                    } else if (Total >= 5){
                        N++;
                        Total-=5;
                    } else if (Total >= 1){
                        P++;
                        Total-=1;
                    }
                }
                System.out.println("Quarters="+Q);
                System.out.println("Dimes="+D);
                System.out.println("Nickels="+N);
                System.out.println("Pennies="+P);
            }
        }
    }
}
