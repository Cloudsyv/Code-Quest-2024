import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Info[] = input.nextLine().split(" ");
                int TotalFuel = Integer.parseInt(Info[0]);
                int NumTanks = Integer.parseInt(Info[1]);
                
                int RemainingFuel = TotalFuel;
                int RemainingTanks = NumTanks;
                double FillList[] = new double[NumTanks];
                
                // Fill and Subtract smalls
                String Tanks[] = input.nextLine().split(" ");
                for (int i = 0; i < Tanks.length; i++){
                    int Value = Integer.parseInt(Tanks[i]);
                    if (TotalFuel/NumTanks > Value){
                        RemainingFuel -= Value;
                        RemainingTanks -= 1;
                        FillList[i] = Value;
                    }
                }
                
                // Fill bigs by remainder/total
                for (int i = 0; i < Tanks.length; i++){
                    //System.out.println("Math: "+TotalFuel+"/"+NumTanks);
                    if (TotalFuel/NumTanks <= Integer.parseInt(Tanks[i])){
                        FillList[i] = (double) RemainingFuel/RemainingTanks;
                        if (FillList[i]/(RemainingFuel/RemainingTanks) != 1){
                            System.out.print(RemainingFuel+"/"+RemainingTanks);
                        } else {
                            System.out.print((int) FillList[i]);
                        }
                    } else {
                        System.out.print((int) FillList[i]);   
                    }
                    
                    // Spacing
                    if (i != Tanks.length-1){
                        System.out.print(" ");
                    } else {
                        System.out.println("");
                    }
                }
            }
        }
    }
}
