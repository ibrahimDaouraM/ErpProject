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
<h3 style="text-align: center;">Gestion des Fournisseurs</h3>
<div id="formFournisseur" class="cadre">
<f:form modelAttribute="fournisseur" action="AjouterFournisseur"
 method="post" enctype="multupart/form-data">
<table class="table">
<tr class="table-active">
<td>Code du Fournisseur</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Code" path="codeFournisseur"/></td>
<td><f:errors path="codeFournisseur" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-success">
<td>Nom du Fournisseur</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Nom"  path="nomFournisseur"/></td>
<td><f:errors path="nomFournisseur" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-warning">
<td>Prenom du Fournisseur</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Prenom"  path="prenomFournisseur"/></td>
<td><f:errors path="prenomFournisseur" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-danger">
<td>Adresse du Fournisseur</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor"   path="adresseFournis"/></td>
<td><f:errors path="adresseFournis" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-info">
<td>Email du Fournisseur</td>
<td><f:input type="email" class="form-control" id="inputEmail4" placeholder="Email" path="email"/></td>
<td><f:errors path="email" cssClass="errors"></f:errors></td>
</tr>

<tr class="table-active">
<td>Numero du telephone</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Numero" path="tel"/></td>
<td><f:errors path="tel" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td ><button type="submit" class="btn btn-success">Ajouter le fournisseur</button></td>
</tr>
</table>
</f:form>
</div>
<div id="tableClient" class="cadre">
<table class="table table-bordered">
<tr class="table-success">
<th>ID</th><th>Code du Fournisseur </th><th>Nom du Fournisseur</th><th>Prenom du Fournisseur</th><th>Adresse du Fournisseur</th>
<th> Email du Fournisseur </th><th>Numero Telephone </th><th>Suppression </th><th>Modification</th>
</tr>


<c:forEach items="${fournisseurs}" var="four">
    <tr >
    <td>${ four.idFournisseur }</td>
    <td>${ four.codeFournisseur }</td>
    <td>${ four.nomFournisseur }</td>
    <td>${ four.prenomFournisseur }</td>
    <td>${ four.adresseFournis }</td>
    <td>${ four.email }</td>
    <td>${ four.tel }</td>
    <td><a href="suppFournisseur?idFournisseur=${four.idFournisseur}">Supprimé</a></td>
     <td><a href="modifFournisseur?idFournisseur=${four.idFournisseur}">Modifier</a></td>
   </tr>
</c:forEach>
</table>
</div>