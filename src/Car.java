public class Car extends Vehicle{
    private int numberOfWheels ;
    private String model;
    private boolean isManual;
    private boolean isElectric;

    public Car(String name, int numberOfWheels, String model, boolean isManual, boolean isElectric) {
        super(name);
        this.numberOfWheels = numberOfWheels;
        this.model = model;
        this.isManual = isManual;
        this.isElectric = isElectric;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public boolean isManual() {
        return isManual;
    }

    public boolean isElectric() {
        return isElectric;
    }
}
