import java.nio.channels.WritePendingException;

class Day2_520DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int c = 0;
        for (int i = 0; i < word.length(); i++) {
            if('a'-word.charAt(i)>0)
            {
                c++;
            }
        }
        if(c == 0 || c==word.length()||(c ==1 && word.charAt(0)>='A'&& word.charAt(0)<='Z'))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // System.out.println(detectCapitalUse("g"));
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("g"));
        System.out.println('a' - 'A');
    }
}