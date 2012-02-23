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