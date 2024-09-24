package web;

import dao.MusicaDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MusicaDeleteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final MusicaDao dao;

    public MusicaDeleteServlet() {
        super();
        this.dao = new MusicaDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.dao.deleteMusica(Integer.parseInt(request.getParameter("id")));

        response.sendRedirect("/musicas");
    }
}
