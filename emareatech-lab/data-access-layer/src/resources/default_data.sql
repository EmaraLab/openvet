insert into vet values (1, 1, '2012-02-02', 1, '2012-02-02', 'James', 'Carter');
insert into vet values (2, 1, '2012-02-02', 1, '2012-02-02', 'Helen', 'Leary');
insert into vet values (3, 1, '2012-02-02', 1, '2012-02-02', 'Linda', 'Douglas');
insert into vet values (4, 1, '2012-02-02', 1, '2012-02-02', 'Rafael', 'Ortega');
insert into vet values (5, 1, '2012-02-02', 1, '2012-02-02', 'Shahid', 'Afridi');
insert into vet values (6, 1, '2012-02-02', 1, '2012-02-02', 'Imran', 'Khan');

INSERT INTO vet_speciality VALUES (1, 1, '2012-02-02',1,'2012-02-02','radiology');
INSERT INTO vet_speciality VALUES (2, 1, '2012-02-02',1,'2012-02-02','surgery');
INSERT INTO vet_speciality VALUES (3, 1, '2012-02-02',1,'2012-02-02','dentistry');


INSERT INTO vet_spec_link VALUES (3, 2);
INSERT INTO vet_spec_link VALUES (3, 3);
INSERT INTO vet_spec_link VALUES (4, 2);
INSERT INTO vet_spec_link VALUES (5, 1);

INSERT INTO pet_type VALUES (1,  1, '2012-02-02',1,'2012-02-02','cat','cat');
INSERT INTO pet_type VALUES (2,  1, '2012-02-02',1,'2012-02-02','dog', 'dog');
INSERT INTO pet_type VALUES (3,  1, '2012-02-02',1,'2012-02-02','lizard', 'lizard');
INSERT INTO pet_type VALUES (4,  1, '2012-02-02',1,'2012-02-02','snake', 'snake');
INSERT INTO pet_type VALUES (5,  1, '2012-02-02',1,'2012-02-02','bird','bird');
INSERT INTO pet_type VALUES (6,  1, '2012-02-02',1,'2012-02-02','hamster','hamster');

INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (1, 1, '2012-02-02',1,'2012-02-02','George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone)  VALUES (2, 1, '2012-02-02',1,'2012-02-02','Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (3, 1, '2012-02-02',1,'2012-02-02','Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (4, 1, '2012-02-02',1,'2012-02-02','Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (5, 1, '2012-02-02',1,'2012-02-02','Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (6, 1, '2012-02-02',1,'2012-02-02','Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (7, 1, '2012-02-02',1,'2012-02-02','Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (8, 1, '2012-02-02',1,'2012-02-02','Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (9, 1, '2012-02-02',1,'2012-02-02','David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owner (owner_id, created_by, created_on, updated_by, updated_on, first_name, last_name, address, city, telephone) VALUES (10, 1, '2012-02-02',1,'2012-02-02','Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (1, 1, '2012-02-02',1,'2012-02-02','Leo', '2010-09-07', 1, 1);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (2, 1, '2012-02-02',1,'2012-02-02','Basil', '2012-08-06', 6, 2);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (3, 1, '2012-02-02',1,'2012-02-02','Rosy', '2011-04-17', 2, 3);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (4, 1, '2012-02-02',1,'2012-02-02','Jewel', '2010-03-07', 2, 3);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (5, 1, '2012-02-02',1,'2012-02-02','Iggy', '2010-11-30', 3, 4);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (6, 1, '2012-02-02',1,'2012-02-02','George', '2010-01-20', 4, 5);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (7, 1, '2012-02-02',1,'2012-02-02','Samantha', '2012-09-04', 1, 6);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (8, 1, '2012-02-02',1,'2012-02-02','Max', '2012-09-04', 1, 6);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (9, 1, '2012-02-02',1,'2012-02-02','Lucky', '2011-08-06', 5, 7);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (10, 1, '2012-02-02',1,'2012-02-02','Mulligan', '2007-02-24', 2, 8);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (11, 1, '2012-02-02',1,'2012-02-02','Freddy', '2010-03-09', 5, 9);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (12, 1, '2012-02-02',1,'2012-02-02','Lucky', '2010-06-24', 2, 10);
INSERT INTO pet (PET_ID, created_by, created_on, updated_by, updated_on, name, birth_date, pet_type, owner_id) VALUES (13, 1, '2012-02-02',1,'2012-02-02','Sly', '2012-06-08', 1, 10);

INSERT INTO pet_visit (visit_id, created_by, created_on, updated_by, updated_on, pet_id, visit_time,description,vet_id) VALUES (1, 1, '2012-02-02',1,'2012-02-02',7, '2013-01-01', 'rabies shot', 1);
INSERT INTO pet_visit (visit_id, created_by, created_on, updated_by, updated_on, pet_id, visit_time,description,vet_id) VALUES (2, 1, '2012-02-02',1,'2012-02-02',8, '2013-01-02', 'rabies shot',1);
INSERT INTO pet_visit (visit_id, created_by, created_on, updated_by, updated_on, pet_id, visit_time,description,vet_id) VALUES (3, 1, '2012-02-02',1,'2012-02-02',8, '2013-01-03', 'neutered',1);
INSERT INTO pet_visit (visit_id, created_by, created_on, updated_by, updated_on, pet_id, visit_time,description,vet_id) VALUES (4, 1, '2012-02-02',1,'2012-02-02',7, '2013-01-04', 'spayed',1);




