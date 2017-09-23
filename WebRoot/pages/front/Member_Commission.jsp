<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String context = request.getContextPath();// /dt41_javaweb2
	String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+context+"/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=path %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="resources/css/style.css" />
    <!--[if IE 6]>
    <script src="resources/easybuy/js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->
        
    <script type="text/javascript" src="resources/easybuy/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="resources/easybuy/js/menu.js"></script>    
        
	<script type="text/javascript" src="resources/easybuy/js/select.js"></script>
        
    
<title>尤洪</title>
</head>
<body>  
<!--Begin Header Begin-->
<jsp:include page="mTop.jsp" flush="true"></jsp:include>
<!--End Header End--> 
<div class="i_bg bg_color">
    <!--Begin 用户中心 Begin -->
	<div class="m_content">
   		<jsp:include page="sidebar.jsp" flush="true"></jsp:include>
		<div class="m_right">
            <p></p>		
            
			<div class="mem_tit">
            	我的佣金
            </div>
            <table border="1" class="co_tab" style="width:930px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="35%"><img src="resources/images/bag.png" align="absmiddle" /> &nbsp;消费返利</td>                       
                <td width="65%" style="color:#ff4e00;">100R</td>
              </tr>
              <tr>
                <td width="35%"><img src="resources/images/bag.png" align="absmiddle" /> &nbsp;预存返还 </td>                       
                <td width="65%" style="color:#ff4e00;">100R</td>
              </tr>
              <tr>
                <td width="35%"><img src="resources/images/bag.png" align="absmiddle" /> &nbsp;联盟返利 </td>                       
                <td width="65%" style="color:#ff4e00;">1000R</td>
              </tr>
              <tr>
                <td width="35%"><img src="resources/images/bag.png" align="absmiddle" /> &nbsp;可提现余额 </td>                       
                <td width="65%" style="color:#ff4e00;">
                	1200R
                	<span class="tx"><a href="#">提现</a></span>
                </td>
              </tr>
            </table>

            
        </div>
    </div>
	<!--End 用户中心 End--> 
    <!--Begin Footer Begin -->
    <jsp:include page="footer.jsp" flush="true"></jsp:include>
    <!--End Footer End -->    
</div>

</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
