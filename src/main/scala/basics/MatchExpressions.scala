package basics

case class Member(name: String)

@main
def matchExpressions():Unit = {

  // match expression is like SWITCH cases in other imperative languages.
  // Unlike SWITCH cases it returns results
  val i = 7

  val day = i match
    case 0 => "Sunday"
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case _ => "Invalid value"

  // If we want to check what is the invalid value

val num = 5
val result = num match
  case 1 => "Correct"
  // Have to create a variable with lower case to catch.
  case invalidVal => s"You provided an invalid values: ${invalidVal}"
  // If it is a

 // A name beginning with an uppercase letter does not introduce a variable ,
 // but matches a value in scope:
  val matchVal = 30
  val OtherVal = 20

  val resultVal = matchVal match
    case 10 => "Correct"
    // When we provide 20 in matchVal then below case matches.
    // It's a value in the scope started with uppercase.
    case OtherVal => s"Other Value is ${OtherVal}"
    // Any other values catches with default though it's started with lowercase.
    case defaultVal => "Default Value"

  println(resultVal)

  // Handle multiple matches inline
  val intNum = 10
  val myResult = intNum match
    case 1 | 3 | 5| 7| 9 => "Odd"
    case 2 | 4 | 6 | 8 | 10 => "Even"

  // Match expressions with guards
  val myNumResult = intNum match
    case i if i%2 == 0 => "Even"
    case i if i%2 != 0 => "Odd"

  val person1 = Member("Bibhuti")
  val person2 = Member("Soumya")

  val mem1 = Member("Plaban")
  val mem2 = Member("Prasant")
  // Case class matching
  val person1Response = matchPerson(person1)
  val person2Response = matchPerson(person2)

  // Case class matching
  val member1Response = matchMember(mem1)
  val member2Response = matchMember(mem2)

  println(person1Response+"####"+person2Response)

  println(member1Response+"####"+member2Response)
}

// Matching through constructor patterns
def matchPerson(person: Member): String = {
  person match
    case Member(name) if name == "Bibhuti" => "It's Bibhuti"
    case Member(name) if name == "Soumya" => "It's Soumya"
}

// Matching through Type test patterns
def matchMember(person: Member): String = {
  person match
    case m:Member if m.name == "Plaban" => "It's Plaban"
    case m:Member if m.name == "Prasant" => "It's Prasant"
}