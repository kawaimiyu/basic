package ex.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Ex11 {
    public static void main(String[] args) {
        //Personクラスを格納するArrayListを作成する
        //5人程度のインスタンスを追加する

        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("山木", "女", 23),
                new Person("森戸", "女", 21),
                new Person("尾関", "男", 19),
                new Person("船木", "男", 18),
                new Person("梁川", "女",19)
        ));

        //一覧表示する
        System.out.println("一覧表示");
        for (Person s : list) System.out.println(s);

        //年齢の降順で表示する
        list.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));//降順
        System.out.println("年齢の降順");
        for (Person s : list) System.out.println(s);

        //男性で年齢の降順で出力
        //男性のみを別のArrayListにコピーして作成
        List<Person> mens = new ArrayList<>();
        for (Person p:list){
            if("男".equals(p.getGender()))mens.add(p);
            }
            mens.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
            System.out.println("男性で年齢の降順");
            for (Person p:mens) System.out.println(p);
        }

        //以下自分でやったやつ　実行できた

        //list.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));//降順
        //System.out.println("男性のみで降順");
        //for (Person s : list) {
          //  if (s.getGender() == "男") System.out.println(s);

        }


