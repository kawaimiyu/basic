package ex.ex10;

class Student {
    private String name;
    private int grade;
    private int cl;
    private int no;
    private int jap;
    private int math;
    private int eng;

    public Student(String name, int grade, int cl, int no, int jap, int math, int eng) {
        this.name = name;
        this.grade = grade;
        this.cl = cl;
        this.no = no;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

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

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %2d %3d %3d %3d %3d %.2f",
                name,grade,cl,no,jap,math,eng,getSum(),getAve());
    }

    //個人合計を求めるメソッドを作成する
    public int getSum() {
        return jap + math + eng;
    }

    //個人平均を求めるメソッドを作成する
    public double getAve() {
        return getSum() / 3.0;
    }
}