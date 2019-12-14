
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


-- Dumping data for table 'books'


insert into public.books_unique_list (isbn, title, book_count, available) values ('118456618-6', 'Horde, The (La Horde)', 25, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('441565065-1', 'Loosies', 21, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('512313038-1', 'Six Weeks', 54, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('017468577-7', 'Smashing Time', 20, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('089141206-9', 'Mill and the Cross, The', 90, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('967579476-3', 'From Beginning to End (Do Começo ao Fim)', 60, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('130794846-4', 'The Beautiful Story', 91, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('190125426-7', 'Notting Hill', 93, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('812731535-4', 'Scientist, The', 57, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('590404517-4', 'Yertle the Turtle and Other Stories', 32, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('200814755-X', 'Man Who Wasn''t There, The', 19, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('762230918-4', 'Happy Birthday to Me', 73, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('521078291-3', 'Story of Floating Weeds, A (Ukikusa monogatari)', 15, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('014484185-1', 'Urban Legends: Final Cut', 28, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('851446304-7', 'The Cyclone', 3, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('761102124-9', 'Pigskin Parade', 34, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('860181446-8', 'Hans (Kukkulan kuningas) ', 37, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('692291440-6', 'Houseguest', 78, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('185442292-8', 'Mendy: A Question of Faith', 21, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('312766304-8', 'The Golden Voyage of Sinbad', 62, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('352441626-8', 'Cube Zero', 47, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('753171398-5', 'Look Who''s Talking', 42, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('868941557-2', 'Adam & Paul', 66, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('901071335-0', 'Cheaper by the Dozen', 32, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('061602867-9', 'Last Season, The', 79, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('485209497-7', 'Private Detective 62', 21, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('808604020-8', 'Generation Iron', 17, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('745057075-0', 'Bribe, The', 47, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('160322638-9', 'Last of the Red Hot Lovers', 84, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('897835385-1', 'Hunt for Red October, The', 53, true);







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


-- Dumping data for table 'users'

insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('mtithacott0', 427215, 'cfNR2bO', '16:20:42', '12:43:12', false, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('ksills1', 869992, 'GTMp59gchD', '0:16:24', '4:32:19', true, false, false, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('rfermer2', 436831, 'LHLtZCnFb9wX', '11:18:10', '13:22:20', false, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('wbielfelt3', 884964, 'UKaRvGQVU', '5:15:07', '0:07:55', false, false, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('dwieprecht4', 620907, 'G1I83uZA', '10:43:44', '16:47:19', true, false, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bmcdavitt5', 975568, 'BoqEXlvE', '13:45:22', '20:23:47', true, true, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('hwroe6', 826356, 'dKlrGcJp', '16:10:39', '13:14:20', true, true, true, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('gspurryer7', 115181, 'O44QgEdNseJD', '15:14:23', '3:39:30', true, false, true, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('cduffyn8', 948133, '2wPr2Bq', '14:16:20', '17:25:38', false, true, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('jparradine9', 749656, 'pnnEvODG', '23:41:14', '1:33:44', true, false, true, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('mdacombea', 547251, '4LMdZXlsYX2', '23:54:20', '18:49:18', true, false, true, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('dstatterb', 326341, 'zLBmeMW', '17:24:57', '8:18:04', false, false, false, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('gvasyatkinc', 420690, 'lRQBr8', '10:05:13', '2:26:26', true, false, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('cmcintoshd', 760701, 'b5K8rWRzV', '17:50:50', '7:11:34', true, false, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('aeadese', 562895, 'TI4LVJAlqlz', '6:53:30', '21:42:25', true, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bmccartanf', 155019, '3P7fDk', '19:18:22', '5:21:56', false, false, false, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('ubonnavantg', 466301, 'Ew2HEo2B8U94', '8:33:38', '3:44:00', true, false, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('nsandefordh', 972525, 'lKIFwLSM', '6:44:51', '16:26:25', false, true, false, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('kpoundsfordi', 977790, '3ikpohjD9Hhn', '8:14:21', '7:03:07', true, false, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('ccrocketj', 746253, '1ghBn1Ia', '11:42:24', '9:59:51', false, true, true, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('jbilbyk', 463184, 'IYcxq3k', '7:39:03', '12:30:46', true, false, true, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('jjaanl', 595460, 'vdJs3o', '6:12:39', '1:42:59', false, false, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bcantillonm', 657033, 'vvV7AyPzqe', '12:27:49', '23:00:58', true, false, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('wfeehamn', 234021, 'MtcwRonXHWLT', '11:55:54', '12:14:45', false, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('rmcsheeo', 491498, 'GqHVqZ1', '8:20:57', '9:56:22', false, false, true, true);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('idabrowskip', 157911, 't5s5YT', '4:30:14', '19:44:24', true, false, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('hblezardq', 243880, '1GktVFshhGnR', '9:55:44', '16:31:16', true, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('mpatmorer', 976792, 'buHeqDbhg', '6:05:43', '11:37:09', true, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('eheaneys', 617102, 'Se9zvMEV', '2:43:10', '7:52:44', false, true, false, false);
insert into public.users (nick_name, id, password, last_login_time, last_logout_time, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bshillitot', 656931, 'GZSJayY3WCdg', '16:51:02', '6:42:30', false, false, true, true);







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

