package objectSample.cloneSample;

//クローンメソッドを正しく実装していない場合
class Sample2 implements Cloneable {
    private int num;//基本型
    private Node node;//参照型

    //コンストラクタも安全ではない
    public Sample2(int num, Node node) {
        this.num = num;
        this.node = new Node(node); //ポインタの参照を断ち切るため
    }

    public void setNum(int num) {

        this.num = num;
    }

    public void setNode(Node node) {

        this.node = node;
    }


    @Override
    public String toString() {
        return "cloneSample{" +
                "num=" + num +
                ", node=" + node +
                '}';
    }
    //オーバーライドして一部変更しただけ
    @Override
    public Sample2 clone() {
        Sample2 clone = null;
        try {
            //オブジェクトクラスのクローンメソッドで複製する
            clone = (Sample2) super.clone();
            //参照型のフィールドを個別で複製する
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();//例外時のトレース
        }
        return clone; //複製を返却する
    }
}
