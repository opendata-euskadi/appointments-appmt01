package aa14f.model.config.business.builder;

import java.util.Collection;

import com.google.common.collect.Lists;

import lombok.experimental.Accessors;
import r01f.types.contact.ContactInfoUsage;
import r01f.types.contact.ContactPhone;

@Accessors(prefix="_")
abstract class AA14ConfigBuilderForEJGVBase
	   extends AA14ConfigBuilderBase {
/////////////////////////////////////////////////////////////////////////////////////////
//  METHODS
///////////////////////////////////////////////////////////////////////////////////////// 
	protected static Collection<ContactPhone> _buildZuzenenanPhones() {
		return Lists.newArrayList(ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("012"),
								  ContactPhone.createToBeUsedFor(ContactInfoUsage.WORK)
											  .withNumber("945018000"));
	}
}