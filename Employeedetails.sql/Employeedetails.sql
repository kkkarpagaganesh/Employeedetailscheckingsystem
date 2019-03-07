create table chainsysregister(
id number(10) primary key,
name varchar2(50)not null,
password varchar2(20),
email varchar2(30)not null unique,
sex varchar2(10)not null,
department varchar2(30) not null,
check(sex in ('Male', 'Female')));

select * from chainsysregister;

create table code(adminid number(10)not null unique,
code number(4) not null unique);

select * from code;

create table signup(
adminid number(10)not null unique,
username varchar2(20)not null,
email varchar2(30)not null,
password varchar2(20),
confirm_password varchar2(20),
constraint pk_email primary key(email),
foreign key(adminid) references code(adminid));

select * from signup;

INSERT INTO CODE VALUES(2109,1998);
INSERT INTO CODE VALUES(2209,1999);
INSERT INTO CODE VALUES(2309,2000);
INSERT INTO CODE VALUES(2409,2001);
INSERT INTO CODE VALUES(2509,2002);
commit;
