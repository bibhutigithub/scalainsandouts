package oops

import java.time.LocalDate

class Student(var name: String, var govtId: String):
  private var _studentId: Int = 0
  private var _applicationDate: Option[LocalDate] = None

  def this(name: String, govtId: String, applicationDate: LocalDate) = {
    this(name, govtId)
    _applicationDate = Some(applicationDate)
  }

  def this(name: String, govtId: String, studentId: Int) = {
    this(name, govtId, LocalDate.now)
    _studentId = studentId
  }

  def this(s: Student, applicationDate:LocalDate) = {
    this(s.name, s.govtId)
    _applicationDate = Some(applicationDate)
  }

  def this(s: Student, studentId: Int) = {
    this(s, LocalDate.now)
    _studentId = studentId
  }
  override def toString: String = {
    s"Student Info (name:${name}, govtId:${govtId}, studentId:${_studentId}, applicationDate:${_applicationDate})"
  }

@main
def auxilliaryConstructors(): Unit = {
  val student = Student("Bibhuti", "BYTPM7200C")
  // Before Enrollment
  println(student)

  // After enrollment the Student got StudentId
  val enrolledStudent = Student(student, 1234)
  println(enrolledStudent)

}
