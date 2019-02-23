//package enrolsystem
package com.enrol
class BootStrap {

    def init = { servletContext ->
// lecturer classes
  def tonderariLec = new Lecturer(
    fullName: "Maswera Tonderai",
    post: "Post stuff",
    subject: "Computing",
    lecturerEmail: "Tonderai@yahoo.com",
    office: "A653",
    bio: "Loves computing more than Laurie",
    ).save()

      def laurieLec = new Lecturer(
        fullName: "Laurie Hirsch",
        post: "Post stuff",
        subject: "Computing",
        lecturerEmail: "Laurie@yahoo.com",
        office: "A633",
        bio: "Loves computing",
        ).save()

        def brianLec = new Lecturer(
          fullName: "Brian Law",
          post: "Post stuff",
          subject: "Law",
          lecturerEmail: "Brian@yahoo.com",
          office: "A563",
          bio: "Massive fan of law and law things",
          ).save()

// Course classes

	def computing= new Course(
	department: "Computing",
	courseTitle: "Computing",
	courseLeader: tonderariLec,
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
	courseLeader: tonderariLec,
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
	courseLeader: brianLec,
	courseCode: "CS563",
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: "Loren ipsum dolor r sit ametsit amolo ipsum doloet ipsum dr sit amet",
	numberOfStudents: 55,
	tuitionFees: 9000.60,
	studyMode: "Full Time").save()

// Student classes
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

// module classes

  def systemArhcs = new Module(
    module_title: "System Architectures",
    module_code: "SysArchs123",
    credits: 50,
    lecturer: "Maswera Tonderai",
    description: "Grails and stuff"
    ).save()

    def webApplications = new Module(
      module_title: "Web Applications",
      module_code: "WADI123",
      credits: 50,
      lecturer: "Maswera Tonderai",
      description: "Web Apps and stuff"
      ).save()

      def housingLaw = new Module(
        module_title: "Housing Law",
        module_code: "WA46323",
        credits: 50,
        lecturer: "Brian Law",
        description: "Housing law and stuff"
        ).save()

    tonderariLec.addToModules(systemArhcs)
    tonderariLec.addToModules(webApplications)
    laurieLec.addToModules(webApplications)
    brianLec.addToModules(housingLaw)

    computing.addToLecturers(tonderariLec)
    computing.addToLecturers(laurieLec)
    law.addToLecturers(brianLec)

    laurieLec.addToCourses(computerScience)

    }
    def destroy = {
    }
}
