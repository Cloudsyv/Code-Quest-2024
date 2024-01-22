import java.util.*;

class CodeQuest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String Information1[] = input.nextLine().split(" ");
                String Information2[] = input.nextLine().split(" ");
                
                ArrayList<Integer> Count = new ArrayList<Integer>();
                for (int i = 0; i < Information1.length; i++){
                    if (Double.parseDouble(Information1[i]) >= .6 && Double.parseDouble(Information1[i]) <= .85 && Double.parseDouble(Information2[i]) >= .6 && Double.parseDouble(Information2[i]) <= .85){
                        Count.add(i);
                    }
                }
                if (Count.size() >= 1){
                    System.out.print(Count.size()+" multipaction events were detected at time indices: ");
                    for (int i = 0; i < Count.size(); i++){
                        System.out.print(Count.get(i));
                        if (i == Count.size()-1){
                            System.out.println(".");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (Count.size() > 0) {
                    System.out.println("A multipaction event was detected at time index "+Count.get(0)+".");
                } else {
                    System.out.println("No multipaction events detected.");
                }
            }
        }
    }
}
