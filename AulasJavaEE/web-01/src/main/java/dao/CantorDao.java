package dao;

import db.DbConnect;
import model.Cantor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CantorDao {

    Connection connection;

    public CantorDao() throws ClassNotFoundException, SQLException {
        connection = DbConnect.getConnection();
    }

    public void addCantor(Cantor cantor) throws SQLException {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cantor(nome, estiloMusical, qtdAlbuns) VALUES(?, ?, ?)");

            preparedStatement.setString(1, cantor.getNome());
            preparedStatement.setString(2, cantor.getEstiloMusical());
            preparedStatement.setString(3, cantor.getQtdAlbuns());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cantor> getAllCantores() throws SQLException {
        List<Cantor> cantores = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM cantor");

            while (resultSet.next()) {
                Cantor cantor = new Cantor(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("estiloMusical"),
                        resultSet.getString("qtdAlbuns")
                );

                cantores.add(cantor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cantores;
    }
}
