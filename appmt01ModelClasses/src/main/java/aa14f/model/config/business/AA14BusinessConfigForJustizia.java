package aa14f.model.config.business;

import aa14f.model.oids.AA14IDs.AA14OrgDivisionID;
import aa14f.model.oids.AA14IDs.AA14OrgDivisionServiceID;
import aa14f.model.oids.AA14IDs.AA14OrgDivisionServiceLocationID;
import aa14f.model.oids.AA14IDs.AA14OrganizationID;
import aa14f.model.oids.AA14IDs.AA14ScheduleID;

public class AA14BusinessConfigForJustizia
	 extends A14BusinessConfigWrappedBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  CONSTANTS
/////////////////////////////////////////////////////////////////////////////////////////
	public static final AA14OrganizationID ORG_ID = AA14OrganizationID.forId("ORG_JUSTIZIA");
	
	// division & service
	public static final AA14OrgDivisionID JUSTIZIA_ID = AA14OrgDivisionID.forId("EJGV_JUSTIZIA");
	public static final AA14OrgDivisionServiceID SRV_REGISTRO_REPARTO_ID = AA14OrgDivisionServiceID.forId("JUSTIZIA_REGISTRO_REPARTO");
	public static final AA14OrgDivisionServiceID SRV_REGISTRO_CIVIL_ID = AA14OrgDivisionServiceID.forId("JUSTIZIA_REGISTRO_CIVIL");
	public static final AA14OrgDivisionServiceID SRV_SOJ_ID = AA14OrgDivisionServiceID.forId("JUSTIZIA_SOJ");
	
	// locations & schedules
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_BIL_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_BIL");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_BIL_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_BIL");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_SOJ_BIL_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_SOJ_BIL");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_BIL_ID = AA14ScheduleID.forId("JUSTIZIA_REGISTRO_REPARTO_BIL");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_MATRIMONIO_BIL_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_MATRIMONIO_BIL");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_CERT_FE_INS_BIL_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_CERT_FE_INS_BIL");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_EXP_BIL_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_EXP_BIL");
	public static final AA14ScheduleID SCH_JUSTIZIA_SOJ_BIL_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_SOJ_BIL");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_GTX_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_GTX");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_GTX_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_GTX");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_GTX_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_GTX");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_GTX_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_GTX_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_GER_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_GER");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_GER_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_GER");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_GER_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_GER");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_GER_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_GER_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_DUR_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_DUR");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_DUR_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_DUR");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_DUR_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_DUR");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_DUR_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_DUR_ID");
	
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_BAL_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_BAL");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_BAL_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_BAL");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_BAL_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_BAL");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_BAL_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_BAL_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_BK_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_BK");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_BK_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_BK");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_BK_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_BK");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_INSC_BK_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_INSC_BK_ID");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_EXP_BK_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_EXP_BK_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_AM_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_AM");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_AM_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_AM");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_AM_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_AM");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_AM_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_AM_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_VI_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_VI");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_VI_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_VI");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_SOJ_VI_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_SOJ_VI");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_VI_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_VI");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_VI_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_VI_ID");
	public static final AA14ScheduleID SCH_JUSTIZIA_SOJ_VI_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_SOJ_VI_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_AZ_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_AZ");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_AZ_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_AZ");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_AZ_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_AZ");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_AZ_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_AZ_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_BER_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_BER");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_BER_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_BER");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_BER_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_BER");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_BER_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_BER_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_IRU_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_IRU");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_IRU_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_IRU");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_IRU_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_IRU");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_IRU_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_IRU_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_EI_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_EI");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_EI_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_EI");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_EI_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_EI");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_EI_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_EI_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_TO_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_TO");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_TO_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_TO");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_TO_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_TO");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_TO_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_TO_ID");
	
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_REPARTO_DON_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_REPARTO_DON");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_REGISTRO_CIVIL_DON_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_REGISTRO_CIVIL_DON");
	public static final AA14OrgDivisionServiceLocationID LOC_JUSTIZIA_SOJ_DON_ID = AA14OrgDivisionServiceLocationID.forId("JUSTIZIA_SOJ_DON");
	public static final AA14ScheduleID SCH_JUSTIZIA_REGISTRO_REPARTO_DON_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_REGISTRO_REPARTO_DON");
	public static final AA14ScheduleID SCH_JUSTIZIA_RC_GENERAL_DON_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_RC_GENERAL_DON_ID");
	public static final AA14ScheduleID SCH_JUSTIZIA_SOJ_DON_ID = AA14ScheduleID.forId("SCH_JUSTIZIA_SOJ_DON_ID");
	
	
/////////////////////////////////////////////////////////////////////////////////////////
//	CONSTRUCTOR & BUILDER
/////////////////////////////////////////////////////////////////////////////////////////
	public AA14BusinessConfigForJustizia(final AA14BusinessConfig wrapped) {
		super(wrapped);
	}
	public static AA14BusinessConfigForJustizia wrap(final AA14BusinessConfig wrapped) {
		return new AA14BusinessConfigForJustizia(wrapped);
	}
}
