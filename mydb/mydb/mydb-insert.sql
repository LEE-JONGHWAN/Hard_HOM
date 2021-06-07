INSERT INTO mydb.transactions(
   transaction_date
  ,amount
  ,transaction_type
  ,bank_account_id
) VALUES (
   '2014-08-29'  -- transaction_date - IN datetime
  ,99.99   -- amount - IN decimal(10,2)
  ,'D'  -- transaction_type - IN char(1)
  ,3   -- bank_account_id - IN int(11)
);



INSERT INTO mydb.bank_accounts(
      bank_account_number
) VALUES (
      'C-927461738'  -- bank_account_number - IN varchar(20)
);

