public class GroupAnagram {

    static String sortString(String str) {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {

        String[] str = {"cat", "act", "dog", "god", "tea", "eat"};
        boolean[] visited = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {

            if (visited[i])
                continue;

            System.out.print("Group: " + str[i] + " ");
            visited[i] = true;

            String sorted1 = sortString(str[i]);

            for (int j = i + 1; j < str.length; j++) {

                String sorted2 = sortString(str[j]);

                if (sorted1.equals(sorted2)) {
                    System.out.print(str[j] + " ");
                    visited[j] = true;
                }
            }

            System.out.println();
        }
    }
}