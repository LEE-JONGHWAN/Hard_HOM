# Lee_Com_Hard
1.마리아DB
아래의 스크립트 내용 추가.

mydb 데이터베이스안에 

CREATE TABLE `transactions` (
  `transaction_id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction_date` datetime DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `transaction_type` char(1) DEFAULT NULL,
  `bank_account_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `bank_real_account_id_fk` (`bank_account_id`),
  CONSTRAINT `bank_real_account_id_fk` FOREIGN KEY (`bank_account_id`) REFERENCES `bank_accounts` (`bank_account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8

CREATE TABLE `bank_accounts` (
  `bank_account_id` int(11) NOT NULL AUTO_INCREMENT,
  `bank_account_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`bank_account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

1	A-28
2	B-17
3	C-927461738