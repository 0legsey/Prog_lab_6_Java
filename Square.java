import java.util.Scanner;
public class Square implements Parameters_Calc{
    protected double len;
    public String name;

    public Square() {
        len = 0;
        name = "Квадрат";
    }

    public Square(double len) {
        this.len = len;
        name = "Квадрат";
    }

    public void set_len(double l) {
        len = l;
    }

    public double get_len() {
        return len;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата:");
        len = in.nextInt();
    }

    public void output() {
        System.out.println("Длина стороны квадрата равна " + len);
        System.out.println("Периметр квадрата равен " + perimeter_calc());
        System.out.println("Площадь квадрата равна " + area_calc());
    }

    public double perimeter_calc() {
        double perimeter;
        perimeter = 4 * len;
        return perimeter;
    }

    public double area_calc() {
        double area;
        area = Math.pow(len, 2);
        return area;
    }

}
