// see aa14aCustomerDetails.inc
function paintCustomAppointmentDetails(appointment) {
	console.log(appointment);
	//Locator
	if (appointment._personLocatorId && appointment._personLocatorId._id){ //backwards compatibility
		$("#datolocator").html(appointment._personLocatorId._id);
		$("#aa14a_editAppointment_form #locator").val(appointment._personLocatorId._id);
		$("#locatorRow").show();
	}
	
	//Set data asociated with the service
	//see /justizia/common/inc/aa14aVariablesIdiomaticas.inc
	if (appointment._businessData && appointment._businessData!=""){
		//Servicio: Registro y reparto
		if (appointment._businessData._profile){
			$("#justizia_titulo").html(tituloRegistroReparto);
			
			var selectedValue=getProfileEnumFromCodeValue(appointment._businessData._profile);
			$("#aa14a_editAppointment_form select[name='justizia.perfil']").val(selectedValue);
			$("#datoperfil").html(eval(appointment._businessData._profile));
			$("tr#justizia_rr_judicial_party").show();
			$("tr#justizia_rr_service").show();
			$("tr#justizia_rr_procedureRow").show();
			$("tr#justizia_rr_profileRow").show();
			$("#btn_rr_salir").show();
		}
		//Servicio: Registro civil
		else if (appointment._businessData._procedure){
			$("#justizia_titulo").html(tituloRegistroCivil);
			
			var selectedValue=getProcedureEnumFromCodeValue(appointment._businessData._profile);
			$("#aa14a_editAppointment_form input[name='justizia.civilregistry.procedure']").val(selectedValue);
			$("#aa14a_editAppointment_form input[name='justizia.civilregistry.residencePlace']").val(appointment._businessData._residencePlace);
			$("td[aa14val='aa14a_rc_proc']").html(eval(appointment._businessData._procedure));
			$("#justizia_rc_procedureRow").show();
			$("#btn_rc_salir").show();
		//Servicio de Orientacion juridica	
		} else if (appointment._businessData._requestorType){
			$("#justizia_titulo").html(tituloSOJ);
			var checkedValue = getRequestorTypeEnumFromCodeValue(appointment._businessData._requestorType);
			$("#aa14a_editAppointment_form input[type=radio][name='justizia.soj.requestorType'][value=" + checkedValue +"]").attr("checked", true);
			$("#datotiposolicitante").html(eval(appointment._businessData._requestorType));
			$("tr#justizia_soj_service").show();
			$("tr#justizia_soj_requestorType").show();
			$("#btn_soj_salir").show();
		}
	}
	//readonly input is not sent
	$("#aa14a_editAppointment_form #nif").hide();
	$("#aa14a_editAppointment_form #nifTxt").val(appointment._person._id._id);
	$("#aa14a_editAppointment_form #nifTxt").prop("disabled", true);
	$("#aa14a_editAppointment_form #nifTxt").prop("readonly", true);
	$("#aa14a_editAppointment_form #locator").hide();
	
	$("#aa14a_editAppointment_form #locatorTxt").prop("disabled", true);
	$("#aa14a_editAppointment_form #locatorTxt").prop("readonly", true);
}

//Correlates a enum value for profile with code value
function getProfileEnumFromCodeValue(enumValue){
	
	if (enumValue == "PERFIL_ABOGADO"){
		return 1;
	}
	else if (enumValue == "PERFIL_PROCURADOR"){
		return 2;
	}
	else if (enumValue == "PERFIL_CIUDADANIA"){
		return 3;
	}
	else if (enumValue == "PERFIL_GRADUADO"){
		return 4;
	}
	else if (enumValue == "PERFIL_OTRO"){
		return 5;
	}
	else return "";
}
function getProcedureEnumFromCodeValue(codeValue){
	
	if (codeValue == "INSCRIPCION_NACIMIENTO") {
		return 1;
	} else if (codeValue == "INSCRIPCION_DEFUNCION") {
		return 2;
	} else if (codeValue == "MATRIMONIO_INFORMACION") {
		return 3;
	} else if (codeValue == "MATRIMONIO_DOCUMENTACION") {
		return 4;
	} else if (codeValue == "MATRIMONIO_LIBRO_FAMILIA") {
		return 5;
	} else if (codeValue == "MATRIMONIO_EXPEDIENTE") {
		return 6;
	} else if (codeValue == "CERTIFICADO_NACIMIENTO") {
		return 7;
	} else if (codeValue == "CERTIFICADO_DEFUNCION") {
		return 8;
	} else if (codeValue == "CERTIFICADO_MATRIMONIO") {
		return 9;
	} else if (codeValue == "CERTIFICADO_LIBRO_FAMILIA") {
		return 10;
	} else if (codeValue == "EXPEDIENTE_CAMBIO") {
		return 11;
	} else if (codeValue == "EXPEDIENTE_TUTELA") {
		return 12;
	} else if (codeValue == "EXPEDIENTE_NACIONALIDAD") {
		return 13;
	} else if (codeValue == "EXPEDIENTE_VECINDAD") {
		return 14;
	} else if (codeValue == "EXPEDIENTE_RECTIFICACION") {
		return 15;
	} else if (codeValue == "FE_VIDA") {
		return 16;
	} else if (codeValue == "OTROS") {
		return 17;
	} else return "";
}
function getRequestorTypeEnumFromCodeValue(codeValue){
	
	if (codeValue == "PROFESIONAL") {
		return 1;
	} else if (codeValue == "CIUDADANO") {
		return 2;
	} else return "";
}	