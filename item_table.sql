-- item_table.sql

CREATE TABLE `item` (
  `item_id` INT NOT NULL,
  `item_name` VARCHAR(50) DEFAULT NULL,
  `artist` VARCHAR(50) DEFAULT NULL,
  `price` INT NOT NULL,
  `item_img` VARCHAR(50) DEFAULT NULL,
  `genre_id` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `item` (`item_id`, `item_name`, `artist`, `price`, `item_img`, `genre_id`) VALUES
(101, 'ポリーボット', 'アン・シャイシー', 580, 'img/h4.jpg', 'book'),
(102, 'AGE of vase', 'ダグレッド', 410, 'img/h3.jpg', 'book'),
(103, '龍玉60年の歴史', '島山明', 600, 'img/h2.jpg', 'book'),
(104, 'Xギャユキ', 'さくらむむこ', 105, 'img/h1.jpg', 'book'),
(201, 'Dream on and roll', 'AERO-Zeppelin', 2945, 'img/d1.jpg', 'cd'),
(202, 'song3', 'plur', 2543, 'img/l2.jpg', 'cd'),
(203, 'ウオトラ', '浜崎あゆみ子', 2800, 'img/d3.jpg', 'cd'),
(301, 'In bar Dream', 'DATA WEST', 7140, 'img/g1.jpg', 'game'),
(302, 'DANCE DANCE!!', '小波', 6090, 'img/g2.jpg', 'game'),
(303, 'COW GAME', '忍電道', 7329, 'img/g4.jpg', 'game'),
(304, 'IMPOSSIBLE IS NOTHING', '南青子', 4800, 'img/g3.jpg', 'game'),
(305, 'ひとりの野球', '小波', 4800, 'img/no.png', 'game');
