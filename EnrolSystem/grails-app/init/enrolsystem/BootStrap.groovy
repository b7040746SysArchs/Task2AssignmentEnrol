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

    }
    def destroy = {
    }
}
