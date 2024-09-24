package web;

import dao.MusicaDao;
import models.Musica;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MusicaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final MusicaDao dao;

    public MusicaServlet() {
        super();
        this.dao = new MusicaDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher index = request.getRequestDispatcher("index.jsp");

        try {
            request.setAttribute("musicas", dao.getAllMusicas());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        index.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Musica musica = new Musica();
            musica.setNome(request.getParameter("nome"));
            musica.setGenero(request.getParameter("genero"));
            musica.setArtista(request.getParameter("artista"));

            dao.addMusica(musica);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        request.setAttribute("musicas", this.dao.getAllMusicas());
        dispatcher.forward(request, response);
    }
}
