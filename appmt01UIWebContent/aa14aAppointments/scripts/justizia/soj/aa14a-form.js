$(document).ready(function(){
	$("#justizia_titulo").html(tituloSOJ);
	$("input[type='checkbox']").prop("cheched", false);
	$("a#terminos").prop("href", enlaceTerminos);
	$("a#politica").prop("href", enlacePoliticas);
	
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
	$("#aa14a_createAppointment_form input[type=radio][name='justizia.soj.requestorType']").change(function() {
		//see /blooddonation/common/inc/aa14aVariablesIdiomaticas.inc
		var codeValue = $("input[type=radio][name='justizia.soj.requestorType']:checked").val();
		$("#datotiposolicitante").html(getRequestorTypeTextFromCodeValue(codeValue));
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
	// nif: data
	if ( $("#aa14a_editAppointment_dialog #nif").val() == ""		// when called from the edit form
	  || $("#aa14a_createAppointment_form #nif").val() == "" ) {	// when called from the create form
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+nifMsgError+"</p>";
	}
	// nif: server side format
//	if ($("#aa14a_createAppointment_form #nif").val() 
//	 && !validateNIF($("#aa14a_createAppointment_form #nif").val())) {
//		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+nifInvalidoMsgError+"</p>";
//	}
	// name
	if ( $("#nombre").val() == "" ) {
		   msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+nombreMsgError+"</p>";
	}
	if ( $("#apellidos").val() == "" ) {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+apellidosMsgError+"</p>";
	}	
	// profile
	if( $("input[type=radio][name='justizia.soj.requestorType']:checked").val() == undefined) {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+requestorTypeMsgError+"</p>";
	}
	// contact data
	if ( $.trim($("#movil").val()) != "") {	
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
	//terms and conditions
	if ( $("#aa14a_createAppointment_form #terms").length && !$("#aa14a_createAppointment_form #terms").prop("checked")) {	
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+msgTermsError+"</p>";
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
function getNumberOfAdjacentSlots(){
	return 1;
}
//Return an specific schedule to use for a location depending of customer data
function forAScheduleId(){
	return "";
}
function getRequestorTypeTextFromCodeValue(codeValue) {
	if (codeValue == 1) {
		return PROFESIONAL;
	}
	else if (codeValue == 2) {
		return CIUDADANO;
	}
	else return "";
}
