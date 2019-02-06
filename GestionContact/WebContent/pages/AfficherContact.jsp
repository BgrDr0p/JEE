<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
<head>
</head>
<body>

 <h1>test</h1>
<logic:iterate name="listeContact"  id="liste">
<p>
NOM	<bean:write name="liste"  property ="id"/>,
	<bean:write name="liste"  property ="nom"/>,
	<bean:write name="liste"  property ="prenom"/>,
	<bean:write name="liste"  property ="email"/>,
	<bean:write name="liste"  property ="numTel"/>,
	<bean:write name="liste"  property ="rue"/>,
	<bean:write name="liste" property ="ville"/>,
	<bean:write name="liste" property ="pays"/>,
	
 </p>
 </logic:iterate>
</body>
</html:html>