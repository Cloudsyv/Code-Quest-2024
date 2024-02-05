import java.util.Scanner;

class CodeQuest {
    public static void Converter(int Number, String Unit){
        // Limits
        if (Unit.equals("h")){
            Number = Math.max(0, Math.min(99, Number));
        } else {
            Number = Math.max(0, Math.min(59, Number));
        }
        
        // Format
        if (Number == 0){
            System.out.print("00");
        } else if (Number < 10){
            System.out.print("0"+Number);
        } else {
            System.out.print(Number);
        }
        
        if (Unit != "s"){
            System.out.print(":");
        }
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String[] TimeArray = input.nextLine().split("[,\\s]+");
                
                int Hours = 0;
                int Minutes = 0;
                int Seconds = 0;
                
                for (int i = 0; i < TimeArray.length; i++){
                    String TimeText = TimeArray[i];
                    
                    if (!TimeText.equals("and")){
                        String Unit = TimeText.substring(TimeText.length()-1, TimeText.length());
                        int Time = Integer.parseInt((TimeText.substring(0, TimeText.length()-1)));
                        
                        if (Unit.equals("h")){
                            Hours = Time;
                        } else if (Unit.equals("m")){
                            Minutes = Time;
                        } else {
                            Seconds = Time;
                        }
                    }
                }
                
                // Convert to time format
                Converter(Hours, "h");
                Converter(Minutes, "m");
                Converter(Seconds, "s");
                System.out.println();
            }
        }
    }
}
