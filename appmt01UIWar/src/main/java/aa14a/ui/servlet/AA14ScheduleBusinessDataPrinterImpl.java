package aa14a.ui.servlet;

import java.io.PrintWriter;

import aa14f.model.AA14Appointment;
import aa14f.model.business.justizia.AA14BusinessDataForJustizia;
import aa14f.model.business.justizia.AA14JustiziaActor;
import aa14f.model.config.AA14OrgDivisionServiceLocation;
import aa14f.model.config.business.AA14BusinessConfigForJustizia;
import r01f.locale.Language;

public class AA14ScheduleBusinessDataPrinterImpl 
  implements AA14ScheduleBusinessDataPrinter {
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public boolean shouldPrintAppointmentDuration(final AA14OrgDivisionServiceLocation loc) {
		return loc.getOrgDivisionRef().getId().isNOT(AA14BusinessConfigForJustizia.JUSTIZIA_ID);
	}
	@Override
	public void printBusinessData(final AA14OrgDivisionServiceLocation loc,
								  final AA14Appointment appointment,final PrintWriter w,
								  final Language lang) {
		// Profile (Justizia)
		if (loc.getOrgDivisionRef().getId().is(AA14BusinessConfigForJustizia.JUSTIZIA_ID) 
		 && appointment.getBusinessData() != null) {
			
			w.print("<td>");
			AA14JustiziaActor profile = appointment.getBusinessDataAs(AA14BusinessDataForJustizia.class).getProfile();
			switch (profile) {
			case PERFIL_ABOGADO:
				w.println(lang == Language.SPANISH ? "Abogado/a" : "Agokatu");
				break;
			case PERFIL_PROCURADOR: 
				w.println(lang == Language.SPANISH ? "Procurador(a)" : "Prokuradore");
				break;
			case PERFIL_CIUDADANIA: 
				w.println(lang == Language.SPANISH ? "Ciudadan&iacute;a" : "Hiritartasuna");
				break;
			case PERFIL_GRADUADO: 
				w.println(lang == Language.SPANISH ? "Graduado/a Social" : "Gizarte lizentziatua" );
				break;
			case PERFIL_OTRO: 
				w.println(lang == Language.SPANISH ? "Otros" : "Beste batzuk");
				break;
			default: w.println("");
			}
			w.print("</td>");
		}
	}
}
