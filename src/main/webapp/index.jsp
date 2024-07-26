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
	<h1 class="text-white">Calculadora</h1>
	
	<form method="post" action="resultado">
		
		<input type="text" class="form-control mb-3" id="numero1" name="numero1" aria-describedby="number1" placeholder="Número 1" required>
		<input type="text" class="form-control mb-3" id="numero2" name="numero2" aria-describedby="number2" placeholder="Número 2" required>
		<select class="form-select mb-3" id="operacion" name="operacion" required>
			<option value="Suma">Suma</option>
			<option value="Resta">Resta</option>
			<option value="Multiplicacion">Multiplicación</option>
			<option value="Division">División</option>
			<option value="Ordenar">Ordenar el número</option>
			<option value="Paridad">¿Cuál es par e impar?</option>
		</select>		
				
			
		<button type="submit" class="btn btn-primary w-100">Calcular</button>
	</form>
</main>


</body>
</html>