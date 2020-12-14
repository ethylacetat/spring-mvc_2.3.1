package web.model;

public class Car {

    private String model;
    private int serial;
    private int color;

    public Car() {
        // NO-OP
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", serial=").append(serial);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    public Car(String model, int serial, int color) {
        this.model = model;
        this.serial = serial;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
