package aa14f.model.config.business.builder;

import java.util.Collection;

import aa14f.model.config.AA14NotificationMessageData;

public class AA14NotificationMessageDataBuilderForBizilagun 
	 extends AA14NotificationMessageDataBuilderBase {
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14NotificationMessageData> createCommonMessageData() {
		Collection<AA14NotificationMessageData> outData = super.createCommonMessageData();
		
		//XXX temporal restriction only by telephone
    		
    	outData.add(AA14NotificationMessageData.create("instructions",
    												   "Le llamaremos por tel�fono el d�a y hora reservado.","Telefonoz deituko dizugu erreserbatutako egunean eta orduan."));
    	
    	outData.add(AA14NotificationMessageData.create("warningTitle", 
    												   "ATENCI�N EXCLUSIVAMENTE TELEF�NICA","TELEFONO BIDEZKO ARRETA SOILIK"));
    		
    	outData.add(AA14NotificationMessageData.create("warningMessage", 
    												   "Hasta nuevo aviso, las citas de este servicio ser�n telef�nicas. Si ya tienes reservada una cita, te llamaremos por tel�fono el d�a y hora reservado.",
    												   "Berriro abisatu arte, zerbitzu horretako hitzorduak telefono bidezkoak izango dira. Hitzordu bat erreserbatuta baduzu, telefonoz deituko dizugu erreserbatutako egunean eta orduan."));
		return outData;
	}
}
