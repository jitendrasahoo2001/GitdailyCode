<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Provider search</title>
<style>
@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');

*{font-family:'Poppins';
}
i.fa-angle-down{
    position: absolute;
    right: 66.8%;
    top: 92.8%;
    border-radius: 20px;
    color: white;
    background-color: orange;
    padding: 18px;
    padding-left: 10px;
    font-size: 20px;
}

{
margin:20px auto;
padding:20px;
background-color:#fff;
border-radius:8px;
box-shadow:0 0 10px rgba(0,0,0,0.1);
}

center {
	text-align: center;
	/* background-color:#c3effa; */
	padding: 5px;

	

}

#logo{
margin-top:-25;
width: 250px;
}
a{

padding:20px;	
}
.right-button{

padding-top:20px;
margin-left:350px;}

label {
	border-line: 15px;
	display: block;
	color: black;
}

input, select {
	padding: 5px;
	box-sizing: border-box;
	border: 1.2px solid black;
	border-radius: 3px; 
}

input[type="text"] {
	
}

select {
	appearance: none;
	background-color: #f5f5f5;
}

select, input[type="radio"] {
	text-align: left;
	color: dark black;
	margin: 0 5px 0 5px;
	padding: 9px 6px;
	background-color: white;
}

select, label {
	display: inline-block;
}

}
.search-button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

button {
	background-color: #4caf50;
	color: light blue;
	text-align: center;
	padding: 10px 15px;
	border: none;
	border-radius: 8px;
	cursor: pointer;
	font-size: 14px;
}

button:hover {
	background-color: #45a049;
}

{
margin-top:20px;
border-collapse:collapse;
}
th, td {
font-size:14px;
	padding: 1px;
/* 	border: 1px solid #0792ed; */
	text-align: center;
	color: black;
}

th {
	background-color: #b8b8b8;
	color: #d3f294;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

tr:hover {
	background-color: #d1cfcf;
}

.paging-buttons {
	text-align: center;
}

.paging-buttons button {
	background-color: #007bff;
	color: white;
	text-align: center;
	padding: 10px 15px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 14px;
	margin: 0 5px;
}

.paging-buttons button:hover {
	background-color: #0056b3;
}
</style>


</head>
<body>
	<h:form>
	<div style="display:flex;">
	
	
	<div id="logo">
	<img src="Jitu logo.png">
	</img></div>
	
	<div class="right-button">
	<div style="font-size:15px">
	<a>News
	</a>
	<a>About Us
	</a>
	<a>Contact Us
	</a>
	</div>
	<div style="margin:30px 0 0 0;">
	<a>Services
	</a>
	<a>Customers
	</a>
	<a>Expertise
	</a>
	<a style="padding:5px;margin:5px">Resources
	</a>
	<a style="background-color:#b8b8b8;border:0px solid white;border-radius:25px;padding:5px 10px 5px 10px;">Find a Doctor  
	</a>
	</div>
	
	
	
	</div>
	
	</div>
	<div style="padding-left:50px;font-size:30px; background-color:#424242;color:white;margin:0 0 20px 0;">Provider Information
	</div>
		
		<center>

			<h2>
				<h:outputText value="" />
			</h2>

			<!-- Provider ID -->
			Provider Id
			<h:inputText id="providerId" value="#{provider.providerId}" />
			&nbsp;

			<!-- Username -->
			User Name
			<h:inputText id="username" value="#{provider.username}" />
			&nbsp;

			<!-- First Name -->
			First Name
			<h:inputText id="firstName" value="#{provider.firstName}" />
			&nbsp; <br> <br>

			<!-- Status -->
			<div style="margin-top:20px;padding-left:390px;">
			<h:outputLabel for="isActive" value=" Active Status" />
			<div style="margin:  -23px 0 -29px 310px;position: relative;padding-left:175px;width:250px;">
				<h:selectOneRadio styleClass="isActive" id="isActive"
					value="#{provider.isActive}">
					<div class="radio_button">
						<f:selectItem itemLabel="ACTIVE" itemValue="ACTIVE" />
						<f:selectItem itemLabel="INACTIVE" itemValue="INACTIVE" />
					</div>

				</h:selectOneRadio>
				</div>
			
			</div>




			<!-- Speciality -->
			<div>
    <h:outputLabel for="speciality" value="Speciality" />
    <div style="position: relative; display: inline-block;">
        <h:selectOneMenu id="speciality" value="#{provider.speciality}" style="width: 183px;">
            <f:selectItem itemLabel="Select" itemValue="" />
            <f:selectItem itemLabel="Dermatologist" itemValue="Dermatologist" />
            <f:selectItem itemLabel="Dentist" itemValue="Dentist" />
            <f:selectItem itemLabel="Physiotherapist" itemValue="Physiotherapist" />
            <f:selectItem itemLabel="Homeopath" itemValue="Homeopath" />
            <f:selectItem itemLabel="Radiologist" itemValue="Radiologist" />
            <f:selectItem itemLabel="Orthopedic Surgeon" itemValue="Orthopedic Surgeon" />
            <f:selectItem itemLabel="Pediatrician" itemValue="Pediatrician" />
            <f:selectItem itemLabel="Surgeon" itemValue="Surgeon" />
            <f:selectItem itemLabel="Neurologist" itemValue="Neurologist" />
            <f:selectItem itemLabel="Cardiologist" itemValue="Cardiologist" />  
         <%--   <f:selectItems value="#{providerDao.getSpecialtyTypes()}"/> --%>
      </h:selectOneMenu>
        <div style="position: absolute; top: 50%; right: 10px; transform: translateY(-50%); pointer-events: none;">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-chevron-down" viewBox="0 0 16 16">
                <path d="M1 5l7 7 7-7H1z" />
            </svg>
        </div>
    </div>
</div>



			<!-- Search Button -->
			<div class="sub_button"
				style="position: relative; top: 11px; display: flex; left: 45%; padding: 20px; width:45px">
				<div class="sub_button2" style="padding-right: 23px; border: 10px;">
					<h:commandButton action="#{paginationDao.getProviderList(provider)}" value="Search" style="background-color: #424242;
    border: none;
    color: white;
    padding: 6px 6px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 14px 2px;
    cursor: pointer;" />

				</div>
				<div class="sub_button2">
					<h:commandButton action="#{providerDao.resetSession()}"
						value="Clear ALL" style="background-color:white;
    border: 0.5px solid black;
    color: black;
    padding: 6px 6px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 14px 2px;
    cursor: pointer;" />
				</div>
				<br> <br>
			</div>
			<h:messages id="messages" globalOnly="true" style="color:red"/>
			<h:panelGroup rendered="#{not empty providerList}">
				<h:dataTable value="#{providerList}" var="p" border="1">
				<h:column>
    <f:facet name="header">
        <h:commandLink action="#{providerDao.sortByProviderId(provider)}" value="Provider Id" style="color: black;">
            <div class="arrow-box">
                <!-- Add your arrow icons here -->
                <p id="arr1" style="display: inline; margin: 0;">&#11205;</p>
                <p id="arr2" style="display: inline; margin: 0;">&#11206;</p>
            </div>
        </h:commandLink>
    </f:facet>
    <h:outputText value="#{p.providerId}" />
</h:column>

				
									<h:column>
						<f:facet name="header">
						<h:commandLink action="#{providerDao.sortByFirstName(provider)}" value="First Name" style="color: black;">
            <div class="arrow-box">
                <!-- Add your arrow icons here -->
                <p id="arr1" style="display: inline; margin: 0;">&#11205;</p>
                <p id="arr2" style="display: inline; margin: 0;">&#11206;</p>
            </div>
        </h:commandLink>
						</f:facet>
						<h:outputText value="#{p.firstName}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Last Name" />
						</f:facet>
						<h:outputText value="#{p.lastName}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Date of Birth" />
						</f:facet>
						<h:outputText value="#{p.dateOfBirth.toString().substring(0, 10)}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Email" />
						</f:facet>
						<h:outputText value="#{p.email}" />
					</h:column>
					 <h:column>
						<f:facet name="header">
						<h:commandLink action="#{providerDao.sortByLicNo(provider)}" value="License Number" style="color: black;">
            <div class="arrow-box">
                <!-- Add your arrow icons here -->
                <p id="arr1" style="display: inline; margin: 0;">&#11205;</p>
                <p id="arr2" style="display: inline; margin: 0;">&#11206;</p>
            </div>
        </h:commandLink>
						</f:facet>
						<h:outputText value="#{p.licenseNumber}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Qualification" />
						</f:facet>
						<h:outputText value="#{p.qualification}" />
					</h:column> 
					<h:column>
						<f:facet name="header">
						<h:commandLink action="#{providerDao.sortByUsrNa(provider)}" value="Username" style="color: black;">
            <div class="arrow-box">
                <!-- Add your arrow icons here -->
                <p id="arr1" style="display: inline; margin: 0;">&#11205;</p>
                <p id="arr2" style="display: inline; margin: 0;">&#11206;</p>
            </div>
        </h:commandLink>
						</f:facet>
						<h:outputText value="#{p.username}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Status" />
						</f:facet>
						<h:outputText value="#{p.status}" />
					</h:column>
					<%-- <h:column>
						<f:facet name="header">
							<h:outputLabel value="Phone Number" />
						</f:facet>
						<h:outputText value="#{p.phoneNo}" />
					</h:column> --%>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Gender" />
						</f:facet>
						<h:outputText value="#{p.gender}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Speciality" />
						</f:facet>
						<h:outputText value="#{p.speciality}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Address" />
						</f:facet>
						<h:outputText value="#{p.address}" />
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Is Active" />
						</f:facet>
						<h:outputText value="#{p.isActive}" />
					</h:column>
					<h:column>
						<f:facet name="header">
						</f:facet>
						<h:commandButton
							action="#{providerDao.searchProvider(p.providerId)}"
							value="Show" style="background-color:#8a8888;
    border: none;
    color: Black;
    padding: 6px 6px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 12px 1.8px;
    cursor: pointer;"  />
					</h:column>


				</h:dataTable>


				<!--The paging buttons-->
				
			<div class="paginationIcon">
			<h:commandButton value="first" action="#{paginationDao.pageFirst}"
				disabled="#{paginationDao.firstRow == 0}" />&nbsp;
			<h:commandButton value="prev" action="#{paginationDao.pagePrevious}"
				disabled="#{paginationDao.firstRow == 0}" />
			<h:outputText value="&nbsp;" escape="false" />
			<h:commandButton value="next" action="#{paginationDao.pageNext}"
				disabled="#{paginationDao.firstRow + paginationDao.rowsPerPage >= paginationDao.totalRows}" />
			<h:outputText value="&nbsp;" escape="false" />
			<h:commandButton value="last" action="#{paginationDao.pageLast}"
				disabled="#{paginationDao.firstRow + paginationDao.rowsPerPage >= paginationDao.totalRows}" />
			<h:outputText value="&nbsp;" escape="false" />
			<h:outputText
				value="Page #{paginationDao.currentPage} / #{paginationDao.totalPages}" />&nbsp;&nbsp;&nbsp;&nbsp;<br>
				</div>
				<!-- Set rows per page -->
				<%-- <h:outputLabel for="rowsPerPage" value="Rows per page" />
				<h:inputText id="rowsPerPage" value="#{paginationDao.rowsPerPage}"
					size="3" maxlength="3" />
				<h:commandButton value="Set" action="#{paginationDao.pageFirst}" />
				<h:message for="rowsPerPage" errorStyle="color: red;" /> --%>
			</h:panelGroup>
		</center>

	</h:form>
	
<!-- 	<script>
    // Function to clear the DataTable body using jQuery
    function clearDataTable() {
        var dataTableBody = $("#provForm\\:claim tbody");
        dataTableBody.find("tr").remove();
    }
 
    // Function to clear the form fields using jQuery
    function clearForm() {
        // Modify this function based on your actual form clearing logic
        // For example, you might reset input values or hide/display certain sections
        $("#searchForm\\:providerid").val("");
        $("#searchForm\\:claim_Id").val("");
        $("#searchForm\\:uHID").val("");
        $("#searchForm\\:disease").val("");
        $("#searchForm\\:radioInput").val("");
        $("#searchForm\\:admit_date").val("");
    }
 
    // Function to check for error messages and clear the DataTable and form using jQuery
    function checkAndClear() {
        // Check if there are any error messages
        var errorMessages = $("#messages").text().trim();
        if (errorMessages !== "") {
            clearDataTable();
            clearForm();
 
            // Clear the panelGroup
            var panelGroup = $("#claimForm\\:claimPanelGroup");
            panelGroup.empty();
        }
    }
 
    // Call the function on page load
    $(document).ready(function() {
        checkAndClear();
    });
</script> -->
	
</body>
	</html>
</f:view>
