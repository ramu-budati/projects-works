<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>list-todo</title>
    <style>
        #todos {
          font-family: Arial, Helvetica, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }
        
        #todos td, #todos th {
          border: 1px solid #ddd;
          padding: 8px;
        }
        
        #todos tr:nth-child(even){background-color: #f2f2f2;}
        
        #todos tr:hover {background-color: #ddd;}
        
        #todos th {
          padding-top: 12px;
          padding-bottom: 12px;
          text-align: left;
          background-color: #04AA6D;
          color: white;
        }
        </style>
        <style>
            .button {
              background-color: #4CAF50; /* Green */
              border: none;
              color: white;
              padding: 10px 12px;
              text-align: center;
              text-decoration: none;
              display: inline-block;
              font-size: 16px;
              margin: 4px 2px;
              transition-duration: 0.4s;
              cursor: pointer;
            }

            .update {
              background-color: #4CAF50;
              color: white;
              border-radius: 10px;
            }
            
            .update:hover{
              background-color: white; 
              color: black; 
              border: 2px solid #4CAF50;
              border-radius: 10px;
            }
            
            
            
            
            .delete {
              background-color: #f44336;
              color: white;
              border-radius: 10px;
            }
            .delete:hover {
              background-color: white; 
              color: black; 
              border: 2px solid #f44336;
              border-radius: 10px;
            }
            
            
            </style>
</head>
<body>
    
    <table id="todos">
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Completed</th>
        </tr>
        <c:forEach  var="todo" items="${todos}">
            <tr>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.completed}</td>
                <td><a class="button update" href="/update-todo?id=${todo.id}">update</a></td>
               <td><a class="button delete" href="/delete-todo?id=${todo.id}">delete</a></td>
            </tr>

        </c:forEach>
    </table>
    <a class="button update" href="/add-todo">Add</a>
</body>
</html>