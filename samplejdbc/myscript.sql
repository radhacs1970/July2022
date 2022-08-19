use july2022;

drop table customer;

CREATE TABLE Customer(
Cus_id varchar(255) Primary Key,
Cus_name varchar(255),
Cus_phone varchar(255),
Cus_Email varchar(255),
Cus_walletbal integer,
Cus_Login_id integer unique,
Cus_Password varchar(255)
);
INSERT INTO Customer VALUES
('C0001','Sheldon','9434346142','Sheldon@gmail.com', 10000,100,'abcd'),
('C0002','Amy','9800641110','Amy@gmail.com', 5500,101,'xyz'),
('C0003','Leonard','9800456987','Leonard@gmail.com', 8700,102,'pqrs'),
('C0004','Penny','9434346589','Penny@gmail.com',9000,103,'mnop'),
('C0005','Harvard','9800262887','Harvard@gmail.com',4500,104,'ijkl');


select * from customer;
