fun main(args: Array<String>) {
    print("Enter your Choice")

    var choice:Int = readLine()!!.toInt()

    if (choice == 0) {
        print("Enroll for 1GB for 20Ksh")
    }
    else if (choice == 1) {
        print("Data Deals")
    }
    else if (choice == 2){
        print("Daily Bundles")
    }
    else if (choice == 3){
        print("Weekly Bundles")
    }
    else if (choice == 4){
        print("Monthly Bundles")
    }
    else if (choice == 5){
        print("No Expiry")
    }
    else{
        print("Invalid Choice")
    }

}