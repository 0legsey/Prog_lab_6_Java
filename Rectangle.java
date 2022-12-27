import java.util.Scanner;
public class Rectangle extends Square{
    private double width;

    public Rectangle(){
        len = 0;
        width = 0;
        name = "Прямоугольник";
    }

    public Rectangle(double len){
        super(len);
        width = 0;
        name = "Прямоугольник";
    }

    public Rectangle(double len, double width){
        super(len);
        this.width = width;
        name = "Прямоугольник";
    }

    public void set_width(double w) {
        width = w;
    }

    public double get_width() {
        return width;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        len = in.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        width = in.nextInt();
    }

    public void output() {
        System.out.println("Длина прямоугольника равна " + len);
        System.out.println("Ширина прямоугольника равна " + width);
        System.out.println("Периметр прямоугольника равен " + perimeter_calc());
        System.out.println("Площадь прямоугольника равна " + area_calc());
    }

    public double perimeter_calc() {
        double perimeter;
        perimeter = 2 * (len + width);
        return perimeter;
    }

    public double area_calc() {
        double area;
        area = len * width;
        return area;
    }
}
