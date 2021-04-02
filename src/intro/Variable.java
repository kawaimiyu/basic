package intro;

    //変数の宣言の仕方   同じクラスの中で同じ変数は使えない(別のクラスでは使える)
public class Variable {
    public static void main(String[] args) {
        //整数型
        byte b = 10;  //右から左に代入する、左から右に解読する
        short s = 32000;
        int i = 100;
        long l = 10000L;//後ろにアルファベット書けるのはlong,float,doubleの3つのみ！

        //浮動小数点型
        float f = 12.34f;
        double d = 123.456;

        //文字型
        char c1 ='A';  //シングルクォーテーション'shift+7'
        char c2 = '\u0041'; //Unicode

        //真偽値型
        boolean bool = true; //true or false

        System.out.println(b);     // b.sout で出せる
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(bool);


    }
}

