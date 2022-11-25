<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo</title>
</head>
<body>
    
    <form:form method="post" modelAttribute="todo">
        <fieldset>
            <form:label path="description"></form:label>
            <form:input type="text" path="description" value="${todo.description}"></form:input>
            <form:errors path="description"></form:errors>
        </fieldset>
        <fieldset>
            <form:label path="targetDate"></form:label>
            <form:input type="date" path="targetDate" value="${todo.targetDate}"></form:input>
            <form:errors path="targetDate"></form:errors>
        </fieldset>
        <input type="submit" value="update" />
    </form:form>
</body>
</html>