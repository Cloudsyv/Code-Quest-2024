import java.util.*;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                
                for (int i = 0; i < Information.length; i++){
                    if (Integer.parseInt(Information[i])%2 == 0){
                        Information[i] = ""+(Integer.parseInt(Information[i])+2); 
                    } else {
                        Information[i] = ""+(Integer.parseInt(Information[i])+1); 
                    }
                    System.out.print(Information[i]+" ");
                    if (i == Information.length-1){
                        System.out.println("");
                    }
                }
            }    
        }
    }
}
