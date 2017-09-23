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
            	申请提现
            </div>
            <table border="0" class="mem_tab" style="width:930px; margin-bottom:30px;" cellspacing="0" cellpadding="0">
              <tr>
              	<td class="ma_a" colspan="2" style="padding:12px 50px;">
                	<span class="fl" style="color:#ff4e00; font-size:14px;">会员余额：<b>￥ 1000元</b></span>
                    <span class="fr"><a href="#">账户明细</a>|<a href="#">提现记录</a></span>        
                </td>
              </tr>
              <tr>                                                                                                                                                    
                <td width="150" class="tx_l">提现金额</td>                                                                                                                                         
                <td width="680"><input type="text" value="提取金额" class="tx_ipt" /></td>
              </tr>
              <tr>
                <td class="tx_l">真实姓名</td>
                <td><input type="text" value="姓名填写" class="tx_ipt" /></td>
              </tr>
              <tr>
                <td class="tx_l">开户行</td>
                <td><input type="text" value="填写银行名称" class="tx_ipt" /></td>
              </tr>
              <tr>
                <td class="tx_l">银行账号</td>
                <td><input type="text" value="填写银行账号" class="tx_ipt" /></td>
              </tr>
              <tr>
                <td class="tx_l">手机号</td>
                <td><input type="text" value="手机号码" class="tx_ipt" /></td>
              </tr>
              <tr valign="top">
                <td class="tx_l">备注</td>
                <td><textarea class="tx_txt">会员备注</textarea></td>
              </tr>
              <tr height="70">
                <td colspan="2" align="center">
                	<input type="submit" value="提交表单" class="btn_tj" /> &nbsp; &nbsp; <input type="reset" value="重置表单" class="btn_tj" />
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
