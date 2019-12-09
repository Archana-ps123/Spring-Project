<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-in</title>

 <style>
        .button {

            background-color: #4CAF50;
            color: white;
            padding: 2px 2px;
            margin: 2px 0;
            border: none;
            width: 125px;
            height: 30px;
            opacity: 0.9;
        }
        input{
            height: 22px;
            width: 250px;
        }

        label {
            color: darkgray;
        }

        form {
            background-color: aliceblue;
        }

    </style>

</head>
<body>
 <form action=" " method="get">
        <center>
            <table cellpadding ="9">
            
                <h1>Login Form</h1>
              
                <tr>
                    <td>
                        <label>Username:</label>
                    </td>
                    <td>
                        <input type="text" name="username" required="required" placeholder="Enter Username"><br>
                    </td>
                </tr>

                <tr>
                    <td>
                        <label>Password:</label>
                    </td>
                    <td> <input type="password" name="password" required="required" placeholder="Enter Password"><br>
                    </td>
                </tr>

                <tr>
                    <td>
                        <label></label>
                    </td>
                    <td>
                        <button type="submit" class="button">Login</button>
                        <a href="registration.html">New Member</a>
                        <br>
                    </td>
                </tr>
              
            </table>
           
        </center>
    </form>

</body>
</html>