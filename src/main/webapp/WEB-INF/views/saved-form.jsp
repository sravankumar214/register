<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form modelAttribute="saved">
			<table style="border: solid;">
				<tr>
					<td>Id</td>
					<td>${saved.id}</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>${saved.name}</td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>${saved.gender}</td>
				</tr>
				<tr>
					<td>Courses</td>
					<td>${saved.course}</td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>