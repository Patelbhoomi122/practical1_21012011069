fun main(){
    print("enter the month number")
    val MonthNumber= readLine()?.toInt()
    val Monthname=when(MonthNumber){
        1 ->"january"
        2 ->"february"
        3 ->"march"
        4 ->"april"
        5 ->"may"
        6 ->"june"
        7 ->"july"
        8 ->"august"

    }
}