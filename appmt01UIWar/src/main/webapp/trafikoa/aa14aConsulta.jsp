<%@include file="/trafikoa/inc/aa14aGlobal.jspf"%>

<!DOCTYPE html>
<html lang="${langCode}">
<head>
	<%@include file="/head/aa14aHead.comun.jspf"%>
	<%@include file="/trafikoa/inc/aa14aHead.trafikoa.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.styles.jspf"%>
	
	<%@include file="/head/aa14aHead.comun.scripts.jspf"%>
	
	<script src="/appcont/aa14aAppointments/scripts/trafikoa/aa14a-appointmentDetails.js"></script>
</head>

<body>
	<script type="text/javascript">
		var nombreCapa =  "${param.nombreCapa}";
		var appointmentId = "${param.appointmentId}";
	</script>
	
	<%@include file="/aa14aJSDynamicVars.jspf"%>
	<%@include file="/trafikoa/inc/aa14aVariablesIdiomaticas.jspf"%>
	
	<%@include file="/trafikoa/inc/aa14aHeader.jspf"%>

	<div class="aa14a_contenido">										
		<!-- <h2 id="aa14a_titulo_pagina_imprimir" style="display: none;"><span class="fa fa-square"></span><fmt:message key="imprimir.titulo" /></h2>-->
		<h2 id="aa14a_titulo_pagina_anular" style="display: none;"><span class="fa fa-square"></span><fmt:message key="anular.titulo" /></h2>
		
		<!-- appointment details -->
		<%@include file="/trafikoa/inc/aa14aAppointmentDetails.jspf"%>
		
		<!-- private details -->
		<%@include file="/aa14aAppointmentPrivateDetails.jspf" %>
			
		<div id= "aa14a_capa_imprimir" class="ocultar">
			<!--  Inicio -->
			<div class="aa14a_btn_anterior_siguiente">
				<a href="aa14aInit.jsp?lang=<%=langStr%>">
					<div class="aa14a_boton aa14a_boton_right aa14a_boton_salir">
						<p><span class="fa fa-home"></span><fmt:message key="comun.salir"/></p>
					 </div>
				</a>					
			</div>
			<!-- print -->
			<div id="aa14a_print_btn" class="aa14a_btn_anterior_siguiente">								
				<a><div class="aa14a_boton aa14a_boton_right">
						<p><span class="fa fa-print"></span><fmt:message key="comun.imprimir"/></p>
				   </div>
				</a>
			</div>
		</div>
	</div>
	
</body>
</html>
