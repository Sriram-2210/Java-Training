public class App{

    public static void main(String[] args) {

        Cal cal = new Cal();
        cal.setPoly(new Square());
        Polygon p1 = cal.getPoly();
        p1.info();
        
    }
}