<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Snippet</title>
</head>
<body>
    
    <form:form method="post" modelAttribute="snippet">

        <div>
            <form:label path="question"></form:label>
            <form:textarea path="question" rows="3" cols="90" />
            <form:errors path="question"></form:errors>
        </div>

        <div>
            <form:label path="javaCode"></form:label>
            <form:textarea path="javaCode" rows="15" cols="70" />
            <form:errors path="javaCode"></form:errors>
        </div>
        <div>
            <form:label path="explanation"></form:label>
            <form:textarea path="explanation" rows="3" cols="90" />
            <form:errors path="explanation"></form:errors>
        </div>
        <input type="submit" value="Add" />
    </form:form>
</body>
</html>