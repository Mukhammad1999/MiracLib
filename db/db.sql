
-- PostgeSQL 
-- version 11
-- https://www.postgres.org
-- Host: 127.0.0.1:5432
-- Generation Time: Dec 12, 20189 at 04:56 PM
--
-- Database: Miraclib
--
-- --------------------------------------------------------
--
-- Table structure

CREATE DATABASE Miraclib;

--Creating tables 

CREATE TABLE public.books (
	id bigserial not null primary key,
	title char not null,
	genre char not null,
	isbn char not null,
	whom_added_id char,
	image bytea,
	borrowe_date timestamp,
	return_date timestamp, 
);


CREATE TABLE public.books_unique_list (
	isnb char  NOT NULL PRIMARY KEY,
	title char NOT NULL,
	book_count integer,
	available boolean NOT NULL
);


CREATE TABLE public.users (
	nick_name char,
	id char NOT NULL PRIMARY KEY,
	password char NOT NULL,
	last_login_time timestamp,
	last_logout_time timestamp,
	active_status boolean,
	update_librerians_privlage boolean,
	update_students_privlage boolean,
	update_books_privlage boolean
);


CREATE TABLE public.actions_track_list(
	id bigserial NOT NULL PRIMARY KEY,
	user_id char NOT NULL,
	action_id integer NOT NULL,
	action_description char NOT NULL,
	made_date timestamp
);

CREATE TABLE public.action_description (
	id integer NOT NULL PRIMARY KEY,
	action_description char NOT NULL
);

