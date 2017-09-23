<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
    String context = request.getContextPath();// /dt41_javaweb2
			String path = request.getScheme() + "://" + request.getServerName()
					+ ":" + request.getServerPort() + context + "/";
%>
<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=path%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="resources/css/style.css" />
<!--[if IE 6]>
    <script src="resources/js/easybuy/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->
<script type="text/javascript"
	src="resources/js/easybuy/jquery-1.11.1.min_044d0927.js"></script>
<script type="text/javascript"
	src="resources/js/easybuy/jquery.bxslider_e88acd1b.js"></script>

<script type="text/javascript"
	src="resources/js/easybuy/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="resources/js/easybuy/menu.js"></script>

<script type="text/javascript" src="resources/js/easybuy/select.js"></script>

<script type="text/javascript" src="resources/js/easybuy/lrscroll.js"></script>

<script type="text/javascript" src="resources/js/easybuy/iban.js"></script>
<script type="text/javascript" src="resources/js/easybuy/fban.js"></script>
<script type="text/javascript" src="resources/js/easybuy/f_ban.js"></script>
<script type="text/javascript" src="resources/js/easybuy/mban.js"></script>
<script type="text/javascript" src="resources/js/easybuy/bban.js"></script>
<script type="text/javascript" src="resources/js/easybuy/hban.js"></script>
<script type="text/javascript" src="resources/js/easybuy/tban.js"></script>

<script type="text/javascript" src="resources/js/easybuy/lrscroll_1.js"></script>


<title>尤洪</title>
</head>
<body>
	<!--Begin Header Begin-->
	<div class="soubg">
		<div class="sou">
			<span class="fr"> <span class="fl">你好请<a
					href="pages/front/Login.jsp">登录</a>&nbsp; <a
					href="pages/front/Regist.jsp" style="color: #ff4e00;">免费注册</a>&nbsp;</span><span class="fl">|&nbsp;关注我们：</span> <span class="s_sh"><a
					href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span> <span
				class="fr">|&nbsp;<a href="#">手机版&nbsp;<img
						src="resources/images/s_tel.png" align="absmiddle" /></a></span>
			</span>
		</div>
	</div>
	<!--End Header End-->
	<!--Begin Login Begin-->
	<div class="log_bg">
		<div class="top">
			<div class="logo">
				<a href="Index.jsp"><img src="resources/images/logo.png" /></a>
			</div>
		</div>
		<div class="regist">
			<div class="log_img">
				<img src="resources/images/l_img.png" width="611" height="425" />
			</div>
			<div class="reg_c">
				<form action="<%=path%>AccountRigist" method="post">
					<table border="0"
						style="width: 420px; font-size: 14px; margin-top: 20px;"
						cellspacing="0" cellpadding="0">
						<tr height="50" valign="top">
							<td width="95">&nbsp;</td>
							<td><span class="fl" style="font-size: 24px;">注册</span> <span
								class="fr">已有商城账号，<a href="pages/front/Login.jsp"
									style="color: #ff4e00;">我要登录</a></span></td>
						</tr>
						<tr height="50">
							<td align="right"><font color="#ff4e00">*</font>&nbsp;用户名
								&nbsp;</td>
							<td><input type="text" value="" class="l_user"
								name="username" pattern="/W{6-16}" placeholder="请输入6-16位的用户名" required="required"/><span id="usernameTip"></span></td>
						</tr>
						<tr height="50">
							<td align="right"><font color="#ff4e00">*</font>&nbsp;密码
								&nbsp;</td>
							<td><input type="password" value="" class="l_pwd"
								name="password" placeholder="请输入6-16位的数字字母组合" pattern="[0-9a-zA-Z]{6-16}" required="required"/></td>
						</tr>
						<tr height="50">
							<td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码
								&nbsp;</td>
							<td><input type="password" value="" class="l_pwd"
								name="checkPassword" placeholder="请重复输入密码"/><span id="checkPassword"></span></td>
						</tr>
						<tr height="50">
							<td align="right"><font color="#ff4e00">*</font>&nbsp;邮箱
								&nbsp;</td>
							<td><input type="email" value="" class="l_email" name="email"
								placeholder="请输入正确的邮箱地址"
								required="required" /><span id="emailTip"></span></td>
						</tr>
						<tr height="50">
							<td align="right"><font color="#ff4e00">*</font>&nbsp;手机
								&nbsp;</td>
							<td><input type="text" value="" class="l_tel" name="phone"
								placeholder="请输入正确的电话号码" pattern="^(13|15|17|18)[0-9]{9}$"
								required="required" /><span id="telTip"></span></td>
						</tr>
						<tr height="50">
							<td align="right"><font color="#ff4e00">*</font>&nbsp;验证码
								&nbsp;</td>
							<td><input type="text" value="" class="l_ipt" name="smsCode"/>&nbsp;&nbsp;<input type="button" id="btn" value="免费获取验证码" onclick="settime(this)" style="height: 35px"/><span id="sms"></span> 
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td style="font-size: 12px; padding-top: 20px;"><span
								style="font-family: '宋体';" class="fl"> <label
									class="r_rad"><input type="checkbox" id="agree" /></label><label
									class="r_txt">我已阅读并接受《用户协议》</label>
							</span></td>
						</tr>
						<tr height="60">
							<td>&nbsp;</td>
							<td><input type="submit" value="立即注册" class="log_btn"
								style="background: gray" disabled="disabled" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<!--End Login End-->
	<!--Begin Footer Begin-->
	<div class="btmbg">
		<div class="btm">
			备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com Copyright © 2015-2018
			尤洪商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
			<img src="resources/images/b_1.gif" width="98" height="33" /><img
				src="resources/images/b_2.gif" width="98" height="33" /><img
				src="resources/images/b_3.gif" width="98" height="33" /><img
				src="resources/images/b_4.gif" width="98" height="33" /><img
				src="resources/images/b_5.gif" width="98" height="33" /><img
				src="resources/images/b_6.gif" width="98" height="33" />
		</div>
	</div>
	<!--End Footer End -->

</body>
<script type="text/javascript">
 $("input[name=checkPassword]").blur(function(){
	var pwd=$("input[name=password]").val();
	var cpwd=$("input[name=checkPassword]").val();
	if(pwd!=cpwd){
		$("#checkPassword").html(" *两次密码不一致");
		$("#checkPassword").css("color","red");
		$("form").submit(function(){
			return false;
		})
	}else{
		$("form").submit(function(){
			return true;
		})
	}
}); 

 $("input[name=username]").blur(function(){
	$.ajax({
		url:'<%=path%>AccountRigistUsername',
		type:'post',
		data:{
			username:$("input[name=username]").val()
		},
		dataType:'json',
		success:function(result){
			var flag=result.flag;
			if(flag){
				$("#usernameTip").html(" *此用户名已被注册");
				$("#usernameTip").css("color","red");
				$("form").submit(function(){
					return false;
				})
			}else{
				$("#usernameTip").html("");
				$("form").submit(function(){
					return true;
				})
			}
		}
	})
}); 
$("input[name=email]").blur(function(){
	$.ajax({
		url:'<%=path%>/AccountRigistEmail',
		type:'post',
		data:{
			email:$("input[name=email]").val()
		},
		dataType:'json',
		success:function(result){
		  	var flag=result.flag;
			if(flag){
				$("#emailTip").html("*此邮箱已被注册");
				$("#emailTip").css("color","red");
				$("form").submit(function(){
					return false;
				})
			}
			else{
				$("#emailTip").html("");
				$("form").submit(function(){
					return true;
				})
			}  
		}
	})
});
$("input[name=phone]").blur(function(){
	$.ajax({
		url:'<%=path%>/AccountRigistPhone',
			type : 'post',
			data : {
				phone : $("input[name=phone]").val()
			},
			dataType : 'json',
			success : function(result) {
				var flag = result.flag;
				if (flag) {
					$("#telTip").html(" *此手机号已被注册");
					$("#telTip").css("color","red");
					$("form").submit(function(){
						return false;
					})
				} else {
					$("#telTip").html("");
					$("form").submit(function(){
						return true;
					})
				}
			}
		})
	});
	/*点击获取短信验证码  */
	$("#btn").click(function(){
		$.ajax({
			url:'<%=path%>/AccountSmsServlet',
				type : 'post',
				data : {
					phone : $("input[name=phone]").val()
				},
				dataType : 'json',
				success : function(result) {
					
					}
				
			})
	});
	/*判断验证码是否正确  */
	$(".l_ipt").blur(function(){
		$.ajax({
			url:'<%=path%>/AccountRigstSmsCodeServlet',
				type : 'post',
				data : {
					phone : $("input[name=phone]").val(),
					smsCode:$(".l_ipt").val()
				},
				dataType : 'json',
				success : function(result) {
					var flag=result.flag;
					if(!flag){
						$("#sms").html("验证码错误");
						$("form").submit(function(){
							return false;
						})
					}else{
						$("#sms").html("");
						$("form").submit(function(){
							return true;
						})
					}
				}
			})
	});
	$("#agree").click(function() {
		if (this.checked) {
			$(".log_btn").css("background", "#F9530a");
			$(".log_btn").removeAttr("disabled");
		} else {
			$(".log_btn").css("background", "gray");
			$(".log_btn").attr("disabled", "disabled");
		}
	});
	var countdown=60; 
    function settime(obj) { 
        if (countdown == 0) { 
            obj.removeAttribute("disabled");    
            obj.value="免费获取验证码"; 
            countdown = 60; 
            return;
        } else { 
            obj.setAttribute("disabled", true); 
            obj.value="重新发送(" + countdown + ")"; 
            countdown--; 
        } 
    setTimeout(function() { 
        settime(obj) }
        ,1000) }
    
</script>

<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
