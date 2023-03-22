fun main(args: Array<String>) {
    add()
    multiply()
}
fun add(){
    println("Enter First Number")
    var num1:Int = readLine()!!.toInt()
    println("Enter Second Number")
    var num2:Int = readLine()!!.toInt()
    var sum =num1 + num2
    println("The sum is")
    println(sum)

}

fun multiply(){
    println("Enter First Number")
    var num1:Int = readLine()!!.toInt()
    println("Enter Second Number")
    var num2:Int = readLine()!!.toInt()
    var ans =num1 * num2
    println("The answer is")
    println(ans)
}