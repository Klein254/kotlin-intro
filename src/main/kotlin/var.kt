fun main(args: Array<String>) {
    println("Enter Your Weight")
    var weight: Int  = readLine()!!.toInt()
    println("Enter your height")
    var height: Double  = readLine()!!.toDouble()

    var bmi = weight / (height*height)

    if (bmi <= 18){
        println("Underweight")
    }
    else if (bmi <= 29){
        println("Normal Weight")
    }
    else if (bmi <= 34){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}
