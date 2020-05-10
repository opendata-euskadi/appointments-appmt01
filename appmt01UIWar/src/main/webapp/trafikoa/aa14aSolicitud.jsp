<%@page import="aa14f.model.config.AA14OrgDivisionServiceLocation"%>
<%@page import="aa14f.model.oids.AA14IDs.AA14OrgDivisionServiceLocationID" %>
<%@page import="r01f.util.types.collections.CollectionUtils"%>
<%@page import="java.util.Collection" %>


<%@include file="/trafikoa/inc/aa14aGlobal.jspf"%>

<!DOCTYPE html>
<html lang="${langCode}">
<head>
	<%@include file="/head/aa14aHead.comun.jspf"%>
	<%@include file="/trafikoa/common/inc/aa14aHead.trafikoa.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.styles.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.scripts.jspf"%>	
	<script src="/appcont/aa14aAppointments/scripts/aa14a-appointmentCreateForm.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-validations.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-form.js"></script>
	<script src="/appcont/aa14aAppointments/scripts/aa14a-appointmentDateTimeSelectionCalendar.js"></script>
</head>
	
<body>
	<%@include file="/aa14aJSDynamicVars.jspf"%>
	<%@include file="/trafikoa/inc/aa14aVariablesIdiomaticas.jspf"%>
	
	
	<%@include file="/trafikoa/inc/aa14aHeader.jspf"%>
	
	<div class="aa14a_contenido" id='aa14a_new_appointment_form'>										
		<h2 id="aa14a_titulo_pagina"><span class="fa fa-square"></span><fmt:message key="comun.solicitud.titulo" /></h2>
		
		<form id="aa14a_createAppointment_form" action="" method="post" class='aa14a_form'>
		
			<!-- data to be sent to the server -->
			<input type="hidden" id="lang" name="lang" value='${langCode}'/>
			<input type="hidden" id="appointmentDateTime" name="appointmentDateTime" />
			<input type="hidden" id="op" name="op" />
			
			<!-- STEP1: Select service -->
			<section id="aa14a_step1" class="aa14a_step">
				<div class="aa14a_titulo_paso">
					<span class="aa14a_numero_paso">1</span>
					<h3><fmt:message key="comun.solicitud.location.title" /></h3>	
				</div>
			
				<%@include file="/trafikoa/inc/aa14aSolicitudLocation.jspf" %>
				
				<div class="aa14a_btn_anterior_siguiente ocultar" id="aa14a_step1_next">
					<a><div id="aa14a_step1_next_btn" class="aa14a_boton aa14a_boton_right"><p><span class="fa fa-forward"></span><fmt:message key="comun.siguiente" /></p></div></a>					
				</div>
			</section>
			
			<!-- STEP2: Fill customer data -->
			<section id="aa14a_step2" class="aa14a_step">
				<div class="aa14a_titulo_paso aa14a_titulo_paso_gris">
					<span class="aa14a_numero_paso">2</span>
					<h3><fmt:message key="comun.solicitud.datospersonales.title" /></h3>
				</div>
			
				<%@include file="/trafikoa/inc/aa14aSolicitudFormWrapper.jspf" %>
				
				<div class="aa14a_btn_anterior_siguiente ocultar" id="aa14a_step2_next">
					<div class="aa14a_btn_error aa14a_warning ocultar" id="aa14a_step2_error">
						<span class="fa fa-warning"></span>
						<fmt:message key="comun.solicitud.datospersonales.error" />
					</div>
					<!-- <a href="javascript:mostrar('#aa14a_paso1');"><div class="aa14a_boton aa14a_boton_left"><p><span class="fa fa-backward"></span><fmt:message key="comun.anterior" /></p></div></a> -->					
					<a><div id="aa14a_step2_next_btn" class="aa14a_boton aa14a_boton_right"><p><span class="fa fa-forward"></span><fmt:message key="comun.siguiente" /></p></div></a>					
				</div>
			</section>
			
			<!-- STEP3: Select date/time -->
			<section id="aa14a_step3" class="aa14a_step">
				<div class="aa14a_titulo_paso aa14a_titulo_paso_gris">
					<span class="aa14a_numero_paso">3</span>
					<h3><fmt:message key="comun.solicitud.fechahora.title"/></h3>
				</div>
			
				<%@include file="/aa14aSolicitudDateTime.jspf" %>
				
				<div class="aa14a_btn_anterior_siguiente ocultar" id="aa14a_step3_next">
					<div class="aa14a_btn_error aa14a_warning ocultar" id="aa14a_step3_error">
						<span class="fa fa-warningk"></span>
						<fmt:message key="comun.solicitud.fechahora.errores.cita" />
					</div>
					<a><div id="aa14a_step3_next_btn" class="aa14a_boton aa14a_boton_right"><p><span class="fa fa-forward"></span><fmt:message key="comun.siguiente" /></p></div></a>					
				</div>
			</section>
			
			<!-- STEP4: Review appointment -->
			<section id="aa14a_step4" class="aa14a_step">
				<div class="aa14a_titulo_paso aa14a_titulo_paso_gris">
					<span class="aa14a_numero_paso">4</span>
					<h3><fmt:message key="comun.solicitud.confirmar.title"/></h3>
				</div>
			
				<%@include file="/trafikoa/inc/aa14aSolicitudReview.jspf" %>
				
				<div class="aa14a_btn_anterior_siguiente ocultar" id="aa14a_step4_next">								
					<a><div id="aa14a_step4_next_btn" class="aa14a_boton aa14a_boton_right"><p><span class="fa fa-check"></span><fmt:message key="comun.confirmar"/></p></div></a>
				</div>
			</section>					
		</form>
		
		<!-- INICIO -->
		<div class="aa14a_btn_anterior_siguiente">
			<a href="aa14aInit.jsp?lang=<%=langStr%>">
				<div class="aa14a_boton aa14a_boton_right aa14a_boton_salir"><p><span class="fa fa-home"></span><fmt:message key="comun.salir"/></p></div>
			</a>					
		</div>
		
	</div>
	
	<%-- Select the favourite location if any --%>
	<%@include file="/aa14aFavouriteLocationSelectAtApplicationForm.jspf"%>
	
	
</body>
</html>
