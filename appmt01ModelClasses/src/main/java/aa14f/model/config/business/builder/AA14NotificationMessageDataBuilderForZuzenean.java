package aa14f.model.config.business.builder;

import java.util.Collection;

import aa14f.model.config.AA14NotificationMessageData;

public class AA14NotificationMessageDataBuilderForZuzenean 
	 extends AA14NotificationMessageDataBuilderBase {
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14NotificationMessageData> createCommonMessageData() {
		Collection<AA14NotificationMessageData> outData = super.createCommonMessageData();
		
    	outData.add(AA14NotificationMessageData.create("cancelUrlWeb", 
    												   "http://www.euskadi.eus/citazuzenean","http://www.euskadi.eus/zerbitzu-medikoa/"));
		return outData;
	}
}
