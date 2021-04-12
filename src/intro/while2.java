package intro;

//whileサンプル2
public class while2 {
    public static void main(String[] args) {
        int[] array = {1,2,-3,5,-4}; //配列の宣言
        int i = 0; //初期化
        while (array [i] >= 0){  //負の数が来るまで処理を繰り替えす
            System.out.println(array[i]);
            i++;
        }
    }
}
