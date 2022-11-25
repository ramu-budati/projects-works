<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <!-- <link href="css/welcome.css" rel="stylesheet"> -->
    <style>
        .navbar{
            display: flex;
            gap: 3rem;
            box-shadow: 0 0 8px 0px;
            padding: 1rem;
            border-radius: 1rem;
            margin-left: 2rem;
            margin-right: 2rem;
            padding-left: 2rem;
            padding-right: 2rem;

        }
        .navbar  a{
            text-decoration: none;
        }
        .navbar  a:hover{
            color: rgb(52, 182, 91);
        }
        .logout{
            margin-left: auto;
        }
    </style>
</head>
<body>
    <p>Helo</p>
    <nav class="navbar">
        <a href="/" class="home" >home</a>
        <a href="/list-todos" class="todo">todo</a>
        <a href="/list-snippets" class="snippet">snippet</a>
        <a href="#" class="logout">logout</a>
    </nav>
</body>
</html>