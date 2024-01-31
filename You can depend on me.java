import java.util.Scanner;

class CodeQuest {
    public static int FindCategoryPos(String Array[][], String Category){
        for (int i = 0; i < Array[i].length; i++){
            //System.out.println(Array[i][0].equals("null"));
            if (Array[i][0] != null && Array[i][0].equals(Category)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                String Dependents[][] = new String[Integer.parseInt(Information[0])][Integer.parseInt(Information[1])];
                
                // Create 2D
                for (int i = 0; i < Integer.parseInt(Information[0]); i++){
                    String DependInfo[] = input.nextLine().split(" ");
                    
                    // Create category
                    if (FindCategoryPos(Dependents, DependInfo[0]) == -1){
                        Dependents[i][0] = DependInfo[0];   
                        Dependents[i][1] = DependInfo[1];
                    } else {
                        // Add to category
                        int CatPos = FindCategoryPos(Dependents, DependInfo[0]);
                        Dependents[CatPos][Dependents[CatPos].length-1] = DependInfo[1];
                    }
                }
                
                // Failure Events
                for (int i = 0; i < Integer.parseInt(Information[1]); i++){
                    String FailedEvent = input.nextLine();
                    int FailedPos = FindCategoryPos(Dependents, FailedEvent);
                    for (int v = 0; v < Dependents[FailedPos].length; v++){
                        System.out.println(Dependents[FailedPos][v]);
                    }
                }
            }
        }
    }
}
