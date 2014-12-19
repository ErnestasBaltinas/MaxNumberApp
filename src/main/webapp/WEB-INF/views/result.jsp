<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Max number app</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"></link>
</head>
<body>
	<div class="container">
		<h2>Max number result list</h2>

		<form:form method="GET" action="/task/home">
			<input type="submit" value="Back" class="btn btn-primary">
		</form:form>

		<c:if test="${not empty lists}">

			<ul class="list-group">
				<c:forEach var="listValue" items="${lists}">
					<li class="list-group-item">${listValue}</li>
				</c:forEach>
			</ul>

		</c:if>
	</div>

</body>
</html>