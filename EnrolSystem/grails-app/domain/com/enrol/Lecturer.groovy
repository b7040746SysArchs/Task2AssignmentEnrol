package com.enrol

class Lecturer {

String fullName;
String post;
String subject;
String lecturerEmail;
String office;
String bio;
String username;
String password;
Course theCourse;

static hasMany=[modules:Module, courses:Course]

static belongsTo=[Course]

String toString(){
  return fullName;
}

    static constraints = {

	fullName blank:false,nullable: false
	post blank:false,nullable: false
	subject blank:false,nullable: false
	lecturerEmail blank:false,nullable: false, email: true
	office blank:false,nullable: false
	bio nullable: false, maxSize: 5000, widget: 'textarea'
  username blank:false,nullable: false, unique: true
  password blank:false,nullable: false, password: true
  theCourse nullable: true, blank: true
    }
}
