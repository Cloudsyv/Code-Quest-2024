import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                for (int i = 0; i < Information.length; i++){
                    if (Information[i].equals("Nimo")){
                        System.out.println(i+1);
                    }
                }
            }
        }
    }
}
