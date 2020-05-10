package aa14f.client.api;

import javax.inject.Inject;
import javax.inject.Singleton;

import aa14f.model.config.business.builder.AA14ConfigBuilderForJustizia;
import aa14f.model.oids.AA14IDs.AA14BusinessID;

@Singleton
public class AA14BusinessConfigCreatorImpl 
     extends AA14BusinessConfigCreatorBase {

/////////////////////////////////////////////////////////////////////////////////////////
//	CONSTRUCTOR
/////////////////////////////////////////////////////////////////////////////////////////
	@Inject
	protected AA14BusinessConfigCreatorImpl(final AA14ClientAPI clientApi) {
		super(clientApi);
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void ensureConfig() { 
//		// Trafikoa
//		_ensureConfig(AA14BusinessID.TRAFIKOA,
//					 new AA14ConfigBuilderForTrafikoa());
//		// Bizilagun
//		_ensureConfig(AA14BusinessID.BIZILAGUN,
//					 new AA14ConfigBuilderForBizilagun());
//		// Blood Donation
//		_ensureConfig(AA14BusinessID.BLOOD_DONATION,
//					 new AA14ConfigBuilderForBloodDonation());
//		// Medical Service
//		_ensureConfig(AA14BusinessID.MEDICAL_SERVICE,
//					 new AA14ConfigBuilderForMedicalService());
//		// Zuzenean
//		_ensureConfig(AA14BusinessID.ZUZENEAN,
//					 new AA14ConfigBuilderForZuzenean());
		// Justizia
		_ensureConfig(AA14BusinessID.JUSTIZIA,
					 new AA14ConfigBuilderForJustizia());
	}
}
