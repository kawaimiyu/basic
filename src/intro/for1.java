package intro;

//for命令のサンプル1
public class for1 {
    public static void main(String[] args) {
        int sum = 0; //合計(sum)の初期化
        for (int i = 1; i <= 10 ; i++) { //i++でiが1個増える
            sum += i;  //回数重ねるごとに0+1、1+2、1+2+3....1+2+3+4+5+6+7+8+9+10って1~10までどんどん足していく
            System.out.println( i + "回目:" + sum);
        }
    }
}

