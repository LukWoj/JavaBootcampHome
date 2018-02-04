public class Car {
    private String mark;
    private String model;
    private double accelerationTime;
    private double power;

    public double getAccelerationTime() {
        return accelerationTime;
    }


    public Car(String mark, String model, double accelerationTime, double power) {
        this.mark = mark;
        this.model = model;
        this.accelerationTime = accelerationTime;
        this.power = power;
    }

    public Car(){

    }

    public String getAutoDescription() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", accelerationTime=" + accelerationTime +
                ", power=" + power +
                '}';
    }
}
