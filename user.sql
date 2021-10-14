drop table if exists user 

/*==============================================================*/
/* Table: user */
/*==============================================================*/
CREATE TABLE user (
  id int NOT NULL AUTO_INCREMENT,
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (id)
)
insert into user (username,password) VALUES('root','root');
insert into user (username,password) VALUES('admin','admin');