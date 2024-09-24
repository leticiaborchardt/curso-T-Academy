<%@ page import="models.Musica" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Músicas</title>
</head>

<body class="mx-64 my-12">
<header class="mb-6">
    <h1 class="text-3xl font-bold">
        Músicas 🎸
    </h1>
</header>
<main>
    <section class="flex flex-col items-center">
        <h2 class="mb-4 text-xl font-medium">Cadastrar Música</h2>
        <form class="flex items-center gap-4" action="musicas" method="post">
            <input type="text" placeholder="Nome" name="nome"
                   class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline w-full"
                   required/>
            <input type="text" placeholder="Gênero" name="genero"
                   class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline w-full"
                   required/>
            <input type="text" placeholder="Artista" name="artista"
                   class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline w-full"
                   required/>
            <input type="submit" value="Cadastrar"
                   class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded self-center cursor-pointer"/>
        </form>
    </section>
    <hr class="my-6">
    <section>
        <h2 class="mb-8 text-xl font-medium">Músicas Cadastradas</h2>
        <%
            List<Musica> musicas = (List<Musica>) request.getAttribute("musicas");

            if (!musicas.isEmpty()) {
                for (Musica musica : musicas) {
                    out.println("<div class='flex items-center justify-between'>");
                    out.println("<div><b>Nome: </b>" + musica.getNome() + "</div>");
                    out.println("<div><b>Gênero: </b>" + musica.getGenero() + "</div>");
                    out.println("<div><b>Artista: </b>" + musica.getArtista() + "</div>");
                    out.println("<div class='flex items-center gap-3'>");
                    out.println("<a href='updateMusica?id=" + musica.getId() + "' class='bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded self-center cursor-pointer'>Editar</a>");
                    out.println("<form class='mb-0 flex justify-end' action='deleteMusica' method='post'>");
                    out.println("<input type='hidden' name='id' value='" + musica.getId() + "'>");
                    out.println("<input type='submit' value='Remover' class='bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded self-center cursor-pointer'>");
                    out.println("</form>");
                    out.println("</div></div><hr class='my-4'>");
                }
            } else {
                out.println("Nenhuma música encontrada.");
            }
        %>
    </section>
</main>
</body>
</html>
