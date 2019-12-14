
#PostgreSQL DB

--Creating a Database

CREATE DATABASE Miraclib


--Creating tables 

CREATE TABLE public.books (
	id bigserial not null primary key,
	title char not null,
	isnb char not null,
	book_count int, 
	image bytea,
	whom_added_id char 
);


CREATE TABLE public.admins (
	nick_name char,
	id char NOT NULL PRIMARY KEY,
	pass chkpass char NOT NULL,
	last_login_time timestamp,
	last_logout_time timestamp,
	active_status boolean
)


CREATE TABLE public.librerians(
	
)