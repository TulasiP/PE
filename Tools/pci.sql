USE [master]
GO

if exists (select * from sys.databases where name='pcidb')
	alter database pcidb set offline with rollback immediate
GO

if exists (select * from sys.databases where name='pcidb')
begin
	drop database pcidb
end

GO
--exec xp_cmdshell 'del /f /q C:\dir *.*'
exec xp_cmdshell 'del /f /q C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb.mdf'
exec xp_cmdshell 'del /f /q C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb_log.ldf'

GO

CREATE DATABASE [pcidb]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'hisdb', FILENAME = N'C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb.mdf')
 LOG ON 
( NAME = N'hisdb_log', FILENAME = N'C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb_log.ldf')
GO

use [pcidb]
GO
drop table patient;
Create table patient(UUID nvarchar(50) PRIMARY KEY, Name nvarchar(50), Age int , Sex nvarchar(50),  DOB datetime , Height nvarchar(50) , Wheight nvarchar(50) , BirthDay nvarchar(50),Addres nvarchar(200), AadhaarNo nvarchar(50) , PhoneNo nvarchar(50), StudyType int foreign key(Studytype) references studytype(studyno))
GO

--insert into patient(UUID, Name, DOB, Age, Sex, Height, Wheight, BirthDay, Addres, AadhaarNo) values('1','fsdfs','1/1/1981 12:00:00 AM',12,'Male','5''5"','34','Thursday',',dmfsksf','2323');
--delete from patient

select * from patient;
select name from patient where UUID=3;
select wheight from patient where UUID=1;
insert into patient(dob) values(1992-09-12);
select name,age,sex,dob,height,wheight,birthday,addres,aadhaarno from patient where UUID=1
alter table patient add PhoneNo nvarchar(20); 
alter table patient alter column PhoneNo nvarchar(20);
ALTER TABLE patient DROP COLUMN PhoneNo;
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo) values('18','','','','1984-05-19','','','Wednesday','','','3477498797')
delete from patient where UUID=9;
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo) values('12','','','','12-09-2011','','','Tuesday','','','1234567890');
delete from patient where name=null;
alter table patient add StudyType nvarchar(50);

select name,age,sex,dob,height,wheight,birthday,addres,aadhaarno,studytype from patient where UUID=5


create table test(number int, name varchar(2))
alter table test add exam varchar(10)
insert into test values(1,'aa','qtr')
insert into test values(1,'aa','half')
delete from test
select * from test

update test set name='bb' where exam='qtr'

create table StudyType(studyno int primary key, studytype varchar(20))
insert into StudyType values(1,'Coronary')
insert into StudyType values(2,'Pediatric')
insert into StudyType values(3,'Electrophysiology')
select * from StudyType
drop table StudyType
update StudyType set studytype='Pediatric' where studyno=3
update StudyType set studyno= where studytype='Pediatric'



drop table StudyType
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('18','','','','1984-05-19','','','Wednesday','','','3477498797','c')
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('19','','','','1984-05-19','','','Wednesday','','','3477498797',4)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('20','','','','1984-05-19','','','Wednesday','','','3477498797',3)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('18','','','','1984-05-19','','','Wednesday','','','3477498797',1)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('19','','','','1984-05-19','','','Wednesday','','','3477498797',2)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('20','','','','1984-05-19','','','Wednesday','','','3477498797',3)

insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('21','','','','1984-05-19','','','Wednesday','','','3477498797',1)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('22','','','','1984-05-19','','','Wednesday','','','3477498797',2)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('23','','','','1984-05-19','','','Wednesday','','','3477498797',3)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('24','','','','1984-05-19','','','Wednesday','','','3477498797',1)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('25','','','','1984-05-19','','','Wednesday','','','3477498797',2)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('26','','','','1984-05-19','','','Wednesday','','','3477498797',3)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('27','','','','1984-05-19','','','Wednesday','','','3477498797',1)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('28','','','','1984-05-19','','','Wednesday','','','3477498797',2)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('29','','','','1984-05-19','','','Wednesday','','','3477498797',3)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('30','','','','1984-05-19','','','Wednesday','','','3477498797',1)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('31','','','','1984-05-19','','','Wednesday','','','3477498797',2)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('32','','','','1984-05-19','','','Wednesday','','','3477498797',3)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('33','','','','1984-05-19','','','Wednesday','','','3477498797',1)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('34','','','','1984-05-19','','','Wednesday','','','3477498797',2)
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo, StudyType) values('35','','','','1984-05-19','','','Wednesday','','','3477498797',3)


select * from patient
select * from StudyType




select * from patient
select studytype from StudyType where studyno=3

select studyno from studytype where studytype='Paediatric'
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo , StudyType) values('3','test2','1114','Male','2000-01-01','5'' 6"','100','Friday','test','1234567890','1234567890',3)
delete from patient
select studytype from studytype where studyno=1;
select studytype from studytype where studyno=2

select * from patientlog

Create table patientlog(FirstName nvarchar(50) , LastName nvarchar(50), Gender nvarchar(50) , MobileNumber nvarchar(50), MailId nvarchar(50) )

create table sample (a nvarchar(50) , b nvarchar(50))
select * from sample

insert into patientlog(FirstName,LastName,Gender,MobileNumber,MailId) values('','','null','','')

alter table patientlog add StudyType nvarchar(50);
drop table patientlog
drop table Studytype
create table StudyType(studyno int primary key, studytype varchar(20))
create table StudyType(studyno int primary key, studytype varchar(20))
Create table patientlog(UUID nvarchar(50) PRIMARY KEY,FirstName nvarchar(50) , LastName nvarchar(50),Age nvarchar(50), Gender nvarchar(50),DOB date,Height nvarchar(50),Wheight nvarchar(50),BirthDay nvarchar(50),Addres nvarchar(50),Aadhaarno nvarchar(50), MobileNumber nvarchar(50), MailId nvarchar(50),StudyType int foreign key(StudyType) references studytype(studyno))
select * from patientlog
delete from patientlog
select * from patientlog where StudyType like 'P%'

create table StudyType(studyno int primary key, studytype varchar(20))
insert into StudyType values(1,'Coronary')
insert into StudyType values(2,'Pediatric')
insert into StudyType values(3,'Electrophysiology')
select * from StudyType
