<%@ taglib prefix="jsp-core" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    input {
        display: block;
    }

    form {
        border: 1px solid black;
        margin: 200px auto;
        width: 300px;
        height: 300px;
    }
</style>
<form action="<jsp-core:url value="/veiculo"/>" method="post">
    Modelo:<input type="text" name="modelo">
    Versao:<input type="text" name="versao">
    Marca:<input type="text" name="marca">
    Ano de Fabricacao:<input type="date" name="anoFabricacao">
    placa: <input type="text" name="placa">
    <input type="submit" value="Registrar">
</form>
