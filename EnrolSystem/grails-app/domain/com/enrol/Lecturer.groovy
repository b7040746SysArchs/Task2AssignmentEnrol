package com.enrol

class Lecturer {

String fullName;
String post;
String subject;
String lecturerEmail;
String office;
String bio;
Course theCourse;

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
  theCourse nullable: true, blank: true
    }
}
