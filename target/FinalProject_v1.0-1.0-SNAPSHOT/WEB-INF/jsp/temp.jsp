
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<!DOCTYPE html>
<html>
  <head>
    <title>Student Application Form</title>
  </head>
  <body bgcolor="blue">
       <label for="university">University<span>*</span></label>
           <Select items ="${requestScope.Unis}">
                <c:forEach var= "uni" items ="${requestScope.Unis}">
                    <option value="${uni.universityID}">
                        ${uni.name}
                    </option>
                       
                </c:forEach>
           </Select>
  </body>
</html>