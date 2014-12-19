<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Max number app</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"></link>
</head>
<body>
	<div class="container">
		<h2>Max number</h2>
		<form:form method="POST" action="/task/result" commandName="number">

			<div class="form-group">
				<form:input path="number" class="form-control"
					placeholder="max number" />
			</div>
			<input class="btn btn-primary" type="submit" value="Submit" />
			<form:errors path='number'>
				<div class="alert alert-danger" role="alert">
					<span class="glyphicon glyphicon-exclamation-sign"
						aria-hidden="true"></span> <span class="sr-only">Error:</span>
					Woops! Something went wrong!
				</div>
			</form:errors>
		</form:form>
	</div>
</body>
</html>