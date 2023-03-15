fun main(args: Array<String>) {
    print("Enter Your Marks")

    var marks:Int = readLine()!!.toInt()

    if (marks > 79){
        print("Your grade is A")
        print(" ")
        print("Congratulations")
    }
    else if (marks > 69){
        print("Your grade is A-")

    }
    else if (marks > 59){
        print("Your grade is B")
    }
    else if (marks >49){
        print("Your grade is C")
    }
    else if (marks >39){
        print("Your grade is D")
    }
    else {
        print("Your grade is E")
        print(" ")
        print("You Have to retake the exam")
    }

}