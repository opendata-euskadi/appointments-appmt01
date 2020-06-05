

// see aa14aCustomerDetails.inc
function paintCustomAppointmentDetails(appointment) {
	console.log(appointment);
	//Locator
	if (appointment._personLocatorId && appointment._personLocatorId._id){ //backwards compatibility
		$("#datolocator").html(appointment._personLocatorId._id);
		$("#aa14a_editAppointment_form #locator").val(appointment._personLocatorId._id);
		$("#locatorRow").show();
	}
	$("p#subject_type").hide();
	$("p#subject_detail").hide();
	$("p#subject_company").hide();
	$("#aa14a_editAppointment_form select[name='kontsumobide.subjectType']").val("");
	$("#aa14a_editAppointment_dialog #subjectDetail").html("");
	$("#aa14a_editAppointment_dialog #kontsumobide_subjectCompany").html("");
	if (appointment._businessData && appointment._businessData!=""){
		//Servicio: Registro
		if (appointment._businessData._subjectType){
			var selectedValue=getSubjectTypeEnumFromCodeValue(appointment._businessData._subjectType);
			$("#aa14a_editAppointment_form select[name='kontsumobide.subjectType']").val(selectedValue);
			$("p#subject_type").show();
			$("p#subject_detail").hide();
			$("p#subject_company").hide();
			$("#appointmentServiceType").val("REGISTRO"); //for validations in aa14a-form.js
		}
		//Servicio: Consulta
		else {
			$("#aa14a_editAppointment_dialog #subjectDetail").html(appointment._subject._description);
			$("#aa14a_editAppointment_dialog #kontsumobide_subjectCompany").html(appointment._businessData._subjectCompany._description);
			$("p#subject_type").hide();
			$("p#subject_detail").show();
			$("p#subject_company").show();
			$("#appointmentServiceType").val("CONSULTA"); //for validations in aa14a-form.js
		}
		$("#appointmentServiceType").prop("checked", true); //for validations in aa14a-form.js
	}//Servicio: Consulta
	else if (appointment._subject._description){
		$("#aa14a_editAppointment_dialog #subjectDetail").html(appointment._subject._description);
		$("p#subject_type").hide();
		$("p#subject_detail").show();
		$("p#subject_company").show();
		$("#appointmentServiceType").val("CONSULTA"); //for validations in aa14a-form.js
		$("#appointmentServiceType").prop("checked", true); //for validations in aa14a-form.js
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
function getSubjectTypeEnumFromCodeValue(enumValue){
	
	if (enumValue == "COMPRA"){
		return 1;
	}
	else if (enumValue == "RECLAMACION"){
		return 2;
	}
	else if (enumValue == "DOCUMENTACION"){
		return 3;
	}
	else if (enumValue == "OTROS"){
		return 4;
	}
	else return "";
}