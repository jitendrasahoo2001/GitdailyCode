<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Show Page</title>
        </head>
        <body>
          

            <h:form>
                <center>
                    <h2><h:outputText value="Doctor Records" /></h2>
                </center>
                <h:dataTable value="#{doctordao.showDoctorDao()}" var="r" border="3">
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Doctor ID" />
                        </f:facet>
                        <h:outputText value="#{r.drId}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Doctor Name" />
                        </f:facet>
                        <h:outputText value="#{r.drName}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Department" />
                        </f:facet>
                        <h:outputText value="#{r.dept}" />
                    </h:column>

                  
                </h:dataTable>
            </h:form>
        </body>
    </html>
</f:view>