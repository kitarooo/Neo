package week2.Dao;


import week2.Pojo.Cars;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    public void addCar(Connection connection, int carId, String carName,String carBrand, int carPrice) {
        String insertSQL = "INSERT INTO cars (car_id, car_name, car_brand, car_price) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(insertSQL);

            ps.setInt(1, carId);

            ps.setString(2, carName);
            ps.setString(3,carBrand);
            ps.setInt(4, carPrice);

            ps.executeUpdate();
            System.out.println("Car was added");
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public void updateCarById(Connection connection, int carId, String newName, String newBrand, int newPrice) {
        String updateSQL = "UPDATE cars SET car_name = ?, car_brand = ?, car_price = ? WHERE car_id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(updateSQL);

            ps.setString(1, newName);
            ps.setInt(2, newPrice);
            ps.setInt(3, carId);

            int rowsUpdate = ps.executeUpdate();

            if (rowsUpdate > 0) {
                System.out.println("Car's data with id: " + carId + " was updated");
            } else {
                System.out.println("Something went wrong(");
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public void deleteCarById(Connection connection, int carId) {
        String deleteSQL = "DELETE FROM cars WHERE car_id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(deleteSQL);
            ps.setInt(1, carId);

            ps.executeUpdate();
            System.out.println("Car with id: " + carId + " was deleted");
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public List<Cars> selectAllCars(Connection connection) {
        String checkAllCars = "SELECT * FROM cars";
        List<Cars> cars = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(checkAllCars);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                Cars car = new Cars();

                car.setCarId(result.getInt("car_id"));
                car.setName(result.getString("car_name"));
                car.setBrand(result.getString("car_brand"));
                car.setPrice(result.getInt("car_price"));

                cars.add(car);

                System.out.println("Car id: " + car.getCarId() + ", car name: " + car.getName() + ", car brand: " + car.getBrand() +", car price: " + car.getPrice());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cars;
    }
}