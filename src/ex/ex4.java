package ex;

//九九の表示
public class ex4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {  //内側のループの方が先に変わる(外側よりも入れ子、さらにその内側が先)
                System.out.println(i + "*" + j + "=" + (i * j) + "");
            }
            System.out.println(); //改行
        }
    }
}
