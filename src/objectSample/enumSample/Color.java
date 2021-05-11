package objectSample.enumSample;

//enumのサンプル
//クラスを選んで列挙型を選択
//publicつけた方が標準的
enum Color {
    RED("赤"),
    BLUE("青"),
    YELLOW("黄");

    //フィールド
    private String jpName;

    private Color(String jpName){
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
