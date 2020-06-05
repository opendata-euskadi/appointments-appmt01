function validateSearchParams() {
	var errorMsg="";
	if ($("#nif").val() == "" && $("#codExp").val() == ""){
		errorMsg +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+msgErrorSearchOr+"</p>";
	}
	return errorMsg;
}