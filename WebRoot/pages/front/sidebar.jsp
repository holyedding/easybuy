<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="m_left">
        	<div class="left_n">管理中心</div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">订单中心</div>
                <ul>
                	<li><a href="pages/front/Member_Order.jsp">我的订单</a></li>
                    <li><a href="pages/front/Member_Address.jsp" class="now">收货地址</a></li>
                    <li><a href="#">缺货登记</a></li>
                    <li><a href="#">跟踪订单</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg2">会员中心</div>
                <ul>
                	<li><a href="pages/front/Member_User.jsp">用户信息</a></li>
                    <li><a href="pages/front/Member_Collect.jsp">我的收藏</a></li>
                    <li><a href="pages/front/Member_Msg.jsp">我的留言</a></li>
                    <li><a href="pages/front/Member_Links.jsp">推广链接</a></li>
                    <li><a href="#">我的评论</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg3">账户中心</div>
                <ul>
                	<li><a href="pages/front/Member_Safe.jsp">账户安全</a></li>
                    <li><a href="pages/front/Member_Packet.jsp">我的红包</a></li>
                    <li><a href="pages/front/Member_Money.jsp">资金管理</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg4">分销中心</div>
                <ul>
                	<li><a href="pages/front/Member_Member.jsp">我的会员</a></li>
                    <li><a href="pages/front/Member_Results.jsp">我的业绩</a></li>
                    <li><a href="pages/front/Member_Commission.jsp">我的佣金</a></li>
                    <li><a href="pages/front/Member_Cash.jsp">申请提现</a></li>
                </ul>
            </div>
        </div>
