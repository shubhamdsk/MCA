<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Employee Registration Form - Results</title>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		int age = Integer.parseInt(request.getParameter("age"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String contactNumber = request.getParameter("contactNumber");
		String address = request.getParameter("address");
		String emailId = request.getParameter("emailId");
		String department = request.getParameter("department");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Connection con;
	    PreparedStatement ps;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "");
			    String sql = "insert into emp values (?,?,?,?,?,?,?,?,?)";
			    ps = con.prepareStatement(sql);
	            ps.setInt(1, id);
	            ps.setInt(2, age);
	            ps.setString(3, firstName);
	            ps.setString(4, lastName);
	            ps.setString(5, contactNumber);
	            ps.setString(6, address);
	            ps.setString(7, emailId);
	            ps.setString(8, department);
	            ps.setDouble(9, salary);
	            int res = ps.executeUpdate();
	            out.print(res +" Employee registered Successfully");
	            
		}catch(Exception e){
			e.printStackTrace();
		}
		
	%>
	
</body>
</html>
