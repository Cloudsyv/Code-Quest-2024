import java.util.*;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                
                Dictionary<String, String> Dict = new Hashtable<>();
                for (int i = 0; i < 26; i++){
                  String Info = input.nextLine();
                  Dict.put(Info.substring(0, 1), Info.substring(1, Info.length())); 
                }
                
                String Message[] = input.nextLine().split("");
                for (int i = 0; i < Message.length; i++){
                  if (Dict.get(Message[i]) == null){
                    System.out.print("    ");
                  } else {
                    System.out.print(Dict.get(Message[i])+"   "); 
                  }
                }
                
                System.out.println("");
                
                String EncodedMessage[] = input.nextLine().split("   ");
                for (int i = 0; i < EncodedMessage.length; i++){
                  
                  // Get keys in dictionary
                  //Enumeration<String> keys = Dict.keys
                  for (Enumeration v = Dict.elements(); v.hasMoreElements();){
                    System.out.println(v.nextElement());
                    System.out.println(EncodedMessage[i]);
                    if (v.nextElement().equals(EncodedMessage[i])){
                      System.out.println(v);
                    }
                    //System.out.println("HI");
                  }
                  /*while (keys.hasMoreElements()) {
                    String key = keys.nextElement();
                    System.out.println(key);
                    System.out.println(EncodedMessage[i]);
                    if (Dict.get(key).equals(EncodedMessage[i])){
                      System.out.print(key);
                    }
                  }*/
                }
                /*
                String Information[] = input.nextLine().split(" ");
                Dictionary<String, Integer> dict= new Hashtable<>();
                dict.put("Alice", 25);
                */
            }
        }
    }
}
