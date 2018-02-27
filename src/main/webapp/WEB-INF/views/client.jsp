<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<div id="formClient">

<f:form modelAttribute="client" action="AjouterClient"
 method="post" enctype="multupart/form-data">
<table>
<tr>
<td>Code du Client</td>
<td><f:input path="codeClient"/></td>
<td><f:errors path="codeClient" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td>Nom du client</td>
<td><f:input path="nomClient"/></td>
<td><f:errors path="nomClient" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td>Prenom du client</td>
<td><f:input path="prenomClient"/></td>
<td><f:errors path="prenomClient" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td>Adresse du client</td>
<td><f:input path="adresse"/></td>
<td><f:errors path="adresse" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td>Email du Client</td>
<td><f:input path="email"/></td>
<td><f:errors path="email" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Numero du telephone</td>
<td><f:input path="tel"/></td>
<td><f:errors path="tel" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td><input type="submit" value="Ajouter"></td>
</tr>
</table>
</f:form>
</div>
<div>
<table>
<tr>
<th>Code du Client </th><th>Nom du Client</th><th>Prenom du Client</th><th>Adresse du Client</th><th> Email du Client </th><th>Numero Telephone </th>
</tr>
<c:forEach items="${clients}" var="clien">
    <tr>
    <td>${ clien.codeClient }</td>
    <td>${ clien.nomClient }</td>
    <td>${ clien.prenomClient }</td>
    <td>${ clien.adresse }</td>
    <td>${ clien.email }</td>
    <td>${ clien.tel }</td>
   </tr>
</c:forEach>
</table>
</div>