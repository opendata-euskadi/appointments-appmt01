package aa14a.bootstrap.ui;

import aa14b.bootstrap.core.AA14COREServicesBootstrapConfigBuilder;
import aa14f.bootstrap.client.AA14ClientBootstrapConfigBuilder;
import aa14f.common.internal.AA14AppCodes;
import r01f.bootstrap.services.config.ServicesBootstrapConfig;
import r01f.bootstrap.services.config.ServicesBootstrapConfigBuilder;
import r01f.bootstrap.services.config.core.ServicesCoreBootstrapConfig;
import r01f.bootstrap.services.config.core.ServicesCoreModuleEventsConfig;
import r01f.guids.CommonOIDs.AppComponent;
import r01f.services.ids.ServiceIDs.CoreModule;
import r01f.xmlproperties.XMLPropertiesBuilder;
import r01f.xmlproperties.XMLPropertiesForApp;
import r01f.xmlproperties.XMLPropertiesForAppComponent;

public class AA14ServletContextListener
	 extends AA14ServletContextListenerBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  CONSTRUCTOR
/////////////////////////////////////////////////////////////////////////////////////////
	public AA14ServletContextListener() {
		super(_buildServicesBootstrapConfig());
	}
	private static final ServicesBootstrapConfig[] _buildServicesBootstrapConfig() {
		// [0] - Load properties
		XMLPropertiesForApp xmlProps = XMLPropertiesBuilder.createForApp(AA14AppCodes.CORE_APPCODE)
														   .notUsingCache();
		XMLPropertiesForAppComponent servicesProps = xmlProps.forComponent(AppComponent.compose(AA14AppCodes.CORE_APPOINTMENTS_MOD,
																							 	CoreModule.SERVICES));
		
		// [1] - Create the modules bootstrap config
		ServicesBootstrapConfig bootCfg = ServicesBootstrapConfigBuilder
												.forClient(AA14ClientBootstrapConfigBuilder.buildClientBootstrapConfig())
				 							   	.ofCoreModules(_buildCoreBootstrapConfigs(xmlProps))
				 							   	.coreEventsHandledAs(ServicesCoreModuleEventsConfig.from(servicesProps))
				 							   	.build();
		return new ServicesBootstrapConfig[] { 
						bootCfg
				   };
	}
	private static final ServicesCoreBootstrapConfig[] _buildCoreBootstrapConfigs(final XMLPropertiesForApp xmlProps) {
		return new ServicesCoreBootstrapConfig[] {
						   AA14COREServicesBootstrapConfigBuilder.buildCoreBootstrapConfig(xmlProps),
						   // ui servlet services
						   AA14ServletServicesBootstrapConfigBuilder.buildCoreBootstrapConfig(xmlProps)
				   };
	}
}
