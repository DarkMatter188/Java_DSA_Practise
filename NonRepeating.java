// package Practise;

public class NonRepeating {
    public int firstUniqChar(String s) {
        // Create an array to count the frequency of each character
        int[] count = new int[26];

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }
    public static void main(String[] args) {
        NonRepeating nrs = new NonRepeating();
        String s = "loveleetcode";
        System.out.println(nrs.firstUniqChar(s));
    }
}
