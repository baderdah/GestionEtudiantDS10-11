<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h1>Bienvenue a l'ensa de safi</h1>

    <form action="acceuilControler" method="POST">
        <label for="">Choix de l'operation</label>
        <select name="operation" >
            <option value="afficher">afficher</option>
            <option value="ajouter">ajouter</option>
        </select>
        <input type="submit" value="Envoyer">
    </form>

</body>
</html>