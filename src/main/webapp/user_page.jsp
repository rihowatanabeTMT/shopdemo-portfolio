<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="ken.bean.Item"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/top.css">
<title>ショッピングサイトLatteトップページ</title>
</head>
<body id="index_page">
	<div id="wrap">
		<header id="header">
			<h1>
				<img src="img/site_id_new.png" width="204" height="120" alt="logo">
			</h1>
			<div class="login">
				<ul>
					<c:choose>
						<c:when test="${not empty login_user}">
							<li><c:out value="${login_user.userName}" />さん</li>
							<li><a href="/user_page.jsp">会員情報</a></li>
							<li><form action="login" method="post">
									<input type="submit" value="ログアウト">
									<input type ="hidden" value ="logout" name ="login_btn">
								</form></li>
						</c:when>
						<c:otherwise>
							<li>ゲスト</li>
							<li><form action="login" method="get">
									<input type="submit" value="ログイン">
									<input type ="hidden" value ="login" name ="login_btn">
								</form></li>
						</c:otherwise>
					</c:choose>
				</ul>

			</div>
		</header>
		<hr>
		<nav id="nav">
			<ul>
				<li><a href="#">ホーム</a></li>
				<li><a href="#">ショップガイド</a></li>
				<li><a href="#">よくある質問</a></li>
				<li><a href="#">会社案内</a></li>
				<li><a href="#">お問い合わせ</a></li>
			</ul>
		</nav>
		<div id="visual">
			<h2>
				<img src="img/yokohama01.jpg" alt="Latteトップページ" width="900"
					height="200">
			</h2>
		</div>
		<main id="main_contents">
			<section>
			
			</section>
			<section>

			</section>
			<section>
			</section>
		</main>
		<!-- InstanceEndEditable -->
		<hr>
		<div id="sub_contents">
			<h4>
				<img src="img/sidemn_shopguide.gif" width="96" height="15"
					alt="ショッピングガイド">
			</h4>
			<ul>
				<li><a href="#">ご購入方法</a></li>
				<li><a href="#">お支払い方法</a></li>
				<li><a href="#">配送料</a></li>
				<li><a href="#">ラッピング</a></li>
				<li><a href="#">返品・交換</a></li>
			</ul>
			<p>
				全国無料配送<br> 各種クレジットカードもご利用になれます。
			</p>
			<p>販売元：株式会社シンクスバンク</p>
		</div>
		<hr>
		<footer id="footer">
			<p>
				<a href="#wrap"><img src="img/page_top.gif" width="49"
					height="9" alt="ページトップ"> </a>
			</p>
			<address>&copy; 2012 Thinketh Bank Co., Ltd. All Rights
				Reserved.</address>
		</footer>
	</div>
</body>
</html>