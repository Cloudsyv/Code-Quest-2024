import java.util.*;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                
                HashMap<String, String> Dict = new HashMap<>();
                for (int i = 0; i < 26; i++){
                  String Info = input.nextLine();
                  Dict.put(Info.substring(0, 1), Info.substring(2, Info.length())); 
                }
                
                // Encode
                String Message[] = input.nextLine().split("");
                for (int i = 0; i < Message.length; i++){
                  if (Dict.get(Message[i]) == null){
                    System.out.print("    ");
                  } else {
                    System.out.print(Dict.get(Message[i])+"   "); 
                  }
                }
                
                System.out.println("");
                
                // Decode
                String EncodedMessage[] = input.nextLine().split("   ");
                for (int i = 0; i < EncodedMessage.length; i++){
                  //System.out.println(EncodedMessage[i]);
                  // Get keys in dictionary
                  //System.out.println(EncodedMessage[i]);
                  //System.out.println(EncodedMessage[i].substring(1, EncodedMessage[i].length()));
                  
                  for (String v: Dict.keySet()){
                    if (Dict.get(v).equals(EncodedMessage[i])){
                      System.out.print(v);
                    } else if (EncodedMessage[i].length() >= 1 && Dict.get(v).equals(EncodedMessage[i].substring(1, EncodedMessage[i].length()))){
                      System.out.print(" "+v);
                    }
                  }
                  
                }
            }
        }
    }
}
