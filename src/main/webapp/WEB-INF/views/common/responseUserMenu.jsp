<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<!-- ハンバーガーボタン -->
<button type="button" class="drawer-toggle drawer-hamburger">
 <span class="sr-only">toggle navigation</span> <span class="drawer-hamburger-icon"></span>
</button>
<nav class="drawer-nav">
 <ul class="drawer-menu">
  <!-- ドロワーメニューの中身 -->
  <a href="ManagementMenu?submit=ユーザ一覧"><li>ユーザ一覧</li></a>
  <a href="ManagementMenu?submit=貸出超過者一覧"><li>貸出超過者一覧</li></a>
  <a href="ManagementMenu?submit=貸出中一覧"><li>貸出中一覧</li></a>
  <a href="ManagementMenu?submit=ユーザランキング"><li>ユーザランキング</li></a>
  <a href="ManagementMenu?submit=ユーザ登録"><li>ユーザ登録</li></a>
  <a href="ManagementMenu?submit=ユーザ削除"><li>ユーザ削除</li></a>
  <a href="/libraryWeb/Management?submit=ログアウト"><li>ログアウト</li></a>
  <a href="#"><li><img src="/library/resources/image/fireFox.jpg" width="50px" height="50px">
 </ul>
</nav>