package web.model;

public class Car {

    private int number;

    private String model;

    private int series;

    public Car() {
    }

    public Car(int number, String model, int series) {
        this.number = number;
        this.model = model;
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
