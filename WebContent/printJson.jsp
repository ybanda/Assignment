<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title><%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<link rel="stylesheet" type="text/css" href="css/OM.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jQuery.Validate/1.6/jQuery.Validate.min.js"></script>
<script type="text/javascript" src="./js/assignment.js"></script>
<body >
	
    <!--Code Starts Here-->
    <div class="container">
    	<%=request.getParameter("json")%> 
    </div> 
    <!--Code Ends Here-->

</body>
</html>