package com.enrol

class Student {

String studentName;
String studentID;
Date dob;
Boolean isFundingAvailable;
String studentEmail;
String studentUsername;
String studentPassword;
Course course;

String toString(){
  return studentName;
}

static hasMany=[modules:Module]

static belongsTo=[Course, Module]

    static constraints = {
	studentName blank:false,nullable: false
	studentID blank:false,nullable: false
	dob blank:false,nullable: false
	studentEmail blank:false,nullable: false, email: true
	studentUsername blank:false,nullable: false, unique: true
	studentPassword blank:false,nullable: false
	isFundingAvailable blank:false,nullable: false
	course blank:false,nullable: false
    }
}
