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
            
			<div class="mem_t">
            	<span class="m_num fr" style="margin-top:15px;"><a href="#">返回</a></span>一级会员
            </div>
            <table border="1" class="mem_tab" style="width:870px; text-align:center; margin-top:20px;" cellspacing="0" cellpadding="0">
              <tr>
                <td class="th_bg" colspan="6">一级会员&nbsp; &nbsp; &nbsp;<b>（6人）</b></td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
              </tr>
              <tr>
                <td width="145" class="td_bg">会员名</td>
                <td width="145">YH1188</td>
                <td width="145" class="td_bg">普通会员</td>
                <td width="145">会员等级</td>
                <td width="145" class="td_bg">会员ID</td>
                <td width="145">12345678</td>
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
