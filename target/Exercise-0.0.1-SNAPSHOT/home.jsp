<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title><%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<link rel="stylesheet" type="text/css" href="css/OM.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jQuery.Validate/1.6/jQuery.Validate.min.js"></script>
<script type="text/javascript" src="./js/assignment.js"></script>
<body>
	
    <!--Code Starts Here-->
    <div class="container">
    	<div class="orangeText boldText padding10">Home Page: Product Management</div>                
        <div class="headerBarblock">
        	<div class="floatLeft boldText">&minus;</div>
            <div class="floatLeft paddingLeft10">Product Inventory</div>
            <div class="clear"></div>
        </div>
        <form action="" method="post"
        accept-charset="utf-8"
         name="productRegistration" id="productRegistration" >
    	<!-- Below class to show LEFT and Right border -->
        <div class="headercontentblock1">                      
            <div class="container1"> 
            	<div class="floatLeft scanner"></div>
                <div class="floatLeft selectWidth85 marginLeft20">
                	<div class="boldText">Scan an item or enter information below</div>
                    <div class="spacer2"></div>
                    <div class="floatLeft selectWidth15">
                        <input name="quantity" id="quantity" type="text" class="inputboxBg selectWidth45" size="15" maxlength="15" placeholder="">
                        <div class="padding10">*Qty</div>
                    </div>
                    <div class="floatLeft selectWidth25">
                        <input name="itemId"  id="itemId" type="text" class="inputboxBg selectWidth80" size="15" maxlength="15" placeholder="">
                        <div class="padding10">*Item ID, UPC, SIM, or IMEI</div>
                    </div>
                     <div class="floatLeft selectWidth25">
                        <!-- <input name="itemName"  id="itemName" type="text" class="inputboxBg selectWidth80" size="15" maxlength="15" placeholder="">
                         -->
                         <label class="custom-select selectWidth90">
                            <select onchange="changeProductName(this.value)" name="itemName" id="itemName">
                                <option selected value=""> Please select Item</option>
                                <option value="Shoe">Shoe</option>
                                <option value="Phones">Phones </option>
                                <option value="Clothes">Clothes</option>
                            </select>
                        </label>
                         <div class="padding10">*Item Name</div>
                    </div>
                    <div class="floatLeft selectWidth25">
                         <label class="custom-select selectWidth90">
                            <select name="salesRepId" id="salesRepId">
                                <option selected value="No Related Products"> Please select </option>
                               
                            </select>
                        </label>
                        <div class="padding10">Related Products</div>
                    </div>
                    <div class="floatLeft selectWidth15">
                        <input type="button" value=" Quick Add " class="greenButton"  onclick="validateForm()">
                    </div> 
                    
                               
                    <div class="clear"></div>
                    <div class="spacer2"></div>
                     <div class="redText" id="error">
                   
                    </div>   
                </div>
                <div class="clear"></div>                                            	                
            </div>
            <div class="sharpblueBar">Added Items</div>
           
            <table id="instructionText" border=1>
            <tr>
            <th>Quantity</th>
            <th>Item Id</th>
            <th>Item Name</th>
            <th>Related Products</th>
            <th>Delete </th>
            <th>Update</th>
            </tr>
            </table>
              <div class="instructionText" >
            	</div>
                <div class="spacer2"></div>
            </div>
          
            <!-- <div class="container1">
            	<div class="blueText boldText">These items will be tied to Sales Rep 
            	<div id="salesId">Sales Rep #1</div></div>
            	
                <div>To change the rep, select from dropdown.</div>
                <div class="spacer2"></div>
                <div class="boldText">
                	AT&T Any City, USA<br>
                	(555) 555-5555
                </div>
                <div class="spacer2"></div>
                <div class="floatLeft selectWidth15">
                    <input type="submit" value=" Update Stock " class="blueButton">
                </div>                
                <div class="clear"></div>
            </div> -->
            
        </div>
   </form>
   <script>
</script>
        <!-- End to show LEFT and Right border -->
        <!-- Below class to show Bottom border with LEFT and RIGHT rounded corners. -->
    	<div class="headercontentblock0"></div>
    	<!-- End to show Bottom border with LEFT and RIGHT rounded corners. -->
    	<div class="spacer2"></div>        
    </div> 
    <!--Code Ends Here-->

</body>
</html>