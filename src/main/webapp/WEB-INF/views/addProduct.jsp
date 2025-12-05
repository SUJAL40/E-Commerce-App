<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html><body>
  <h2>Add Product</h2>
  <form:form method="post" modelAttribute="product" action="/admin/product/add">
    Name: <form:input path="name"/><br/>
    Price: <form:input path="price"/><br/>
    Quantity: <form:input path="quantity"/><br/>
    <button type="submit">Save</button>
  </form:form>
</body></html>
