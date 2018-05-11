$(document).ready(function(){
	alert("Document is Loaded");
});

function changedSalesRep(val){
	alert('changedSalesRep='+val);
	document.getElementById("salesId").innerHTML=val;
}