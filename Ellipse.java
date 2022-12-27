class Ellipse extends Circle_Like_Figure{

    private Point figure_point_2;
    private Segment radius_2;

    public Ellipse() {
        super();
        figure_point_2 = new Point();
        radius_2 = new Segment();
    }

    public Ellipse(Point center) {
        super(center);
        figure_point_2 = new Point();
        radius_2 = new Segment(this.center, figure_point_2);
    }

    public Ellipse(Point center, Point figure_point, Point figure_point_2) {
        super(center, figure_point);
        this.figure_point_2 = figure_point_2;
        radius_2 = new Segment(this.center, this.figure_point_2);
    }

    public void input() {
        Point center = new Point();
        Point figure_point = new Point();
        Point figure_point_2 = new Point();
        System.out.println("Введите координаты центра эллипса:");
        center.input();
        System.out.println("Введите координаты ближайшей к центру точки эллипса:");
        figure_point.input();
        System.out.println("Введите координаты дальней от центра точки эллипса:");
        figure_point_2.input();
        Segment radius = new Segment(center, figure_point);
        Segment radius_2 = new Segment(center, figure_point_2);
        this.center = center;
        this.figure_point = figure_point;
        this.figure_point_2 = figure_point_2;
        this.radius = radius;
        this.radius_2 = radius_2;
    }

    public void output() {
        System.out.println("Координаты центра эллипса: ");
        this.center.output();
        System.out.println("Координаты ближайшей к центру точки эллипса: ");
        this.figure_point.output();
        System.out.println("Координаты дальней от центра точки эллипса: ");
        this.figure_point_2.output();
        System.out.println("Длина меньшего радиуса равна " + this.radius.get_length());
        System.out.println("Длина большего радиуса равна " + this.radius_2.get_length());
        System.out.println("Длина эллипса равна " + this.figure_length());
        System.out.println("Площадь эллипса равна " + this.figure_area());
    }

    public double figure_length() {
        double len;
        len = Math.PI * (radius.get_length() + radius_2.get_length());
        return len;
    }

    public double figure_area() {
        double area;
        area = Math.PI * radius.get_length() * radius_2.get_length();
        return area;
    }
}
