CREATE TABLE `users` (
  `id` BIGINT UNSIGNED NOT NULL COMMENT 'ユーザーID',
  `email` VARCHAR(255) NOT NULL COMMENT 'Eメール',
  `name` VARCHAR(100) NOT NULL COMMENT '名前',
  `age` INT UNSIGNED NOT NULL COMMENT '年齢',
  `created_at` datetime NOT NULL COMMENT '作成日時',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新日時',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ユーザー一覧';