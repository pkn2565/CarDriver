public class CarDriver {
    public static void main(String[] args) {
        Car his = new Car();
        his.setColor("red");
        his.setEngineSize(7);
        his.setHorsePow(1);
        his.setMake("Honda");
        System.out.println(his.toString());

        Car hers = new Car("Toyota", "red", 3.2, 4);
        System.out.println(hers.toString());

        Car mine = new Car("Volks", "black", 3.5, 400);
    }
}
