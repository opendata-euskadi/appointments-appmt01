package aa14f.model.config.business.builder;

import java.util.Collection;

import aa14f.model.config.AA14NotificationMessageData;

public class AA14NotificationMessageDataBuilderForKontsumobide 
	 extends AA14NotificationMessageDataBuilderBase {
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14NotificationMessageData> createCommonMessageData() {
		Collection<AA14NotificationMessageData> outData = super.createCommonMessageData();
		
		//XXX temporal restriction only by telephone
    		
    	outData.add(AA14NotificationMessageData.create("instructions",
    												   "Le llamaremos por teléfono el día y hora reservado.","Telefonoz deituko dizugu erreserbatutako egunean eta orduan."));
    	
    	outData.add(AA14NotificationMessageData.create("warningTitle", 
    												   "ATENCI�N EXCLUSIVAMENTE TELEFONICA","TELEFONO BIDEZKO ARRETA SOILIK"));
    		
    	outData.add(AA14NotificationMessageData.create("warningMessage", 
    												   "Hasta nuevo aviso, las citas de este servicio serán telefónicas. Si ya tienes reservada una cita, te llamaremos por telófono el día y hora reservado.",
    												   "Berriro abisatu arte, zerbitzu horretako hitzorduak telefono bidezkoak izango dira. Hitzordu bat erreserbatuta baduzu, telefonoz deituko dizugu erreserbatutako egunean eta orduan."));
		return outData;
	}
}
