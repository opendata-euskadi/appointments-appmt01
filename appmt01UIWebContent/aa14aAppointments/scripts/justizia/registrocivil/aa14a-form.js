$(document).ready(function(){
	$("#justizia_titulo").html(tituloRegistroCivil);
	$("input[type='checkbox']").prop("cheched", false);
	$("a#terminos").prop("href", enlaceTerminos);
	$("a#politica").prop("href", enlacePoliticas);
	// Step 1
	$("div[id^= 'loc_']").hide();
	$("div[id^= 'tram_']").hide();
	$("input:radio[name='locTh']")
		.change(function() {
						var outLocTh;
						if ($("input:radio[name='locTh']").length) {
							outLocTh = $("input:radio[name='locTh']:checked").val()
						}
						// get the selected location group
						$("div[id^= 'tram_']").hide();
						$("div[id^= 'loc_']").hide(); 
						//quitar el checked del partido judicial y el tramite 
						$("div[id='loc_" + outLocTh + "']").show();
				  });
	$("input:radio[name='locId']")
		.change(function() {
						var outLocId;
						var outLocTh;
						if ($("input:radio[name='locId']").length) {
							outLocId = $("input:radio[name='locId']:checked").val()
						}
						
						if ($("input:radio[name='locTh']").length) {
							outLocTh = $("input:radio[name='locTh']:checked").val()
						}
						// get the selected location group
						$("div[id^= 'loc_']").hide();
						$("div[id^= 'tram_']").hide();
						$("div[id='loc_" + outLocTh + "']").show();
						$("div[id='tram_" + outLocId + "']").show();
						
				  });
	$("input:radio[name='serviceLocId']").click(
			function() {
				// procId format procedureCode_loc
				var selectedProcedureCode = getSelectedProcedureCode();

				$("td[aa14val='aa14a_rc_proc']").each(function() {
					$(this).html(getProcedureNameFromCode(selectedProcedureCode));
				});	
				$("input[name='justizia.civilregistry.procedure']").val(selectedProcedureCode);
				$("#datotramite").html(getProcedureNameFromCode(selectedProcedureCode));		
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
	$("input[name='justizia.civilregistry.procedure']").hide();
	
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
//	// nif: server side format
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
	if ( $("#lugar").val() == "" ) {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+lugarMsgError+"</p>";
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
	} else {
		msgErrores +="<p class='aa14a_warning'><span class='fa fa-warning'></span>"+emailEmptyMsgError+"</p>";
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
	var selectedProcedureCode = getSelectedProcedureCode();
	if ((selectedProcedureCode > 6 && selectedProcedureCode < 11)
			|| selectedProcedureCode == 16){ //10 min per appointment
		return 1;
	}
	else if (selectedProcedureCode < 6
			|| selectedProcedureCode == 17){ // 20 min per appointment
		return 2;
	}
	else {
		return 3; // rest of procedures 30 min per appointment
	}
	
}

function getProcedureNameFromCode(codeValue) {	
	if (codeValue == 1) {
		return INSCRIPCION_NACIMIENTO;
	} else if (codeValue == 2) {
		return INSCRIPCION_DEFUNCION;
	} else if (codeValue == 3) {
		return MATRIMONIO_INFORMACION;
	} else if (codeValue == 4) {
		return MATRIMONIO_DOCUMENTACION;
	} else if (codeValue == 5) {
		return MATRIMONIO_LIBRO_FAMILIA;
	} else if (codeValue == 6) {
		return MATRIMONIO_EXPEDIENTE;
	} else if (codeValue == 7) {
		return CERTIFICADO_NACIMIENTO;
	} else if (codeValue == 8) {
		return CERTIFICADO_DEFUNCION;
	} else if (codeValue == 9) {
		return CERTIFICADO_MATRIMONIO;
	} else if (codeValue == 10) {
		return CERTIFICADO_LIBRO_FAMILIA;
	} else if (codeValue == 11) {
		return EXPEDIENTE_CAMBIO;
	} else if (codeValue == 12) {
		return EXPEDIENTE_TUTELA;
	} else if (codeValue == 13) {
		return EXPEDIENTE_NACIONALIDAD;
	} else if (codeValue == 14) {
		return EXPEDIENTE_VECINDAD;
	} else if (codeValue == 15) {
		return EXPEDIENTE_RECTIFICACION;
	} else if (codeValue == 16) {
		return FE_VIDA;
	} else if (codeValue == 17) {
		return OTROS;
	} else return "";
}

	
function getSelectedProcedureCode(){
	var locationAndProcedureId = $("input:radio[name='serviceLocId']:checked").prop("id");
	return locationAndProcedureId.substring(0,locationAndProcedureId.indexOf('_'));	
}
//Return an specific schedule to use for a location depending of customer data
function forAScheduleId(){
	var locId = getSelectedServiceLocationId();
	var selectedProcedureCode = getSelectedProcedureCode();
	var schId = "";
	if (locId == "JUSTIZIA_REGISTRO_CIVIL_BIL") {
		if (selectedProcedureCode > 2 && 
			selectedProcedureCode < 7){
			schId = "SCH_JUSTIZIA_RC_MATRIMONIO_BIL";
		}
		else if((selectedProcedureCode > 10 && 
				 selectedProcedureCode < 16) ||
				selectedProcedureCode == 17){
			schId = "SCH_JUSTIZIA_RC_EXP_BIL";
		}
		else {
			schId = "SCH_JUSTIZIA_RC_CERT_FE_INS_BIL";
		}
	}
	else if (locId == "JUSTIZIA_REGISTRO_CIVIL_BK") {
		 if((selectedProcedureCode > 2 && 
			 selectedProcedureCode < 7) ||
			(selectedProcedureCode > 10 && 
			 selectedProcedureCode < 16) ||
			selectedProcedureCode == 17){
			schId = "SCH_JUSTIZIA_RC_EXP_BK_ID";
		 }
		 else {	
			schId = "SCH_JUSTIZIA_RC_INSC_BK_ID";
		 }
	}
	return schId;
}