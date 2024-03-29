package me.whiteship.chapter04.item16.point.method;

// 코드 16-2 접근자와 변경자(mutator) 메서드를 활용해 데이터를 캡슐화한다. (102쪽)
class Point {

    //필드를 private으로 유지하고 메서드 API로 필드를 제공
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // 부가 작업 ex)검증
        return x;
    }
    public double getY() { return y; }

    public void setX(double x) {
        // 부가 작업
        this.x = x;
    }
    public void setY(double y) { this.y = y; }
}
