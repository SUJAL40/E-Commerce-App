<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html><body>
  <h2>Register</h2>
  <form:form method="post" modelAttribute="user" action="">
    Username: <form:input path="username"/><br/>
    Email: <form:input path="email"/><br/>
    Password: <form:password path="password"/><br/>
    <button type="submit">Register</button>
  </form:form>
</body></html>
