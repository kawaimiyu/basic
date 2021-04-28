package objectSample.beansSample;

import java.util.ArrayList;
import java.util.List;

//Beansの活用
public class BeansSample {
    public static void main(String[] args) {
        List<StudentBean> list = new ArrayList<>(); //Listは候補から選ばないとバグになる
        //各項目のデータを用意する
        String name = "結";
        int grade = 1;
        int cl = 1;
        int no = 20;
        int jap = 80;
        int math = 70;
        int eng = 60;

        //Beansに追加する
        StudentBean studentBean = new StudentBean(); //空のインスタンスを作る
        studentBean.setName(name);
        studentBean.setGrade(grade);     //studentBean大文字と小文字の場所見分けるsは小文字
        studentBean.setCl(cl);
        studentBean.setNo(no);
        studentBean.setJap(jap);
        studentBean.setMath(math);
        studentBean.setEng(eng);
        list.add(studentBean);

    }
}
