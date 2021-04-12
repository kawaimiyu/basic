package intro;

//whileサンプル1
public class while1 {
    public static void main(String[] args) {
        //1~10までを加算
        int sum = 0; //合計を初期化
        int i = 1;  //繰り返しの変数を初期化
        while ( i <= 10 ) {
            sum += i;  //合計を計算する
            System.out.println( i + "回目:" + sum);
            i++;  //iを増やす
        }
    }
}
