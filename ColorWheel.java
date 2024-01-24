import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String DesiredColor[] = input.nextLine().split("-");
                String ColorToMake;
                String FullColor;
                if (DesiredColor.length == 1){
                    ColorToMake = DesiredColor[0].toLowerCase();
                    FullColor = DesiredColor[0].toLowerCase();
                } else {
                    ColorToMake = DesiredColor[1].toLowerCase(); 
                    FullColor = DesiredColor[0].toLowerCase()+"-"+DesiredColor[1].toLowerCase();
                }
                
                System.out.println(ColorToMake);
                if (ColorToMake.equals("orange")){
                    System.out.println("In order to make "+FullColor+", red and yellow must be mixed.");
                } else if (ColorToMake.equals("violet")){
                    System.out.println("In order to make "+FullColor+", blue and red must be mixed.");
                } else if (ColorToMake.equals("green")){
                    System.out.println("In order to make "+FullColor+", blue and yellow must be mixed.");
                } else {
                    System.out.println("No colors need to be mixed to make "+FullColor+".");
                }
            }
        }
    }
}
