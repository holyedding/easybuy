<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

    <div class="menu_bg">
	<div class="menu">
    	<!--Begin 商品分类详情 Begin-->    
    	<div class="nav">
        	<div class="nav_t">全部商品分类</div>
            <div class="leftNav">
                <ul>      
                   <c:forEach items="${list1 }" var="map1">
                    <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="resources/images/nav1.png" /></span>
                            <span class="fl" data-value="${map1.id }">${map1.title }</span>
                        </div>
                        <div class="zj">
                            <div class="zj_l">
                            </div>

                            <div class="zj_r">
                                <a href="#"><img src="resources/images/n_img1.jpg" width="236" height="200" /></a>
                                <a href="#"><img src="resources/images/n_img2.jpg" width="236" height="200" /></a>
                            </div>
                        </div>
                     </li>
                    </c:forEach>
                </ul>            
            </div>
        </div>   
        <!--End 商品分类详情 End-->                                                     
    	<ul class="menu_r">    
            <c:forEach items="${list }" var="map">
            <li><a href="${map.href }">${map.title }</a></li>
            </c:forEach>
        </ul>
        <div class="m_ad">中秋送好礼！</div>
    </div>
</div>

