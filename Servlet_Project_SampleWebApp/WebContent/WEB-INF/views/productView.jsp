<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
 <jsp:include page="_header.jsp"></jsp:include>
   <jsp:include page="_menu.jsp"></jsp:include>
   <h3>Product Page</h3>
   <p style="color: red;">${errorString}</p>
<form method="POST" action="${pageContext.request.contextPath}/productList">
     <table border="0">
       
      
         <tr>
              <td colspan ="2">
                 <input type="button" value="Add Product" />
               </td>
                <td colspan ="2">
                 <input type="button" value="List Product" />
               </td>
                <td colspan ="2">
                 <input type="button" value="Update Product" />
               </td>
                <td colspan ="2">
                 <input type="button" value="Delete Product" />
               </td>
           </tr>
       
           <tr>
              <td colspan ="5">
                 <input type="submit" value="Submit" />
                 <a href="${pageContext.request.contextPath}/">Cancel</a>
              </td>
           </tr>
        </table>
     </form>

</body>
</html>