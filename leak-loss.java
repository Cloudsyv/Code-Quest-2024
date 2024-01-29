import java.util.*;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                
                System.out.println(Math.round((double) Integer.parseInt(Information[0])/(Integer.parseInt(Information[1])-Integer.parseInt(Information[2]))*Integer.parseInt(Information[2])));
            }
        }
    }
}
