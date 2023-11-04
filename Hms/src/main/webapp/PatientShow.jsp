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
                    <h2><h:outputText value="Patient Records" /></h2>
                </center>
                <h:dataTable value="#{patientdao.showPatientDao()}" var="r" border="3">
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient ID" />
                        </f:facet>
                        <h:outputText value="#{r.pid}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient Name" />
                        </f:facet>
                        <h:outputText value="#{r.name}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient age" />
                        </f:facet>
                        <h:outputText value="#{r.age}" />
                    </h:column>
                     <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient weight" />
                        </f:facet>
                        <h:outputText value="#{r.weight}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient gender" />
                        </f:facet>
                        <h:outputText value="#{r.gender}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient address" />
                        </f:facet>
                        <h:outputText value="#{r.address}" />
                    </h:column>
                     <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient phn" />
                        </f:facet>
                        <h:outputText value="#{r.phoneNo}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient Disease" />
                        </f:facet>
                        <h:outputText value="#{r.disease}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Patient doctor" />
                        </f:facet>
                        <h:outputText value="#{r.doctor_id}" />
                    </h:column>

                  
                </h:dataTable>
            </h:form>
        </body>
    </html>
</f:view>
