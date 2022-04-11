Create table users(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	first_name varchar(20),
	last_name varchar(20),
	username varchar(100),
	password varchar(20)
);


Create table todos(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	description varchar(255),
	is_done bit(1),
	target_date datetime,
	username varchar(100),
	title varchar(200)
);