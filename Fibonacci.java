import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
               int GoalNum = input.nextInt();
               
               long LastPrior[] = {0, 1};
               long Result = 0;
               for (int i = 0; i < GoalNum-2; i++){
                   Result = LastPrior[0]+LastPrior[1];
                   LastPrior[0] = LastPrior[1];
                   LastPrior[1] = Result;
               } 
               System.out.println(GoalNum+" = "+Result);
            }
        }
    }
}
