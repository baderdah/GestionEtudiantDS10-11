<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>afficher</title>
</head>
<body>
    <Table>
        <thead>
            <tr>
                <td>Nom</td>
                <td>Prenom</td>
                <td>Age</td>
                <td>Niveau</td>
                <td>Tel</td>
                <td>Mail</td>
            </tr>
        </thead>
        <tbody>
        	<c:if test="${not empty etudiantsMap}">  
	        	<c:forEach var="etudiantMap" items="${etudiantsMap}">
		            <tr>
		                <td> ${etudiantMap.value.nom} </td>
		                <td> ${etudiantMap.value.prenom} </td>
		                <td> ${etudiantMap.value.age} </td>
		                <td> ${etudiantMap.value.niveauEtude} </td>
		                <td> ${etudiantMap.value.tel} </td>
		                <td> ${etudiantMap.value.mail} </td>
		            </tr>
		          </c:forEach>
         	</c:if>
        </tbody>
    </Table>
</body>
</html>