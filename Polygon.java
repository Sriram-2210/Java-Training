

public interface Polygon{

    public abstract void info();

}

class Square implements Polygon{
    @Override
    public void info() {
        System.out.println("All Sides are same");
    }
}

class Rectangle implements Polygon{
    @Override
    public void info() {
        System.out.println("Opposite sides are same");
    }
}