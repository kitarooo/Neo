package week2;

import week2.Dao.CarDAO;
import week2.Dao.ClientsDAO;
import week2.MysqlConnector.Connector;
import week2.Dao.ClientsDAO;
import week2.Dao.CarDAO;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = Connector.connect();

        //CRUD Check clients
        ClientsDAO clientsDAO = new ClientsDAO();

        //add new client
        clientsDAO.addClient(connection, 1, "Sultan");

        //update client_name
        clientsDAO.updateClientById(connection,1,"NeoSultan");

        //show clients
        clientsDAO.selectAllClient(connection);

        //delete client by id
        //clientsDAO.deleteClientById(connection,1);


        //CRUD check cars
        CarDAO carDAO = new CarDAO();

        //add new car
        carDAO.addCar(connection,1,"X5","BMW", 500);

        //update product by id
        carDAO.updateCarById(connection,1,"911", "Porsche",550);

        //check all
        carDAO.selectAllCars(connection);

        //delete prodct by id
        //carDAO.deleteCarById(connection,1);
    }
}