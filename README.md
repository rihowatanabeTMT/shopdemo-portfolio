# shopdemo-portfolio
Java / JSP / Servlet / DAO / MVC構成で作成した簡易ショッピングWebアプリです。


## DB初期化方法

このプロジェクトには、MySQL用の初期データが含まれています。  
以下のコマンドで `shopdemo` データベースにインポートできます。

```bash
mysql -u ユーザー名 -p shopdemo < init_user.sql
