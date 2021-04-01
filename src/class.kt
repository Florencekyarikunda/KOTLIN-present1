fun main() {
    detailsMe()
    println(moduls(23, 7))
    addition()
    println(division(90,5))
   var person= detail("Florence","florncearinda@gmail.com","0759221716")
    println(person[2])
    println(person[0])




}

fun detailsMe() {
    var firstName = "Florence"
    var lastName = "Arinda"
    lastName = "Alinda"
    var age = 23
    var message = "Hello guys, my name is $firstName and am $age years old"
    println(message)
    println(firstName)
    println(lastName)

}

fun moduls(a: Int, d: Int): Int {
    var remainder = a % d
    return remainder
}

fun addition() {
    var num1 = 2
    var num2 = 40
    var num3 = 44
    var sum=num1+num2+num3
    println(sum)
}
    fun division(num1: Int,num2: Int):Int{
        var result=num1/num2
        return result
    }


fun detail(name:String,email:String,phoneNumber:String):Array<String>{
    return arrayOf(name,email,phoneNumber)

}






