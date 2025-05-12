package WallAreaComputation;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println(wall);
        wall.setHeight(-1.5);
        System.out.println(wall);
    }
}
