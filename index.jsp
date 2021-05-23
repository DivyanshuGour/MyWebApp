<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Intro Page</title>
    </head>
    <body>
        <center style="padding-top: 170px">
              <h1 style="background-color: white;">Hello Divyanshu!</h1>
              <form style="align-items: flex-start" action="WebAppServlet" method="Post">
                  <label>Email : </label>
                  <input type="email" name="email" placeholder="email"><br><br>
                  <label>Password : </label>
                  <input type="password" name="pswd" placeholder="password"><br><br>
                  <input type="submit" value="Login">
              </form>
        </center>
    </body>
</html>
