import java.util.Scanner;
public class Main {

    public static int dynamic_variables() {
        Scanner in = new Scanner(System.in);
        Point point = new Point();
        Segment segment = new Segment();
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        int answer;
        System.out.println("\nВыберите фигуру, параметры которой необходиму определить:");
        System.out.println("1) Точка\n2) Отрезок\n3) Круг\n4) Эллипс\n5) Квадрат\n6) Треугольник\n7) Прямоугольник\n8) Вернуться в меню");
        do {
            System.out.println("Ответ: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 8);
        switch (answer) {
            case 1: {
                point.input();
                System.out.println(Point.name);
                point.output();
                break;
            }
            case 2: {
                try{
                    segment.input();
                    if(segment.get_a().get_x() == segment.get_b().get_x() && segment.get_a().get_y() == segment.get_b().get_y()){
                        throw new Ex();
                    }
                }
                catch(Ex e){
                    System.out.println("Исключение. Точки не должны иметь общие координаты.\n");
                    return 0;
                }
                System.out.println(Segment.name);
                segment.output();
                System.out.format("Угол между положительным направлением оси X и данным отрезком составляет %f\n", Segment.degrees_calc(segment));
                break;
            }
            case 3: {
                circle.input();
                circle.output();
                break;
            }
            case 4: {
                ellipse.input();
                ellipse.output();
                break;
            }
            case 5: {
                square.input();
                System.out.println(square.name);
                square.output();
                break;
            }
            case 6: {
                triangle.input();
                System.out.println(Triangle.name);
                triangle.output();
                break;
            }
            case 7: {
                rectangle.input();
                System.out.println(rectangle.name);
                rectangle.output();
                break;
            }
            case 8: {
                return 0;
            }
        }
        dynamic_variables();
        return 0;
    }

    public static int array_of_segments(){
        Scanner in = new Scanner(System.in);
        Segment[] segments = new Segment[10];
        int i = 0, n, answer, number, p = 0;
        while(true) {
            System.out.println("Выберите режим работы программы:");
            System.out.println("1) Создать новый массив отрезков\n2) Вывести на экран существующий отрезок\n3) Возврат в меню выбора режима работы");
            do {
                System.out.println("Ответ: ");
                answer = in.nextInt();
            } while (answer < 1 || answer > 3);
            switch (answer) {
                case 1: {
                    do {
                        System.out.println("Введите количество отрезков, которые вы хотите создать(не более 10): ");
                        n = in.nextInt();
                    } while (n < 1 || n > 10);
                    for (i = 0; i < n; i++) {
                        p = 0;
                        System.out.println("Отрезок №" + (i + 1) + ":");
                        while(p == 0) {
                            try {
                                segments[i] = new Segment();
                                p = 1;
                                segments[i].input();
                                if(segments[i].get_a().get_x() == segments[i].get_b().get_x() && segments[i].get_a().get_y() == segments[i].get_b().get_y()){
                                    throw new Ex();
                                }
                            }
                            catch(Ex e){
                                p = 0;
                                System.out.println("Исключение. Точки не должны иметь общие координаты.\n");
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    if (i == 0) {
                        System.out.println("Массив пуст");
                        System.out.println("");
                    } else {
                        do {
                            System.out.println("Введите номер отрезка: ");
                            number = in.nextInt();
                        } while (number < 1 || number > i);
                        segments[number - 1].output();
                        System.out.println("");
                    }
                    break;
                }
                case 3:
                    return 0;
            }
        }
    }

    public static int array_of_segments_2(){
        Scanner in = new Scanner(System.in);
        Segment[][] segments = new Segment[7][7];
        int i = 0, j = 0, n, m, answer, number_line, number_column, p = 0;
        while(true) {
            System.out.println("Выберите режим работы программы:");
            System.out.println("1) Создать новый двумерный массив отрезков\n2) Вывести на экран существующий отрезок\n3) Возврат в меню выбора режима работы");
            do {
                System.out.println("Ответ: ");
                answer = in.nextInt();
            } while (answer < 1 || answer > 3);
            switch (answer) {
                case 1: {
                    do {
                        System.out.println("Введите количество строк и столбцов массива: ");
                        n = in.nextInt();
                        m = in.nextInt();
                    } while (n < 1 || n > 7 || m < 1 || m > 7);
                    for (i = 0; i < n; i++)
                        for (j = 0; j < m; j++) {
                            segments[i][j] = new Segment();
                            p = 0;
                            System.out.println("Отрезок " + "(" + (i + 1) + ")(" + (j + 1) + "):");
                            while (p == 0) {
                                try {
                                    p = 1;
                                    segments[i][j].input();
                                    if (segments[i][j].get_a().get_x() == segments[i][j].get_b().get_x() && segments[i][j].get_a().get_y() == segments[i][j].get_b().get_y()) {
                                        throw new Ex();
                                    }
                                } catch (Ex e) {
                                    p = 0;
                                    System.out.println("Исключение. Точки не должны иметь общие координаты.\n");
                                }
                            }
                        }
                    break;
                }
                case 2: {
                    if (i == 0) {
                        System.out.println("Массив пуст");
                        System.out.println("");
                    } else {
                        do {
                            System.out.println("Введите номер строки и столбца на пересечении которых находится отрезок: ");
                            number_line = in.nextInt();
                            number_column = in.nextInt();
                        } while (number_line < 1 || number_line > i || number_column < 1 || number_column > j);
                        segments[number_line - 1][number_column - 1].output();
                        System.out.println("");
                    }
                    break;
                }
                case 3:
                    return 0;
            }
        }
    }

    public static int cloning(){
        Scanner in = new Scanner(System.in);
        int answer = 0;
        Segment A = new Segment();
        Segment B = new Segment();
        Circle C = new Circle();
        Circle D = new Circle();
        System.out.println("Выберите способ клонирования:");
        System.out.println("1) Мелкое клонирование\n2) Глубокое клонирование\n3) Возврат в меню выбора режима работы");
        do {
            System.out.println("Ответ: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 3);
        switch(answer){
            case 1:{
                System.out.println("Отрезок A:");
                A.input();
                B = (Segment)A.clone();
                System.out.println("Получившийся отрезок A:");
                A.output();
                System.out.println("Получившийся отрезок B:");
                B.output();
                Point i = new Point (5, 3);
                A.set_a(i);
                System.out.println("");
                System.out.println("Конечный отрезок A:");
                A.output();
                System.out.println("Конечный отрезок B:");
                B.output();
                System.out.println("");
                break;
            }
            case 2:{
                System.out.println("Круг C:");
                C.input();
                D = (Circle)C.clone();
                System.out.println("Получившийся круг C:");
                C.output();
                System.out.println("Получившийся круг D:");
                D.output();
                Point i = new Point (5, 3);
                C.set_center(i);
                System.out.println("");
                System.out.println("Конечный круг C:");
                C.output();
                System.out.println("Конечный круг D:");
                D.output();
                System.out.println("");
                break;
            }
            case 3:
                return 0;
        }
        cloning();
        return 0;
    }

    public static int menu(){
        Scanner in = new Scanner(System.in);
        int answer;
        System.out.println("Выберите режим работы программы:");
        System.out.println("1) Работа с объектами классов\n2) Создать массив объектов класса Segment\n3) Создать двумерный массив объектов класса Segment\n4) Клонирование\n5) Выйти из программы");
        do {
            System.out.println("Ответ: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 5);
        switch (answer) {
            case 1: dynamic_variables(); break;
            case 2: array_of_segments(); break;
            case 3: array_of_segments_2(); break;
            case 4: cloning(); break;
            case 5: return 0;
        }
        menu();
        return 0;
    }

    public static void main(String[] args) {
        System.setProperty("file.encoding","1251");
        Segment.a1 = new Point(0, 0);
        Segment.b1 = new Point(2, 0);
        Point.name = "Точка";
        Segment.name = "Отрезок";
        Triangle.name = "Треугольник";
        menu();
    }
}
