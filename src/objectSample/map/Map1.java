package objectSample.map;

import java.util.HashMap;
import java.util.Map;

//Mapサンプル
class Map1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //値の追加
        map.put("Apple","りんご");
        map.put("Banana","バナナ");
        map.put("Orange","オレンジ"); //対にすることをMapping
        //一覧の表示
        System.out.println(map);

        //for命令での表示
        //データを取得する変数 entry
        //データ型はMap.Entry<String,String>
        //entrySet()はひとつの組み合わせを取り出す
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //どんなアプリケーションでもforの拡張構文は絶対に使う

        //keyを指定して取得
        System.out.println(map.get("Apple"));//りんご
        System.out.println(map.get("abc"));//存在しなければnull

        //Keyが存在することを確認してからgetする
        if (map.containsKey("Apple")) {
            System.out.println(map.get("Apple"));
        } else {
            System.out.println("Key:Appleは存在しません");
        }

        //値の存在を調べる
        String word = "りんご";
        if (map.containsValue(word)) {
            System.out.println(word + "は存在します");
        } else {
            System.out.println(word + "は存在しません");
        }

        //値の変更
        System.out.println(map);
        System.out.println(map.put("Apple", "リンゴ"));//以前の値を返す
        System.out.println(map);

        //Keyの集合を取得
        System.out.println(map.keySet());//[Apple, Orange, Banana]

        //値のコレクションを取得
        System.out.println(map.values());//[リンゴ, オレンジ, バナナ]

        //Keyを指定して値の削除
        String key = "Apple";
        if (map.containsKey(key)) {
            map.remove(key);
        }
        System.out.println(map);
    }
}