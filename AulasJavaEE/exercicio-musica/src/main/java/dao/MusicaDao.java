package dao;

import db.DbConnect;
import models.Musica;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MusicaDao {

    Connection connection;

    public MusicaDao() {
        connection = DbConnect.getConnection();
    }

    public void addMusica(Musica musica) {
        try {
            PreparedStatement pst = connection.prepareStatement("INSERT INTO musica(nome, genero, artista) VALUES(?,?,?)");
            pst.setString(1, musica.getNome());
            pst.setString(2, musica.getGenero());
            pst.setString(3, musica.getArtista());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Musica> getAllMusicas() {
        List<Musica> musicas = new ArrayList<>();

        try {
            Statement pst = connection.createStatement();
            ResultSet rs = pst.executeQuery("SELECT * FROM musica");

            while (rs.next()) {
                Musica musica = new Musica(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("artista")
                );

                musicas.add(musica);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return musicas;
    }

    public Musica getMusicaById(int id) {
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM musica WHERE id = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return new Musica(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("artista")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void updateMusica(Musica musica) {
        try {
            PreparedStatement pst = this.connection.prepareStatement("UPDATE musica SET nome = ?, genero = ?, artista = ? WHERE id = ?");
            pst.setString(1, musica.getNome());
            pst.setString(2, musica.getGenero());
            pst.setString(3, musica.getArtista());
            pst.setInt(4, musica.getId());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMusica(int id) {
        try {
            PreparedStatement pst = this.connection.prepareStatement("DELETE FROM musica WHERE id = ?");
            pst.setInt(1, id);

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
