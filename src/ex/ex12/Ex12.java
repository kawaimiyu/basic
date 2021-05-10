package ex.ex12;

import java.util.*;

class Ex12 {
    public static void main(String[] args) {
        //Personクラスを格納するArrayListを作成する
        //5人程度のインスタンスを追加する

        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("山木", "女", 23),
                new Person("森戸", "女", 21),
                new Person("尾関", "男", 19),
                new Person("船木", "男", 18),
                new Person("梁川", "女", 19)
        ));

        //一覧表示する
        System.out.println("一覧表示");
        for (Person p : list) System.out.println(p);


        //検索する名前の入力
        Scanner in = new Scanner(System.in);
        System.out.println("検索する名前を入力");
        String name = in.nextLine();
        System.out.println(name);


        //名前のリストを作成する
        List<String> nameList = new ArrayList<>();
        for (Person p:list) {
            nameList.add(p.getName());
        }
        //検索する
        if (nameList.contains(name)) {
            System.out.println(name + "は存在します");
        } else {
            System.out.println(name + "は存在しません");
        }

        //別解
       // if (containsName (name,list)) {
      //      System.out.println(name + "は存在します");
       // } else {
       //     System.out.println(name + "は存在しません");
       // }
    }
}


