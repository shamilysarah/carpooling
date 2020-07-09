
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title> 
        </head>
        <body>
            <form:form id="prodet" modelAttribute="provider" action="detailProcess" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="username">Provider Name</form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="carnum">Car No</form:label>
                        </td>
                        <td>
                            <form:input path="carnum" onfocus="this.value='';" name="carnum" id="carnum" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="origin">Origin</form:label>
                        </td>
                        <td>
                            <form:input path="origin" name="origin" id="origin" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="destination">Destination</form:label>
                        </td>
                        <td>
                            <form:input path="destination" name="destination" id="destination" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="starttime">StartTime</form:label>
                        </td>
                        <td>
                            <form:input path="starttime" onfocus="this.value='';" name="starttime" id="starttime" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="vacancy">Vacancy</form:label>
                        </td>
                        <td>
                            <form:input path="vacancy" onfocus="this.value='';" name="vacancy" id="vacancy" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="amount">Amount</form:label>
                        </td>
                        <td>
                            <form:input path="amount" onfocus="this.value='';" name="amount" id="amount" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="submit" name="submit">Submit</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="/">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>