/* 최종 완성 */
select book.book_title, ab.* ,a.last_name 
from book
	join author_book ab on ab.book_id = book.book_id
	join author a on a.author_id  = ab.author_id
where a.last_name like '조%';

/* 1차 */
select book.*, ab.*
from book
	join author_book ab on ab.book_id = book.book_id ;
	

/* 최종 목표 */
select b.book_title 
from book b
	join author_book ab on ab.book_id = b.book_id
	join author a2 on a2.author_id = ab.author_id
where a2.last_name like '조%';

