package objectSample;

//finalのサンプル

class SuperClass{
    //再代入不可なので定数、変数名はすべて大文字で記述
    protected final String CONST_WORD = "abc";


    //メソッドにfinalがつくとオーバーライド不可
    public final String getCONST_WORD() {
        return CONST_WORD;
    }
}

//SuperClassを継承したSub1を作成 finalがつくと継承不可になる
final class Sub1 extends SuperClass {
    //SuperClassからフィールドとメソッドを継承
}

//class  sub2 extends sib1() これはコンパイルエラー
    final class sub1 extends SuperClass {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();//デフォルトコンストラクター
        System.out.println(superClass.getCONST_WORD());//abc
        Sub1 sub1 = new Sub1();
        System.out.println(sub1.getCONST_WORD());//abc
    }
}

