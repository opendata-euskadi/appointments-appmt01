$(document).ready(function(){
	$("#recoverForm #aditionalInstructions").show();
});

function validateSearchParams() {
	var errorMsg="";
	if ($("#formBuscarCitas #locator").length) {
		if ($("input[name='serviceLocId']:checked", "#formBuscarCitas").val() == undefined  || $("#formBuscarCitas #locator").val() == "") {
			errorMsg +="<p class='aa14a_warning'><span class='fa fa-warning'></span>" + msgErrorSearchAnd + "</p>";
		}
	}
	else if ( $("input[name='serviceLocId']:checked", "#formBuscarCitas").val() == undefined || $("#nif").val() == ""){
		errorMsg +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+msgErrorSearchAnd+"</p>";
	}
	return errorMsg;
}