package objectSample.equalSample;


class EqualsSample {
    public static void main(String[] args) {
        Sample sample1 = new Sample("abc");//Sampleクラスを事前に作られてないと使えない
        Sample sample2 = sample1;
        Sample sample3 = new Sample("def");
        Sample sample4 = new Sample("abc");
        String str = "abc";
        Sample2 sample21 = new Sample2("Tom",35);
        Sample2 sample22 = sample21;
        Sample2 sample23 = new Sample3("Tom",35);
        Sample2 sample24 = new Sample2("Tom",35);

        //同一のオブジェクトの場合
        System.out.println(sample1.equals(sample2));//true
        System.out.println(sample1.equals(str));//false
        System.out.println(sample1.equals(sample4));//true
        System.out.println(sample1.equals(sample3));//false

        System.out.println(sample21.equals(sample22));//true
        System.out.println(sample21.equals(sample23));//false
        System.out.println(sample21.equals(sample24));//true

    }
}
