package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusicaDao;
import models.Musica;

import java.io.IOException;

public class MusicaUpdateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final MusicaDao dao;

    public MusicaUpdateServlet() {
        super();
        this.dao = new MusicaDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("update-musica.jsp");

        try {
            request.setAttribute("musica", dao.getMusicaById(Integer.parseInt(request.getParameter("id"))));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Musica musica = new Musica();

        try {
            musica.setId(Integer.parseInt(request.getParameter("id")));
            musica.setNome(request.getParameter("nome"));
            musica.setGenero(request.getParameter("genero"));
            musica.setArtista(request.getParameter("artista"));

            this.dao.updateMusica(musica);

            response.sendRedirect("/musicas");
        } catch (Exception e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/update-musica.jsp");

            request.setAttribute("musica", musica);
            dispatcher.forward(request, response);
        }
    }
}