package com.liferay.code.samples.portal.modules.applications.portlets.configurable_portlet.configuration;

import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;
import org.osgi.service.component.annotations.Component;

@Component
public class TaskListInstanceConfigurationBeanDeclaration implements ConfigurationBeanDeclaration {

    @Override
    public Class<?> getConfigurationBeanClass() {
        return PersonalTaskPortletInstanceConfiguration.class;
    }
}
