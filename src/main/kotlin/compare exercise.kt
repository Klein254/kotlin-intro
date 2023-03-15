fun main(args: Array<String>) {
    print("Enter your age")
    var age:Int = readln()!!.toInt()

    if (age >= 18){
        print("Welcome to The Club")
    }
    else{
        println("Sorry we can't admit underage")
    }
}