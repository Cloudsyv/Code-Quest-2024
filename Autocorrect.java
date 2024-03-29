import java.util.Scanner;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information[] = input.nextLine().split(" ");
                int D = Integer.parseInt(Information[0]), W = Integer.parseInt(Information[1]);
                
                String DictionaryWords[] = new String[D];
                for (int i = 0; i < D; i++){
                    DictionaryWords[i] = input.nextLine();
                }
                
                String Words[] = new String[W];
                for (int i = 0; i < W; i++){
                    String Word = input.nextLine();
                    Words[i] = Word;
                } 
                
                // Loop through word list
                for (int i = 0; i < Words.length; i++){
                    String Word = Words[i];
                    int MatchList[] = new int[D];
                    
                     // Loop through dictionary words
                    for (int y = 0; y < DictionaryWords.length; y++){
                        // Loop through characters in dicitonary word
                        for (int v = 0; v < DictionaryWords[y].length(); v++){
                            // Loop through characters in word
                            for (int x = 0; x < Word.length(); x++){
                                if (DictionaryWords[y].charAt(v) == Word.charAt(x) && DictionaryWords[y].length() == Word.length()){
                                    MatchList[y]++;
                                }
                            }
                        }
                    }
                    
                    String MatchedWord = "";
                    int Matches = 0;
                    for (int y = 0; y < MatchList.length; y++){
                        if (MatchList[y] >= Matches){
                            Matches = MatchList[y];
                            MatchedWord = DictionaryWords[y];
                        }
                    }
                    System.out.println(MatchedWord);
                }
            }
        }
    }
}
