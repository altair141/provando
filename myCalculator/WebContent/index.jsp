<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mi Calculadora</title>
</head>
<body>
	<h3>Calculadora</h3>

	<form id="formCalculadora" action="operarValores" method="get" onsubmit="borrar()">
		<table>
		<tr>
			<td>Valor de A:</td>
			<td>
				<input type="text" name="valorA" id="IDvalorA" style="width: 250px">
			</td>
		</tr>
		<tr>
			<td>Valor de B:</td>
			<td>
				<input type="text" name="valorB" id="IDvalorB" style="width: 250px">
			</td>
		</tr>
		<tr>
			<td>Operacion</td>
			<td>
				<select id="IDoperacion" style="width: 250px" name="operacion">
					<option value="S">Sumar</option>
					<option value="R">Restar</option>
					<option value="M">Multiplicar</option>
					<option value="D">Dividir</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				<br/>
				<input type="submit" value="Operar">
			</td>
		</tr>
		</table>
	</form>
</body>
</html>