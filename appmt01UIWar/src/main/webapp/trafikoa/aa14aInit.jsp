<%@include file="/trafikoa/inc/aa14aGlobal.jspf"%>

<!DOCTYPE html>
<html lang="${langCode}">
<head>
	<%@include file="/head/aa14aHead.comun.jspf"%>
	<%@include file="/trafikoa/common/inc/aa14aHead.trafikoa.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.styles.jspf"%>
	<%@include file="/head/aa14aHead.calendar.styles.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.scripts.jspf"%>
	
	<%@include file="/head/aa14aHead.calendar.scripts.jspf"%>
	
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-appointmentDetails.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-form.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-validations.js"></script>
	
	<script src="/appcont/aa14aAppointments/scripts/aa14a-printAppointmentsDialog.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-appointmentEditDialog.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-appointmentDateTimeSelectionCalendar.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-nonBookableEditDialog.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-bookedSlotRelease.js"></script>
</head>

<body>
	<%@include file="/aa14aJSDynamicVars.jspf"%>
	<%@include file="/trafikoa/inc/aa14aVariablesIdiomaticas.jspf"%>
	
	
	<%@include file="/trafikoa/inc/aa14aHeader.jspf"%>
	
	<div class="aa14a_contenido">
		<!-- Solicitar Cita / Consultar o Cancelar cita -->
		<section>
			<p class="aa14a_introduccion">
				<fmt:message key="trafikoa.inicio.mensaje.bienvenida" />
				<fmt:message key="trafikoa.inicio.mensaje.instrucciones" />
			</p>
			
			<nav id="aa14a_box" class='aa14aclearfix'>
				<div id="aa14a_left">
					<a href="aa14aSolicitud.jsp?lang=<%=langStr%>" class="aa14a_noSubrayado">
						<div id="aa14a_solicitar"> 
							<span class="fa fa-clock-o fa-5x"></span><br />
							<span class="aa14a_titulo_azul"><fmt:message key="comun.inicio.solicitar" /></span><br/>
						</div>
					</a>
				</div>
				<div id="aa14a_right">
					<a href="aa14aBusqueda.jsp?lang=<%=langStr%>" class="aa14a_noSubrayado">
						<div id="aa14a_consulta_cancelacion"> 
							<span class="fa fa-calendar fa-4x"></span><br /><br />
							<span class="aa14a_titulo_azul"><fmt:message key="comun.inicio.consultarcancelar" /></span><br/>
						</div>
					</a>												
				</div>
			</nav>
			<!-- 			
			<p class="aa14a_introduccion"><fmt:message key="trafikoa.inicio.mensaje.informacion" /></p>
			 -->
		</section>
	<% if (authenticated && hasScheduleAccess) { %>
		<!-- Reserva de huecos -->
		<!-- Calendario de citas (ver AA14BusinessConfigForTrafikoa para las constantes)-->
		<section class="aa14a_calendario_citas">
			<!-- schedule selection -->
			<%@include file="/trafikoa/inc/aa14aScheduleSelection.jspf"%>
			
			<!-- full calendar -->
			<div id='calendar'></div>	<!-- div where fullcalendar.js injects it's html -->	
			
			<!-- Print appointments Button bar -->
			<div class='aa14_button_bar'>
				<div id="aa14a_print_appointments_btn" class="aa14a_btn_anterior_siguiente">
					<a><div id="aa14a_nonBookableSave" class="aa14a_boton aa14a_boton_right">
							<p><span class="fa fa-print"></span><fmt:message key="comun.imprimirCitas" /></p>
					   </div>
					</a>					
				</div>
			</div>
		</section>
		
		<!-- Print appointments Pop-up -->
		<div id='aa14a_print_appointments_dialog' class='ocultar'>
			<%@include file="/trafikoa/inc/aa14aPrintAppointments.jspf"%>
		</div>
			
			
		<!-- Pop-up de edición de citas (cambiar hora, borrar...) -->
		<div id='aa14a_editAppointment_dialog'>
			<%@include file="/trafikoa/inc/aa14aAppointmentEditWrapper.jspf"%>
		</div>
		
		
		<!-- Pop-up de reserva de huecos -->
		<div id='aa14a_reserveSlot_dialog' class='ocultar'>
			<%@include file="/aa14aNonBookableEdit.jspf"%>
		</div>
		
		<!-- Release slot dialogs -->
		<div id="aa14_booked_slot_release_dialog" class='ocultar'>
			<p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span><fmt:message key="anular.msg"/></p>
		</div>
		<div id="aa14_booked_slot_release_response_dialog" class='ocultar'>
			<p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span><fmt:message key="anular.confirmacion"/></p>
		</div>
		
		
	<% } %>
	
	</div>
	
	<%-- Select the favourite schedule if any --%>	
	<%@include file="/aa14aFavouriteScheduleSelectAtMain.jspf"%>


</body>
</html>

