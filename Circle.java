import java.util.Scanner;
class Circle extends Circle_Like_Figure {
    public Circle() {
        super();
    }

    public Circle(Point center) {
        super(center);
    }

    public Circle(Point center, Point figure_point) {
        super(center, figure_point);
    }

    public void input() {
        Point center = new Point();
        Point figure_point = new Point();
        System.out.println("Введите координаты центра окружности:");
        center.input();
        System.out.println("Введите координаты точки на окружности:");
        figure_point.input();
        Segment radius = new Segment(center, figure_point);
        this.center = center;
        this.figure_point = figure_point;
        this.radius = radius;
    }

    public void output() {
        Auxiliary Aux = new Auxiliary();
        int c_length;
        circle_length_int(Aux);
        c_length = Aux.parameter;
        System.out.println("Координаты центра окружности: ");
        this.center.output();
        System.out.println("Координаты точки на окружности: ");
        this.figure_point.output();
        System.out.println("Длина радиуса равна " + this.radius.get_length());
        System.out.println("Длина окружности равна " + this.figure_length());
        System.out.println("Длина окружности равна(без дробной части) " + c_length);
        System.out.println("Площадь круга равна " + this.figure_area());
    }

    public double figure_length() {
        double len;
        len = 2 * Math.PI * radius.get_length();
        return len;
    }

    public void circle_length_int(Auxiliary A) {
        A.parameter = (int)(2 * Math.PI * radius.get_length());
    }

    public double figure_area() {
        double area;
        area = Math.PI * Math.pow(radius.get_length(), 2);
        return area;
    }

    public Object clone(){
        try{
            Circle clone = (Circle)super.clone();
            clone.center = (Point)center.clone();
            clone.figure_point = (Point)figure_point.clone();
            return clone;
        }
        catch(CloneNotSupportedException e){

        }
        return this;
    }

}
