
fun main() {
    welcome()
    userInfor()
    departmentDetails()
}

fun welcome() {
    println("Enter name: ")
    val name = readLine()!!.toString()
    println("Hello $name!")
    println("=========WELCOME TO KOTLIN=========")
}
fun userInfor() {
    println("=========ENTER INFORMATION=========")
    println("Enter your name: ")
    val name = readLine()!!.toString()
    println("Enter your age: ")
    val age = readLine()!!.toInt()
    println("Enter your GPA: ")
    val GPA = readLine()!!.toDouble()
    println("Name: $name , Age: $age , GPA: $GPA")
}


fun departmentDetails(){
    val listDepartment = listOf(
        "1. Marketing",
        "2. Software engineer",
        "3. Finance"
    )
    println("=======List of Departments=======")
    listDepartment.forEach { element -> println(element) }
    println("Choose Your Department (1 - 3) : ")
    val option = readLine()!!.toInt()
    val i = option - 1
    val yourDep = listDepartment[i]
    println("Your Department: $yourDep")
}
