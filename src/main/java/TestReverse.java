import java.util.Scanner;

public class TestReverse {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入你想反转的字符串:");
//        String str = input.next();
//        String strReverse = stringReverse(str);
//        System.out.println("反转后的字符串=" + strReverse);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你想反转的字符串:");
        String str = input.next();
        String s = stringReverseByNum(str, 3, 6);
        System.out.println("部分反转后的字符串=" + s);
        System.out.println("部分反转后的字符串=" + s);
        System.out.println("部分反转后的字符串=" + s);
        System.out.println("部分反转后的字符串=" + s);
    }

    //全反转11111111111111111
    public static String stringReverse(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer strReverse = stringBuffer.reverse();
        String strReverseString = strReverse.toString();
        return strReverseString;
    }

    //部分反转
    public static String stringReverseByNum(String str , int start , int end){
        if(str.toCharArray().length < end){
            return "字符串长度不够";
        }
        StringBuilder fullStr = new StringBuilder(str);
        String middle = new StringBuilder(str.substring(start, end)).reverse().toString();
        return fullStr.replace(start, end, middle).toString();


    }



}
