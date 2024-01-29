import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                int Speed = Integer.parseInt(Information[0]);
                if (Information[1].equals("true")){
                    Speed-=5;
                }
                if (Speed <= 60){
                    System.out.println("no ticket");
                } else if (Speed <= 80){
                    System.out.println("small ticket");
                } else {
                    System.out.println("big ticket");
                }
            }
        }
    }
}
