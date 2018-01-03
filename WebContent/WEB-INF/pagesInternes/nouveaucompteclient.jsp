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
ul {
    width: 70%;
    margin: auto;
}
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
<title>Creer un Nouveau Compte Client</title>
</head>
<body>
  
<div class="navbar fixed-top">

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ConseillerServlet"><strong>Home</strong></a></li>
			
		<li class="nav-item"><a class="nav-link active" data-toggle="tab"
			href="./NouveauCompteServlet"><strong>Nouveau Compte</strong></a></li>
	<!-- 
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./ClientUpdateServlet"><strong>Mise à Jour Compte Client</strong></a></li>
			
		<li class="nav-item"><a class="nav-link" href="./ListerUnClientServlet"><strong>Lister un Client</strong></a></li>
		
		<li class="nav-item"><a class="nav-link" data-toggle="tab"
			href="./VirementServlet"><strong>Virements</strong></a></li>
		 -->	
			</ul>
			</div>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
${MsgJSP}

<div class="main">
<div class="row"> 
<div class="col-lg-4">
			<div class="card text-white bg-primary mb-3"
				style="max-width: 20rem;">
				<div class="card-header">Creation de Compte</div>
				<div class="card-body">
					<h4 class="card-title">Precautions d'usage</h4>
					<p class="card-text">Bien verifier les donnees saisies avant de valider</p>
				</div>
			</div>
			</div>
<div class="col-xs-1">
</div>
<div class="col-lg-4">
<form method="post" action="CreationCompteServlet">
<div class="form-group">
  <label class="col-form-label" for="inputDefault">Nom</label>
  <input name="nom" class="form-control" placeholder="nom" id="inputDefault" type="text">

  <label class="col-form-label" for="inputDefault">Prenom</label>
  <input name="prenom" class="form-control" placeholder="prenom" id="inputDefault" type="text">

  <label class="col-form-label" for="inputDefault">Adresse</label>
  <input name="adresse" class="form-control" placeholder="adresse" id="inputDefault" type="adresse">

  <label class="col-form-label" for="inputDefault">Code Postal</label>
  <input name="codepostal" class="form-control" placeholder="code postal" id="inputDefault" type="number">

  <label class="col-form-label" for="inputDefault">Ville</label>
  <input name="ville" class="form-control" placeholder="ville" id="inputDefault" type="text">

  <label class="col-form-label" for="inputDefault">Telephone</label>
  <input name="telephone" class="form-control" placeholder="telephone" id="inputDefault" type="text">

 <label class="col-form-label" for="inputDefault">Email</label>
  <input name="email" class="form-control" placeholder="email" id="inputDefault" type="email">

 <label class="col-form-label" for="inputDefault">Compte Courant</label>
  <input name="comptecourant" class="form-control" placeholder="comptecourant" id="inputDefault" type="number">

  <label class="col-form-label" for="inputDefault">Solde Compte Courant</label>
  <input name="soldecptecourant" class="form-control" placeholder="soldecptecourant" id="inputDefault" type="text">
  
  <label class="col-form-label" for="inputDefault">Date d'ouverture</label>
  <input name="date" class="form-control" placeholder="Date d'ouverture" id="inputDefault" type="date">

  <label class="col-form-label" for="inputDefault">Compte Epargne</label>
  <input name="compteepargne" class="form-control" placeholder="compteepargne" id="inputDefault" type="number">

  <label class="col-form-label" for="inputDefault">Solde Compte Epargne</label>
  <input name="soldecpteepargne" class="form-control" placeholder="soldecpteepargne" id="inputDefault" type="text">

<p>&nbsp;</p>
    <button type="submit" class="btn btn-primary">Valider</button>
    </div>
    </form>
 </div>
 </div>
</div>

</body>
</html>