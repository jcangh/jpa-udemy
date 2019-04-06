create table person(

	id 			integer not null,
	name		varchar(255) not null,
	location	varchar(255),
	birth_date	timestamp,
	primary key(id)
);

insert into person
	(id,name,location,birth_date)
values
	(1,'Juan','Bogota','1987-09-7');
	
insert into person
	(id,name,location,birth_date)
values
	(2,'Claudia','Leticia','1984-03-25');	
	
insert into person
	(id,name,location,birth_date)
values
	(3,'Pedro','Fresno','1961-04-24');	