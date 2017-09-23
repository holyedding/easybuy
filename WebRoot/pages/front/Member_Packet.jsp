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
            <div class="mem_tit">我的红包</div>
			<table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
              <tr>                                                                                                                                                    
                <td width="155">红包序号</td>
                <td width="155">红包名称</td>
                <td width="155">红包金额</td>
                <td width="155">最小订单金额</td>
                <td width="155">截止使用日期</td>
                <td width="155">红包状态</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
			</table>

            
			<div class="mem_tit">添加红包</div>
			<form>
            <table border="0" style="width:880px;"  cellspacing="0" cellpadding="0">
              <tr height="50">
                <td width="80" align="right">红包序列码 &nbsp; &nbsp;</td>
                <td width="300"><input type="text" value="" class="add_ipt" style="width:260px;" /></td>
                <td><input type="submit" value="生成代码" class="btn_tj" /></td>
              </tr>
            </table>
            </form>


            
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
