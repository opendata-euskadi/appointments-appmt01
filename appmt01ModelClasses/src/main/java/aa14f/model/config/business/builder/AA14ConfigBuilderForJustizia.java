package aa14f.model.config.business.builder;

import static aa14f.model.config.business.AA14BusinessConfigForJustizia.JUSTIZIA_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_AM_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_AZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BAL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BK_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_DON_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_DUR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_EI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_GER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_GTX_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_IRU_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_TO_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_VI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_AM_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_AZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_BAL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_BER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_BK_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_DON_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_DUR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_EI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_GER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_GTX_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_IRU_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_TO_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_VI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_SOJ_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_SOJ_DON_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.LOC_JUSTIZIA_SOJ_VI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.ORG_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_EXP_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_EXP_BK_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_AM_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_AZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_BAL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_BER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_DON_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_DUR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_EI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_GER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_GTX_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_IRU_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_TO_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_GENERAL_VI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_INSC_BK_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_RC_MATRIMONIO_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_AM_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_AZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_BAL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_BER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_BK_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_DON_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_DUR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_EI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_GER_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_GTX_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_IRU_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_TO_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_REGISTRO_REPARTO_VI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_SOJ_BIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_SOJ_DON_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SCH_JUSTIZIA_SOJ_VI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SRV_REGISTRO_CIVIL_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SRV_REGISTRO_REPARTO_ID;
import static aa14f.model.config.business.AA14BusinessConfigForJustizia.SRV_SOJ_ID;

import java.util.Collection;

import com.google.common.collect.Lists;

import aa14f.model.config.AA14NotifierFromConfig;
import aa14f.model.config.AA14NotifierMessageComposingConfig;
import aa14f.model.config.AA14OrgDivision;
import aa14f.model.config.AA14OrgDivisionService;
import aa14f.model.config.AA14OrgDivisionServiceLocation;
import aa14f.model.config.AA14Organization;
import aa14f.model.config.AA14Schedule;
import aa14f.model.config.AA14ScheduleBookingConfig;
import aa14f.model.config.AA14ScheduleBookingLimit;
import aa14f.model.config.business.AA14BusinessConfigForJustizia;
import aa14f.model.oids.AA14IDs.AA14BusinessID;
import aa14f.model.oids.AA14OIDs.AA14OrgDivisionOID;
import aa14f.model.oids.AA14OIDs.AA14OrgDivisionServiceLocationOID;
import aa14f.model.oids.AA14OIDs.AA14OrgDivisionServiceOID;
import aa14f.model.oids.AA14OIDs.AA14OrganizationOID;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import r01f.locale.Language;
import r01f.locale.LanguageTexts.LangTextNotFoundBehabior;
import r01f.locale.LanguageTextsMapBacked;
import r01f.types.Color;
import r01f.types.Path;
import r01f.types.contact.ContactInfo;
import r01f.types.contact.ContactInfoUsage;
import r01f.types.contact.ContactMail;
import r01f.types.contact.ContactPhone;
import r01f.types.contact.EMail;
import r01f.types.contact.Phone;
import r01f.types.datetime.Time;
import r01f.types.geo.GeoMunicipality;
import r01f.types.geo.GeoOIDs.GeoZipCode;
import r01f.types.geo.GeoPosition;
import r01f.types.geo.GeoStreet;
import r01f.util.types.Dates;
import r01f.util.types.Strings;

/**
 *  Configuration for Justizia Applications
 *  
 *  Front end for Registry and delivery:
 *  One service with 14 locations/schedules 
 *  Each location matches with a judicial party for this municipality.
 *  	For each location, the judicial party is represented with the location municipality
 *  	In the location name the judicial party specific service name is located (instead of a more meaning text), for the appointment requestor to know
 *  	This location name is displayed in the front end as the "Location service", but internally all locations belong to the same service id. 
 *
 * Front end for Civil Registry:
 * 14 locations and 17 procedures
 * Most locations have a schedule for all the procedures, 2 locations will have several schedules grouping the procedures:
 * i.e: Bilbao will have 3 schedules, Barakaldo will have 2, and the rest will have only one.
 * 
 * Front end for Judicial Guidance Service:
 * 3 locations with an scheduler each
 * 
 */
@Slf4j
@Accessors(prefix="_")
public class AA14ConfigBuilderForJustizia 
	 extends AA14ConfigBuilderForEJGVBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  CONSTANTS
/////////////////////////////////////////////////////////////////////////////////////////
	// colors
	private static final Color COLOR_JUSTIZIA = Color.from("2f5a7c"); 
	
	// Texts
	private static final String SRV_REGISTRO_REPARTO_TXT_ES = "Registro y Reparto - Atención presencial";
	private static final String SRV_REGISTRO_REPARTO_TXT_EU = "Erregistro eta banaketa - Aurrez-aurreko arreta";
	private static final String PROCEDURE_TXT_ES = "Presentación de escritos de inicio";
	private static final String PROCEDURE_TXT_EU = "Hasierako Idazkiak aurkezteko gunea";
	
	private static final String LOC_REGISTRO_REPARTO_TXT_ES = "Servicio de Registro y Reparto";
	private static final String LOC_REGISTRO_REPARTO_TXT_EU = "Erregistro eta Banaketa Zerbitzua";
	private static final String LOC_AT_PUBLICO_TXT_ES = "Servicio de Información al Público";
	private static final String LOC_AT_PUBLICO_TXT_EU = "Herritarrentzako Informazio Zerbitzua";
	private static final String LOC_DEC_REGISTRO_CIVIL_TXT_ES = "Decanato y Registro Civil";
	private static final String LOC_DEC_REGISTRO_CIVIL_TXT_EU = "Dekanotza eta Erregistro Zibila";
	private static final String LOC_SERVICIOS_COMUNES_TXT_ES = "Servicios comunes";
	private static final String LOC_SERVICIOS_COMUNES_TXT_EU = "Zerbitzu Erkideak";
	private static final String LOC_SERVICIO_COMUN_PROCESAL_TXT_ES = "Servicio Común Procesal - Sección General";
	private static final String LOC_SERVICIO_COMUN_PROCESAL_TXT_EU = "Zerbitzu Erkide Prozesala - Atal Nagusia";
	private static final String SCH_REGISTRO_REPARTO_TXT_ES = "Registro y Reparto - Atención presencial";
	private static final String SCH_REGISTRO_REPARTO_TXT_EU = "Erregistro eta banaketa - Aurrez-aurreko arreta";
	
	private static final String LOC_RC_PATTERN_TXT_ES = "Registo civil de {}";
	private static final String LOC_RC_PATTERN_TXT_EU = "{}ko Erregistro Zibila";
	
	
	private static final String SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_TXT_ES = "Certifi./Fés de vida/Inscripc";
	private static final String SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_TXT_EU = "Zertifika/Bizi-fedea/Inskripzioa";
	private static final String SCH_JUSTIZIA_RC_MATRIMONIO_BIL_TXT_ES = "Matrimonio";
	private static final String SCH_JUSTIZIA_RC_MATRIMONIO_BIL_TXT_EU = "Ezkontza";
	private static final String SCH_JUSTIZIA_RC_EXP_TXT_ES = "Expedientes";
	private static final String SCH_JUSTIZIA_RC_EXP_TXT_EU = "Espedienteak";
	private static final String SCH_JUSTIZIA_RC_INSC_TXT_ES = "Inscripciones";
	private static final String SCH_JUSTIZIA_RC_INSC_TXT_EU = "Izen-emateak";
	private static final String SCH_JUSTIZIA_RC_GENERAL_TXT_ES = "General";
	private static final String SCH_JUSTIZIA_RC_GENERAL_TXT_EU = "Orokorra";
	
	private static final String SRV_REGISTRO_CIVIL_TXT_ES = "Registro civil - Atención presencial";
	private static final String SRV_REGISTRO_CIVIL_TXT_EU = "Erregistro Zibila - Aurrez-aurreko arreta";
	private static final String SRV_SOJ_TXT_ES = "Servicio de Orientación Judicial - Atención presencial";
	private static final String SRV_SOJ_TXT_EU = "Orientazio Juridikoko Zerbitzua - Aurrez-aurreko arreta";
	private static final String LOC_SOJ_PATTERN_TXT_ES = "Servicio de Orientación Judicial, {}";
	private static final String LOC_SOJ_PATTERN_TXT_EU = "Orientazio Juridikoko Zerbitzua, {}";
	private static final String SCH_JUSTIZIA_SOJ_TXT_ES = "Servicio de Orientación Judicial - Atención presencial";
	private static final String SCH_JUSTIZIA_SOJ_TXT_EU = "Orientazio Juridikoko Zerbitzua - Aurrez-aurreko arreta";
	
	
/////////////////////////////////////////////////////////////////////////////////////////
//  METHODS
/////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////
//	ORGS
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public AA14Organization createOrganizationConfig(final AA14BusinessID businessId) {
		// --- Organization
		AA14Organization org = _buildOrganization(businessId,
												  AA14OrganizationOID.supply(),ORG_ID,
												  "Eusko Jaurlaritza / Gobierno Vasco","Eusko Jaurlaritza / Gobierno Vasco");
		org.setNotifierFromConfig(this.createNotifierFromConfig());
		log.warn("[Org]: Created {}",
				  org.getId());
		return org;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	ORG DIVISION
/////////////////////////////////////////////////////////////////////////////////////////	
	@Override
	public Collection<AA14OrgDivision> createOrgDivisionConfigs(final AA14Organization org) {
		Collection<AA14OrgDivision> outDivs = Lists.newArrayListWithExpectedSize(1);		
		// --- Division
		{
			AA14OrgDivision division = _buildDivision(AA14BusinessID.JUSTIZIA,
													  org,
									  				  AA14OrgDivisionOID.supply(),JUSTIZIA_ID,
									  				  "Justizia","Justizia");
			outDivs.add(division);
			log.warn("\t[Division]: Created {}",
					  division.getId());
		}
		return outDivs;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	SERVICES
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14OrgDivisionService> createOrgDivisionServicesConfigs(final AA14Organization org,
									  							      		   final Collection<AA14OrgDivision> divisions) {
		Collection<AA14OrgDivisionService> outServices = Lists.newArrayListWithExpectedSize(3);
		// --- Service: Registration and delivery
		{
			AA14OrgDivisionService registrationAndDeliveryService = _buildService(AA14BusinessID.JUSTIZIA,
																				  org,
															    				  this.within(divisions).find(JUSTIZIA_ID),
															    				  AA14OrgDivisionServiceOID.supply(),SRV_REGISTRO_REPARTO_ID,
															    				  SRV_REGISTRO_REPARTO_TXT_ES,SRV_REGISTRO_REPARTO_TXT_EU);
			registrationAndDeliveryService.setProcedure(new LanguageTextsMapBacked(LangTextNotFoundBehabior.RETURN_NULL)
															     .add(Language.SPANISH,PROCEDURE_TXT_ES)
															     .add(Language.BASQUE,PROCEDURE_TXT_EU));
			registrationAndDeliveryService.setNotifierMessageComposingConfig(this.createNotifierMessageComposingConfig());
			outServices.add(registrationAndDeliveryService);
			log.warn("\t\t[Service]: Created {}",
					 registrationAndDeliveryService.getId());
		}
		// --- Service: Civil Registration
		{
			AA14OrgDivisionService crService = _buildService(AA14BusinessID.JUSTIZIA,
																				  org,
															    				  this.within(divisions).find(JUSTIZIA_ID),
															    				  AA14OrgDivisionServiceOID.supply(),SRV_REGISTRO_CIVIL_ID,
															    				  SRV_REGISTRO_CIVIL_TXT_ES,SRV_REGISTRO_CIVIL_TXT_EU);
			crService.setNotifierMessageComposingConfig(this.createNotifierMessageComposingConfig());
			outServices.add(crService);
			log.warn("\t\t[Service]: Created {}",
					 crService.getId());
		}
		// --- Service: Judicial Guidance Service
		{
			AA14OrgDivisionService jgService = _buildService(AA14BusinessID.JUSTIZIA,
																				  org,
															    				  this.within(divisions).find(JUSTIZIA_ID),
															    				  AA14OrgDivisionServiceOID.supply(),SRV_SOJ_ID,
															    				  SRV_SOJ_TXT_ES,SRV_SOJ_TXT_EU);
			jgService.setNotifierMessageComposingConfig(this.createNotifierMessageComposingConfig());
			outServices.add(jgService);
			log.warn("\t\t[Service]: Created {}",
					 jgService.getId());
		}
		return outServices;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	LOCATION
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14OrgDivisionServiceLocation> createOrgDivisionServiceLocationsConfigs(final AA14Organization org,
																  							   final Collection<AA14OrgDivision> divisions,
																  							   final Collection<AA14OrgDivisionService> services) {
		Collection<AA14OrgDivisionServiceLocation> outLocs = Lists.newArrayListWithExpectedSize(14);
		
		// --- Location: Registration and delivery Bilbao
		{
			AA14OrgDivisionServiceLocation bilbaoRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_REPARTO_BIL_ID,
																			 LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																			 _buildRDBilbaoGeoPosition(),
																			 _buildRDBilbaoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(bilbaoRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 bilbaoRDLocation.getId());
		}
		// --- Location: Civil registry - Bilbao
		{
			AA14OrgDivisionServiceLocation bilbaoCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BIL_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Bilbao"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Bilbo"),
																			 _buildRCBilbaoGeoPosition(),
																			 _buildRCBilbaoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(bilbaoCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 bilbaoCRLocation.getId());
		}
		// --- Location: Judicial Guidance Service - Bilbao
		{
			AA14OrgDivisionServiceLocation bilbaoJGSLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_SOJ_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_SOJ_BIL_ID,
																			 Strings.customized(LOC_SOJ_PATTERN_TXT_ES, "Bilbao"),Strings.customized(LOC_SOJ_PATTERN_TXT_EU, "Bilbo"),
																			 _buildSOJBilbaoGeoPosition(),
																			 _buildSOJBilbaoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(bilbaoJGSLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 bilbaoJGSLocation.getId());
		}
		
		// --- Location: Registration and delivery Getxo
		{
			AA14OrgDivisionServiceLocation getxoRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			org,
																		    this.within(divisions).find(JUSTIZIA_ID),
																		    this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																		    AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_GTX_ID,
																		    LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																		    _buildRDGetxoGeoPosition(),
																		    _buildRDGetxoContactInfo(),
																		    COLOR_JUSTIZIA);
			outLocs.add(getxoRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 getxoRDLocation.getId());
		}
		// --- Location: Civil registry - Getxo
		{
			AA14OrgDivisionServiceLocation getxoCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_GTX_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Getxo"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Getxo"),
																			 _buildRCGetxoGeoPosition(),
																			 _buildRCGetxoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(getxoCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 getxoCRLocation.getId());
		}
		// --- Location: Registration and delivery Gernika-Lumo
		{
			AA14OrgDivisionServiceLocation gernikaRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			  org,
																			  this.within(divisions).find(JUSTIZIA_ID),
																			  this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			  AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_GER_ID,
																			  LOC_AT_PUBLICO_TXT_ES,LOC_AT_PUBLICO_TXT_EU,
																			  _buildRDGernikaLumoGeoPosition(),
																			  _buildRDGernikaLumoContactInfo(),
																			  COLOR_JUSTIZIA);
			outLocs.add(gernikaRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 gernikaRDLocation.getId());
		}
		// --- Location: Civil registry - Gernika-Lumo
		{
			AA14OrgDivisionServiceLocation gernikaCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_GER_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Gernika"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Gernika"),
																			 _buildRCGernikaLumoGeoPosition(),
																			 _buildRCGernikaLumoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(gernikaCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 gernikaCRLocation.getId());
		}
		// --- Location: Registration and delivery Durango
		{
			AA14OrgDivisionServiceLocation durangoRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			  org,
																			  this.within(divisions).find(JUSTIZIA_ID),
																			  this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			  AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_DUR_ID,
																			  LOC_DEC_REGISTRO_CIVIL_TXT_ES, LOC_DEC_REGISTRO_CIVIL_TXT_EU,
																			  _buildRDDurangoGeoPosition(),
																			  _buildRDDurangoContactInfo(),
																			  COLOR_JUSTIZIA);
			outLocs.add(durangoRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 durangoRDLocation.getId());			
		}
		// --- Location: Civil registry - Durango
		{
			AA14OrgDivisionServiceLocation durangoCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_DUR_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Durango"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Durango"),
																			 _buildRCDurangoGeoPosition(),
																			 _buildRCDurangoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(durangoCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 durangoCRLocation.getId());
		}
		// --- Location: Registration and delivery Balmaseda
		{
			AA14OrgDivisionServiceLocation balmasedaRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																				org,
																				this.within(divisions).find(JUSTIZIA_ID),
																				this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																				AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_BAL_ID,
																				LOC_SERVICIOS_COMUNES_TXT_ES + ", Balmaseda", LOC_SERVICIOS_COMUNES_TXT_EU + ", Balmaseda",
																				_buildRDBalmasedaGeoPosition(),
																				_buildRDBalmasedaContactInfo(),
																				COLOR_JUSTIZIA);
			outLocs.add(balmasedaRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 balmasedaRDLocation.getId());
		}
		// --- Location: Civil registry - Balmaseda
		{
			AA14OrgDivisionServiceLocation balmasedaCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BAL_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Balmaseda"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Balmaseda"),
																			 _buildRCBalmasedaGeoPosition(),
																			 _buildRCBalmasedaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(balmasedaCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 balmasedaCRLocation.getId());
		}
		// --- Location: Registration and delivery Barakaldo
		{
			AA14OrgDivisionServiceLocation barakaldoRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																				org,
																				this.within(divisions).find(JUSTIZIA_ID),
																				this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																				AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_BK_ID,
																				LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																				_buildRDBarakaldoGeoPosition(),
																				_buildRDBarakaldoContactInfo(),
																				COLOR_JUSTIZIA);
			outLocs.add(barakaldoRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 barakaldoRDLocation.getId());
		}
		// --- Location: Civil registry - Barakaldo
		{
			AA14OrgDivisionServiceLocation barakaldoCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BK_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Barakaldo"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Barakado"),
																			 _buildRCBarakaldoGeoPosition(),
																			 _buildRCBarakaldoContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(barakaldoCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 barakaldoCRLocation.getId());
		}
		// --- Location: Registration and delivery Amurrio
		{
			AA14OrgDivisionServiceLocation amurrioRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			  org,
																			  this.within(divisions).find(JUSTIZIA_ID),
																			  this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			  AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_AM_ID,
																			  LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																			  _buildRDAmurrioGeoPosition(),
																			  _buildRDAmurrioContactInfo(),
																			  COLOR_JUSTIZIA);
			outLocs.add(amurrioRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 amurrioRDLocation.getId());
		}
		// --- Location: Civil registry - Amurrio
		{
			AA14OrgDivisionServiceLocation amurrioCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_AM_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Amurrio"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Amurrio"),
																			 _buildRCAmurrioGeoPosition(),
																			 _buildRCAmurrioContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(amurrioCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 amurrioCRLocation.getId());
		}
		// --- Location: Registration and delivery Vitoria-Gasteiz
		{
			AA14OrgDivisionServiceLocation vitoriaRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			  org,
																			  this.within(divisions).find(JUSTIZIA_ID),
																			  this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			  AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_VI_ID,
																			  LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																			  _buildRDVitoriaGeoPosition(),
																			  _buildRDVitoriaContactInfo(),
																			  COLOR_JUSTIZIA);
			outLocs.add(vitoriaRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 vitoriaRDLocation.getId());
		}
		// --- Location: Civil registry - Vitoria-Gazteiz
		{
			AA14OrgDivisionServiceLocation vitoriaCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_VI_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Vitoria-Gazteiz"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Gazteiz"),
																			 _buildRCVitoriaGeoPosition(),
																			 _buildRCVitoriaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(vitoriaCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 vitoriaCRLocation.getId());
		}
		// --- Location: Judicial Guidance Service - Vitoria-Gazteiz
		{
			AA14OrgDivisionServiceLocation vitoriaJGSLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_SOJ_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_SOJ_VI_ID,
																			 Strings.customized(LOC_SOJ_PATTERN_TXT_ES, "Vitoria-Gazteiz"),Strings.customized(LOC_SOJ_PATTERN_TXT_EU, "Vitoria-Gazteiz"),
																			 _buildSOJVitoriaGeoPosition(),
																			 _buildSOJVitoriaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(vitoriaJGSLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 vitoriaJGSLocation.getId());
		}
		// --- Location: Registration and delivery Azpeitia
		{
			AA14OrgDivisionServiceLocation azpeitiaRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			   org,
																			   this.within(divisions).find(JUSTIZIA_ID),
																			   this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			   AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_AZ_ID,
																			   LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																			   _buildRDAzpeitiaGeoPosition(),
																			   _buildRDAzpeitiaContactInfo(),
																			   COLOR_JUSTIZIA);
			outLocs.add(azpeitiaRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 azpeitiaRDLocation.getId());
		}
		// --- Location: Civil registry - Azpeitia
		{
			AA14OrgDivisionServiceLocation azpeitiaCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_AZ_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Azpeitia"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Azpeitia"),
																			 _buildRCAzpeitiaGeoPosition(),
																			 _buildRCAzpeitiaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(azpeitiaCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 azpeitiaCRLocation.getId());
		}
		// --- Location: Registration and delivery Bergara
		{
			AA14OrgDivisionServiceLocation bergaraRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			  org,
																			  this.within(divisions).find(JUSTIZIA_ID),
																			  this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			  AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_BER_ID,
																			  LOC_REGISTRO_REPARTO_TXT_ES, LOC_REGISTRO_REPARTO_TXT_EU,
																			  _buildRDBergaraGeoPosition(),
																			  _buildRDBergaraContactInfo(),
																			  COLOR_JUSTIZIA);
			outLocs.add(bergaraRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 bergaraRDLocation.getId());
		}
		// --- Location: Civil registry - Bergara
		{
			AA14OrgDivisionServiceLocation bergaraCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_BER_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Bergara"),Strings.customized(LOC_RC_PATTERN_TXT_EU, "Bergara"),
																			 _buildRCBergaraGeoPosition(),
																			 _buildRCBergaraContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(bergaraCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 bergaraCRLocation.getId());
		}
		// --- Location: Registration and delivery Irun
		{
			AA14OrgDivisionServiceLocation irunRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																		   org,
																		   this.within(divisions).find(JUSTIZIA_ID),
																		   this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																		   AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_IRU_ID,
																		   LOC_SERVICIO_COMUN_PROCESAL_TXT_ES,LOC_SERVICIO_COMUN_PROCESAL_TXT_EU,
																		   _buildRDIrunGeoPosition(),
																		   _buildRDIrunContactInfo(),
																		   COLOR_JUSTIZIA);
			outLocs.add(irunRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 irunRDLocation.getId());
		}
		// --- Location: Civil registry - Irun
		{
			AA14OrgDivisionServiceLocation irunCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_IRU_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Irun"),"Irungo Erregistro Zibila",
																			 _buildRCIrunGeoPosition(),
																			 _buildRCIrunContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(irunCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 irunCRLocation.getId());
		}
		// --- Location: Registration and delivery Eibar
		{
			AA14OrgDivisionServiceLocation eibarRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			org,
																			this.within(divisions).find(JUSTIZIA_ID),
																			this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_EI_ID,
																			LOC_DEC_REGISTRO_CIVIL_TXT_ES, LOC_DEC_REGISTRO_CIVIL_TXT_EU,
																			_buildRDEibarGeoPosition(),
																			_buildRDEibarContactInfo(),
																			COLOR_JUSTIZIA);
			outLocs.add(eibarRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 eibarRDLocation.getId());
		}
		// --- Location: Civil registry - Eibar
		{
			AA14OrgDivisionServiceLocation eibarCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_EI_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Bergara"),"Eibarreko Erregistro Zibila",
																			 _buildRCEibarGeoPosition(),
																			 _buildRCEibarContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(eibarCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 eibarCRLocation.getId());
		}
		// --- Location: Registration and delivery Tolosa
		{
			AA14OrgDivisionServiceLocation tolosaRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_TO_ID,
																			 LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																			 _buildRDTolosaGeoPosition(),
																			 _buildRDTolosaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(tolosaRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 tolosaRDLocation.getId());
		}
		// --- Location: Civil registry - Tolosa
		{
			AA14OrgDivisionServiceLocation tolosaCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_TO_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Tolosa"),Strings.customized(LOC_RC_PATTERN_TXT_EU,"Tolosa"),
																			 _buildRCTolosaGeoPosition(),
																			 _buildRCTolosaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(tolosaCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 tolosaCRLocation.getId());
		}
		// --- Location: Registration and delivery Donostia/San Sebastian
		{
			AA14OrgDivisionServiceLocation donostiaRDLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			   org,
																			   this.within(divisions).find(JUSTIZIA_ID),
																			   this.within(services).find(SRV_REGISTRO_REPARTO_ID),
																			   AA14OrgDivisionServiceLocationOID.supply(),LOC_JUSTIZIA_REGISTRO_REPARTO_DON_ID,
																			   LOC_AT_PUBLICO_TXT_ES, LOC_AT_PUBLICO_TXT_EU,
																			   _buildRDDonostiaGeoPosition(),
																			   _buildRDDonostiaContactInfo(),
																			   COLOR_JUSTIZIA);
			outLocs.add(donostiaRDLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 donostiaRDLocation.getId());
		};
		// --- Location: Civil registry - Donostia/San Sebastian
		{
			AA14OrgDivisionServiceLocation eibarCRLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_REGISTRO_CIVIL_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_REGISTRO_CIVIL_DON_ID,
																			 Strings.customized(LOC_RC_PATTERN_TXT_ES, "Donostia/San Sebastián"),Strings.customized(LOC_RC_PATTERN_TXT_EU,"Donostia"),
																			 _buildRCDonostiaGeoPosition(),
																			 _buildRCDonostiaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(eibarCRLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 eibarCRLocation.getId());
		}
		// --- Location: Judicial Guidance Service - Donostia/San Sebastian
		{
			AA14OrgDivisionServiceLocation donostiaJGSLocation = _buildLocation(AA14BusinessID.JUSTIZIA,
																			 org,
																			 this.within(divisions).find(JUSTIZIA_ID),
																			 this.within(services).find(SRV_SOJ_ID),
																			 AA14OrgDivisionServiceLocationOID.supply(),AA14BusinessConfigForJustizia.LOC_JUSTIZIA_SOJ_DON_ID,
																			 Strings.customized(LOC_SOJ_PATTERN_TXT_ES, "Donostia/San Sebastián"),Strings.customized(LOC_SOJ_PATTERN_TXT_EU, "Donostia/San Sebastián"),
																			 _buildSOJDonostiaGeoPosition(),
																			 _buildSOJDonostiaContactInfo(),
																			 COLOR_JUSTIZIA);
			outLocs.add(donostiaJGSLocation);
			log.warn("\t\t\t[Location]: Created {}",
					 donostiaJGSLocation.getId());
		}
		return outLocs;
		
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	SCHEDULES
/////////////////////////////////////////////////////////////////////////////////////////	
	@Override
	public Collection<AA14Schedule> createSchedulesConfigs(final AA14Organization org,
														   final Collection<AA14OrgDivision> divisions,
														   final Collection<AA14OrgDivisionService> services,
														   final Collection<AA14OrgDivisionServiceLocation> locs) {
		Collection<AA14Schedule> outSchs = Lists.newArrayListWithExpectedSize(3);
		
		// Schedule: Registration and delivery Bilbao
		{
			AA14Schedule bilbaoRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_REGISTRO_REPARTO_BIL_ID,
												  	  SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Bilbao)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Bilbao)",
												  	  _createJustiziaRDScheduleBookingConfig(2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_BIL_ID));
			outSchs.add(bilbaoRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bilbaoRDSch.getId());
		}
		// Schedule: Civil Registry - Certifications, Proof of Life, Registrations  Bilbao (all Barakaldo schedules need the same booking config, i.e: seame number of resources)
		{
			AA14Schedule bilbaoCROtherSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_ID,
												  	  SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_TXT_ES + " SCHEDULE (Bilbao)",SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_TXT_EU + " SCHEDULE (Bilbao)",
												  	  _createJustiziaCRScheduleBookingConfig("20:00", 3),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BIL_ID));
			outSchs.add(bilbaoCROtherSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bilbaoCROtherSch.getId());
		}
		// Schedule: Civil Registry - Marriage Bilbao (all Bilbao schedules need the same booking config, i.e: seame number of resources)
		{
			AA14Schedule bilbaoCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_MATRIMONIO_BIL_ID,
												  	  SCH_JUSTIZIA_RC_MATRIMONIO_BIL_TXT_ES + " SCHEDULE (Bilbao)",SCH_JUSTIZIA_RC_MATRIMONIO_BIL_TXT_EU + " SCHEDULE (Bilbao)",
												  	  _createJustiziaCRScheduleBookingConfig("20:00", 3),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BIL_ID));
			outSchs.add(bilbaoCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bilbaoCRBDSch.getId());
		}
		// Schedule: Civil Registry - Proceedings (all Bilbao schedules need the same booking config, i.e: seame number of resources)
		{
			AA14Schedule bilbaoCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_EXP_BIL_ID,
												  	  SCH_JUSTIZIA_RC_EXP_TXT_ES + " SCHEDULE (Bilbao)",SCH_JUSTIZIA_RC_EXP_TXT_EU + " SCHEDULE (Bilbao)",
												  	  _createJustiziaCRScheduleBookingConfig("20:00", 3),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BIL_ID));
			outSchs.add(bilbaoCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bilbaoCRBDSch.getId());
		}
		// Schedule: Judicial Guidance Service - Bilbao
		{
			AA14Schedule bilbaoSOJSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_SOJ_BIL_ID,
												  	  SCH_JUSTIZIA_SOJ_TXT_ES + " SCHEDULE (Bilbao)",SCH_JUSTIZIA_SOJ_TXT_EU + " SCHEDULE (Bilbao)",
												  	  _createJustiziaSOJScheduleBookingConfig(3),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_SOJ_BIL_ID));
			outSchs.add(bilbaoSOJSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bilbaoSOJSch.getId());
		}
		// Schedule: Registration and delivery Getxo
		{
			AA14Schedule getxoRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													 SCH_JUSTIZIA_REGISTRO_REPARTO_GTX_ID,
												  	 SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Getxo)", SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Getxo)",
												  	 _createJustiziaRDScheduleBookingConfig(2),
												  	 null,		// no qmatic orchestra config
												  	 this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_GTX_ID));
			outSchs.add(getxoRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 getxoRDSch.getId());
		}
		// Schedule: Civil Registry - Getxo
		{
			AA14Schedule getxoCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_GTX_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Getxo)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Getxo)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_GTX_ID));
			outSchs.add(getxoCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 getxoCRBDSch.getId());
		}
		// Schedule: Registration and delivery Gernika-Lumo
		{
			AA14Schedule gernikaRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													   SCH_JUSTIZIA_REGISTRO_REPARTO_GER_ID,
												  	   SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Gernika-Lumo)", SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Gernika-Lumo)",
												  	   _createJustiziaRDScheduleBookingConfig(1),
												  	   null,		// no qmatic orchestra config
												  	   this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_GER_ID));
			outSchs.add(gernikaRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 gernikaRDSch.getId());
		}
		// Schedule: Civil Registry - Gernika-Lumo
		{
			AA14Schedule gernikaCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_GER_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Gernika-Lumo)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Gernika-Lumo)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_GER_ID));
			outSchs.add(gernikaCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 gernikaCRBDSch.getId());
		}
		// Schedule: Registration and delivery Durango
		{
			AA14Schedule durangoRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													   SCH_JUSTIZIA_REGISTRO_REPARTO_DUR_ID,
												  	   SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Durango)", SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Durango)",
												  	   _createJustiziaRDScheduleBookingConfig(1),
												  	   null,		// no qmatic orchestra config
												  	   this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_DUR_ID));
			outSchs.add(durangoRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 durangoRDSch.getId());
		}
		// Schedule: Civil Registry - Durango
		{
			AA14Schedule durangoCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_DUR_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Durango)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Durango)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_DUR_ID));
			outSchs.add(durangoCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 durangoCRBDSch.getId());
		}
		// Schedule: Registration and delivery Balmaseda
		{
			AA14Schedule balmasedaRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
														 SCH_JUSTIZIA_REGISTRO_REPARTO_BAL_ID,
												  		 SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Balmaseda)", SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Balmaseda)",
												  		 _createJustiziaRDScheduleBookingConfig(1),
												  		 null,		// no qmatic orchestra config
												  		 this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_BAL_ID));
			outSchs.add(balmasedaRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 balmasedaRDSch.getId());
		}
		// Schedule: Civil Registry - Balmaseda
		{
			AA14Schedule balmasedaCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_BAL_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Balmaseda)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Balmaseda)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BAL_ID));
			outSchs.add(balmasedaCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 balmasedaCRBDSch.getId());
		}
		// Schedule: Registration and delivery Barakaldo (all Barakaldo schedules need the same booking config, i.e: seame number of resources)
		{
			AA14Schedule barakaldoRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
														 SCH_JUSTIZIA_REGISTRO_REPARTO_BK_ID,
												  		 SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Barakaldo)", SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Barakaldo)",
												  		 _createJustiziaRDScheduleBookingConfig(3),
												  		 null,		// no qmatic orchestra config
												  		 this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_BK_ID));
			outSchs.add(barakaldoRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 barakaldoRDSch.getId());
		}
		// Schedule: Civil Registry - Inscriptions Barakaldo (all Barakaldo schedules need the same booking config, i.e: seame number of resources)
		{
			AA14Schedule barakaldoCRInscDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  		  SCH_JUSTIZIA_RC_INSC_BK_ID,
													  		  SCH_JUSTIZIA_RC_INSC_TXT_ES + " SCHEDULE (Barakaldo)",SCH_JUSTIZIA_RC_INSC_TXT_EU + " SCHEDULE (Barakaldo)",
													  		  _createJustiziaCRScheduleBookingConfig("20:00", 3),
													  		  null,		// no qmatic orchestra config
													  		  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BK_ID));
			outSchs.add(barakaldoCRInscDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 barakaldoCRInscDSch.getId());
		}
		// Schedule: Civil Registry - Proceedings Barakaldo
		{
			AA14Schedule barakaldoCRExpSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  		SCH_JUSTIZIA_RC_EXP_BK_ID,
													  		SCH_JUSTIZIA_RC_EXP_TXT_ES + " SCHEDULE (Barakaldo)",SCH_JUSTIZIA_RC_EXP_TXT_EU + " SCHEDULE (Barakaldo)",
													  		_createJustiziaCRScheduleBookingConfig("20:00", 3),
													  		null,		// no qmatic orchestra config
													  		this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BK_ID));
			outSchs.add(barakaldoCRExpSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 barakaldoCRExpSch.getId());
		}
		// Schedule: Registration and delivery Amurrio
		{
			AA14Schedule amurrioRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													   SCH_JUSTIZIA_REGISTRO_REPARTO_AM_ID,
												  	   SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Amurrio)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Amurrio)",
												  	   _createJustiziaRDScheduleBookingConfig(1),
												  	   null,		// no qmatic orchestra config
												  	   this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_AM_ID));
			outSchs.add(amurrioRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 amurrioRDSch.getId());
		}
		// Schedule: Civil Registry - Amurrio
		{
			AA14Schedule amurrioCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_AM_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Amurrio)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Amurrio)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_AM_ID));
			outSchs.add(amurrioCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 amurrioCRBDSch.getId());
		}
		// Schedule: Registration and delivery Vitoria-Gazteiz
		{
			AA14Schedule vitoriaRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													   SCH_JUSTIZIA_REGISTRO_REPARTO_VI_ID,
												  	   SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Vitoria-Gazteiz)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Vitoria-Gazteiz)",
												  	   _createJustiziaRDScheduleBookingConfig(2),
												  	   null,		// no qmatic orchestra config
												  	   this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_VI_ID));
			outSchs.add(vitoriaRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 vitoriaRDSch.getId());
		}
		// Schedule: Civil Registry - Vitoria-Gazteiz
		{
			AA14Schedule vitoriaCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_VI_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Vitoria-Gazteiz)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Vitoria-Gazteiz)",
												  	  _createJustiziaCRScheduleBookingConfig("20:00", 6),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_VI_ID));
			outSchs.add(vitoriaCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 vitoriaCRBDSch.getId());
		}
		// Schedule: Judicial Guidance Service - Vitoria
		{
			AA14Schedule vitoriaSOJSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_SOJ_VI_ID,
												  	  SCH_JUSTIZIA_SOJ_TXT_ES + " SCHEDULE (Vitoria)",SCH_JUSTIZIA_SOJ_TXT_EU + " SCHEDULE (Vitoria)",
												  	  _createJustiziaSOJScheduleBookingConfig(2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_SOJ_VI_ID));
			outSchs.add(vitoriaSOJSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 vitoriaSOJSch.getId());
		}
		// Schedule: Registration and delivery Azpeitia
		{
			AA14Schedule azpeitiaRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
														SCH_JUSTIZIA_REGISTRO_REPARTO_AZ_ID,
												  		SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Azpeitia)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Azpeitia)",
												  		_createJustiziaRDScheduleBookingConfig(1),
												  		null,		// no qmatic orchestra config
												  		this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_AZ_ID));
			outSchs.add(azpeitiaRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 azpeitiaRDSch.getId());
		}
		// Schedule: Civil Registry - Azpeitia
		{
			AA14Schedule azpeitiaCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_AZ_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Azpeitia)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Azpeitia)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_AZ_ID));
			outSchs.add(azpeitiaCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 azpeitiaCRBDSch.getId());
		}
		// Schedule: Registration and delivery Bergara
		{
			AA14Schedule bergaraRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													   SCH_JUSTIZIA_REGISTRO_REPARTO_BER_ID,
												  	   SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Bergara)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Bergara)",
												  	   _createJustiziaRDScheduleBookingConfig(1),
												  	   null,		// no qmatic orchestra config
												  	   this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_BER_ID));
			outSchs.add(bergaraRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bergaraRDSch.getId());
		}
		// Schedule: Civil Registry - Bergara
		{
			AA14Schedule bergaraCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_BER_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Bergara)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Bergara)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_BER_ID));
			outSchs.add(bergaraCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 bergaraCRBDSch.getId());
		}
		// Schedule: Registration and delivery Irun
		{
			AA14Schedule irunRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													SCH_JUSTIZIA_REGISTRO_REPARTO_IRU_ID,
												  	SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Irun)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Irun)",
												  	_createJustiziaRDScheduleBookingConfig(1),
												  	null,		// no qmatic orchestra config
												  	this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_IRU_ID));
			outSchs.add(irunRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 irunRDSch.getId());
		}
		// Schedule: Civil Registry - Irun
		{
			AA14Schedule irunCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_IRU_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Irun)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Irun)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_IRU_ID));
			outSchs.add(irunCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 irunCRBDSch.getId());
		}
		// Schedule: Registration and delivery Eibar
		{
			AA14Schedule eibarRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													 SCH_JUSTIZIA_REGISTRO_REPARTO_EI_ID,
												  	 SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Eibar)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Eibar)",
												  	 _createJustiziaRDScheduleBookingConfig(1),
												  	 null,		// no qmatic orchestra config
												  	 this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_EI_ID));
			outSchs.add(eibarRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 eibarRDSch.getId());
		}
		// Schedule: Civil Registry - Eibar
		{
			AA14Schedule eibarCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_EI_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Eibar)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Eibar)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_EI_ID));
			outSchs.add(eibarCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 eibarCRBDSch.getId());
		}
		// Schedule: Registration and delivery Tolosa
		{
			AA14Schedule tolosaRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_REGISTRO_REPARTO_TO_ID,
												  	  SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Tolosa)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Tolosa)",
												  	  _createJustiziaRDScheduleBookingConfig(1),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_TO_ID));
			outSchs.add(tolosaRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 tolosaRDSch.getId());
		}
		// Schedule: Civil Registry - Tolosa
		{
			AA14Schedule eibarCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_TO_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Tolosa)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Tolosa)",
												  	  _createJustiziaCRScheduleBookingConfig("14:00", 2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_TO_ID));
			outSchs.add(eibarCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 eibarCRBDSch.getId());
		}
		// Schedule: Registration and delivery Donostia/San Sebastian
		{
			AA14Schedule donostiaRDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
														SCH_JUSTIZIA_REGISTRO_REPARTO_DON_ID,
												  		SCH_REGISTRO_REPARTO_TXT_ES + " SCHEDULE (Donostia/San Sebastián)",SCH_REGISTRO_REPARTO_TXT_EU + " SCHEDULE (Donostia-San Sebastián)",
												  		_createJustiziaRDScheduleBookingConfig(2),
												  		null,		// no qmatic orchestra config
												  		this.within(locs).find(LOC_JUSTIZIA_REGISTRO_REPARTO_DON_ID));
			outSchs.add(donostiaRDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 donostiaRDSch.getId());
		}
		// Schedule: Civil Registry - Donostia/San Sebastian
		{
			AA14Schedule donostiaCRBDSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_RC_GENERAL_DON_ID,
												  	  SCH_JUSTIZIA_RC_GENERAL_TXT_ES + " SCHEDULE (Donostia/San Sebastián)",SCH_JUSTIZIA_RC_GENERAL_TXT_EU + " SCHEDULE (Donostia/San Sebastián)",
												  	  _createJustiziaCRScheduleBookingConfig("20:00", 6),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_REGISTRO_CIVIL_DON_ID));
			outSchs.add(donostiaCRBDSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 donostiaCRBDSch.getId());
		}
		// Schedule: Judicial Guidance Service - Donostia/San Sebastian
		{
			AA14Schedule donostiaSOJSch = _buildSchedule(AA14BusinessID.JUSTIZIA,
													  SCH_JUSTIZIA_SOJ_DON_ID,
												  	  SCH_JUSTIZIA_SOJ_TXT_ES + " SCHEDULE (Donostia/San Sebastian)",SCH_JUSTIZIA_SOJ_TXT_EU + " SCHEDULE (Donostia/San Sebastian)",
												  	  _createJustiziaSOJScheduleBookingConfig(2),
												  	  null,		// no qmatic orchestra config
												  	  this.within(locs).find(LOC_JUSTIZIA_SOJ_DON_ID));
			outSchs.add(donostiaSOJSch);
			log.warn("\t\t\t[Schedule]: Created {}",
					 donostiaSOJSch.getId());
		}
		return outSchs;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	 
/////////////////////////////////////////////////////////////////////////////////////////
	private static AA14ScheduleBookingConfig _createJustiziaRDScheduleBookingConfig(final int maxAppointments) {
		return new AA14ScheduleBookingConfig(Time.of("9:00"),		// day bookable range start 
				    						 Time.of("14:00"),		// day bookable range end
											 10,					// slot length
											 maxAppointments,		// max appointments in slot
											 new AA14ScheduleBookingLimit(Dates.fromFormatedString("31/12/2020", Dates.ES_DEFAULT_FORMAT)));// future booking limit
	}
	private static AA14ScheduleBookingConfig _createJustiziaCRScheduleBookingConfig(final String dayBookableRangeEnd, 
																					final int maxAppointments) {
		return new AA14ScheduleBookingConfig(Time.of("9:00"),		// day bookable range start 
				    						 Time.of(dayBookableRangeEnd),		// day bookable range end
											 10,					// slot length
											 maxAppointments,		// max appointments in slot
											 new AA14ScheduleBookingLimit(Dates.fromFormatedString("31/12/2020", Dates.ES_DEFAULT_FORMAT)));// future booking limit
	}
	private static AA14ScheduleBookingConfig _createJustiziaSOJScheduleBookingConfig(final int maxAppointments) {
		return new AA14ScheduleBookingConfig(Time.of("9:00"),		// day bookable range start 
				    						 Time.of("14:00"),		// day bookable range end
											 15,					// slot length
											 maxAppointments,		// max appointments in slot
											 new AA14ScheduleBookingLimit(Dates.fromFormatedString("31/12/2020", Dates.ES_DEFAULT_FORMAT)));// future booking limit
	}
/////////////////////////////////////////////////////////////////////////////////////////
//  
/////////////////////////////////////////////////////////////////////////////////////////
	
	private GeoPosition _buildRDBergaraGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Bergara")
													  	   .withNameInLang(Language.BASQUE,"Bergara"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Ariznoa Enparantza, s/n, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Ariznoa Enparantza, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20570"));
	}
	private ContactInfo _buildRDBergaraContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943038055"));
	}
	private ContactInfo _buildRDAzpeitiaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943025191"));
	}
	private GeoPosition _buildRDAzpeitiaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Azpeitia")
													  	   .withNameInLang(Language.BASQUE,"Azpeitia"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Bº Sanjuandegi, Euskalerria 30")
							  			   .withNameInLang(Language.BASQUE,"Sanjuandegi Auz., Euskalerria 30"))
						  .withZipCode(GeoZipCode.forId("20530"));
	}
	private ContactInfo _buildRDVitoriaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("945004897"));
	}
	private GeoPosition _buildRDVitoriaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(ARABA_COUNTY)
						  .withMunicipality(GASTEIZ)
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Avenida Gasteiz, 18, Planta de Acceso")
							  			   .withNameInLang(Language.BASQUE,"Gasteiz Etorbidea, 18, Sarbide solairua"))
						  .withZipCode(GeoZipCode.forId("01008"));
	}
	private ContactInfo _buildRDAmurrioContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("945026990"));
	}
	private GeoPosition _buildRDAmurrioGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(ARABA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Amurrio")
													  	   .withNameInLang(Language.BASQUE,"Amurrio"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Elexondo, 33, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Elexondo, 33, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("01470"));
	}
	private ContactInfo _buildRDBarakaldoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("944001000"));
	}
	private GeoPosition _buildRDBarakaldoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Barakaldo")
													  	   .withNameInLang(Language.BASQUE,"Barakaldo"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Bide Onera Plaza, s/n, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Bide Onera Plaza, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48901"));
	}
	private ContactInfo _buildRDBalmasedaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946039956"));
	}
	private GeoPosition _buildRDBalmasedaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Balmaseda")
													  	   .withNameInLang(Language.BASQUE,"Balmaseda"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Calle de la Estación, s/n, Primera planta")
							  			   .withNameInLang(Language.BASQUE,"Estacion Kalea, z/g, Lehenengo solairua"))
						  .withZipCode(GeoZipCode.forId("48800"));
	}
	private ContactInfo _buildRDDurangoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946030062"));
	}
	private GeoPosition _buildRDDurangoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Durango")
													  	   .withNameInLang(Language.BASQUE,"Durango"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Ezkurdi Plaza, s/n, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Ezkurdi Plaza, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48200"));
	}
	private ContactInfo _buildRDGernikaLumoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946035773"));
	}
	private GeoPosition _buildRDGernikaLumoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Gernika-Lumo")
													  	   .withNameInLang(Language.BASQUE,"Gernika-Lumo"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Allende Salazar, 9, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Allende Salazar, 9, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48300"));
	}
	private ContactInfo _buildRDGetxoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946023972"));
	}
	private GeoPosition _buildRDGetxoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Getxo")
													  	   .withNameInLang(Language.BASQUE,"Getxo"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Fueros, 10, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Fueros, 10, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48992"));
	}
	private ContactInfo _buildRDBilbaoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("944016650"));
	}
	private GeoPosition _buildRDBilbaoGeoPosition() {
		
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Bilbao")
													  	   .withNameInLang(Language.BASQUE,"Bilbao"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Barroeta Aldamar, 10, Planta de Acceso")
							  			   .withNameInLang(Language.BASQUE,"Barroeta Aldamar, 10, Sarbide solairua"))
						  .withZipCode(GeoZipCode.forId("48001"));
	}
	private ContactInfo _buildRDDonostiaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943000700"));
	}
	private GeoPosition _buildRDDonostiaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Donostia/San Sebastián")
													  	   .withNameInLang(Language.BASQUE,"Donostia/San Sebastián"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Teresa de Calcuta Plaza, 1 (Atotxa), Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Teresa de Calcuta Plaza, 1 (Atotxa), Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20012"));
	}
	private ContactInfo _buildRDTolosaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943002600"));
	}
	private GeoPosition _buildRDTolosaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Tolosa")
													  	   .withNameInLang(Language.BASQUE,"Tolosa"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"San Juan, 3, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"San Juan, 3, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20400"));
	}
	private ContactInfo _buildRDEibarContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943033404"));
	}
	private GeoPosition _buildRDEibarGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Eibar")
													  	   .withNameInLang(Language.BASQUE,"Eibar"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Juan Gisasola, 1, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Juan Gisasola, 1, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20600"));
	}
	private ContactInfo _buildRDIrunContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943020144"));
	}
	private GeoPosition _buildRDIrunGeoPosition() {
		
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Irun")
													  	   .withNameInLang(Language.BASQUE,"Irun"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Iparralde Etorbidea, 9, Planta de acceso")
							  			   .withNameInLang(Language.BASQUE,"Iparralde Etorbidea, 9, Sarbide solairua"))
						  .withZipCode(GeoZipCode.forId("20300"));
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////  
//	  
///////////////////////////////////////////////////////////////////////////////////////// 
	
		private GeoPosition _buildRCBergaraGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Bergara")
													  	   .withNameInLang(Language.BASQUE,"Bergara"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Ariznoa Enparantza, s/n, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Ariznoa Enparantza, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20570"));
	}
	private ContactInfo _buildRCBergaraContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943038059"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilBergara@justizia.eus"));
	}
	private ContactInfo _buildRCAzpeitiaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943025199"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilAzpeitia@justizia.eus"));
	}
	private GeoPosition _buildRCAzpeitiaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Azpeitia")
													  	   .withNameInLang(Language.BASQUE,"Azpeitia"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Bº Sanjuandegi, Euskalerria 30, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Sanjuandegi Auz., Euskalerria 30, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20530"));
	}
	private ContactInfo _buildRCVitoriaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("945004879"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilVitoria-Gazteiz@justizia.eus"));
	}
	private GeoPosition _buildRCVitoriaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(ARABA_COUNTY)
						  .withMunicipality(GASTEIZ)
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Avenida Gasteiz, 18, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Gasteiz Etorbidea, 18, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("01008"));
	}
	private ContactInfo _buildRCAmurrioContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("945026995"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilAmurrio@justizia.eus"));
	}
	private GeoPosition _buildRCAmurrioGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(ARABA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Amurrio")
													  	   .withNameInLang(Language.BASQUE,"Amurrio"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Elexondo, 33, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Elexondo, 33, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("01470"));
	}
	private ContactInfo _buildRCBarakaldoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("944001020"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilBarakaldo@justizia.eus"));
	}
	private GeoPosition _buildRCBarakaldoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Barakaldo")
													  	   .withNameInLang(Language.BASQUE,"Barakaldo"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Bide Onera Plaza, s/n, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Bide Onera Plaza, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48901"));
	}
	private ContactInfo _buildRCBalmasedaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946039955"))
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946039956"));
	}
	private GeoPosition _buildRCBalmasedaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Balmaseda")
													  	   .withNameInLang(Language.BASQUE,"Balmaseda"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Calle de la Estación, s/n, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Estacion Kalea, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48800"));
	}
	private ContactInfo _buildRCDurangoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946030062"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilBalmaseda@justizia.eus"));
	}
	private GeoPosition _buildRCDurangoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Durango")
													  	   .withNameInLang(Language.BASQUE,"Durango"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Ezkurdi Plaza, s/n, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Ezkurdi Plaza, z/g, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48200"));
	}
	private ContactInfo _buildRCGernikaLumoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946035771"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilDurango@justizia.eus"));
	}
	private GeoPosition _buildRCGernikaLumoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Gernika-Lumo")
													  	   .withNameInLang(Language.BASQUE,"Gernika-Lumo"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Allende Salazar, 9, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Allende Salazar, 9, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48300"));
	}
	private ContactInfo _buildRCGetxoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("946023970"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilGetxo@justizia.eus"));
	}
	private GeoPosition _buildRCGetxoGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Getxo")
													  	   .withNameInLang(Language.BASQUE,"Getxo"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Fueros, 10, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Fueros, 10, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48992"));
	}
	private ContactInfo _buildRCBilbaoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("944016710"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilBilbao@justizia.eus"));
	}
	private GeoPosition _buildRCBilbaoGeoPosition() {
		
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Bilbao")
													  	   .withNameInLang(Language.BASQUE,"Bilbao"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Barroeta Aldamar, 10, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Barroeta Aldamar, 10, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48001"));
	}
	private ContactInfo _buildRCDonostiaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943000730"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilSanSebastian@justizia.eus"));
	}
	private GeoPosition _buildRCDonostiaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Donostia/San Sebastián")
													  	   .withNameInLang(Language.BASQUE,"Donostia/San Sebastián"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Teresa de Calcuta Plaza, 1 (Atotxa), Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Teresa de Calcuta Plaza, 1 (Atotxa), Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20012"));
	}
	private ContactInfo _buildRCTolosaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943002610"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilTolosa@justizia.eus"));
	}
	private GeoPosition _buildRCTolosaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Tolosa")
													  	   .withNameInLang(Language.BASQUE,"Tolosa"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"San Juan, 3, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"San Juan, 3, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20400"));
	}
	private ContactInfo _buildRCEibarContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943033404"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilEibar@justizia.eus"));
	}
	private GeoPosition _buildRCEibarGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Eibar")
													  	   .withNameInLang(Language.BASQUE,"Eibar"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Juan Gisasola, 1, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Juan Gisasola, 1, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20600"));
	}
	private ContactInfo _buildRCIrunContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943020146"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("RegistroCivilIrun@justizia.eus"));
	}
	private GeoPosition _buildRCIrunGeoPosition() {
		
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Irun")
													  	   .withNameInLang(Language.BASQUE,"Irun"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Iparralde Etorbidea, 9, Planta baja")
							  			   .withNameInLang(Language.BASQUE,"Iparralde Etorbidea, 9, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("20300"));
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////  
	//	  
	///////////////////////////////////////////////////////////////////////////////////////// 
	
	private ContactInfo _buildSOJVitoriaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("945004896"));
	}
	private GeoPosition _buildSOJVitoriaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(ARABA_COUNTY)
						  .withMunicipality(GASTEIZ)
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Avenida Gasteiz, 18, Cuarta planta")
							  			   .withNameInLang(Language.BASQUE,"Gasteiz Etorbidea, 18, Laugarren solairua"))
						  .withZipCode(GeoZipCode.forId("01008"));
	}
	private ContactInfo _buildSOJBilbaoContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("944016712"));
	}
	private GeoPosition _buildSOJBilbaoGeoPosition() {
		
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Bilbao")
													  	   .withNameInLang(Language.BASQUE,"Bilbao"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Barroeta Aldamar, 10, Planta Baja")
							  			   .withNameInLang(Language.BASQUE,"Barroeta Aldamar, 10, Beheko solairua"))
						  .withZipCode(GeoZipCode.forId("48001"));
	}
	private ContactInfo _buildSOJDonostiaContactInfo() {
		return ContactInfo.create()
						  .addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("943004356"))
						  .addMailAddress(ContactMail.createToBeUsedFor(ContactInfoUsage.WORK)
								  			  .mailTo("soj@icagi.net"));
	}
	private GeoPosition _buildSOJDonostiaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(GeoMunicipality.create()
													  	   .withNameInLang(Language.SPANISH,"Donostia/San Sebastián")
													  	   .withNameInLang(Language.BASQUE,"Donostia/San Sebastián"))
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Teresa de Calcuta Plaza, 1 (Atotxa), Cuarta planta")
							  			   .withNameInLang(Language.BASQUE,"Teresa de Calcuta Plaza, 1 (Atotxa), Laugarren solairua"))
						  .withZipCode(GeoZipCode.forId("20012"));
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	NOTIFIER
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public AA14NotifierFromConfig createNotifierFromConfig() {
		AA14NotifierFromConfig outConfig = new AA14NotifierFromConfig();
		
		outConfig.setEmailFromAddress(EMail.of("justizia-noreply@euskadi.eus"));
		outConfig.setEmailFromAddressOwner("Justizia.eus");
		
		outConfig.setSmsFromPhoneNumber(Phone.of("012"));
		outConfig.setSmsFromPhoneOwner("Justizia");
		
		return outConfig;
	}
	@Override
	public AA14NotifierMessageComposingConfig createNotifierMessageComposingConfig() {
		AA14NotifierMessageComposingConfig outCfg = new AA14NotifierMessageComposingConfig();
		// email templates
		outCfg.setEmailTemplateForCreate(Path.from("aa14b/notifier/email/justizia/AA14MailTemplateForJustizia.vm"));
		outCfg.setEmailTemplateForUpdate(Path.from("aa14b/notifier/email/justizia/AA14MailTemplateForJustizia.vm"));
		outCfg.setEmailTemplateForDelete(Path.from("aa14b/notifier/email/justizia/AA14MailTemplateForJustizia.vm"));
		outCfg.setEmailTemplateForRemindToday(Path.from("aa14b/notifier/email/justizia/AA14MailTemplateForJustizia.vm"));
		outCfg.setEmailTemplateForRemindTomorrow(Path.from("aa14b/notifier/email/justizia/AA14MailTemplateForJustizia.vm"));
		outCfg.setEmailTemplateForPersonIdLocatorRemind(Path.from("aa14b/notifier/email/justizia/AA14MailTemplateForJustizia.vm"));
		
		// sms templates
		outCfg.setSmsTemplateForCreate(Path.from("aa14b/notifier/sms/justizia/AA14MessagingTemplateForJustizia.vm"));
		outCfg.setSmsTemplateForUpdate(Path.from("aa14b/notifier/sms/justizia/AA14MessagingTemplateForJustizia.vm"));
		outCfg.setSmsTemplateForDelete(Path.from("aa14b/notifier/sms/justizia/AA14MessagingDeleteTemplateForJustizia.vm"));
		outCfg.setSmsTemplateForRemindToday(Path.from("aa14b/notifier/sms/justizia/AA14MessagingTemplateForJustizia.vm"));
		outCfg.setSmsTemplateForRemindTomorrow(Path.from("aa14b/notifier/sms/justizia/AA14MessagingTemplateForJustizia.vm"));
		outCfg.setSmsTemplateForPersonIdLocatorRemind(Path.from("aa14b/notifier/sms/justizia/AA14MessagingTemplateForJustizia.vm"));	
		
		// template model data
		AA14NotificationMessageDataBuilderForJustizia messageDataBuider = new AA14NotificationMessageDataBuilderForJustizia();
		outCfg.setCommonMessageData(messageDataBuider.createCommonMessageData());
		outCfg.setCreateMessageData(messageDataBuider.createCreateMessageData());
		outCfg.setUpdateMessageData(messageDataBuider.createUpdateMessageData());
		outCfg.setDeleteMessageData(messageDataBuider.createDeleteMessageData());
		outCfg.setRemindMessageData(messageDataBuider.createRemindMessageData());
		
		// return
		return outCfg;
	}
}
