<#-- Header -->
<#--
<#list nameList as fieldName>
						<rich:column label="${"#"}{bundle.${fieldName?upper_case}}">
							<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
							<a4j:commandButton image="/jsf/images/desc.png" reRender="table"
								actionListener="${"#"}{extractCtrolAction.orderListener}"
								ajaxSingle="true" id="${fieldName}" value="desc">
							</a4j:commandButton>
						</rich:column>
</#list>
-->

<#-- Data -->
<#--
<#list nameList as fieldName>
				<rich:column label="${"#"}{bundle.${fieldName?upper_case}}">
					<f:facet name="header">
						<h:inputText id="${fieldName}"
							value="${"#"}{extractCtrolAction.queryItem.${fieldName}}">
							<a4j:support event="onchange"
								action="${"#"}{extractCtrolAction.query}" reRender="table" />
						</h:inputText>
					</f:facet>
					<h:outputText value="${"#"}{extractCtrol.${fieldName}}" />
				</rich:column>
</#list>
-->

<#-- add -->
<#--
<#list nameList as fieldName>
						<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
						<h:inputText label="${"#"}{bundle.${fieldName?upper_case}}" id="${fieldName?upper_case}"
							style="width:170px;"
							value="${"#"}{extractCtrolAction.newItem.${fieldName}}" maxlength="4" />
						<rich:message for="${fieldName?upper_case}" showDetail="false">
							<f:facet name="errorMarker">
								<h:graphicImage value="/jsf/images/error.gif" />
							</f:facet>
						</rich:message>
</#list>
-->

<#-- edit -->
<#---->
<#list nameList as fieldName>
						<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
						<h:inputText label="${"#"}{bundle.${fieldName?upper_case}}" id="${fieldName?upper_case}"
							style="width:170px;"
							value="${"#"}{extractCtrolAction.currentItem.${fieldName}}" maxlength="4" />
						<rich:message for="${fieldName?upper_case}" showDetail="false">
							<f:facet name="errorMarker">
								<h:graphicImage value="/jsf/images/error.gif" />
							</f:facet>
						</rich:message>
</#list>
