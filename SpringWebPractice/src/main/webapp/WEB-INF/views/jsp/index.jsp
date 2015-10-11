<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
	<link href="${bootstrapCss}" rel="stylesheet" />
</head>

<div class="container">

    <div class="row">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#">Home</a></<li>
            <li><a href="#">GitHub</a></<li>
            <li><a href="#">SVN</a></<li>
            <li><a href="#">Tutorial</a></<li>
        </ul>
    </div>

    <div class="row">
        <div class="col-xs-12 col-lg-12" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <h1>${title} <small> ${msg} </small><h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12 col-lg-12" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <h1>Teoría de cuerdas<p><small>Descripcion</small></p></h1>
            <p class="lead">La teoría de cuerdas es un modelo fundamental de física teórica que básicamente asume que las partículas materiales aparentemente puntuales son en realidad "estados vibracionales" de un objeto extendido más básico llamado "cuerda" o "filamento".1</p>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-4 col-lg-4" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <small>This is small line</small><br>
            <strong>This is strong line</strong><br>
            <em>This is italic line</em>
        </div>
        <div class="col-xs-4 col-lg-4" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <p class="text-left">Text align left</p>
            <p class="text-center">Text align center</p>
            <p class="text-rigth">Text align rigth</p>
        </div>
        <div class="col-xs-4 col-lg-4" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <p class="text-muted">Text muted</p>
            <p class="text-primary">Text primary</p>
            <p class="text-success">Text success</p>
            <p class="text-info">Text info</p>
            <p class="text-warning">Text warning</p>
            <p class="text-danger">Text danger</p>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-2 col-lg-2" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <abbr title="Worl Wide Web">WWW</abbr><br>
            <abbr title="Real Simple Indication" class="initialism">RSS</abbr>
        </div>
        <div class="col-xs-5 col-lg-5" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">Row 3 Col - 2</div>
        <div class="col-xs-5 col-lg-5" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">Row 3 Col - 3</div>
    </div>

    <div class="row">
        <div class="col-xs-2 col-lg-2" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">
            <img src="./resources/img/ipn.png" class="img-responsive" alt="Responsive Image"/>
        </div>
        <div class="col-xs-5 col-lg-5" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">Row 3 Col - 2</div>
        <div class="col-xs-5 col-lg-5" style="box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444">Row 3 Col - 3</div>
    </div>

    <div class="row">
        <div class="alert alert-success">Success! Well done its submitted.</div>
    </div>

</div>


<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>

</body>
</html>