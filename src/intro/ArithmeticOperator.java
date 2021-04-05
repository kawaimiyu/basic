package intro;


//算術演算子
public class ArithmeticOperator {
    public static void main(String[] args) {

        int a = 5,b = 3;
        System.out.println(a+"+"+b+"="+(a+b));//8(+と-は文字列のために””をつける)
        System.out.println(a+"-"+b+"="+(a-b));//引き算　2
        System.out.println(a+"*"+b+"="+(a*b));//掛け算　15
        System.out.println(a+"/"+b+"="+(a/b));//割り算　1
        System.out.println(a+"%"+b+"="+(a%b));//割り算のあまりを求める　2

        double c = 5, d = 3;
        System.out.println(c+"+"+d+"="+(c+d));//8.0
        System.out.println(c+"-"+d+"="+(c-d));//2.0
        System.out.println(c+"*"+d+"="+(c*d));//15.8
        System.out.println(c+"/"+d+"="+(c/d));//1.666666666666667 0以下を出すにはdouble.計算対象が何型なのか考えてつくる。
        System.out.println(c+"%"+d+"="+(c%d));//2.0

    }
}
