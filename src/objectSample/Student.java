package objectSample;

class Student {
    //クラスは呼び出すためのもの→実行できない
    //public classのpublicを取ったらプライベートフィールド
    // クラス　no int  出席番号、name String 名前、grade int 学年、cl int クラス
    // - プライベート、+　パブリック
    // メソッド　＋各getter、+to String
    //コンストラクタ　自動生成でつくる

    //フィールド（データを記録する場所)
    private String name;
    private int grade;
    private int cl;
    private int no;

    //コンストラクタ　インスタンスを作るときに使用するメソッド
    public Student(String name, int grade, int cl, int no) {
        this.name = name;
        this.grade = grade;
        this.cl = cl;
        this.no = no;
    }

    //getter データを取得するメソッド
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getNo() {
        return no;
    }

   //toString 文字列に変換
    @Override
    public String toString() {
        return String.format("%s %d %d %2d",
               name,grade,cl,no);
    }
}
