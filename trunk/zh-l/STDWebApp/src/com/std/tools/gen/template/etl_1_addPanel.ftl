<#list nameList as fieldName>
						<h:outputText value="${"#"}{bundle.${fieldName?upper_case}}" />
						<h:inputText label="${"#"}{bundle.${fieldName?upper_case}}" id="${fieldName?upper_case}" required="true"
<#--							validator="${"#"}{extAgentinfoAction.validate}"-->
							style="width:160px;"
							value="${"#"}{extAgentinfoAction.newItem.${fieldName}}" maxlength="20" />
						<rich:message for="${fieldName?upper_case}" showDetail="false">
							<f:facet name="errorMarker">
								<h:graphicImage value="/jsf/images/error.gif" />
							</f:facet>
						</rich:message>
</#list>