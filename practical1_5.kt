fun main(){
    print("enter the month number:")
    val MonthNumber= readLine()?.trim()!!.toInt()
    val Monthname=when(MonthNumber){
        1 ->"january"
        2 ->"february"
        3 ->"march"
        4 ->"april"
        5 ->"may"
        6 ->"june"
        7 ->"july"
        8 ->"august"
        9 ->"september"
        10 ->"octomber"
        11 ->"november"
        12 ->"december"
        else ->"please enter proper month number!!"

    }
    println("$Monthname")
}