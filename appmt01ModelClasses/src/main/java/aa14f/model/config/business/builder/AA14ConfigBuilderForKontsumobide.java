package aa14f.model.config.business.builder;

import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.KONTSUMOBIDE_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.LOC_CONSULTA_AR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.LOC_CONSULTA_BIZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.LOC_CONSULTA_GI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.LOC_REGISTRO_AR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.LOC_REGISTRO_BIZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.LOC_REGISTRO_GI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.ORG_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_AR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_BIZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SCH_CONSULTA_GI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_AR_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_BIZ_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SCH_REGISTRO_GI_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SRV_CONSULTA_ID;
import static aa14f.model.config.business.AA14BusinessConfigForKontsumoBide.SRV_REGISTRO_ID;

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
import aa14f.model.config.business.AA14BusinessConfigForKontsumoBide;
import aa14f.model.oids.AA14IDs.AA14BusinessID;
import aa14f.model.oids.AA14OIDs.AA14OrgDivisionOID;
import aa14f.model.oids.AA14OIDs.AA14OrgDivisionServiceLocationOID;
import aa14f.model.oids.AA14OIDs.AA14OrgDivisionServiceOID;
import aa14f.model.oids.AA14OIDs.AA14OrganizationOID;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import r01f.locale.Language;
import r01f.types.Color;
import r01f.types.Path;
import r01f.types.contact.ContactInfo;
import r01f.types.contact.ContactInfoUsage;
import r01f.types.contact.ContactPhone;
import r01f.types.contact.EMail;
import r01f.types.contact.Phone;
import r01f.types.datetime.Time;
import r01f.types.geo.GeoOIDs.GeoZipCode;
import r01f.types.geo.GeoPosition;
import r01f.types.geo.GeoStreet;

@Slf4j
@Accessors(prefix="_")
public class AA14ConfigBuilderForKontsumobide 
	 extends AA14ConfigBuilderForEJGVBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  CONSTANTS
/////////////////////////////////////////////////////////////////////////////////////////
	// colors
	private static final Color COLOR_KONTSUMOBIDE = Color.from("#0099cc");
	
	// Texts
	private static final String REGISTRO_TXT_ES = "Servicio de registro";
	private static final String REGISTRO_TXT_EU = "Erregistro Zerbitzua";
	private static final String CONSULTA_TXT_ES = "Servicio de consulta";
	private static final String CONSULTA_TXT_EU = "Kontsulta-zerbitzua";

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
//  DIVISION
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Collection<AA14OrgDivision> createOrgDivisionConfigs(final AA14Organization org) {
		Collection<AA14OrgDivision> outDivs = Lists.newArrayListWithExpectedSize(1);
		// --- Division
		{
			AA14OrgDivision division = _buildDivision(AA14BusinessID.KONTSUMOBIDE,
													  org,
										  			  AA14OrgDivisionOID.supply(),KONTSUMOBIDE_ID,
										  			  "Kontsumobide","Kontsumobide");
			outDivs.add(division);
			log.warn("\t[Division]: Created {}",
					  division.getId());
		}
		return outDivs;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	DIVISION SERVICES
/////////////////////////////////////////////////////////////////////////////////////////	
	@Override
	public Collection<AA14OrgDivisionService> createOrgDivisionServicesConfigs(final AA14Organization org,
									  							      		   final Collection<AA14OrgDivision> divisions) {
		Collection<AA14OrgDivisionService> outServices = Lists.newArrayListWithExpectedSize(3);
		// --- Service: Registry
		{
			AA14OrgDivisionService registryService =  _buildService(AA14BusinessID.KONTSUMOBIDE,
																	 org,
														    		 this.within(divisions).find(KONTSUMOBIDE_ID),
														    		 AA14OrgDivisionServiceOID.supply(),SRV_REGISTRO_ID,
														    		 REGISTRO_TXT_ES,REGISTRO_TXT_EU);
			registryService.setNotifierMessageComposingConfig(this.createNotifierMessageComposingConfig());
			outServices.add(registryService);
			log.warn("\t\t[Service]: Creating {}",
					 registryService.getId());
		}
		// --- Service: Query
		{
			AA14OrgDivisionService queryService =  _buildService(AA14BusinessID.KONTSUMOBIDE,
																	 org,
														    		 this.within(divisions).find(KONTSUMOBIDE_ID),
														    		 AA14OrgDivisionServiceOID.supply(),SRV_CONSULTA_ID,
														    		 CONSULTA_TXT_ES,CONSULTA_TXT_EU);
			queryService.setNotifierMessageComposingConfig(this.createNotifierMessageComposingConfig());
			outServices.add(queryService);
			log.warn("\t\t[Service]: Creating {}",
					 queryService.getId());
		}
		return outServices;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	DIVISION SERVICES LOCATIONS
/////////////////////////////////////////////////////////////////////////////////////////	
	@Override
	public Collection<AA14OrgDivisionServiceLocation> createOrgDivisionServiceLocationsConfigs(final AA14Organization org,
																  							   final Collection<AA14OrgDivision> divisions,
																  							   final Collection<AA14OrgDivisionService> services) {
		Collection<AA14OrgDivisionServiceLocation> outLocs = Lists.newArrayListWithExpectedSize(3);
		
		// --- Location: Registry AR
		{
			AA14OrgDivisionServiceLocation registryAr = _buildLocation(AA14BusinessID.KONTSUMOBIDE,
																		 org,
																		 this.within(divisions).find(KONTSUMOBIDE_ID),
																		 this.within(services).find(SRV_REGISTRO_ID),
																		 AA14OrgDivisionServiceLocationOID.supply(),LOC_REGISTRO_AR_ID,
																		 REGISTRO_TXT_ES + " (AR)",REGISTRO_TXT_EU + " (AR)",
																		 _buildKontsumobideArabaGeoPosition(),
																		 _buildKontsumobideArabaContactInfo(),
																		 COLOR_KONTSUMOBIDE);
			outLocs.add(registryAr);
			log.warn("\t\t\t[Location]: Creating {}",
					 registryAr.getId());
		}
		// --- Location: Registry BIZ
		{
			AA14OrgDivisionServiceLocation registryBiz = _buildLocation(AA14BusinessID.KONTSUMOBIDE,
																		 org,
																		 this.within(divisions).find(KONTSUMOBIDE_ID),
																		 this.within(services).find(SRV_REGISTRO_ID),
																		 AA14OrgDivisionServiceLocationOID.supply(),LOC_REGISTRO_BIZ_ID,
																		 REGISTRO_TXT_ES + " (BIZ)",REGISTRO_TXT_EU + " (BIZ)",
																		 _buildKontsumobideBizkaiaGeoPosition(),
																		 _buildKontsumobideBizkaiaContactInfo(),
																		 COLOR_KONTSUMOBIDE);
			outLocs.add(registryBiz);
			log.warn("\t\t\t[Location]: Creating {}",
					 registryBiz.getId());
		}
		// --- Location: Registry GI
		{
			AA14OrgDivisionServiceLocation registryGi = _buildLocation(AA14BusinessID.KONTSUMOBIDE,
																		 org,
																		 this.within(divisions).find(KONTSUMOBIDE_ID),
																		 this.within(services).find(SRV_REGISTRO_ID),
																		 AA14OrgDivisionServiceLocationOID.supply(),LOC_REGISTRO_GI_ID,
																		 REGISTRO_TXT_ES + " (GI)",REGISTRO_TXT_EU + " (GI)",
																		 _buildKontsumobideGipuzkoaGeoPosition(),
																		 _buildKontsumobideGipuzkoaContactInfo(),
																		 COLOR_KONTSUMOBIDE);
			outLocs.add(registryGi);
			log.warn("\t\t\t[Location]: Creating {}",
					 registryGi.getId());
		}
		// --- Location: Query AR
		{
			AA14OrgDivisionServiceLocation queryAr = _buildLocation(AA14BusinessID.KONTSUMOBIDE,
																		 org,
																		 this.within(divisions).find(KONTSUMOBIDE_ID),
																		 this.within(services).find(SRV_CONSULTA_ID),
																		 AA14OrgDivisionServiceLocationOID.supply(),LOC_CONSULTA_AR_ID,
																		 CONSULTA_TXT_ES + " (AR)",CONSULTA_TXT_EU + " (AR)",
																		 _buildKontsumobideArabaGeoPosition(),
																		 _buildKontsumobideArabaContactInfo(),
																		 COLOR_KONTSUMOBIDE);
			outLocs.add(queryAr);
			log.warn("\t\t\t[Location]: Creating {}",
					 queryAr.getId());
		}
		// --- Location: Query BIZ
		{
			AA14OrgDivisionServiceLocation queryBiz = _buildLocation(AA14BusinessID.KONTSUMOBIDE,
																		 org,
																		 this.within(divisions).find(KONTSUMOBIDE_ID),
																		 this.within(services).find(SRV_CONSULTA_ID),
																		 AA14OrgDivisionServiceLocationOID.supply(),LOC_CONSULTA_BIZ_ID,
																		 CONSULTA_TXT_ES + " (BIZ)",CONSULTA_TXT_EU + " (BIZ)",
																		 _buildKontsumobideBizkaiaGeoPosition(),
																		 _buildKontsumobideBizkaiaContactInfo(),
																		 COLOR_KONTSUMOBIDE);
			outLocs.add(queryBiz);
			log.warn("\t\t\t[Location]: Creating {}",
					 queryBiz.getId());
		}
		// --- Location: Query GI
		{
			AA14OrgDivisionServiceLocation registryGi = _buildLocation(AA14BusinessID.KONTSUMOBIDE,
																		 org,
																		 this.within(divisions).find(KONTSUMOBIDE_ID),
																		 this.within(services).find(SRV_CONSULTA_ID),
																		 AA14OrgDivisionServiceLocationOID.supply(),LOC_CONSULTA_GI_ID,
																		 CONSULTA_TXT_ES + " (GI)",CONSULTA_TXT_EU + " (GI)",
																		 _buildKontsumobideGipuzkoaGeoPosition(),
																		 _buildKontsumobideGipuzkoaContactInfo(),
																		 COLOR_KONTSUMOBIDE);
			outLocs.add(registryGi);
			log.warn("\t\t\t[Location]: Creating {}",
					 registryGi.getId());
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
		
		// Schedule: Registry AR
		{
			AA14Schedule registrySchAr = _buildSchedule(AA14BusinessID.KONTSUMOBIDE,
														  SCH_REGISTRO_AR_ID,
														  REGISTRO_TXT_ES + " SCHEDULE (AR)", REGISTRO_TXT_ES + " SCHEDULE (AR)",
														   _createKontsumobideScheduleBookingConfig(Time.of("08:30"), //range date start	
																   									Time.of("14:00"), //range date end
																  								   10,			// slot length
																   							   	   1),			// max appointments in slot
														  null,		// no qmatic orchestra config
														  this.within(locs).find(AA14BusinessConfigForKontsumoBide.LOC_REGISTRO_AR_ID));
			outSchs.add(registrySchAr);
			log.warn("\t\t\t[Schedule]: Creating {}",
					 registrySchAr.getId());
		}
		// Schedule: Registry BIZ
		{
			AA14Schedule registrySchBiz = _buildSchedule(AA14BusinessID.KONTSUMOBIDE,
														  SCH_REGISTRO_BIZ_ID,
														  REGISTRO_TXT_ES + " SCHEDULE (BIZ)", REGISTRO_TXT_ES + " SCHEDULE (BIZ)",
														   _createKontsumobideScheduleBookingConfig(Time.of("08:30"), //range date start	
																   									Time.of("14:00"), //range date end
																   									10,			// slot length
																   							   	   	1),			// max appointments in slot
														  null,		// no qmatic orchestra config
														  this.within(locs).find(AA14BusinessConfigForKontsumoBide.LOC_REGISTRO_BIZ_ID));
			outSchs.add(registrySchBiz);
			log.warn("\t\t\t[Schedule]: Creating {}",
					 registrySchBiz.getId());
		}
		// Schedule: Registry GI
		{
			AA14Schedule registrySchGi = _buildSchedule(AA14BusinessID.KONTSUMOBIDE,
														  SCH_REGISTRO_GI_ID,
														  REGISTRO_TXT_ES + " SCHEDULE (GI)", REGISTRO_TXT_ES + " SCHEDULE (GI)",
														   _createKontsumobideScheduleBookingConfig(Time.of("08:30"), //range date start	
																   									Time.of("14:00"), //range date end
																   									10,			// slot length
																   							   	   	1),			// max appointments in slot
														  null,		// no qmatic orchestra config
														  this.within(locs).find(AA14BusinessConfigForKontsumoBide.LOC_REGISTRO_GI_ID));
			outSchs.add(registrySchGi);
			log.warn("\t\t\t[Schedule]: Creating {}",
					 registrySchGi.getId());
		}
		// Schedule: Query AR
		{
			AA14Schedule querySchAr = _buildSchedule(AA14BusinessID.KONTSUMOBIDE,
														  SCH_CONSULTA_AR_ID,
														  CONSULTA_TXT_ES + " SCHEDULE (AR)",CONSULTA_TXT_EU + " SCHEDULE (AR)",
														   _createKontsumobideScheduleBookingConfig(Time.of("08:30"), //range date start	
																   									Time.of("13:50"), //range date end
																  								   	20,			// slot length
																   							   	   	1),			// max appointments in slot
														  null,		// no qmatic orchestra config
														  this.within(locs).find(AA14BusinessConfigForKontsumoBide.LOC_CONSULTA_AR_ID));
			outSchs.add(querySchAr);
			log.warn("\t\t\t[Schedule]: Creating {}",
					 querySchAr.getId());
		}
		// Schedule: Query BIZ
		{
			AA14Schedule querySchBiz = _buildSchedule(AA14BusinessID.KONTSUMOBIDE,
														  SCH_CONSULTA_BIZ_ID,
														  CONSULTA_TXT_ES + " SCHEDULE (BIZ)", CONSULTA_TXT_EU + " SCHEDULE (BIZ)",
														   _createKontsumobideScheduleBookingConfig(Time.of("08:30"), //range date start	
																   									Time.of("13:50"), //range date end
																   									20,			// slot length
																   							   	   	1),			// max appointments in slot
														  null,		// no qmatic orchestra config
														  this.within(locs).find(AA14BusinessConfigForKontsumoBide.LOC_CONSULTA_BIZ_ID));
			outSchs.add(querySchBiz);
			log.warn("\t\t\t[Schedule]: Creating {}",
					 querySchBiz.getId());
		}
		// Schedule: Query GI
		{
			AA14Schedule querySchGi = _buildSchedule(AA14BusinessID.KONTSUMOBIDE,
														  SCH_CONSULTA_GI_ID,
														  CONSULTA_TXT_ES + " SCHEDULE (GI)", CONSULTA_TXT_EU + " SCHEDULE (GI)",
														  _createKontsumobideScheduleBookingConfig(Time.of("08:30"), //range date start	
																   									Time.of("13:50"), //range date end
																   									20,			// slot length
																   							   	   	1),			// max appointments in slot
														  null,		// no qmatic orchestra config
														  this.within(locs).find(AA14BusinessConfigForKontsumoBide.LOC_CONSULTA_GI_ID));
			outSchs.add(querySchGi);
			log.warn("\t\t\t[Schedule]: Creating {}",
					 querySchGi.getId());
		}
		return outSchs;
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	 
/////////////////////////////////////////////////////////////////////////////////////////
	private static AA14ScheduleBookingConfig _createKontsumobideScheduleBookingConfig(final Time rangeStart,
																					  final Time rangeEnd,
																					  final int slotLength,
																					  final int maxAppointmentsInSlot) {
		return new AA14ScheduleBookingConfig(rangeStart,		// day bookable range start 
				    						 rangeEnd,			// day bookable range end
											 slotLength,			// slot length
											 maxAppointmentsInSlot,	// max appointments in slot
											 null);					// future booking limit (no limit)
	}
/////////////////////////////////////////////////////////////////////////////////////////
//  
/////////////////////////////////////////////////////////////////////////////////////////
	protected static GeoPosition _buildKontsumobideArabaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(ARABA_COUNTY)
						  .withMunicipality(GASTEIZ)
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Avenida Santiago, 11")
							  			   .withNameInLang(Language.BASQUE,"Avenida Santiago, 11"))
						  .withZipCode(GeoZipCode.forId("01002"));
	}
	protected static ContactInfo _buildKontsumobideArabaContactInfo() {
		return ContactInfo.create()
						 		.addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK).withNumber("945062161"));
	}
	protected static GeoPosition _buildKontsumobideGipuzkoaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(GIPUZKOA_COUNTY)
						  .withMunicipality(DONOSTIA)
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Easo 10")
							  			   .withNameInLang(Language.BASQUE,"Easo 10"))
						  .withZipCode(GeoZipCode.forId("20006"));
	}
	protected static ContactInfo _buildKontsumobideGipuzkoaContactInfo() {
		return ContactInfo.create()
						 		.addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK).withNumber("943022562"));
	}
	protected static GeoPosition _buildKontsumobideBizkaiaGeoPosition() {
		return GeoPosition.create()
						  .withCountry(SPAIN)
						  .withState(EUSKADI_STATE)
						  .withCounty(BIZKAIA_COUNTY)
						  .withMunicipality(BILBAO)
						  .withStreet(GeoStreet.create()
									  	   .withNameInLang(Language.SPANISH,"Alameda Recalde, 39")
							  			   .withNameInLang(Language.BASQUE,"Alameda Recalde, 39"))
						  .withZipCode(GeoZipCode.forId("48008"));
	}
	protected static ContactInfo _buildKontsumobideBizkaiaContactInfo() {
		return ContactInfo.create()
						 		.addPhone(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK).withNumber("944032436"));
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	NOTIFIER
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public AA14NotifierFromConfig createNotifierFromConfig() {
		AA14NotifierFromConfig outConfig = new AA14NotifierFromConfig();
		
		outConfig.setEmailFromAddress(EMail.of("kontsumobide-noreply@euskadi.eus"));
		outConfig.setEmailFromAddressOwner("Eusko Jaurlaritza-kontsumobide / Gobierno Vasco-kontsumobide");
		
		outConfig.setSmsFromPhoneNumber(Phone.of("012"));
		outConfig.setSmsFromPhoneOwner("kontsumobide");
		
		return outConfig;
	}
	@Override
	public AA14NotifierMessageComposingConfig createNotifierMessageComposingConfig() {
		AA14NotifierMessageComposingConfig outCfg = new AA14NotifierMessageComposingConfig();
		// email templates
		outCfg.setEmailTemplateForCreate(Path.from("aa14b/notifier/email/kontsumobide/AA14MailTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setEmailTemplateForUpdate(Path.from("aa14b/notifier/email/kontsumobide/AA14MailTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setEmailTemplateForDelete(Path.from("aa14b/notifier/email/kontsumobide/AA14MailTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setEmailTemplateForRemindToday(Path.from("aa14b/notifier/email/kontsumobide/AA14MailTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setEmailTemplateForRemindTomorrow(Path.from("aa14b/notifier/email/kontsumobide/AA14MailTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setEmailTemplateForPersonIdLocatorRemind(Path.from("aa14b/notifier/email/kontsumobide/AA14MailTemplateForkontsumobideByPhoneOnly.vm"));
		
		// sms templates
		outCfg.setSmsTemplateForCreate(Path.from("aa14b/notifier/sms/kontsumobide/AA14MessagingTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setSmsTemplateForUpdate(Path.from("aa14b/notifier/sms/kontsumobide/AA14MessagingTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setSmsTemplateForDelete(Path.from("aa14b/notifier/sms/kontsumobide/AA14MessagingDeleteTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setSmsTemplateForRemindToday(Path.from("aa14b/notifier/sms/kontsumobide/AA14MessagingTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setSmsTemplateForRemindTomorrow(Path.from("aa14b/notifier/sms/kontsumobide/AA14MessagingTemplateForkontsumobideByPhoneOnly.vm"));
		outCfg.setSmsTemplateForPersonIdLocatorRemind(Path.from("aa14b/notifier/sms/kontsumobide/AA14MessagingTemplateForkontsumobideByPhoneOnly.vm"));	
		
		// template model data
		AA14NotificationMessageDataBuilderForKontsumobide messageDataBuider = new AA14NotificationMessageDataBuilderForKontsumobide();
		outCfg.setCommonMessageData(messageDataBuider.createCommonMessageData());
		outCfg.setCreateMessageData(messageDataBuider.createCreateMessageData());
		outCfg.setUpdateMessageData(messageDataBuider.createUpdateMessageData());
		outCfg.setDeleteMessageData(messageDataBuider.createDeleteMessageData());
		outCfg.setRemindMessageData(messageDataBuider.createRemindMessageData());
		
		// return
		return outCfg;
	}
}
