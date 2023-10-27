package week2.Pojo;

public class Cars {
    private int carId;

    private String brand;
    private String name;
    private int price;

    public Cars() {
    }

    public Cars(String name, String brand , int price, int carId) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.carId = carId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}