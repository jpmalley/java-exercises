package studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        HashMap<Character, Integer> charactersHashMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String testStr;

        System.out.println("Enter your text:");
        testStr = in.nextLine().toLowerCase();

        char[] charactersInString = testStr.toCharArray();

        // count characters
        for (Character character : charactersInString) {
            if(Character.isLetter(character)) {
                if (!charactersHashMap.containsKey(character)) {
                    Integer count = 1;
                    charactersHashMap.put(character, count);
                } else {
                    charactersHashMap.put(character, charactersHashMap.get(character) + 1);
                }
            }
        }

        // print results
        for (Map.Entry<Character, Integer> character : charactersHashMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

}
