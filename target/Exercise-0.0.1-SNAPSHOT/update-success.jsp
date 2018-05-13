<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Success</title><%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<link rel="stylesheet" type="text/css" href="css/OM.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jQuery.Validate/1.6/jQuery.Validate.min.js"></script>
<script type="text/javascript" src="./js/assignment.js"></script>
<body>
	<!-- Code Starts Here-->
	<div class="container">
		<div class="headerBarblock padding10">
        	Product Inventory
	  		<div class="floatRight closeX" onclick="window.close();"></div>
            <div class="clear"></div>
      	</div>
		<!-- Below class to show LEFT and Right border -->
        <div class="popupcontentBlock">
            <div>
                <div class="container1">
                    <div class="available paddingTop5 floatLeft"></div>
                    <div class="boldText floatLeft selectWidth80 marginLeft20 blueText">Your Item <%=request.getParameter("itemId")%> has been successfully updated</div>                           
                    <div class="clear"></div>
                </div>            
            </div>
            <div class="container1">
                <div class="floatRight">
                    <input type="submit" value=" Close " class="blueButton" onclick="window.close();">
                </div>
                <div class="clear"></div>
            </div>            
        </div>    
		<!-- End to show LEFT and Right border -->
		<!-- Below class to show Bottom border with LEFT and RIGHT rounded corners. -->
		<div class="popupcontentBlockbottom"></div>
		<!-- End to show Bottom border with LEFT and RIGHT rounded corners. --><!-- Code Ends Here-->
	</div>
    <!-- Code Ends Here-->
</body>
</html>
