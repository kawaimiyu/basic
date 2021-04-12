package ex;

import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Array;
import java.util.Arrays;

//いちばん大きい数字を見つける
public class ex5 {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 50, 40};
        int max = array[0]; //仮の最大値
        int min = array[0]; //仮の最小値
        int sum = 0;  //合計を初期化
        double ave = 0.0;  //平均を初期化

        //各値を見つける
        for (int value : array) {
            if (max < value) max = value; //最大値の更新
            if (min > value) min = value; //最小値の更新
            sum += value;
        }
        ave = sum / array.length;  //平均を求める

        //結果の出力
        System.out.println(Arrays.toString(array));
        System.out.println(String.format("max:%d min:%d ave:%.2f", max, min, ave));
    }
}



