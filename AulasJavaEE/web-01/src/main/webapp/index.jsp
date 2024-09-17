<%@ page import="java.util.ArrayList"%>




<html>
<body>
<%@ include file="header.jsp"  %>
<h2>Hello World!</h2>
<ul>
    <c:forEach items="${cantores}" var="cantor">
        <p><c:out value="${cantor.nome}"/> </p>
        <p><c:out value="${cantor.estiloMusical}"/></p>
        <p><c:out value="${cantor.qtdAlbuns}"/></p>
    </c:forEach>
</ul>

</body>
</html>
