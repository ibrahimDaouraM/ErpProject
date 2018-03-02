<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<jsp:include page="home.jsp" />
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<h3 style="text-align: center;">Gestion des Clients</h3>
<div id="formClient" class="cadre">
<f:form modelAttribute="client" action="AjouterClient"
 method="post" enctype="multupart/form-data">
<table class="table">
<tr class="table-active">
<td>Code du Client</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Code" path="codeClient"/></td>
<td><f:errors path="codeClient" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-success">
<td>Nom du client</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Nom"  path="nomClient"/></td>
<td><f:errors path="nomClient" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-warning">
<td>Prenom du client</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Prenom"  path="prenomClient"/></td>
<td><f:errors path="prenomClient" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-danger">
<td>Adresse du client</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor"   path="adresse"/></td>
<td><f:errors path="adresse" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-info">
<td>Email du Client</td>
<td><f:input type="email" class="form-control" id="inputEmail4" placeholder="Email" path="email"/></td>
<td><f:errors path="email" cssClass="errors"></f:errors></td>
</tr>

<tr class="table-active">
<td>Numero du telephone</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Numero" path="tel"/></td>
<td><f:errors path="tel" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td ><button type="submit" class="btn btn-success">Ajouter le Client</button></td>
</tr>
</table>
</f:form>
</div>
<div id="tableClient" class="cadre">
<table class="table table-bordered">
<tr class="table-success">
<th>ID</th><th>Code du Client </th><th>Nom du Client</th><th>Prenom du Client</th><th>Adresse du Client</th>
<th> Email du Client </th><th>Numero Telephone </th><th>Suppression </th><th>Modification</th>
</tr>


<c:forEach items="${clients}" var="clien">
    <tr >
    <td>${ clien.idClient }</td>
    <td>${ clien.codeClient }</td>
    <td>${ clien.nomClient }</td>
    <td>${ clien.prenomClient }</td>
    <td>${ clien.adresse }</td>
    <td>${ clien.email }</td>
    <td>${ clien.tel }</td>
    <td><a href="suppClient?idClient=${clien.idClient }">Supprimé</a></td>
     <td><a href="modifClient?idClient=${clien.idClient}">Modifier</a></td>
   </tr>
</c:forEach>
</table>
</div>