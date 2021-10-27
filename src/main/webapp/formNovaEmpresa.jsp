<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="novaEmpresaLink"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form action = "${novaEmpresaLink}" method = "post">
        Nome: <input type = text name = "nome">
        Data Abertura: <input type = text name = "data">
        <input type="submit">
    </form>
</body>
</html>