<%@ page import="java.util.List" %>
<%@ page import="br.com.murillo.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<c:url value="/removeEmpresa" var="removeEmpresaLink"/>
<c:url value="/mostraEmpresa" var="mostraEmpresaLink"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty empresa}">
    nova empresa criada: ${empresa} id: ${numero}
</c:if>
<c:if test="${empty empresa}">

    Nenhuma empresa cadastrada.

</c:if>
Empresas cadastradas:
<ul>

    <c:forEach items="${empresas}" var="empresa">

        <li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd//MM//yyyy"/>

            <a href="${removeEmpresaLink}?id=${empresa.id}">Remover</a>
            <a href="${mostraEmpresaLink}?id=${empresa.id}">Editar dados</a>
        </li>
    </c:forEach>
</ul>


</body>
</html>
