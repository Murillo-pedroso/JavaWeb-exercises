<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nova Empresa</title>
</head>
<body>
<c:if test="${not empty empresa}">
    nova empresa criada: ${empresa} id: ${numero}
</c:if>
<c:if test="${empty empresa}">

    Nenhuma empresa cadastrada.

</c:if>
</body>
</html>