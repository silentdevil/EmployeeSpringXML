
INSERT INTO roles(roleid, role) VALUES (1,'CEO');
INSERT INTO roles(roleid, role) VALUES (2,'VICE PRESIDENT');
INSERT INTO roles(roleid, role) VALUES (3,'DEVELOPER');
INSERT INTO roles(roleid, role) VALUES (4,'DESIGNER');
INSERT INTO roles(roleid, role) VALUES (5,'BA');


INSERT INTO EMPLOYEES(employeeid, lastname, firstname, middlename, suffix, title, address, birthday, gwa, datehired, currentlyhired)
	VALUES(1, 'CARPIO','JIM MIKAEL','ROXAS','','',1,'1996-05-21',4,'2017-01-23','T');

INSERT INTO EMPLOYEES(employeeid, lastname, firstname, middlename, suffix, title, address, birthday, gwa, datehired, currentlyhired)
	VALUES(2, 'CABANLIG','ERsVEIN','BRAVO','','',2,'1993-02-01',3,'2016-04-02','F');

INSERT INTO EMPLOYEES(employeeid, lastname, firstname, middlename, suffix, title, address, birthday, gwa, datehired, currentlyhired)
	VALUES(3, 'CARPIO','JASSMYNE','ROXAS','','',1,'1996-05-21',2,'2017-01-23','T');


INSERT INTO ADDRESSES(addressid,streetno, street, brgy, city, zipcode) 
	VALUES (1, 1209,'SUAREZ','MAYBUNGA', 'PASIG','1607');


INSERT INTO CONTACTS(employeeid, landline, mobile, email)
	VALUES(1, '641-3026','0932-869-0113','jimmikaelcarpio@gmail.com');



INSERT INTO ADDRESSES(addressid,streetno, street, brgy, city, zipcode) 
	VALUES (2, 12,'EMERALD','SAN ANTONIO', 'PASIG','1600');


INSERT INTO CONTACTS(employeeid, landline, mobile, email)
	VALUES(2,'','','ervein@yahoo.com');


INSERT INTO CONTACTS(employeeid, landline, mobile, email)
	VALUES(3, '641-3026','0932-869-0113','jassmyne@gmail.com');

