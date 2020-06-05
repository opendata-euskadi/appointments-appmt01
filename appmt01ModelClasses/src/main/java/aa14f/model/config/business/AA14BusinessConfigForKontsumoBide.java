package aa14f.model.config.business;

import aa14f.model.oids.AA14IDs.AA14OrgDivisionID;
import aa14f.model.oids.AA14IDs.AA14OrgDivisionServiceID;
import aa14f.model.oids.AA14IDs.AA14OrgDivisionServiceLocationID;
import aa14f.model.oids.AA14IDs.AA14OrganizationID;
import aa14f.model.oids.AA14IDs.AA14ScheduleID;

public class AA14BusinessConfigForKontsumoBide 
	 extends A14BusinessConfigWrappedBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  CONSTANTS
/////////////////////////////////////////////////////////////////////////////////////////
	public static final AA14OrganizationID ORG_ID = AA14OrganizationID.forId("ORG_KONTSUMO");
	
	// division & service
	public static final AA14OrgDivisionID KONTSUMOBIDE_ID = AA14OrgDivisionID.forId("EJGV_KONTSUMOBIDE");
	public static final AA14OrgDivisionServiceID SRV_REGISTRO_ID = AA14OrgDivisionServiceID.forId("KONTSUMOBIDE_REGISTRO");
	public static final AA14OrgDivisionServiceID SRV_CONSULTA_ID = AA14OrgDivisionServiceID.forId("KONTSUMOBIDE_CONSULTA");
	
	// locations & schedules
	public static final AA14OrgDivisionServiceLocationID LOC_REGISTRO_AR_ID = AA14OrgDivisionServiceLocationID.forId("KONTSUMOBIDE_REGISTRO_AR");
	public static final AA14ScheduleID SCH_REGISTRO_AR_ID = AA14ScheduleID.forId("SCH_KONTSUMOBIDE_REGISTRO_AR");

	public static final AA14OrgDivisionServiceLocationID LOC_REGISTRO_GI_ID = AA14OrgDivisionServiceLocationID.forId("KONTSUMOBIDE_REGISTRO_GI");
	public static final AA14ScheduleID SCH_REGISTRO_GI_ID = AA14ScheduleID.forId("SCH_KONTSUMOBIDE_REGISTRO_GI");
	
	public static final AA14OrgDivisionServiceLocationID LOC_REGISTRO_BIZ_ID = AA14OrgDivisionServiceLocationID.forId("KONTSUMOBIDE_REGISTRO_BIZ");
	public static final AA14ScheduleID SCH_REGISTRO_BIZ_ID = AA14ScheduleID.forId("SCH_KONTSUMOBIDE_REGISTRO_BIZ");

	public static final AA14OrgDivisionServiceLocationID LOC_CONSULTA_AR_ID = AA14OrgDivisionServiceLocationID.forId("KONTSUMOBIDE_CONSULTA_AR");
	public static final AA14ScheduleID SCH_CONSULTA_AR_ID = AA14ScheduleID.forId("SCH_KONTSUMOBIDE_CONSULTA_AR");

	public static final AA14OrgDivisionServiceLocationID LOC_CONSULTA_GI_ID = AA14OrgDivisionServiceLocationID.forId("KONTSUMOBIDE_CONSULTA_GI");
	public static final AA14ScheduleID SCH_CONSULTA_GI_ID = AA14ScheduleID.forId("SCH_KONTSUMOBIDE_CONSULTA_GI");
	
	public static final AA14OrgDivisionServiceLocationID LOC_CONSULTA_BIZ_ID = AA14OrgDivisionServiceLocationID.forId("KONTSUMOBIDE_CONSULTA_BIZ");
	public static final AA14ScheduleID SCH_CONSULTA_BIZ_ID = AA14ScheduleID.forId("SCH_KONTSUMOBIDE_CONSULTA_BIZ");
	
/////////////////////////////////////////////////////////////////////////////////////////
//	CONSTRUCTOR & BUILDER
/////////////////////////////////////////////////////////////////////////////////////////
	public AA14BusinessConfigForKontsumoBide(final AA14BusinessConfig wrapped) {
		super(wrapped);
	}
	public static AA14BusinessConfigForKontsumoBide wrap(final AA14BusinessConfig wrapped) {
		return new AA14BusinessConfigForKontsumoBide(wrapped);
	}
}
