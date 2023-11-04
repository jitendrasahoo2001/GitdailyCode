<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 



<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <center>
		<h2>
	<h:outputText value="Add Patient" />
	</h2>
	<h:form>
	<h:outputText value="Phone No" />
	<h:inputText value="#{patient.cusPhoneNumber}" /><br/>
		<br><br>
	<h:outputText value="Patient Name" />
	<h:inputText value="#{patient.cusName}" /><br/> 
	<br/><br/>
	<h:outputText value="Phone No" />
	<h:inputText value="#{patient.cusPhoneNumber}" /><br/>
		<br><br>
	<h:outputText value="UserName" />
	<h:inputText value="#{patient.cusUsername}" /><br/>
	    <br><br>
	<h:outputText value="Password" />
	<h:inputText value="#{patient.cusPassword}" /><br/>
		<br><br>
	<h:outputText value="Customer Email" />
	<h:inputText value="#{patient.cusEmail}" /><br/>
	<br/><br/>
	<h:commandButton action="#{customerController.addCustomer()}" value="Add Customer" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton>
	<h:messages/>
	</h:form>
</center>
    </body>
</html>
</f:view>