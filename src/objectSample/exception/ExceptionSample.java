package objectSample.exception;

//実行時例外の例
public class ExceptionSample {
    public static void main(String[] args) {
        String str1 = "abc", str2 = null;
        System.out.println(str1.length());
        System.out.println(str2.length()); //実行時例外が発生
        //str2はカラだからバグが発生してる
    }
}
