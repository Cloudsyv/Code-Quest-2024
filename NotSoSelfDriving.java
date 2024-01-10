import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
               
               String Information[] =  input.nextLine().split(":");
               double V = Math.max(0, Math.min(200, Double.parseDouble(Information[0])));
               double X = Math.max(1, Math.min(400,Double.parseDouble(Information[1])));
               
               double Seconds = X/V;
               if (V != 0 && X != 0) {
                   Seconds = (Math.round(X*100)/100)/(Math.round(V*100)/100);
               };
               if (Seconds <= 1){
                   System.out.println("SWERVE");
               } else if (Seconds <= 5){
                   System.out.println("BRAKE");
               } else {
                   System.out.println("SAFE");
               }
            }
        }
    }
}
