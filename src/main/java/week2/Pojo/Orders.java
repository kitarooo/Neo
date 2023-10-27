package week2.Pojo;

import java.util.List;

public class Orders {
    private long orderId;
    private int carId;
    private int clientId;

    public Orders(long orderId, int carId, int clientId) {
        this.orderId = orderId;
        this.carId = carId;
        this.clientId = clientId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}