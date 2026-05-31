public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            String temp = "";

            for (int j = i; j < s.length(); j++) {

                temp += s.charAt(j);

                boolean found = true;

                for (int k = 0; k < t.length(); k++) {

                    if (temp.indexOf(t.charAt(k)) == -1) {
                        found = false;
                        break;
                    }
                }

                if (found) {

                    if (ans.equals("") || temp.length() < ans.length())
                        ans = temp;

                    break;
                }
            }
        }

        System.out.println("Minimum Window = " + ans);
    }
}