package aa14f.model.config.business.builder;

import java.util.Collection;

import aa14f.model.config.AA14NotificationMessageData;

public class AA14NotificationMessageDataBuilderForJustizia 
	 extends AA14NotificationMessageDataBuilderBase {
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14NotificationMessageData> createCommonMessageData() {
		Collection<AA14NotificationMessageData> outData = super.createCommonMessageData();
		
		outData.add(AA14NotificationMessageData.create("serviceLbl",
												 	   "SERVICIO DE CITA PREVIA PARA PRESENTACI�N DE ESCRITOS DE INICIO EN LA ADMINISTRACI�N DE JUSTICIA EN EUSKADI","EUSKADIKO JUSTIZIA ADMINISTRAZIOAN PROZEDURAK HASTEKO IDAZKIAK AURKEZTEKO AURRETIKO HITZORDU ZERBITZUA"));
		
		// Footer
    	outData.add(AA14NotificationMessageData.create("cancelUrlWeb",
    												   "https://www.justizia.eus/inicio","https://www.justizia.eus/hasiera")); 
    	outData.add(AA14NotificationMessageData.create("cancelWebTextLink", 
    												   "Justizia","Justizia"));
		return outData;
	}
}
