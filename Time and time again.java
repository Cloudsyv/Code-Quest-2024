import java.util.Scanner;

class CodeQuest {
    public static void Converter(int Number, String Unit){
        // Format
        if (Number == 0){
            System.out.print("00");
        } else if (Number < 10){
            System.out.print("0"+Number);
        } else {
            System.out.print(Number);
        }
        
        if (!Unit.equals("s")){
            System.out.print(":");
        } else {
            System.out.print("\n");
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
                    
                    if (TimeText.length() > 1 && !TimeText.equals("and")){
                        String Unit = TimeText.substring(TimeText.length()-1, TimeText.length());
                        int Time = Integer.parseInt((TimeText.substring(0, TimeText.length()-1)));
                        
                        if (Unit.equals("h")){
                            Hours = Time;
                        } else if (Unit.equals("m")){
                            Minutes = Time;
                        } else if (Unit.equals("s")){
                            Seconds = Time;
                        }
                    }
                }
                
                // Convert to time format
                Converter(Hours, "h");
                Converter(Minutes, "m");
                Converter(Seconds, "s");
            }
        }
    }
}
