package 연습.문자찾기;

import java.util.HashMap;

/**
 * 
 * 각 한문자마다 나온 갯수를 출력할때 사용한다.
 *
 */

public class StringFindesDetailes {
        public static void main(String[] args) {
            String string1 = "Great responsibility";
            char string[] = string1.toCharArray();
            HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
            for (int i = 0; i < string.length; i++) {
                for (int j = i + 1; j < string.length; j++) {
                    Integer value = hashMap.get(string[i]);
                    if (value == null) {
                        value = 1;
                    }
                    if (string[i] == string[j]) {
                        hashMap.put(string[i], value + 1);
                    } else {
                        hashMap.put(string[i], value);
                    }
                }
            }
            System.out.println(hashMap);
        }
}
