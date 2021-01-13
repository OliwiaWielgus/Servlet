<%-- 
    Document   : strona
    Created on : 2020-12-28, 16:35:59
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <title>Login Page</title>
    </head>
    <body style="background-color:#e6f2ff;">
    <center><p class="fs-1 fw-bolder">Sign in</p></center>
    <center>
        <div>
            <form action="Serwlet">
                <div class="mb-3 mx-5">
                    <label for="login" class="form-label fs-4 fw-bold">Login</label>
                    <input type="text" name="username" placeholder="User name" class="form-control">
                </div>
                <div class="mb-3 mx-5">
                    <label for="password" class="form-label fs-4 fw-bold">Password</label>
                    <input type="password" name="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
<!--            <form action="Serwlet" />
            <table>
                <tr>
                    <td>User name</td>
                    <td><input type="text" name="username" placeholder="User name"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" placeholder="Password"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit" value="Submit"></td>
                </tr>
            </table>
            </form>-->
        </div>
    </center>
    </body>
</html>
