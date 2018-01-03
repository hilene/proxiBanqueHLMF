<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<style>
body {
 
background-image: linear-gradient(to bottom, rgba(255,255,255,0.6) 0%,rgba(255,255,255,0.6) 0%), url("bootstrap/img/Green8.jpg");
}
.nav {
    overflow: hidden;
   background-color: rgb(244,253,174);
    position: fixed; /* Set the navbar to fixed position */
    top: 0; /* Position the navbar at the top of the page */
    width: 100%; /* Full width */
}
.main {
  margin-top: 30px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Virement</title>
</head>
<body>
	
  
<div class="navbar fixed-top">

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ConseillerServlet"><strong>Home</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./NouveauCompteServlet"><strong>Nouveau Compte</strong></a></li>
		
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ClientUpdate"><strong>Mise à Jour Compte Client</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" href="./ListerUnClientServlet"><strong>Lister un Client</strong></a></li>
		
		<li class="nav-item"><a class="nav-link active" data-toggle="tab"
			href="./VirementServlet"><strong>Virements</strong></a></li>
			
			</ul>
			</div>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>

<div class="main">
	

<div class="row"> 

	
<div class="container-fluid">
	<div class="row">
		<div class="col-md-1">
			
		</div>
		
			<div class="col-lg-6">
	<legend>Compte a Debiter</legend>

		<form method="post" action="CreationCompteServlet A MODIFIER!!!!">
<div class="form-group">
	<label class="col-form-label" for="inputDefault">Id Client</label>
  <input name="nom" class="form-control" value="" type="number" readonly>

  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" value="" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" value=""  type="text" readonly>

   <label for="exampleSelect1">Veuillez selectionner le type de compte</label>
      <select class="form-control" id="exampleSelect1">
        <option>Compte Courant</option>
        <option>Compte Epargne</option>
    </select>
<p>&nbsp;</p>
   <label class="col-form-label" for="inputDefault"><strong> Montant du transfert </strong></label>
  <input name="prenom" class="form-control" placeholder="Veuillez indiquer le montant du transfert" id="inputDefault" type="text" >

<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>

    <div class="col-lg-12">
	<legend>Compte a Crediter</legend>
			
<label class="col-form-label" for="inputDefault">Id Client</label>
  <input name="nom" class="form-control" value="" type="number" readonly>

  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" value="" type="text" readonly>

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" value=""  type="text" readonly>

   <label for="exampleSelect1">Veuillez selectionner le type de compte</label>
      <select class="form-control" id="exampleSelect1">
        <option>Compte Courant</option>
        <option>Compte Epargne</option>
    </select>
<p>&nbsp;</p>
	<button type="reset" class="btn btn-danger btn-lg">Annuler</button>
    <button type="submit" class="btn btn-primary btn-lg">Valider</button>
</div>
</form>
</div>
</div>
</div>
	
		
	</div>
</div>
</body>