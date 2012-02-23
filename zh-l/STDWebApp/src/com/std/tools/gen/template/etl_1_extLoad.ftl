<#-- header -->
<#---->
<#list nameList as fieldName>
						<rich:column label="${"#"}{bundle.${fieldName?upper_case}}">
							<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
							<a4j:commandButton image="/jsf/images/desc.png" reRender="table"
								actionListener="${"#"}{extLoadCtrolAction.orderListener}"
								ajaxSingle="true" id="${fieldName}" value="desc">
							</a4j:commandButton>
						</rich:column>
</#list>
<#-- data -->
<#--
<#list nameList as fieldName>
				<rich:column label="${"#"}{bundle.${fieldName?upper_case}}">
					<f:facet name="header">
						<h:inputText id="${fieldName}"
							value="${"#"}{extLoadCtrolAction.queryItem.${fieldName}}">
							<a4j:support event="onchange"
								action="${"#"}{extLoadCtrolAction.query}" reRender="table" />
						</h:inputText>
					</f:facet>
					<h:outputText value="${"#"}{extLoadCtrol.${fieldName}}"
						converter="${"#"}{extLoadCtrolAction.longCharsConverter}" />
					<rich:toolTip value="${"#"}{extLoadCtrol.${fieldName}}" />
				</rich:column>
</#list>
-->

<#-- edit -->
<#--
<#list nameList as fieldName>
						<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
						<h:inputText label="${"#"}{bundle.${fieldName?upper_case}}" id="${fieldName?upper_case}" style="width:200px;"
							value="${"#"}{extLoadCtrolAction.currentItem.${fieldName}}" maxlength="10" />
						<rich:message for="${fieldName?upper_case}" showDetail="false">
							<f:facet name="errorMarker">
								<h:graphicImage value="/jsf/images/error.gif" />
							</f:facet>
						</rich:message>
</#list>
-->

<#-- add -->
<#--
<#list nameList as fieldName>
						<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
						<h:inputText label="${"#"}{bundle.${fieldName?upper_case}}" id="${fieldName?upper_case}"
							style="width:200px;"
							value="${"#"}{extLoadCtrolAction.newItem.${fieldName}}" maxlength="256" />
						<rich:message for="${fieldName?upper_case}" showDetail="false">
							<f:facet name="errorMarker">
								<h:graphicImage value="/jsf/images/error.gif" />
							</f:facet>
						</rich:message>
</#list>
-->