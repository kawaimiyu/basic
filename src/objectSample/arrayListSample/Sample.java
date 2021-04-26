package objectSample.arrayListSample;


class Sample {
    private String name;
    private int age;

    public Sample(String name, int age) { //自動生成コンストラクタ
        this.name = name;
        this.age = age;
    }

    public String getName() { //自動生成Getter
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
