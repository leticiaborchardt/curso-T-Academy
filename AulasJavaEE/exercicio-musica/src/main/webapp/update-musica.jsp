<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="models.Musica" %>

<html>
<head>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Atualizar Música</title>
</head>

<body class="mx-64 my-12">
<header class="mb-6">
    <h1 class="text-3xl font-bold">
        Músicas 🎸
    </h1>
</header>
<main>
    <section class="flex flex-col items-center">
        <h2 class="mb-4 text-xl font-medium">Atualizar Música</h2>
        <% Musica musica = (Musica) request.getAttribute("musica"); %>
        <form class="flex flex-col gap-4 w-64" action="updateMusica" method="post">
            <input type="hidden" id="id" name="id" value="<%= musica.getId() %>"/>
            <input type="text" placeholder="Nome" id="nome" name="nome"
                   class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline w-full"
                   value="<%= musica.getNome() %>" required/>
            <input type="text" placeholder="Gênero" id="genero" name="genero"
                   class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline w-full"
                   value="<%= musica.getGenero() %>" required/>
            <input type="text" placeholder="Artista" id="artista" name="artista"
                   class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline w-full"
                   value="<%= musica.getArtista() %>" required/>
            <input type="submit" value="Salvar"
                   class="cursor-pointer bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded self-center mt-4"/>
        </form>
    </section>
</main>
</body>
</html>
