-- com.web.library.dao.ex.entity.TUserStatusMapperEx updateLend--
UPDATE
	T_USER_STATUS
SET
	user_history = '10002,10003,10004,',
	user_num_lending = user_num_lending + 3
WHERE
	user_id = '10002';

'10010','10002','2018-06-23','2018-07-01','103','user103');