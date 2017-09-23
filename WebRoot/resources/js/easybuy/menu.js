// JavaScript Document

var jq = jQuery.noConflict();
jQuery(function(){
	jq(".leftNav ul li").hover(
		function(){
			var subMenu=$(this).find(".zj .zj_l");
			var flag=subMenu.attr("rendered");
			var subMenuId=$(this).find(".fj .fl").attr("data-value");
			if(!flag){
				//获取二级菜单数据
			$.ajax({
				async : false,
				url:'SubMenuListServlet',
					type : 'post',
					data : {
						"MenuId" : subMenuId
					},
					dataType : 'json',
					success : function(result) {
						menulist=result.menulist;
						var html=""
						for(var i=0;i<menulist.length;i++){//获取二级菜单数据循环添加
							var data=menulist[i];
							var subMenuNavId=data.id;//获取2级菜单id(3级菜单parent)
							html+="<div class=\"zj_l_c\" data-value="+data.id+"><h2>"+data.title+"</h2>";
					//获取3级菜单数据
					$.ajax({
						async : false,
						url:'NavMenuListServlet',
							type : 'post',
							data : {
								"subMenuNavId" : subMenuNavId//获取二级菜单id,传到servlet
							},
							dataType : 'json',
							success : function(result) {
							    var menuNavlist=result.menuNavlist;
								for(var i=0;i<menuNavlist.length;i++){//获取3级菜单数据循环添加
									var dataNav=menuNavlist[i];
									html+="<a href=\"#\">"+dataNav.title+"</a>";
								}
								}
				           }) 
				           html+="</div>";
						}
						subMenu.html(html);
						subMenu.attr("rendered",true);
				}
			});
			}
			jq(this).find(".fj").addClass("nuw");
			jq(this).find(".zj").show();
		}
		,
		function(){
			jq(this).find(".fj").removeClass("nuw");
			jq(this).find(".zj").hide();
		}
	)
})