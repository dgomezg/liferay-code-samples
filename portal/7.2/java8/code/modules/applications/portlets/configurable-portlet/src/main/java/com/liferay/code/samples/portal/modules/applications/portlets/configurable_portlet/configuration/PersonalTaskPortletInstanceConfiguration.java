package com.liferay.code.samples.portal.modules.applications.portlets.configurable_portlet.configuration;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;


@ExtendedObjectClassDefinition(
        scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
        //ID must be the fully qualified class name
        id = "com.liferay.code.samples.portal.modules.applications.portlets.configuration_portlet.configuration.PersonalTaskInstanceConfiguration",
        //Adds info to support internazionalization on the configuration UI.
        localization = "content/Language", name = "personal-task-configuration2.title"
)
public interface PersonalTaskPortletInstanceConfiguration {

    @Meta.AD(
            deflt = "priority", name = "default-display-view",
            optionLabels = {"Priority", "title", "Due Date"},
            optionValues = {"priority", "title", "dueDate"}, required = false
    )
    String orderBy();

}
