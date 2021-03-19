import java.util.*

fun main() {
    county("Nakuru","Meru","Nyeri","Narok")
    capitalCities()
    calculation()
    println(Arrays.toString(great("Joy","Diana","Ruth")))
}
fun county(name1:String,name2:String,name3:String,name4:String){
    var namesArray=arrayOf(name1,name2,name3,name4)
    println(Arrays.toString(namesArray))
}
fun capitalCities(){
    var citiesArray=arrayOf("harare","mumba","dodoma","jakarta")
    for (cities in citiesArray){
        println(cities.capitalize())

    }
}
fun calculation(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var a=numbers[1]
    var b=numbers[4]
    var result=a+b
    println(result)
    println(numbers.indexOf(158))
    var sortedNumbers=numbers.sortedArray()
    println(Arrays.toString(sortedNumbers))
}
fun great(name1:String,name2:String,name3:String):Array<String>{
    return arrayOf(name1,name2,name3)

}