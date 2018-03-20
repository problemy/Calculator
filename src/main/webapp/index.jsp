<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="pl">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title></title>
</head>
 
<body>
    <h1 align="center">Bankowy kaulkulator kredytowy</h1>
    <form action="credit" method="post" align="center" >
        <label> Wnioskowana kwota kredytu: <br /> <input  type="text" id= "amount" name="amount"/> </label><br />
        <label> Ilosc lat: <br /> <input type="text" id="years" name="years"/></label>   <br />
        <label> Oprocentowanie:<br /> <input type="text" id="percentage" name="percentage"/> </label> <br />
        <label> Prowizja: <br />  <input type="text" id="commision" name="commision"/> </label>  <br />
        <label> Rodzaj rat :<br /> <select name="type"> 
    <option selected="selected">Stale</option>
    <option>Malejace</option>
       
</select>
         <br /> <br /></label>
    <input type="submit" name="submit" value="Wyslij" />
    </form>
 
</body>
</html>