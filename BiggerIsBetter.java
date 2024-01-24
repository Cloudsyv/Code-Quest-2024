import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                int HighestNum = Integer.parseInt(Information[0]);
                for (int i = 1; i < Information.length; i++){
                    if (Integer.parseInt(Information[i]) > HighestNum){
                        HighestNum = Integer.parseInt(Information[i]);
                    }
                }
                System.out.println(HighestNum);
            }
        }
    }
}
