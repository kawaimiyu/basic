package ex.ex8;

//長方形クラス
class Rectangle implements IfGetArea {
    private double height;//高さ
    private double width;//幅

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return String.format("長方形 高さ:%.2f 幅:%.2f 面積:%.2f",
                height,width,getArea());
    }
}