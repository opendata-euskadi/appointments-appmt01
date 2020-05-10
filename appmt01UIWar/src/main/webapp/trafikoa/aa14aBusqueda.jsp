<%@include file="/trafikoa/inc/aa14aGlobal.jspf"%>

<!DOCTYPE html>
<html lang="${langCode}">
<head>
	<%@include file="/head/aa14aHead.comun.jspf"%>
	<%@include file="/trafikoa/common/inc/aa14aHead.trafikoa.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.styles.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.scripts.jspf"%>	
	
	<script src="/appcont/aa14aAppointments/scripts/aa14a-appointmentSearch.js"></script>
	
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-search.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-appointmentDetails.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-form.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-validations.js"></script>
	
	<script src="/appcont/aa14aAppointments/scripts/aa14a-appointmentDateTimeSelectionCalendar.js"></script>
</head>

<body>
	<%@include file="/aa14aJSDynamicVars.jspf"%>
	<%@include file="/trafikoa/inc/aa14aVariablesIdiomaticas.jspf"%>
	
	<%@include file="/trafikoa/inc/aa14aHeader.jspf"%>
	
	<div class="aa14a_contenido" id="aa14_appointment_search">										
		<h2 id="aa14a_titulo_pagina"><span class="fa fa-square"></span><fmt:message key="busqueda.titulo" /></h2>
		<section>									
			<div class="aa14a_titulo_consulta">
				<h3><fmt:message key="busqueda.informacion" /></h3>
			</div>
			
			<!-- Errores de validaci�n -->
			<div id="aa14a_errores_busqueda"></div>
			
			<!-- Formulario de b�squeda -->
			<form action="" method="get" name="formBuscarCitas" id="formBuscarCitas" class='aa14a_form'>
				<input type=hidden id="op" name="op">
				<input type=hidden id="lang" name="lang">
				<input type=hidden id="serviceId" name="serviceId" value="<%= AA14BusinessConfigForTrafikoa.SERVICE_ID %>">
				
				<p class="aa14a_comentario"><span class="fa fa-commenting"></span><fmt:message key="trafikoa.busqueda.texto" /></p>
				<p>
					<label for="codExp"><fmt:message key="comun.datospersonales.codexpediente" />: </label>
					<input class="aa14a_input" type="text" name="codExp" id="codExp" autofocus="true" placeholder="<fmt:message key='comun.datospersonales.codExp.placeholder' />">
				</p>
				<p>
					<label for="nif"><fmt:message key="comun.datospersonales.nif" />:</label>
					<input class="aa14a_input" type="text" name="nif" id="nif"  placeholder="<fmt:message key='comun.datospersonales.nif.placeholder' />">
					
				</p>
				<%@include file="/aa14aSearchCommonForm.jspf"%>
			</form>
			<div class="aa14a_btn_anterior_siguiente">
				<a><div id="aa14a_realizar_busqueda" class="aa14a_boton aa14a_boton_center">
						<p><span class="fa fa-search"></span><fmt:message key="comun.buscar" /></p>
				   </div>
				</a>
			</div>
			
			<!-- Resultados de b�squeda -->
			<div id="aa14a_search_results" class="aa14a_tabla ocultar">
				<table class="table-bordered table-striped table-condensed cf">
					<thead class="cf"><tr>
						<th class='aa14_srchItemSrvc'><fmt:message key='comun.location.lblservicio'/></th>
						<th class='aa14_srchItemName'><fmt:message key='comun.datospersonales.nombre'/></th>
						<th class='aa14_srchItemSurname'><fmt:message key='comun.datospersonales.apellidos'/></th>
						<th class='aa14_srchItemID'><fmt:message key='comun.datospersonales.nif'/></th>
						<th class='aa14_srchItemDate'><fmt:message key='comun.fechahora'/></th>
						<th class="aa14_srchItemEdit aa14a_th-center"><fmt:message key='comun.modificar'/></th>
					</tr></thead>
					<tbody id="aa14a_search_results_items">
					</tbody>
				</table>
			</div>
		</section>		
													
		<div class="aa14a_btn_anterior_siguiente">
			<a href="aa14aInit.jsp?lang=<%=langStr%>">
				<div class="aa14a_boton aa14a_boton_right aa14a_boton_salir">
					<p><span class="fa fa-home"></span><fmt:message key="comun.salir" /></p>
				</div>
			</a>					
		</div>	
	</div>
	
	<!-- Editar cita (cambiar hora) -->
	<div id='aa14a_editAppointment_dialog'>
		<%@include file="/trafikoa/inc/aa14aAppointmentEditWrapper.jspf"%>
	</div>
	
	<!-- Release slot dialogs -->
	<div id="aa14_booked_slot_release_dialog">
		<p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span><fmt:message key="anular.msg"/></p>
	</div>
	<div id="aa14_booked_slot_release_response_dialog">
		<p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span><fmt:message key="anular.confirmacion"/></p>
	</div>
	
</body>
</html>
