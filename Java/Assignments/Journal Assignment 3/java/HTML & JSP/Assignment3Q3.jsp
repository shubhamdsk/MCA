<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import = "java.io.*,java.util.*" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Operations</title>
    </head>

    <body>
        <%
        int n = Integer.parseInt(request.getParameter("num"));
        String option = request.getParameter("op");
        int i;
        
            if(option.equals("square")){
                int s = n*n;
                out.println("Square of Number : "+s);
            }

            if(option.equals("prime")){
            int f=0;
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                out.println(n+ " is Prime Number");
            }
            else{
                out.println(n+ " is not Prime Number");
            }   
        }
            if(option.equals("cdate")){
                Date d = new Date();
                out.println(d.toString());
            } 
            if(option.equals("even")){
                if(n%2==0){
                    out.println(n+ " is Even Number");
                }
                else{
                	out.println(n+ " is Odd Number");
                 } 
            }
        %>
    </body>

    </html>