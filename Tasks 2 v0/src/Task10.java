/*
10.	Возвращает true, если сумма значений ASCII первой строки
совпадает с суммой значений ASCII второй строки,
в противном случае возвращает false.
 */
/*
public class Task10 {
    public static void main(String[] args){
        System.out.print(sameAscii("EdAbIt", "EDABIT"));
    }
    public static boolean sameAscii(String a, String b){
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        int aAscii=0;
        int bAscii=0;
        for (int i=0; i< arrayA.length;i++){
            aAscii += (int)arrayA[i];
        }
        for(int i=0; i< arrayB.length;i++){
            bAscii += (int)arrayB[i];
        }
        return (aAscii==bAscii);
    }
}
*/










/*
10.	Возвращает true, если сумма значений ASCII первой строки
совпадает с суммой значений ASCII второй строки,
в противном случае возвращает false.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(ascii("fasd", "fasd"));
    }
    public static boolean ascii(String s, String ss)
    {
        int asciiA = 0;
        int asciiB = 0;
        char[] A = s.toCharArray();
        char[] B = ss.toCharArray();
        for (int i = 0; i <A.length; ++i)
            asciiA += (int)A[i];
        for (int i = 0; i <B.length; ++i)
            asciiB  += (int)B[i];
        if (asciiA == asciiB)
            return true;
        else
            return false;
    }
}
























