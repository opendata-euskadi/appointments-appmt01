package aa14a.ui.servlet;

import aa14f.model.AA14Appointment;
import aa14f.model.business.blooddonation.AA14BusinessDataForBloodDonation;
import aa14f.model.business.blooddonation.AA14LastBloodDonation;
import aa14f.model.business.justizia.AA14BusinessDataForJustizia;
import aa14f.model.business.justizia.AA14JustiziaActor;
import r01f.servlet.HttpRequestParamsWrapper;

public class AA14AppointmentFromRequestBuilderImpl 
	 extends AA14AppointmentFromRequestBuilderBase {

/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	protected void _setAppointmentBusinessDataFromRequest(final HttpRequestParamsWrapper reqParams,final AA14Appointment appointment) {
		// blood-donation business data
		AA14LastBloodDonation bloodDonationBusinessDataNotDonatedSince = reqParams.getParameter("bloodDonation.notDonatedSince").asEnumElementFromIntCode(AA14LastBloodDonation.class)
																    			  .orNull();
		if (bloodDonationBusinessDataNotDonatedSince != null) {
			appointment.setBusinessData(new AA14BusinessDataForBloodDonation(bloodDonationBusinessDataNotDonatedSince));
		}
		
		// justizia business data
		AA14JustiziaActor justiziaRequestorProfile = reqParams.getParameter("justizia.perfil")
															  .asEnumElementFromIntCode(AA14JustiziaActor.class)
															  .orNull();
		if (justiziaRequestorProfile != null) {
			appointment.setBusinessData(new AA14BusinessDataForJustizia(justiziaRequestorProfile));
		}
	}
}
