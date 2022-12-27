abstract class Circle_Like_Figure implements Cloneable{
    protected Segment radius;
    protected Point center;
    protected Point figure_point;

    public Circle_Like_Figure() {
        center = new Point();
        figure_point = new Point();
        radius = new Segment();
    }

    public Circle_Like_Figure(Point center) {
        this.center = center;
        figure_point = new Point();
        radius = new Segment(this.center, figure_point);
    }

    public Circle_Like_Figure(Point center, Point figure_point) {
        this.center = center;
        this.figure_point = figure_point;
        radius = new Segment(this.center, this.figure_point);
    }

    public void set_center(Point i) {
        center = i;
        radius = new Segment(this.center, this.figure_point);
    }

    public void set_figure_point(Point j) {
        figure_point = j;
        radius = new Segment(this.center, this.figure_point);
    }

    public void set_radius(Segment r) {
        radius = r;
    }

    public Point get_center() {
        return center;
    }

    public Point get_figure_point() {
        return figure_point;
    }

    public Segment get_radius() {
        return radius;
    }

    public abstract double figure_length();

    public abstract double figure_area();
}
