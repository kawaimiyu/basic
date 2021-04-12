package intro;

//拡張for命令
public class for3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};  //配列の宣言
        int sum = 0; //合計の初期化
        for (int value : array){
            System.out.println(sum);  //配列の順番に加算されていく
            sum += value; //配列の内容を合計に加算
                          //配列から一個ずつ値を取り出していくという意味でvalue
                          //配列の何番目かという情報は取り出せない
        }
        System.out.println(sum); //合計の出力sout(sum)消したら結果150が出る
    }
}
