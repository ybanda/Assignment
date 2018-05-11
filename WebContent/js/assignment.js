

function changeProductName(val){
	console.log('changeProductName='+val);
	var shoeRelatd = ['lace','shoe polish', 'Brush','shinner'];
	var phoneRelated =['charger','case','screen Guard'];
	var clotherRelated =['tie','shirt','trouser'];
	var finalArray=[];
	switch(val){
	case 'Shoe':
		finalArray=shoeRelatd;
		break;
	case 'Phones':
		finalArray=phoneRelated;
		break;
	case 'Clothes':
		finalArray=clotherRelated;
		break;
	
		
		
	}
	var option = '';
	for (var i=0;i<finalArray.length;i++){
		   option += '<option value="'+ finalArray[i] + '">' + finalArray[i] + '</option>';
		}
	console.log('Option value='+val+' Appeneded Value ='+option);
		$('#salesRepId').append(option);
}

//inputboxerror

$(document).ready(function(){
	//validateForm();

});
function validateForm(){
	console.log("Document is Loaded :: validateForm");
	var returnValue=true;
	var errorStr="";
	var quantity = $('#quantity').val();
	var itemId = $('#itemId').val();
	var itemName = $('#itemName').val();
	var salesRepId = $('#salesRepId').val();
	var error =$('#error');
	console.log('Quantity = '+quantity+' Item Id='+itemId+", Item Name="+itemName+", Sales Rep Id="+salesRepId);

	if(!quantity.length){
		console.log('qty is required');
		errorStr+='Quantity is required <br>';
		//error.text('');
		returnValue=false;
	}
	else{
		if(!$.isNumeric(quantity)){
			errorStr+='Quantity must be Numeric <br>';
			returnValue=false;
		}
	}
	if(!itemId.length){
		errorStr+='ItemId is required <br>';
		console.log('Item Id is required');
		returnValue=false;
	}
	if(!itemName.length){
		errorStr+='Item Name is required <br>';
		console.log('Item Name is required');
		returnValue=false;
	}
	alert('ReturnVal'+returnValue+"--"+(returnValue==true));
	if(returnValue==true)
		populateTheGrid(quantity,itemId,itemName,salesRepId);
	error.html(errorStr);
	
	return returnValue;
}
function populateTheGrid(quantity,itemId,itemName,relatedProdId){
	
	alert('Populate Grid'+quantity+","+itemId+","+itemName+","+relatedProdId);
	   var returnValue;
	$.ajax({
	    url: "AddProduct",
	    type: "POST",
	    data:
	    	"quantity="+quantity+
	    	"&itemId="+itemId+
	    	"&itemName="+itemName+
	    	"&relatedProdId="+relatedProdId,
	    
	    	success: function(data, textStatus, jqXHR) {
	    		console.log(data);
	    		data = data.split("Served at: /Exercise")[1];
	    		console.log(data.productJSON);
	    		
	    		$("#instructionText").html(data);
	    	/*	$.each( arr, function( key, value ) {
	    			 alert('Key ='+key+',Value='+value);
	    			
	    			});*/
	    		
	    		/*alert(data[i].quantity+"\t"
	    				+data[i].itemId+"\t"+
	    				data[i].itemName+"\t"+
	    				data[i].relatedProdId);*/
	    	
	    	},
	    	 error: function(jqXHR, textStatus, errorThrown){
	    		 console.log("Something really bad happened " + textStatus +"\n"+jqXHR.responseText);
                 
            }
	    
	}).done(function( e ) {
	    console.log( "word was saved" + e );
	});
	
	
}