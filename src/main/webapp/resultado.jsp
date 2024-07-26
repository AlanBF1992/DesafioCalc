<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
	<jsp:include page="./assets/html/head.jsp"></jsp:include>
	<link rel="stylesheet" type="text/css" href="./assets/css/styles.css"/>
</head>
<body class="d-flex align-items-center justify-content-center">

<main>
	<h1 class="text-white">Respuesta</h1>
	
	<p>
		<c:out value="${respuesta}"></c:out>
	</p>
</main>


</body>
</html>