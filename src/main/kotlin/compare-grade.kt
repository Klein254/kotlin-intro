fun main(args: Array<String>) {
    print("Enter Your Marks")

    var marks: Int = readLine()!!.toInt()

    if (marks > 79 && marks <= 100){
        print("Your grade is A")
        print(" ")
        print("Congratulations")
    }
    else if (marks > 69 && marks < 80){
        print("Your grade is A-")

    }
    else if (marks > 59 && marks < 70){
        print("Your grade is B")
    }
    else if (marks >49 && marks < 60){
        print("Your grade is C")
    }
    else if (marks >39 && marks < 50){
        print("Your grade is D")
    }
    else if (marks <40 && marks >= 0){
        print("Your grade is E")
        print(" ")
        print("You Have to retake the exam")
    }
    else {
        print("Invalid Marks")
    }

}