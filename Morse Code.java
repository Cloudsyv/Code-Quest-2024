import java.util.*;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                HashMap<String, String> dict = new HashMap<>();
                for (int i = 0; i < 26; i++){
                    String info = input.nextLine();
                    dict.put(info.substring(0, 1), info.substring(2));
                }

                // Encode
                String[] message = input.nextLine().split("");
                for (int i = 0; i < message.length; i++){
                    if (message[i].equals(" ")) {
                        System.out.print("       "); // 7 spaces for word separation
                        while (i + 1 < message.length && message[i + 1].equals(" ")) {
                            i++; // Skip extra spaces
                        }
                    } else if (dict.containsKey(message[i])){
                        System.out.print(dict.get(message[i]));
                        if (i < message.length - 1 && !message[i + 1].equals(" ")) {
                            System.out.print("   "); // 3 spaces for letter separation
                        }
                    }
                }
                System.out.println();

                // Decode
                String encodedMessage = input.nextLine();
                String[] encodedWords = encodedMessage.split("       "); // Split by 7 spaces
                for (String word : encodedWords) {
                    String[] encodedChars = word.trim().split("   "); // Split by 3 spaces
                    for (String encodedChar : encodedChars) {
                        for (String key : dict.keySet()) {
                            if (dict.get(key).equals(encodedChar)) {
                                System.out.print(key);
                                break;
                            }
                        }
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
