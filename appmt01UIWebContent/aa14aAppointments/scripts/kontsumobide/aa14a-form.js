$(document).ready(function(){
	$("input[type='checkbox']").prop("cheched", false);
	// Step 1
	$("input:radio[name='serviceLocId']").change(function() {
		var loc = getSelectedServiceLocationId();
		if (loc.indexOf("REGISTRO") > -1){
			$("p#subject_type").show();
			$("p#subject_detail").hide();
			$("p#subject_company").hide();
			$("#aa14a_createAppointment_form #subjectDetail").val("");
			$("#aa14a_createAppointment_form #kontsumobide_subjectCompany").val("");
		}
		else {
			$("p#subject_type").hide();
			$("#aa14a_createAppointment_form #kontsumobide_subjectType").prop('selectedIndex', 0)
			$("p#subject_detail").show();
			$("p#subject_company").show();	
		}
	});
	// Step 2
	$("#aa14a_createAppointment_form #nifTxt").hide();
	$("#aa14a_createAppointment_form #locator").hide();
	$("#aa14a_createAppointment_form #locatorTxt").prop("readonly", true);
	$("#aa14a_createAppointment_form #locatorTxt").prop("disabled", true);
	$("#aa14a_createAppointment_form #nif")
		.change(function() {
					// When the nif changes reset the locator
					$("#aa14a_step2_next_btn").show();
				});
	
	
	// Change contact info
	$("#aa14a_editAppointment_form #nif").hide();
	$("#aa14a_editAppointment_form #nifTxt").val($("datonif").html());
	$("#aa14a_editAppointment_form #nifTxt").prop("disabled", true);
	$("#aa14a_editAppointment_form #nifTxt").prop("readonly", true);
	$("#aa14a_editAppointment_form #locator").hide();
});


function validateCustomerData() {
	var msgErrores="";
	
	// requestor
	if( $("#aa14a_editAppointment_dialog #nif").val() == "" || $("#aa14a_createAppointment_form #nif").val() == "" ) {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+nifMsgError+"</p>";
	}
	// nif: server side format
	if ($("#aa14a_createAppointment_form #nif").val() 
	 && !validateNIF($("#aa14a_createAppointment_form #nif").val())) {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+nifInvalidoMsgError+"</p>";
	}
	if( $("#nombre").val() == "" ) {
		   msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+nombreMsgError+"</p>";
	}
	if( $("#apellidos").val() == "" ) {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+apellidosMsgError+"</p>";
	}	
	
	// contact data
	if( $.trim($("#movil").val()) != "") {	
		if( !validarMovil("#movil")) {
			msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+movilMsgError+"</p>";
		}
	} else { 
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+movilEmptyMsgError+"</p>";
	}
	if ($.trim($("#email").val()) != "") {
		if( !validarEmail("#email")) {
			msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+emailMsgError+"</p>";
		}
	}
	
	var loc = getSelectedServiceLocationId();
	if (loc.indexOf("REGISTRO") > -1){
		if( $("#kontsumobide_subjectType").val() == undefined ||		
			$("#kontsumobide_subjectType").val() == ""){
			msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+subjectTypeMsgError+"</p>";
		}
	}
	else {
		if( $("#aa14a_editAppointment_dialog #subjectDetail").val() == "" || 
				$("#aa14a_createAppointment_form #subjectDetail").val() == ""){
				msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+subjectMsgError+"</p>";
		}
	}
	return msgErrores;
}

/**
 * Person locator...
 * @param nif
 * @returns
 */
function generateLocator() {
	// generate the locator
	var nif = $("#aa14a_createAppointment_form #nif").val();
	var email = $("#aa14a_createAppointment_form #email").val();
	if (email == ""){
		email = "appmt-fake-mail@euskadi.eus";
	}
	console.log("[Locator]: getting locator for nif=" + nif + " email=" + email);
	var success = false;
	$.ajax({
		  url		: '/' + appmtContextRoot + '/AA14ControllerServlet?R01HNoPortal=true',
		  data		: "op=GENERATE_PERSON_LOCATOR&personId=" + nif + "&email=" + email,
		  type		: "get",
		  async		: false,	// IMPORTANT!! the success info is needed SYNCHRONOUSLY!
		  success	: function(validationResult) {
			  				if (validationResult.ok) {
								// create appointment
								$("#aa14a_createAppointment_form #locator").val(validationResult["person-locator"]);
								
								// edit appointment
								$("#aa14a_editAppointment_form #locator").val(validationResult["person-locator"]);
								$("#datolocator").html(validationResult["person-locator"]);
								
								success = true;
							}
							else {
								var dialog = $("#aa14_locator_response_dialog").dialog();
				    			$("#aa14_locator_response_dialog #locatorMessage").html(validationResult.message);
				    			dialog.dialog("open");
				    			
				    			success = false;
							}
					  },
		  error		: function (xhr, ajaxOptions, thrownError) {
							var dialog = $("#aa14_locator_response_dialog").dialog();
			    			$("#aa14_locator_response_dialog #locatorMessage").html(thrownError);
			    			dialog.dialog("open");
			    			
			    			success = false;
			  		  }
	});	
	if (!success) {
		var dialog = $("#aa14_locator_response_dialog").dialog();
		$("#aa14_locator_response_dialog #locatorMessage").html("Error generating the locator!");
		dialog.dialog("open");
		
		return;
	}
	return success;
}

// Return the number of slots needed for a single appointment
function getNumberOfAdjacentSlots() {
	return 1;
}

//Return an specific schedule to use for a location depending of customer data
function forAScheduleId(){
	return "";
}