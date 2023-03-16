fun main(args: Array<String>) {
    var weight = 68
    var height = 1.7

    var bmi = weight / (height*height)

    if (bmi <= 18){
        println("Underweight")
    }
    else if (bmi <= 29){
        println("Normal Weight")
    }l
    else if (bmi <= 34){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}
