package ex;

//for1,for2の合体
//配列を合計する
public class ex3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};  //配列の宣言
        int sum = 0;  //合計の初期化
        for (int i = 0; i< array.length ; i++) {
            sum += array[i];  //配列の内容を合計に加算
        }
            System.out.println(sum); //合計の出力
        }
    }





