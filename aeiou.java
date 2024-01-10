import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information = input.nextLine();
                
                int Count = 0;
                for (int i = 0; i < Information.length(); i++){
                    String Letter = Information.substring(i,i+1).toLowerCase();
                    if (Letter.equals("a") || Letter.equals("e") || Letter.equals("i") || Letter.equals("i") || Letter.equals("o") || Letter.equals("u")){
                        Count++;
                    }
                }
                System.out.println(Count);
            }
        }
    }
}
