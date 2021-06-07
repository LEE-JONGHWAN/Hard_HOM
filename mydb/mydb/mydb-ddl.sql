ALTER TABLE transactions
	ADD CONSTRAINT bank_real_account_id_fk FOREIGN KEY ( bank_account_id)
	REFERENCES bank_accounts ( bank_account_id)
	ON DELETE restrict
	ON UPDATE restrict;