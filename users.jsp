<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>View users</title>
</head>
<body>
<a class="btn btn-dark" href="getUsers">Get users</a>
<table class="table">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Username</th>
      <th scope="col">Password</th>
      
    </tr>
  </thead>
  <tbody>
  
  <s:iterator value="list">
  
  
    <tr>
    
      <th scope="row"><s:property value="id"/> </th>
      <td><s:property value="username"/></td>
      <td><s:property value="password"/></td>
     
    </tr>
    
    </s:iterator>

  </tbody>
</table>

</body>
</html>