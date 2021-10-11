public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s) == true)
                System.out.println(s + " - Палиндром");
            else
                System.out.println(s + " - Не палиндром");
        }
    }
    public static String reverseString(String s)
    {
        String k = "";
        for (int l = s.length() - 1; l != -1; --l)
        {
            k += s.charAt(l);
        }
        return k;
    }
    public static boolean isPalindrome(String s)
    {
        if (s.equals(reverseString(s)))
            return true;
        else
            return false;
    }
}
