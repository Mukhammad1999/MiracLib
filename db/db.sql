
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


-- Dumping data for table 'books'


insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (1, 'Babysitter Wanted', 'Horror|Thriller', '154459012-1', 'Dell', 'http://dummyimage.com/233x193.png/5fa2dd/ffffff', '0:50:45', '0:45:23');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (2, 'Secret Policeman''s Other Ball, The', 'Comedy|Documentary|Musical', '429856125-9', 'Rennie', 'http://dummyimage.com/120x145.png/5fa2dd/ffffff', '16:17:52', '19:34:12');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (3, 'Resident Evil: Damnation', 'Action|Animation|Horror', '099796089-2', 'Lianne', 'http://dummyimage.com/167x102.bmp/dddddd/000000', '6:16:35', '20:06:01');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (4, 'Reversal of Fortune', 'Drama', '441486885-8', 'Allsun', 'http://dummyimage.com/134x209.bmp/dddddd/000000', '1:19:24', '15:21:14');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (5, 'For a Good Time, Call...', 'Comedy|Drama|Romance', '020458209-1', 'Ally', 'http://dummyimage.com/218x120.jpg/dddddd/000000', '23:18:24', '19:47:47');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (6, 'Police Academy', 'Comedy|Crime', '230211739-5', 'Magdalen', 'http://dummyimage.com/216x147.png/5fa2dd/ffffff', '2:07:58', '13:01:47');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (7, 'Legendary', 'Drama', '407160017-9', 'Dale', 'http://dummyimage.com/245x129.bmp/dddddd/000000', '20:58:47', '23:04:46');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (8, 'The Circle', 'Documentary|Drama', '549829841-2', 'Dyanne', 'http://dummyimage.com/222x102.png/ff4444/ffffff', '3:54:09', '21:32:43');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (9, 'Funny People', 'Comedy|Drama', '919025695-6', 'Myrah', 'http://dummyimage.com/244x108.bmp/dddddd/000000', '10:29:10', '9:39:12');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (10, 'Out for Justice', 'Action|Crime|Drama|Thriller', '357649561-4', 'Alasteir', 'http://dummyimage.com/246x236.bmp/dddddd/000000', '0:05:12', '21:57:26');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (11, 'Wing Commander', 'Action|Sci-Fi', '583394746-4', 'Adair', 'http://dummyimage.com/164x137.png/cc0000/ffffff', '22:33:40', '13:00:27');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (12, 'Scientist, The', 'Drama', '219359416-3', 'Fonsie', 'http://dummyimage.com/110x202.png/ff4444/ffffff', '11:13:53', '9:01:33');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (13, 'Late Chrysanthemums (Bangiku)', 'Drama', '398639018-9', 'Percival', 'http://dummyimage.com/144x201.png/ff4444/ffffff', '10:35:35', '16:22:02');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (14, 'Bambi Meets Godzilla', 'Animation|Comedy', '874456723-5', 'Vladamir', 'http://dummyimage.com/149x127.jpg/cc0000/ffffff', '4:42:45', '23:20:42');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (15, 'Pinky', 'Drama', '928059367-6', 'Gradey', 'http://dummyimage.com/157x152.bmp/cc0000/ffffff', '13:07:33', '18:23:00');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (16, 'Blade of the Ripper', 'Drama|Horror|Mystery|Romance|Thriller', '559007841-5', 'Colene', 'http://dummyimage.com/177x135.bmp/5fa2dd/ffffff', '7:52:42', '1:11:49');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (17, 'Hey Ram', 'Drama', '595290323-1', 'Eva', 'http://dummyimage.com/238x129.png/ff4444/ffffff', '16:05:43', '3:21:34');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (18, 'Blazing Saddles', 'Comedy|Western', '170608803-5', 'Reuven', 'http://dummyimage.com/155x124.jpg/ff4444/ffffff', '6:54:49', '15:15:09');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (19, 'Sharon''s Baby', 'Horror', '600788714-6', 'Inga', 'http://dummyimage.com/202x247.bmp/ff4444/ffffff', '16:38:35', '17:00:08');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (20, 'Clonehunter', 'Sci-Fi', '535799327-0', 'Horace', 'http://dummyimage.com/185x183.png/dddddd/000000', '13:28:33', '4:49:27');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (21, 'Twelve O''Clock High', 'Drama|War', '291508164-6', 'Thea', 'http://dummyimage.com/244x115.png/cc0000/ffffff', '0:02:56', '6:43:50');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (22, 'The 39 Steps', 'Action|Adventure|Comedy|Crime|Drama|Thriller', '659282655-X', 'Myrvyn', 'http://dummyimage.com/202x120.jpg/dddddd/000000', '0:57:20', '23:38:31');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (23, 'Naked Civil Servant, The', 'Comedy|Drama', '501863401-4', 'Dareen', 'http://dummyimage.com/179x190.jpg/ff4444/ffffff', '7:00:59', '5:16:20');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (24, 'Saturday Night', 'Documentary', '463967056-7', 'Anthea', 'http://dummyimage.com/172x131.jpg/ff4444/ffffff', '21:30:31', '4:45:18');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (25, 'Green Fish (Chorok mulkogi)', 'Drama', '185141333-2', 'Ivy', 'http://dummyimage.com/250x183.jpg/ff4444/ffffff', '9:56:17', '18:42:09');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (26, 'Dust', 'Drama|Western', '971101851-9', 'Fanny', 'http://dummyimage.com/152x204.png/dddddd/000000', '4:21:01', '10:45:25');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (27, 'Sink or Swim', 'Documentary', '760169349-X', 'Pacorro', 'http://dummyimage.com/191x212.bmp/ff4444/ffffff', '14:15:04', '12:53:12');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (28, 'Girl in the Red Velvet Swing, The', 'Crime|Drama|Romance', '591675728-X', 'Bone', 'http://dummyimage.com/249x125.jpg/cc0000/ffffff', '19:11:13', '3:37:02');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (29, 'Amorosa', 'Drama', '714283085-9', 'Kerrill', 'http://dummyimage.com/171x247.png/dddddd/000000', '10:49:53', '1:35:57');
insert into public.books (id, title, genre, isbn, whom_added_id, image, borrowed_date , return_date ) values (30, 'Noose, The (Petla)', 'Drama', '453006380-1', 'Aldridge', 'http://dummyimage.com/186x128.jpg/5fa2dd/ffffff', '18:23:08', '14:48:05');



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

