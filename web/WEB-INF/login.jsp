<%-- 
    Document   : login
    Created on : 30-Sep-2022, 3:30:30 PM
    Author     : Timle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
              rel="stylesheet" 
              integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" 
              crossorigin="anonymous">
    </head>
    <body>
        
        
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <h1 class="my-5">Login</h1>
                
                    <form action="login" method="post">

                        <div class="form-floating mb-3">
                            <input type="text" class="form-control" id="username" name="username">
                            <label for="floatingInput">Username</label>
                        </div>
                        <div class="form-floating">
                            <input type="password" class="form-control" id="password" id="password">
                            <label for="password">Password</label>
                        </div>
                
                        <button type="submit" class="btn btn-primary mt-3">Submit</button>
                    </form>
                    
                    <p>${message}</p>
                    
                </div>
            </div>
            
        </div>
        
    </body>
</html>
