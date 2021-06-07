-- jh_hardshop.브랜드명 definition

CREATE TABLE `브랜드명` (
  `brand_name` varchar(20) DEFAULT NULL COMMENT '브랜드명(삼성전자 등등)',
  `hard_data` varchar(20) DEFAULT NULL COMMENT '하드용량(250기가 등등)',
  `hard_description` varchar(200) DEFAULT NULL COMMENT '하드 설명서'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
