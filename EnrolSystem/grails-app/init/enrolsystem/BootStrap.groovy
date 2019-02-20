//package enrolsystem
package com.enrol
class BootStrap {

    def init = { servletContext ->

	def computing= new Course(
	department: "department",
	courseTitle: "Computing",
	courseLeader: "Dr Michelle Murphy",
	courseCode: "CS123",
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
