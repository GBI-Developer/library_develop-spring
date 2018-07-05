-- com.web.library.dao.ex.entity.TLendingBookTmpMapperEx updateLend--
insert into
	T_LENDING_BOOK_TMP
	(book_id, user_id, lending_date, return_date, mng_user_id, create_user)
values
	('10008','10002',CURDATE(),'2018-07-01','103','user103'),
	('10009','10002','2018-06-23','2018-07-01','103','user103'),
	('10010','10002','2018-06-23','2018-07-01','103','user103');