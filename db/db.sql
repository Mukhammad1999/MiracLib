
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
	title varchar not null,
	genre varchar not null,
	isbn varchar not null,
	whom_added_id varchar,
	image bytea,
	borrowed_date timestamp,
	return_date timestamp
);


-- Dumping data for table 'books'



insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (1, 'Babysitter Wanted', 'Horror|Thriller', '154459012,1', 'Dell', 'http://dummyimage.com/233x193.png/5fa2dd/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (2, 'Secret Policeman''s Other Ball, The', 'Comedy|Documentary|Musical', '429856125,9', 'Rennie', 'http://dummyimage.com/120x145.png/5fa2dd/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (3, 'Resident Evil: Damnation', 'Action|Animation|Horror', '099796089,2', 'Lianne', 'http://dummyimage.com/167x102.bmp/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (4, 'Reversal of Fortune', 'Drama', '441486885,8', 'Allsun', 'http://dummyimage.com/134x209.bmp/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (5, 'For a Good Time, Call...', 'Comedy|Drama|Romance', '020458209,1', 'Ally', 'http://dummyimage.com/218x120.jpg/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (6, 'Police Academy', 'Comedy|Crime', '230211739,5', 'Magdalen', 'http://dummyimage.com/216x147.png/5fa2dd/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (7, 'Legendary', 'Drama', '407160017,9', 'Dale', 'http://dummyimage.com/245x129.bmp/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (8, 'The Circle', 'Documentary|Drama', '549829841,2', 'Dyanne', 'http://dummyimage.com/222x102.png/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (9, 'Funny People', 'Comedy|Drama', '919025695,6', 'Myrah', 'http://dummyimage.com/244x108.bmp/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (10, 'Out for Justice', 'Action|Crime|Drama|Thriller', '357649561,4', 'Alasteir', 'http://dummyimage.com/246x236.bmp/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (11, 'Wing Commander', 'Action|Sci-Fi', '583394746,4', 'Adair', 'http://dummyimage.com/164x137.png/cc0000/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (12, 'Scientist, The', 'Drama', '219359416,3', 'Fonsie', 'http://dummyimage.com/110x202.png/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (13, 'Late Chrysanthemums (Bangiku)', 'Drama', '398639018,9', 'Percival', 'http://dummyimage.com/144x201.png/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (14, 'Bambi Meets Godzilla', 'Animation|Comedy', '874456723,5', 'Vladamir', 'http://dummyimage.com/149x127.jpg/cc0000/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (15, 'Pinky', 'Drama', '928059367,6', 'Gradey', 'http://dummyimage.com/157x152.bmp/cc0000/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (16, 'Blade of the Ripper', 'Drama|Horror|Mystery|Romance|Thriller', '559007841,5', 'Colene', 'http://dummyimage.com/177x135.bmp/5fa2dd/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (17, 'Hey Ram', 'Drama', '595290323,1', 'Eva', 'http://dummyimage.com/238x129.png/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (18, 'Blazing Saddles', 'Comedy|Western', '170608803,5', 'Reuven', 'http://dummyimage.com/155x124.jpg/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (19, 'Sharon''s Baby', 'Horror', '600788714,6', 'Inga', 'http://dummyimage.com/202x247.bmp/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (20, 'Clonehunter', 'Sci-Fi', '535799327,0', 'Horace', 'http://dummyimage.com/185x183.png/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (21, 'Twelve O''Clock High', 'Drama|War', '291508164,6', 'Thea', 'http://dummyimage.com/244x115.png/cc0000/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (22, 'The 39 Steps', 'Action|Adventure|Comedy|Crime|Drama|Thriller', '659282655,X', 'Myrvyn', 'http://dummyimage.com/202x120.jpg/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (23, 'Naked Civil Servant, The', 'Comedy|Drama', '501863401,4', 'Dareen', 'http://dummyimage.com/179x190.jpg/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (24, 'Saturday Night', 'Documentary', '463967056,7', 'Anthea', 'http://dummyimage.com/172x131.jpg/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (25, 'Green Fish (Chorok mulkogi)', 'Drama', '185141333,2', 'Ivy', 'http://dummyimage.com/250x183.jpg/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (26, 'Dust', 'Drama|Western', '971101851,9', 'Fanny', 'http://dummyimage.com/152x204.png/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (27, 'Sink or Swim', 'Documentary', '760169349,X', 'Pacorro', 'http://dummyimage.com/191x212.bmp/ff4444/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (28, 'Girl in the Red Velvet Swing, The', 'Crime|Drama|Romance', '591675728,X', 'Bone', 'http://dummyimage.com/249x125.jpg/cc0000/ffffff');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (29, 'Amorosa', 'Drama', '714283085,9', 'Kerrill', 'http://dummyimage.com/171x247.png/dddddd/000000');
insert into public.books (id, title, genre, isbn, whom_added_id, image ) values (30, 'Noose, The (Petla)', 'Drama', '453006380,1', 'Aldridge', 'http://dummyimage.com/186x128.jpg/5fa2dd/ffffff');





CREATE TABLE public.books_unique_list (
	isbn varchar NOT NULL PRIMARY KEY,
	title varchar NOT NULL,
	book_count integer,
	available boolean NOT NULL
);


-- Dumping data for table 'books'


insert into public.books_unique_list (isbn, title, book_count, available) values ('118456618,6', 'Horde, The (La Horde)', 25, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('441565065,1', 'Loosies', 21, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('512313038,1', 'Six Weeks', 54, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('017468577,7', 'Smashing Time', 20, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('089141206,9', 'Mill and the Cross, The', 90, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('967579476,3', 'From Beginning to End (Do Começo ao Fim)', 60, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('130794846,4', 'The Beautiful Story', 91, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('190125426,7', 'Notting Hill', 93, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('812731535,4', 'Scientist, The', 57, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('590404517,4', 'Yertle the Turtle and Other Stories', 32, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('200814755,X', 'Man Who Wasn''t There, The', 19, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('762230918,4', 'Happy Birthday to Me', 73, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('521078291,3', 'Story of Floating Weeds, A (Ukikusa monogatari)', 15, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('014484185,1', 'Urban Legends: Final Cut', 28, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('851446304,7', 'The Cyclone', 3, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('761102124,9', 'Pigskin Parade', 34, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('860181446,8', 'Hans (Kukkulan kuningas) ', 37, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('692291440,6', 'Houseguest', 78, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('185442292,8', 'Mendy: A Question of Faith', 21, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('312766304,8', 'The Golden Voyage of Sinbad', 62, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('352441626,8', 'Cube Zero', 47, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('753171398,5', 'Look Who''s Talking', 42, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('868941557,2', 'Adam & Paul', 66, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('901071335,0', 'Cheaper by the Dozen', 32, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('061602867,9', 'Last Season, The', 79, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('485209497,7', 'Private Detective 62', 21, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('808604020,8', 'Generation Iron', 17, false);
insert into public.books_unique_list (isbn, title, book_count, available) values ('745057075,0', 'Bribe, The', 47, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('160322638,9', 'Last of the Red Hot Lovers', 84, true);
insert into public.books_unique_list (isbn, title, book_count, available) values ('897835385,1', 'Hunt for Red October, The', 53, true);







CREATE TABLE public.users (
	nick_name varchar,
	id varchar NOT NULL PRIMARY KEY,
	password varchar NOT NULL,
	last_login_time timestamp,
	last_logout_time timestamp,
	active_status boolean,
	update_librerians_privlage boolean,
	update_students_privlage boolean,
	update_books_privlage boolean
);


-- Dumping data for table 'users'

insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('mtithacott0', 427215, 'cfNR2bO',  false, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('ksills1', 869992, 'GTMp59gchD',  true, false, false, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('rfermer2', 436831, 'LHLtZCnFb9wX',  false, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('wbielfelt3', 884964, 'UKaRvGQVU',  false, false, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('dwieprecht4', 620907, 'G1I83uZA',  true, false, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bmcdavitt5', 975568, 'BoqEXlvE',  true, true, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('hwroe6', 826356, 'dKlrGcJp',  true, true, true, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('gspurryer7', 115181, 'O44QgEdNseJD',  true, false, true, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('cduffyn8', 948133, '2wPr2Bq',  false, true, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('jparradine9', 749656, 'pnnEvODG',  true, false, true, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('mdacombea', 547251, '4LMdZXlsYX2',  true, false, true, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('dstatterb', 326341, 'zLBmeMW',  false, false, false, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('gvasyatkinc', 420690, 'lRQBr8',  true, false, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('cmcintoshd', 760701, 'b5K8rWRzV',  true, false, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('aeadese', 562895, 'TI4LVJAlqlz',  true, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bmccartanf', 155019, '3P7fDk',  false, false, false, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('ubonnavantg', 466301, 'Ew2HEo2B8U94',  true, false, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('nsandefordh', 972525, 'lKIFwLSM',  false, true, false, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('kpoundsfordi', 977790, '3ikpohjD9Hhn',  true, false, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('ccrocketj', 746253, '1ghBn1Ia',  false, true, true, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('jbilbyk', 463184, 'IYcxq3k',  true, false, true, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('jjaanl', 595460, 'vdJs3o',  false, false, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bcantillonm', 657033, 'vvV7AyPzqe',  true, false, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('wfeehamn', 234021, 'MtcwRonXHWLT',  false, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('rmcsheeo', 491498, 'GqHVqZ1',  false, false, true, true);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('idabrowskip', 157911, 't5s5YT',  true, false, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('hblezardq', 243880, '1GktVFshhGnR',  true, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('mpatmorer', 976792, 'buHeqDbhg',  true, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('eheaneys', 617102, 'Se9zvMEV',  false, true, false, false);
insert into public.users (nick_name, id, password, active_status, update_librerians_privlage, update_students_privlage, update_books_privlage) values ('bshillitot', 656931, 'GZSJayY3WCdg',  false, false, true, true);




CREATE TABLE public.actions_track_list(
	id bigserial NOT NULL PRIMARY KEY,
	user_id varchar NOT NULL,
	action_id integer NOT NULL,
	action_description varchar NOT NULL,
	due_date timestamp
);


-- Dumping data for table 'actions_track_list'

insert into public.actions_track_list (id, user_id, action_id, action_description) values (1, 229030, 17, 'Aliquam non mauris.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (2, 169563, 50, 'Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (3, 572379, 80, 'In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (4, 961113, 93, 'Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (5, 670778, 60, 'Vestibulum sed magna at nunc commodo placerat. Praesent blandit.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (6, 245731, 65, 'In quis justo. Maecenas rhoncus aliquam lacus.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (7, 717802, 16, 'Quisque id justo sit amet sapien dignissim vestibulum.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (8, 126463, 70, 'Vestibulum sed magna at nunc commodo placerat.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (9, 788374, 18, 'Sed sagittis.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (10, 546429, 38, 'Morbi non quam nec dui luctus rutrum. Nulla tellus.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (11, 844459, 50, 'Nam tristique tortor eu pede.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (12, 763656, 4, 'Donec semper sapien a libero.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (13, 625691, 84, 'Aenean auctor gravida sem.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (14, 787768, 3, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (15, 507517, 47, 'Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (16, 937121, 84, 'Nulla facilisi.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (17, 982491, 33, 'Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (18, 468157, 48, 'Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (19, 991552, 24, 'Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (20, 990101, 48, 'In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (21, 620518, 19, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (22, 556444, 23, 'In hac habitasse platea dictumst.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (23, 907725, 23, 'Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (24, 482600, 79, 'Proin risus. Praesent lectus.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (25, 933762, 41, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (26, 853094, 74, 'Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (27, 982024, 96, 'Nullam molestie nibh in lectus.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (28, 763144, 70, 'Nullam varius.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (29, 402707, 90, 'Morbi quis tortor id nulla ultrices aliquet.');
insert into public.actions_track_list (id, user_id, action_id, action_description) values (30, 263340, 87, 'Phasellus in felis.');






CREATE TABLE public.action_description (
	id integer NOT NULL PRIMARY KEY,
	action_description varchar NOT NULL
);

-- Dumping data for table 'action_description'

insert into public.action_description(id,action_description) values (0,'loged out from the system');
insert into public.action_description(id,action_description) values (1,'loged in to the system');
insert into public.action_description(id,action_description) values (2,'added librerian');
insert into public.action_description(id,action_description) values (3,'updated librerian'); 
insert into public.action_description(id,action_description) values (4,'deleted librerian');
insert into public.action_description(id,action_description) values (5,'added student');
insert into public.action_description(id,action_description) values (6,'updated student');
insert into public.action_description(id,action_description) values (7,'deleted student');
insert into public.action_description(id,action_description) values (8,'added book');
insert into public.action_description(id,action_description) values (9,'updated book');
insert into public.action_description(id,action_description) values (10,'deleted book');
insert into public.action_description(id,action_description) values (11,'registered a loan');
insert into public.action_description(id,action_description) values (12,'confirmed book return'); 
insert into public.action_description(id,action_description) values (13,'blocked student');
insert into public.action_description(id,action_description) values (14,'fined a student');