package String;
public class Decode {
    public static void main(String[] args) {
        String s = "5[a]2[bcd]";
        String ch = "";
        String res = "";
        int n = 0;

        int i = 0;
        while(i < s.length()){
            if((s.charAt(i)-'0') > 0 && (s.charAt(i)-'0') < 10){
                n = s.charAt(i)-'0';
                i++;
            }

            while(s.charAt(i)!=']'){
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    ch = ch + s.charAt(i);
                }
                i++;
            }

            while(n!=0){
                res = res + ch;
                n--;
            }
            ch = "";
            i++;
        }
        System.out.println(res);

    }
}
