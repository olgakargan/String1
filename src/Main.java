import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String surname = "Ivanovich.";
        String fullName = "Ivanov Ivan Ivanovich.";

        System.out.println("last name first name patronymic of the employee:" + fullName);

        String result = fullName.toUpperCase();
        System.out.println("Employee's full name data for filling out the report" + "Result: " + result);

        String OldFullName = "Ivanov Ivan Ivanovich";
        String NewFullName = OldFullName.replace('a', 'o');
        System.out.println(NewFullName);
        //русские буквы не выводит, полуачаются иероглифы


        String text = "Ivanov Ivan Ivanovich";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String str = "aabccddefgghiijjkk";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                System.out.println("the letters are repeated: " + arr[i]);

        }
        String string1 = "aabccddefgghiijjkk";
        char[] string;
        string = string1.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; string.length > i; i++) {
            for (int j = i + 1; string.length > j; j++) {
                Integer value = hashMap.get(string[i]);
                if (value == null) value = 1;
                if (string[i] == string[j]) {
                    hashMap.put(string[i], value + 1);
                } else {
                    hashMap.put(string[i], value);
                }
            }
        }
        System.out.println(hashMap);


        String s1 = "135";
        String s2 = "246";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            s.append(s1.charAt(i)).append(s2.charAt(i));
        }
        System.out.println(s.toString());
    }
}