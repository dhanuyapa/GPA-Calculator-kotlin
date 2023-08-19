package gpaCal

fun main() {
    println("Enter number of course :")
    val numCourses = readln().toInt()
    var totalCredits = 0
    var totalGradePoints = 0.0

    for (i in 1..numCourses) {
        print("Enter credit value for course $i: ")
        val credit = readln().toInt()

        print("Enter result (e.g., A, B, C, ) for course $i: ")
        val result = readln()

        val gradePoint = when (result) {
            "A+" -> 4.0
            "A" -> 4.0
            "A-" -> 3.7


            "B+" -> 3.3
            "B" -> 3.0
            "B-" -> 2.7

            "C+" -> 2.3
            "C" -> 2.0
            "C-" -> 1.7


            else -> {
                println("Invalid result entered. Assuming grade points as 0.")
                0.0
            }
        }

        totalCredits += credit
        totalGradePoints += credit * gradePoint
    }

    val gpa = totalGradePoints / totalCredits

    println("Your GPA is: $gpa")
}