public class Car {
    public String color;
    public double engineSize;
    public long horsePow;
    public String make;

    public Car(){
        color = "black";
        engineSize = 7.5;
        horsePow = 1;
        make = "Jeep";
    }public Car(String make, String color, double engineSize, long horsePow){
        this.color = color;
        this.engineSize = engineSize;
        this.horsePow = horsePow;
        this.make = make;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setEngineSize(double engineSize){
        this.engineSize = engineSize;
    }
    public double getEngineSize(){
        return engineSize;
    }
    public void setHorsePow(long horsePow){
        this.horsePow = horsePow;
    }
    public long getHorsePow(){
        return horsePow;
    }
    public void setMake(String make){
        this.make = make;
    }


    public String getMake() {
        return make;
    }
    public String toString(){
        return "Your car is a:\n" +"make: "+ this.make + "\nColor:" + this.color + "\nEngine Size:" + this.engineSize
        + "\nHorse Power: " + this.horsePow;
    }
}
