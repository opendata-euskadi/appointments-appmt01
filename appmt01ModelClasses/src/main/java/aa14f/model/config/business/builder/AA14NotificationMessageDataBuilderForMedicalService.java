package aa14f.model.config.business.builder;

import java.util.Collection;

import aa14f.model.config.AA14NotificationMessageData;

public class AA14NotificationMessageDataBuilderForMedicalService 
	 extends AA14NotificationMessageDataBuilderBase {
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14NotificationMessageData> createCommonMessageData() {
		Collection<AA14NotificationMessageData> outData = super.createCommonMessageData();
		
    	outData.add(AA14NotificationMessageData.create("textCancelSMS",
    												   "Si NO puedes asistir, por favor anula tu cita.","EZIN bazara bertaratu, mesedez ezezta ezazu zure zita."));
    		
    	outData.add(AA14NotificationMessageData.create("textPhone",
    												   "Tel�fonos","Telefonoak"));
    		 
    	//footer 		
    	outData.add(AA14NotificationMessageData.create("textCancel",
    												   "Si por alg&uacute;n motivo NO puedes asistir, por favor anula tu cita previa.","Ezein arrazoigatik EZIN bazara bertaratu, mesedez ezezta ezazu zure aurretiko zita."));
    		
    	outData.add(AA14NotificationMessageData.create("cancelUrlWeb", 
    												   "http://www.euskadi.eus/servicio-medico/","http://www.euskadi.eus/zerbitzu-medikoa/"));
    		
    	outData.add(AA14NotificationMessageData.create("cancelWebTextLink", 
    												   "Servicio m�dico","Servicio m�dico"));
		return outData;
	}
}
