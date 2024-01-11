//Time completed: 7m
//Difficulty: Easy

import java.util.*;

public class GoForTwo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                int Team1 = Integer.parseInt(Information[0]), Team2 = Integer.parseInt(Information[1]);

                int Difference = Team1-Team2;
                if (Difference == -15 || Difference == -13 || Difference == -11 || Difference == -10 || Difference == -8 || Difference == -5 || Difference == -4 || Difference == -2 || Difference == 1 || Difference == 5 || Difference == 12){
                    System.out.println("2");
                } else {
                    System.out.println("1");
                }
            }
        }
    }
}
