package week2.Dao;

import week2.Pojo.Clients;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientsDAO {
    public void addClient(Connection connection, int clientId, String clientName) {
        String insertSQL = "INSERT INTO clients (client_id, client_name) VALUES (?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(insertSQL);

            ps.setInt(1, clientId);
            ps.setString(2, clientName);

            ps.executeUpdate();
            System.out.println("Client was added");
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public void updateClientById(Connection connection, int clientId, String newClientName) {
        String updateSQL = "UPDATE clients SET client_name = ? WHERE client_id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(updateSQL);

            ps.setString(1, newClientName);
            ps.setInt(2, clientId);

            int rowsUpdate = ps.executeUpdate();

            if (rowsUpdate > 0) {
                System.out.println("Client's data with id: " + clientId + " was updated");
            } else {
                System.out.println("Something went wrong(");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientById(Connection connection, int clientId) {
        String deleteSQL = "DELETE FROM clients WHERE client_id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(deleteSQL);
            ps.setInt(1, clientId);
            ps.executeUpdate();

            System.out.println("Client with id: " + clientId + " was deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Clients> selectAllClient(Connection connection) {
        String checkSQL = "SELECT * FROM clients";
        List<Clients> clients = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(checkSQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Clients client = new Clients();
                client.setClientId(resultSet.getInt("client_id"));
                client.setName(resultSet.getString("client_name"));

                clients.add(client);

                System.out.println("Client id: " + client.getClientId() + ", name: " + client.getName());
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }

        return clients;
    }
}