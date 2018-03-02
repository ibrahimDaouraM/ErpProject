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
<h3 style="text-align: center;">Gestion des Factures</h3>
<div id="formFacture" class="cadre">
<f:form modelAttribute="facture" action="AjouterFacture"
 method="post" enctype="multupart/form-data">
<table class="table">
<tr class="table-active">
<td>Reference</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="reference" path="reference"/></td>
<td><f:errors path="reference" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-danger">
<td>Nature de La Facture</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="nature de facture" path="naturedeFacture"/></td>
<td><f:errors path="naturedeFacture" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-success">
<td>Nom de la Societé</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="nom de la societé"  path="nomSociete"/></td>
<td><f:errors path="nomSociete" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-warning">
<td>TVA</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="tva"  path="tva"/></td>
<td><f:errors path="tva" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-danger">
<td>Adresse de la Societé</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor"   path="adresse"/></td>
<td><f:errors path="adresse" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-info">
<td>Date</td>
<td><f:input type="text" class="form-control" id="inputAddress2" placeholder="date"   path="date"/></td>
<td><f:errors path="date" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-active">
<td>Telephone</td>
<td><f:input type="text" class="form-control" id="inputEmail4" placeholder="Telephone" path="tel"/></td>
<td><f:errors path="tel" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-success">
<td>Code Client</td>
<td><f:select class="form-control" id="inputEmail4" placeholder="code client"   path="client.idClient" items="${clients}" itemValue="idClient" itemLabel="nomClient"></f:select></td>
<td><f:errors path="client.idClient" cssClass="errors"></f:errors></td>
</tr>
<tr class="table-warning">
<td>Code Fournisseur</td>
<td><f:select class="form-control" id="inputEmail4" placeholder="code fournisseur"   path="fournisseur.idFournisseur" items="${fournisseurs}" itemValue="idFournisseur" itemLabel="nomFournisseur"></f:select></td>
<td><f:errors path="fournisseur.idFournisseur" cssClass="errors"></f:errors></td>
</tr>
<tr>
<td ><button type="submit" class="btn btn-success">Ajouter la Facture</button></td>
</tr>
</table>
</f:form>
</div>
<div id="tableClient" class="cadre">
<table class="table table-bordered">
<tr class="table-success" >
<th >ID</th><th>Reference</th><th>Nature de Facture</th><th>Nom de la Societé</th><th>La TVA</th><th>Adresse</th><th>La Date</th><th>Numero Telephone</th><th>Reference du Client</th><th>Reference du Fournisseur</th><th>Suppression </th><th>Modification</th>
</tr>
<c:forEach items="${factures}" var="fac">
    <tr>
    <td>${ fac.idFacture}</td>
    <td>${fac.reference }</td>
    <td>${fac.naturedeFacture }</td>
    <td>${ fac.nomSociete}</td>
    <td>${fac.tva}%</td>
    <td>${fac.adresse}</td>
    <td>${fac.date}</td>
    <td>${fac.tel}</td>
    <td>${fac.client.nomClient}</td>
    <td>${fac.fournisseur.nomFournisseur}</td>
    <td><a href="suppFacture?idFacture=${fac.idFacture }">Supprimé</a></td>
    <td><a href="modifFacture?idFacture=${fac.idFacture }">Modifier</a></td>
   </tr>
   
</c:forEach>
</table>
</div>