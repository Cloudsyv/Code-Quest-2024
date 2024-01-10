import java.util.*;

public class Pa$$w0rd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                char[] Information = input.nextLine().toCharArray(); //OR String Information[] = input.nextLine().split("");
                boolean CapsCheck = false, LowerCaseCheck = false, NonAlphaCheck = false, NumbersCheck = false;
                int TotalChecks = 0;

                for (int i = 0; i < Information.length/*Information.length*/; i++){
                    // Check length and Check for repeating for 3+ in a row
                    if (Information.length < 8 || (i >= 2 && Information[i] == Information[i-1] && Information[i-1] == Information[i-2])){
                        System.out.println("INVALID");
                        break;
                    }

                    // Checks
                    if (!CapsCheck && Character.isUpperCase(Information[i])){
                        CapsCheck = true;
                        TotalChecks++;
                    } else if (!LowerCaseCheck && Character.isLowerCase(Information[i])){
                        LowerCaseCheck = true;
                        TotalChecks++;
                    } else if (!NonAlphaCheck && !Character.isLetterOrDigit(Information[i])){
                        NonAlphaCheck = true;
                        TotalChecks++;
                    } else if (!NumbersCheck && Character.isDigit(Information[i])){
                        NumbersCheck = true;
                        TotalChecks++;
                    }

                    // Final evaluation
                    if (Information.length-1 == i && (TotalChecks >= 3)){
                        System.out.println("VALID");
                        break;
                    } else if (Information.length-1 == i){
                        System.out.println("INVALID");
                    }
                }
            }
        }
    }
}
