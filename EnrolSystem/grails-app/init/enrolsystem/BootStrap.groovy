//package enrolsystem
package com.enrol
class BootStrap {

    def init = { servletContext ->

	def computing= new Course(
	department: "Computing",
	courseTitle: "Computing",
	courseLeader: "Dr Michelle Murphy",
	courseCode: "CS123",
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: "Loren ipsum dolor r sit ametsit amolo ipsum doloet ipsum dr sit amet",
	numberOfStudents: 55,
	tuitionFees: 9000.60,
	studyMode: "Full Time").save()

	def computerScience= new Course(
	department: "Computing",
	courseTitle: "Computer Science",
	courseLeader: "Dr Tonderai",
	courseCode: "CS233",
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: "Loren ipsum dolor r sit ametsit amolo ipsum doloet ipsum dr sit amet",
	numberOfStudents: 55,
	tuitionFees: 9000.60,
	studyMode: "Full Time").save()

	def law= new Course(
	department: "Law",
	courseTitle: "Law",
	courseLeader: "Dr Jason Law",
	courseCode: "CS563",
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: "Loren ipsum dolor r sit ametsit amolo ipsum doloet ipsum dr sit amet",
	numberOfStudents: 55,
	tuitionFees: 9000.60,
	studyMode: "Full Time").save()

  def casey = new Student(
    studentName: "Casey Smith",
    studentID: "44HDHD",
    dob: new Date('13/05/1997'),
    studentEmail: "caseyrsmith43@gmail.com",
    studentUsername: "Casey6624",
    studentPassword: "Dogs11",
    isFundingAvailable: false,
    course: computing
    ).save()

  def systemArhcs = new Module(
    module_title: "System Architectures",
    module_code: "SysArchs123",
    credits: 50,
    lecturer: "Maswera Tonderai",
    description: "Grails and stuff"
    ).save()

    }
    def destroy = {
    }
}
