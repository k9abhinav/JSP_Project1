<%@page import="com.cec.models.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DISPLAY LIST</title>
<script src="https://cdn.tailwindcss.com"></script>
    <style>
        /* For GitHub dark mode like look */
        body {
            background-color: #0d1117; /* Dark background */
            color: #c9d1d9; /* Light text */
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #30363d;
        }
        th {
            background-color: #21262d;
            color: #f0f6fc;
        }
        td {
            background-color: #161b22;
        }
    </style>
</head>
<body class="min-h-screen p-8">
	<h1 class="text-3xl font-bold mb-8 text-center">List of Employees</h1>

	<%
	ArrayList<Employee> employeeList = (ArrayList<Employee>) request.getAttribute("employeeList");

	//Method 1
	//employeeList.forEach(table code)

	//Method 2:
	//convert to Array 
	//Object[] empArray = employeeList.toArray();
	//for(Employee emp : (Employee)empArray){
	// table code
	//}
	%>

	<div class="overflow-x-auto">
		<table class="min-w-full table-auto">
			<thead>
				<tr>
					<th class="px-4 py-2 text-left">First Name</th>
					<th class="px-4 py-2 text-left">Last Name</th>
					<th class="px-4 py-2 text-left">Phone Number</th>
				</tr>
			</thead>
			<tbody>
				<%
				if (employeeList != null) {
					for (Employee emp : employeeList) {
				%>
				<tr class="hover:bg-gray-700">
					<td class="px-4 py-2"><%=emp.getFirstName()%></td>
					<td class="px-4 py-2"><%=emp.getLastName()%></td>
					<td class="px-4 py-2"><%=emp.getPhoneNo()%></td>
				</tr>
				<%
				}
				} else {
				%>
				<tr>
					<td colspan="3" class="text-center py-4">No employees found</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>