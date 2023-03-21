fun main(args: Array<String>) {
    println("Enter USSD")
    var ussd:Int = readLine()!!.toInt()
     if (ussd == 544) {
         println("Select one of the choices below")
         println("0:Sh 20= 1GB for 1hr")
         println("1:Data deals")
         println("2:Daily Bundles")
         println("3:GO MONTHLY")
         println("4:No Expiry")
         println("5:Video Bundles")
         println("6:Okoa Bundles")
         println("7:Lipa Mdogo")
         println("8:Data Plus NEW")
         var number: Int = readLine()!!.toInt()

         when (number) {
             0 -> println("Sh 20= 1GB for 1hr")
             1 -> println("Data deals")
             2 -> println("Daily Bundles")
             3 -> println("GO MONTHLY")
             4 -> println("No Expiry")
             5 -> println("Video Bundles")
             6 -> println("Okoa Bundles")
             7 -> println("Lipa Mdogo")
             8 -> println("Data Plus NEW")

             else -> println("Floor not available")
         }
     }
     else{
         print("Invalid USSD")
     }

}