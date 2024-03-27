create database crimeanalysis;
drop database crimeanalysis;
use crimeanalysis;
drop table incidents;
select * from incidents;
Create table Victims 
(VictimID INT Primary key,
FirstName Varchar(30),
LastName Varchar(30),
DateOfBirth Date,
Gender Varchar(20),
Address Varchar (50),
PhoneNumber Varchar(20));

Create table Suspects 
(SuspectID INT Primary key,
FirstName Varchar(30),
LastName Varchar(30),
DateOfBirth Date,
Gender Varchar(20),
Address Varchar (50),
PhoneNumber Varchar(20));

Create table incidents
(IncidentID INT Primary key,
IncidentType Varchar(20),
IncidentDate Date,
Latitude DECIMAL(12,9) NOT NULL,
Longitude DECIMAL(12,9) NOT NULL,
Description VARCHAR(255),
Status Varchar(20)
);
insert into incidents values(10,'fired','2024-01-24',0.5,0.55,'bomb','dead');
Create table Evidence
(EvidenceID INT PRIMARY KEY,
Description Varchar(255),
LocationFoundLatitude DECIMAL(12,9) NOT NULL,
LocationFoundLongitude DECIMAL(12,9) NOT NULL,
IncidentID INT,
FOREIGN KEY (IncidentID) REFERENCES Incidents(IncidentID)
);

Create Table LawEnforcementAgencies
(AgencyID INT Primary Key,
AgencyName Varchar(20),
Jurisdiction VARCHAR(100),
Address Varchar(50),
PhoneNumber Varchar(20)
);

Create table Officers
(OfficerID INT Primary Key,
FirstName Varchar(20),
LastName Varchar(20),
BadgeNumber INT,
RankNumber INT,
Address Varchar(50),
PhoneNumber Varchar(20),
AgencyID INT,
Foreign Key (AgencyID) REFERENCES LawEnforcementAgencies(AgencyID)
);
Create table Reports
(ReportID INT PRIMARY KEY,
IncidentID INT,
ReportingOfficer INT,
ReportDate Date,
ReportDetails TEXT,
Status Varchar(20),
Foreign Key (IncidentID) REFERENCES Incidents(IncidentID),
Foreign Key (ReportingOfficer) REFERENCES Officers(OfficerID)
);

Create table Cases
(CaseID INT PRIMARY KEY,
CaseName varchar(20),
IncidentID INT,
IncidentDate Date,
Description Varchar(20),
Status Varchar(20),
foreign key(incidentid)references incidnets(incidentid)
);

insert into cases values(1,'fired',10,2024-01-24,'bomb','dead');

select * from Incidents where IncidentDate between "26-09-2002" and curdate();
select * from cases;
alter table Cases add foreign key(incidentid) references incidents(incidentid) on delete set null;




