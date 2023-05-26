Create database CrimeFile
Go
Use CrimeFile
Go
Create table [Users] (
Username varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
Address varchar(255) Not null,
Tel varchar(255) Not null,
Password varchar(255) Not null
)
Go
Create table Administrator (
AdminID varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
Address varchar(255) Not null,
Tel varchar(255) Not null,
Password varchar(255) Not null
)
Go
Create table FIR (
FirID varchar(255) Primary key,
SuspectName varchar(255) Not null,
Location varchar(255) Not null,
Description varchar(255) Not null,
DateOfOccurence Date Not null,
Evidence varchar(255) Not null,
AdminID varchar(255) Foreign key references Administrator
)
Go
Create table [Cases] (
CaseID varchar(255) Primary key,
CaseName varchar(255) Not null,
Status varchar(255) Not null,
FirID varchar(255) Foreign key references FIR
)
Go
Create table InvestigatingOfficer (
InvestigatingOfficerID varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
Address varchar(255) Not null,
Tel varchar(255) Not null
)
Go
Create table PostMortem (
PostMortemID varchar(255) Primary key,
Location varchar(255) Not null,
DateOfDeath Date Not null,
CauseOfDeath varchar(255) Not null,
Evidence varchar(255) Not null,
DoctorName varchar(255) Not null,
AdminID varchar(255) Foreign key references Administrator
)
Go
Create table Crime (
CrimeID varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
Occupation varchar(255) Not null,
Type varchar(255) Not null
)
Go
Create table Victim (
VictimID varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
Address varchar(255) Not null,
Occupation varchar(255) Not null,
FirID varchar(255) Foreign key references FIR
)
Go
Create table Prisoner (
PrisonerID varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
CrimeType varchar(255) Not null,
PrisonTerm int Not null,
Status varchar(255)
)
Go 
Create table MWCrime (
MWCrimeID varchar(255) Primary key,
Fullname varchar(255) Not null,
Age int Not null,
Gender char(1) Not null,
Height varchar(255) Not null,
Weight varchar(255) Not null,
Identification varchar(255) Not null,
Type varchar(255) Not null,
Image varbinary(max) Not null,
DangerLevel varchar(255) Not null,
RewardAmount money Not null
)
Go 
Create table Complaint (
ComplaintID varchar(255) Primary key,
SuspectName varchar(255) Not null,
Location varchar(255) Not null,
ComplaintDate Date Not null,
ComplaintType varchar(255) Not null,
Description varchar(255) Not null,
Status varchar(255) Default('pending'),
Username varchar(255) Foreign key references  [Users]
)
Go
Create table ManageUser(
AdminID varchar(255) Foreign key references Administrator,
Username varchar(255) Foreign key references [Users],
Primary key (AdminID, Username)
)
Go
Create table RegisterComplaint (
Username varchar(255) Foreign key references [Users],
ComplaintID varchar(255) Foreign key references Complaint,
Primary key(Username, ComplaintID)
)
Go 
Create table ManageFIR (
AdminID varchar(255) Foreign key references Administrator,
FirID varchar(255)  Foreign key references FIR,
Primary key (AdminID, FirID)
)
Go
Create table CaseInvestigate (
CaseID varchar(255) Foreign key references [Cases],
InvestigatingOfficerID varchar(255) Foreign key references InvestigatingOfficer,
Primary key (CaseID, InvestigatingOfficerID)
)
Go
Create table ManagePostMortem (
PostMortemID varchar(255) Foreign key references PostMortem,
AdminID varchar(255) Foreign key references Administrator,
Primary key (PostMortemID, AdminID)
)
Go
Create table ManagePrisoner (
PrisonerID varchar(255) Foreign key references Prisoner,
AdminID varchar(255) Foreign key references Administrator,
Primary key(PrisonerID, AdminID)
)
Go
Create table TrackMWCrime (
MWCrimeID varchar(255) Foreign key references MWCrime,
AdminID varchar(255) Foreign key references Administrator,
Primary key(MWCrimeID, AdminID)
)
