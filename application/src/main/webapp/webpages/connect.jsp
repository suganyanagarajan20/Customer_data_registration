<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
   <h3> CUSTOMER REGISTRATION FORM </h3>
   <form action="save" method="post">
   
   <label for ="id"> Customer ID </label><br>
   <input type = "number" id = "id" name = "id"><br>
     
   <label for= "first_name"> First name</label> <br>
   <input type = "text" id="first_name" name="first_name"><br>
   
   <label for = "last_name"> Last name</label> <br>
   <input type ="text" id="last_name" name="last_name"> <br>
   
   <p> Gender <br>
   <label for ="male">Male</label>
   <input type="radio" id ="male" name="gender" value="Male"> <br>
   
   <label for ="female">Female</label>
   <input type="radio" id ="female" name="gender" value="Female"> <br><br>
   
   <label for="email">Email ID</label> <br>
   <input type="text" id="email" name="email"> <br><br>
   
   <input type = "submit" value="Submit"><br><br>
   </form>
</body>
</html>