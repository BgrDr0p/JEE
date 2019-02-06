<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<html:html>
<head>
<title><bean:message key="add.contact"/></title>
<html:base/>
</head>
<body bgcolor="white">
<html:form action="/SupprimerContact">
<html:errors/>

<table>
	<tr>
		<td align="center" colspan="2">

		<font size="4">Please Enter the Following Details</font>
	</tr>
	<tr>
		<td align="right">
		Prenom
		</td>
		<td align="left">
		<html:text property="prenom" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		Nom
		</td>
		<td align="left">
		<html:text property="nom" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		E-mail address
		</td>
		<td align="left">
		<html:text property="email" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		tel
		</td>
		<td align="left">
		<html:text property="numTel" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		rue
		</td>
		<td align="left">
		<html:text property="rue" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		ville
		</td>
		<td align="left">
		<html:text property="ville" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		pays
		</td>
		<td align="left">
		<html:text property="pays" size="30" maxlength="30"/>
		</td>
	</tr>
	<tr>
		<td align="right">
		<html:submit> Save </html:submit>
		</td>
		</tr>
</table>
		</html:form>
</body>
</html:html>