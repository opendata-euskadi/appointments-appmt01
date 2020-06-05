package aa14a.security;

import javax.servlet.http.HttpServletRequest;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

import aa14f.model.config.business.AA14BusinessConfigForKontsumoBide;

/**
 * Security config
 * Tenant    		| PF | Profile
 * =================|====|========================================================
 * Trafikoa  		| 01 | Agentes Zuzenean 012
 *           		| 02 | Agentes Zuzenean BI
 *           		| 03 | Agentes Zuzenean AR
 *           		| 04 | Agentes Zuzenean GI
 *           		| 05 | Trafikoa CATIT
 *           		| 06 | Trafikoa BI
 *           		| 07 | Trafikoa AR
 *           		| 08 | Trafikoa GI
 * =================|====|========================================================
 * ---------------  | 09 | -- Acceso a la aplicacion --
 * =================|====|========================================================
 * Bizilagun 		| 10 | Finanzas y depositos AR
 *           		| 11 | Comunidades y Alquileres AR
 *           		| 12 | Fianzas y depositos BIZ
 *           		| 13 | Comunidades y Alquileres BIZ
 *           		| 14 | Fianzas y depositos GI
 *           		| 15 | Comunidades y Alquileres GI
 * =================|====|========================================================
 * Blood Donation 	| 16 | Admin blood donation
 *           		| 17 | Blood Donation AR
 *           		| 18 | Blood Donation BIZ
 *           		| 19 | Blood Donation GI
 * =================|====|========================================================
 * Medical Service 	| 20 | Admin medical Service
 * =================|====|========================================================
 * Zuzenean 	 	| 01 | Agentes Zuzenean 012
 *           		| 02 | Agentes Zuzenean BI
 *           		| 03 | Agentes Zuzenean AR
 *           		| 04 | Agentes Zuzenean GI
 * =================|====|========================================================
 * Justizia     	| 21 | Admin Justizia Escritos de inicio / Registro Civil
 * 			     	| 22 | Justizia Escritos de inicio / Registro Civil Bilbao
 * 			     	| 23 | Justizia Escritos de inicio / Registro Civil Getxo
 * 			     	| 24 | Justizia Escritos de inicio / Registro Civil Gernika-Lumo
 * 			     	| 25 | Justizia Escritos de inicio / Registro Civil Durango
 * 			     	| 26 | Justizia Escritos de inicio / Registro Civil Balmaseda
 * 			     	| 27 | Justizia Escritos de inicio / Registro Civil Barakaldo
 * 			     	| 28 | Justizia Escritos de inicio / Registro Civil Amurrio
 * 			     	| 29 | Justizia Escritos de inicio / Registro Civil Vitoria-Gazteiz
 * 			     	| 30 | Justizia Escritos de inicio / Registro Civil Azpeitia
 * 			     	| 31 | Justizia Escritos de inicio / Registro Civil Bergara
 * 			     	| 32 | Justizia Escritos de inicio / Registro Civil Irun
 * 			     	| 33 | Justizia Escritos de inicio / Registro Civil Eibar
 * 					| 34 | Justizia Escritos de inicio / Registro Civil Tolosa
 * 			     	| 35 | Justizia Escritos de inicio / Registro Civil Donostia/San Sebastian   
 * =================|====|========================================================
 * Kontsumobide 	| 36 | Kontsumobide admin
 *           		| 37 | Kontsumobide Bilbao
 *           		| 38 | Kontsumobide Donostia
 *           		| 39 | Kontsumobide Vitoria      
 */
public class AA14SecurityAuthCtxForKontsumobide 
	 extends AA14SecurityAuthCtxBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  
/////////////////////////////////////////////////////////////////////////////////////////
	public AA14SecurityAuthCtxForKontsumobide(final HttpServletRequest req) {
				super("kontsumobide","AA14A-FN-0001",		
			  // see aa14b.xlnets.properties.xml
			  new Predicate<String>() {
					@Override
					public boolean apply(final String profileId) {
						return profileId.equals("AA14A-PF-0036")
							|| profileId.equals("AA14A-PF-0037")
							|| profileId.equals("AA14A-PF-0038")
							|| profileId.equals("AA14A-PF-0039");
					}
			  },
			  new Function<String,AA14UIUserScheduleData>() {
						@Override
						public AA14UIUserScheduleData apply(final String profileId) {
							AA14UIUserScheduleData outUserSchData = null;
							
							// ----- KONTSUMOBIDE
							if (profileId.equals("AA14A-PF-0036")) {	// admin
								// 012: no schedule, must select schedule
								return new AA14UIUserScheduleData(null,													// no favorite schedule
																  Lists.newArrayList(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_AR_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_BIZ_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_GI_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_AR_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_BIZ_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_GI_ID));	
							} else if (profileId.equals("AA14A-PF-0037")) {
								return new AA14UIUserScheduleData(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_BIZ_ID,			
																  Lists.newArrayList(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_BIZ_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_BIZ_ID));
							} else if (profileId.equals("AA14A-PF-0038")) {
								return new AA14UIUserScheduleData(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_GI_ID,			
																  Lists.newArrayList(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_GI_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_GI_ID));
							} else if (profileId.equals("AA14A-PF-0039")) {
								return new AA14UIUserScheduleData(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_AR_ID,			
																  Lists.newArrayList(AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_AR_ID,
																		  			 AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_AR_ID));
							} else {
								//throw new IllegalAccessError("Unknown schedule id for security profileId=" + profileId);
							}
							return outUserSchData;
						}
			  },
			  req);
	}
}
