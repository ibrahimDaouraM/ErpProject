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
<h3 style="text-align: center;">Gestion des Produits</h3>
<div id="formProduit" class="cadre">
<f:form modelAttribute="produit" action="AjouterProduit"
 method="post" enctype="multupart/form-data">
<table class="table">
<tr class="table-active">
<td>Designation</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="designation" path="designation"/></td>
<td><f:errors path="designation" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-success">
<td>Description</td>
<td><f:textarea type="text" class="form-control" id="inputAddress2" placeholder="description"  path="description"/></td>
<td><f:errors path="description" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-warning">
<td>Prix</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Prix"  path="prix"/></td>
<td><f:errors path="prix" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-danger">
<td>Quantité</td>
<td><f:input type="text"  class="form-control" id="inputAddress2" placeholder="quantité"   path="quantite"/></td>
<td><f:errors path="quantite" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td ><button type="submit" class="btn btn-success">Ajouter le Produit</button></td>
</tr>
</table>
</f:form>
</div>
<div id="tableClient" class="cadre">
<table class="table table-bordered">
<tr class="table-success">
<th>ID</th><th>Designation</th><th>Description</th><th>Prix</th><th>Quantité</th><th>Suppression </th><th>Modification</th>
</tr>


<c:forEach items="${produits}" var="prod">
    <tr >
    <td>${ prod.idProduit}</td>
    <td>${ prod.designation }</td>
    <td>${prod.description }</td>
    <td>${ prod.prix }</td>
    <td>${ prod.quantite }</td>
    <td><a href="suppProduit?idProduit=${prod.idProduit }">Supprimé</a></td>
     <td><a href="modifProduit?idProduit=${prod.idProduit}">Modifier</a></td>
   </tr>
</c:forEach>
</table>
</div>