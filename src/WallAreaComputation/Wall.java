package WallAreaComputation;

public class Wall {
    private double width, height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;

        if (this.width < 0)
            this.width = 0;

        if (this.height < 0)
            this.height = 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            width = 0;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            height = 0;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                '}';
    }
}
