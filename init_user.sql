-- init_user.sql

CREATE TABLE `user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(50) DEFAULT NULL,
  `user_name_kana` VARCHAR(50) DEFAULT NULL,
  `post` VARCHAR(20) DEFAULT NULL,
  `address` VARCHAR(100) DEFAULT NULL,
  `phone` VARCHAR(50) DEFAULT NULL,
  `mail` VARCHAR(50) DEFAULT NULL,
  `password` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1005 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user` (`user_id`, `user_name`, `user_name_kana`, `post`, `address`, `phone`, `mail`, `password`) VALUES
(1001, '野村朱里', 'ノムラアカリ', '932-3333', '東京都世田谷区北沢1-1-1KENコーポ203', '090-0000-0000', 'kenken1@kenschool.jp', '$2a$10$dCeI1H0vAvKacNgXRxHG5Oe2ULYPv6FlCDBDOYH2zVxrpjN2fM0Ey'),
(1002, '佐藤賢一', 'サトウケンイチ', '932-3334', '千葉県柏市1-1-1KENコーポ204', '090-0000-0000', 'kenken2@kenschool.jp', '$2a$10$GZeF1SUsKNrcgBkCySOQwOiZ4MkX8KZTLR1FeMSqZxTQC5aZSezzC'),
(1003, '田中亮雄', 'タナカアキオ', '932-3335', '神奈川県横浜市1-1-1KENコーポ205', '090-0000-0000', 'kenken3@kenschool.jp', '$2a$10$Th0KwJeiq1qCHxMiDcc9OeOaOby2cklsU.VRXOhR3JY91NT3FxFBK'),
(1004, '松本昭徳', 'マツモトアキノリ', '932-3336', '神奈川県茅野市1-1-1KENコーポ204', '090-0000-0000', 'kenken4@kenschool.jp', '$2a$10$2C4RZ.Ccf6pPwM0WSb/bkO/o9PzTtkWa7tOSMbIpe.zCUpSvQyNNa');