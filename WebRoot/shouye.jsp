<%@ page contentType="text/html; charset=GB2312" %>
<html>
   <head>
      <title></title>
      <style type="text/css">
	/*��վlogo��������ʽ*/
#site_title{
	float:left;			/*���󸡶�*/
	margin-top:30px;
}
	
/*�˵����������*/
	/*ҳ��˵�*/
 
 #menubar{
	width:980px;
	height:60px;
	background:url(images/menuber.jpg) no-repeat;
 }
 .ddsmoothmenu{
	float:left;
 }
 .ddsmoothmenu ul{
	z-index:100;					/*����ҳ�����϶���ʾ*/
	margin:0;
	padding:0;
	list-style-type:none;			/*�б������б���ʽ*/
 }

 .ddsmoothmenu ul li{
	position:relative;
	display:inline;
	float:left;
 }

 .ddsmoothmenu ul li a{
	display:block;
	padding:0 30px;
	height:40px;
	line-height:40px;
	font-size:12px;
	color:#2f2f2f;
	text-decoration:none;
	outline:none;
	text-align:center;
 }

 .ddsmoothmenu ul li a.selected,.ddsmoothmenu ul li a:hover{
	color:#fff;
	background:#2f2f2f;
 }

 .ddsmoothmenu ul li ul{
	position:absolute;
	left:0;
	padding:10px 0 0;
	display:none;
	visibility:hidden;
	background:#313131;
	border-bottom:4px solid #000
 }

 .ddsmooyhmenu ul li ul li{
	display:list-item;
	float:none;
 }

 .ddsmoothmenu ul li ul li a{
	font-weight:400;
	width:130px;
	height:30px;
	padding:0 30px;
	line-height:30px;
	font-size:11px;
	text-align:left;
	background:none;
	color:#ccc;
	border-bottom:1px solid #222;
	border-top:1px solid #444;
	
 }

.ddsmoothmenu ul li ul li a.selected,.ddsmoothmenu ul li ul li a:hover{
	color:#fff;
	font-weight:700;
	background:#222;
 }

 .ddshadow{
	position:absolute;
	left:0;
	top:0;
	width:0;
	height:0;
 }
   
        h1{ text-align:center; }
        <!--divtext-align:right; padding-right:-->
.container{
	width:960px;
	height:450px;
	margin:60px auto;
}
.pic{
	width:250px;
}
.container img{
	padding: 10px 10px 10px;
	background: white;
	box-shadow: 5px,5px,3px,rgba(50,50,50,0.4);
}

.pic1{
	transform: rotate(-15deg);
	
}
.pic2{
	transform: rotate(5deg);
	
}
.pic3{
	transform: rotate(-10deg);
}
.pic4{
	transform: rotate(20deg);
	
}
.pic5{
	transform: rotate(10deg);
	
}
.pic6{
	transform: rotate(-15deg);
	
}
.pic7{
	transform: rotate(15deg);
	
}
.pic8{
	transform: rotate(-20deg);
	
}
/*ҳ��ײ��İ�Ȩ��ʽ*/
#footer{
	width:960px;
	padding:30px 10px;
	color:#2f2f2f;									/*��ɫ*/
	text-align:center;
	background:url(images/footer.jpg)no-repeat top
}

#footer a{
	color:#2f2f2f;									/*����������Ϊ��ɫ*/
}
    </style>
   </head>
   <body bgcolor="pink">
      <form name="PetShop2" method="POST" action="action2">
  		<h1>��ӭ�����߲�������̵�</h1>
  		<div id="site_title"><h3><b>��ã�<%= request.getAttribute("value") %> ��ӭ���ٱ���</b>&nbsp;&nbsp;&nbsp;&nbsp;</h3></div>
			<div class="cleaner"></div>
		</div>
       <div id="menubar">
			<div id="top_nav" class="ddsmoothmenu">
            <ul>
            <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
             <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
              <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
               <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li><a href="main.html" class="selected">��ҳ</a></li>
					
					<li><a href="#">����</a></li>
					<li><a href="#">��������</a></li>
					<li><a href="#">��ϵ</a></li>
				</ul>
				<br style="clear:left"/>
			</div>
            </div>
  		<br>
  		<div align="left">
  			
  		</div>
  		<div align="lift">
  		<tr>
  		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<td>��ѡ����Ҫ��ѯ�ĳ������ࣺ
  		<select name="type"> 
		<option value="0">����è</option> 
		<option value="1">���ﹷ</option> 
		</select> </td>&nbsp;&nbsp;&nbsp;
		<td>��ѡ����Ҫ��ѯ�ĳ�����ʽ��
  		<select name="styles"> 
  		<option value="0">ȫ��</option>
		<option value="1">���ͳ���</option> 
		<option value="2">���ͳ���</option> 
		<option value="3">С�ͳ���</option> 
		</select> </td>&nbsp;&nbsp;&nbsp;
		<td><input type="submit" name="select" value="����"></td></tr>
  		</div><br /><br /><br /><br />
  		<div class="container" align="center">
		     <img src="img/mao1.jpg" class="pic pic1" style="height: 196px; "/>
		     <img src="img/mao2.jpg" class="pic pic2" style="height: 196px; "/>
		     <img src="img/mao3.jpg" class="pic pic3" style="height: 208px; "/>
		     <img src="img/mao4.jpg" class="pic pic4" style="height: 222px; "/>
		     <img src="img/xiaogou1.jpg" class="pic pic5" style="height: 212px; "/>
		     <img src="img/xiaogou2.jpg" class="pic pic6" />
		     <img src="img/xiaogou3.jpg" class="pic pic7" />
		     <td><img src="img/xiaogou4.jpg" class="pic pic8" style="height: 264px; width: 332px"/></td></tr>
		  <div id="footer">
		    <p> 
					<a href="main.html">��ҳ</a></a>|<a href="#">����</a>|<a href="#">��������</a>|<a href="#">��ϵ</a>
<div>
</p>
Copyright &copy; &nbsp;<a href="#">�߲�������</a>&nbsp;&nbsp;2017&nbsp;&nbsp;|&nbsp;&nbsp;���ߣ�400-420-1234&nbsp;&nbsp;ICP �� 12345678 ��
			</div> 
		</div>
  	</form>
   </body>
</html>
