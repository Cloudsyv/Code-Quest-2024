import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split("\\|");
                String Word1 = Information[0];
                String Word2 = Information[1];
                
                int Count = 0;
                // Loop 1st word
                for (int i = 0; i < Word1.length(); i++){
                    boolean Stop = false;
                    // Loop through characters of 2nd word
                    for (int v = 0; v < Word2.length(); v++){
                        if (Word2.substring(v, v+1).equals(Word1.substring(i, i+1)) && Stop == false){
                            Count++;
                            System.out.println(Word2.substring(v, v+1));
                            Stop = true;
                        }
                    }
                }
                
               if (Count == Word1.length() && Word1.equals(Word2) == false){
                    System.out.println(Word1+"|"+Word2+" = ANAGRAM");
                } else {
                  System.out.println(Word1+"|"+Word2+" = NOT AN ANAGRAM");  
                }
            }
        }
    }
}
