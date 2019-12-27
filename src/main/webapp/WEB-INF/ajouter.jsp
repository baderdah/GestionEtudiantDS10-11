<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajouter</title>
</head>
<body>
	<h4>Ajouter un etudiant</h4>
    <form action="ajouter" method="POST">
        <table>
            <tr>
                <td><label>Nom :</label></td>
                <td><input type="text" name="nom" id=""></td>
            </tr>
            <tr>
                <td><label>Prenom :</label></td>
                <td><input type="text" name="prenom" id=""> </td>
            </tr>
            <tr>
                <td><label>Age :</label></td>
                <td><input type="text" name="age" id=""> </td>
            </tr>
            <tr>
                <td><label>Tel :</label></td>
                <td><input type="text" name="tel" id=""> </td>
            </tr>
            <tr>
                <td><label>Mail :</label></td>
                <td><input type="text" name="mail" id=""> </td>
            </tr>
            <tr>
                <td><label>Niveay d'etude</label></td>
                <td>
                    <select name = "niveau">
                        <option value="1">premiere</option>
                        <option value="2">deuxieme</option>
                        <option value="3">troisieme</option>
                        <option value="4">quatrieme</option>
                        <option value="5">cinquieme</option>
                    </select>
				</td>
            </tr>
            <tr>
                <td><input type="submit"> </td>
                <td><input type="reset"> </td>
            </tr>
        </table>
        <c:out value="${ operationResultMessage }"></c:out>
    </form>
</body>
</html>