<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Register page</title>
 <style>
        .button {
            background-color: #4CAF50;
            color: white;
            padding: 2px 2px;
            margin: 2px 0;
            border: none;
            width: 70px;
            opacity: 0.9;
        }
        form{
            background-color:aliceblue;
        }

    </style>

</head>
<body>

   
    
    <form action="/Project-login/RegisterServlet" method="post">
        <center>
            <table >
                <h1>Registration Form</h1>
               <!-- start of nameField-->
                <tr>
                    <td>
                        <label>First Name:</label>
                    </td>
                    <td>
                        <input type="text" name="firstname" required="required"><br>
                    </td>
                </tr>
                <!--End of nameField-->
                
                <tr>
                    <td>
                        <label>Last Name:</label>
                    </td>
                    <td> <input type="text" name="lastname" required="required"><br>
                    </td>
                </tr>
                <!--End of lastNameField-->
                <tr>
                    <td>
                        <label>Username:</label>
                    </td>
                    <td> <input type="text" name="username" required="required"><br>
                    </td>
                </tr>
                <!--End of userNameField-->
                <tr>
                    <td>
                        <label>Password:</label>
                    </td>
                    <td> <input type="password" name="password" required="required"><br>
                    </td>
                </tr>
              
                <tr>
                    <td>
                        <label>Email:</label>
                    </td>
                    <td> <input type="email" name="email" required="required"><br>
                    </td>
                </tr>
                <!--End of emailid-->
                <tr>
                    <td>
                        <label>Mobile No:</label>
                    </td>
                    <td> <input type="tel" name="mobile" required="required"><br>
                    </td>
                </tr>
               
                <tr>
                    <td>
                        <label></label>
                    </td>
                    <td>
                        <label>City:</label>
                        <select name="city">
                            <option value="Thrissur">Thrissur</option>
                            <option value="kottayam">Kottayam</option>
                            <option value="Kollam">Kollam</option>
                            <option value="Kollam">Kochi</option>
                        </select>
                        <br>
                    </td>
                </tr>
                <!--ending drop down menu-->
                <!--starting  button and reference-->
                <tr>
                    <td>
                        <label></label>
                    </td>
                    <td>
                        <button type="submit" class="button">Register</button>
                        <a href="login.html">Back to home</a>
                        <br>
                    </td>
                </tr>
                <!--end of button and reference-->
            </table>
            <!--end of table-->
        </center>
    </form>
  



</body>
</html>