fun main(){
    printNationality("Tanzania")
    printNationality2("Rwanda")
    identity(true)
    printNationalityWhen("Rwanda")
    myNation("Banie")
    selectContainer(11)
    languages(arrayOf("Kiswahili","Luganda","Kinyarwanda","Somali"))
    group("Lovalace")
    numbers(9,17)
    println(calculate(5,7,"+"))
    whileL(12)
    alpha("abcdefghijklmnopqrstuvwxyz")






}
//CONTROLLING THE FLOW OF INSTRUCTIONS
//BINARY DECISION - 2 conditions
fun printNationality(country: String){
    if(country =="Tanzania"){
        println("Tanzanian")
    }
        else{
            println("Foreigner")
    }
}

//MORE THAN TWO CONDITIONS
fun printNationality2(country: String){
    if(country =="Tanzania"){
        println("Tanzanian")
    }
    else if(country =="Uganda"){
        println("Ugandan")
    }
    else{
        println("Foreigner")
    }
}
fun assignSchool(marks: Int){
    if(marks >390){
        println("National")
    }
        else if (marks in 350 ..389) {
        println("Provicincial")
    }

        else{
           println("District")
    }
    }

fun identity(married: Boolean){
    if(married){
        println("Mrs")
    }
        else{
            println("Miss")
    }
}
//


fun printNationalityWhen(country: String){
    when(country) {
        "Ugandan" -> println("Ugandan")
        "Tanzania" -> println("Tanzanian")
        "Kenya" -> println("Kenyan")
        "Malawi" -> println("Malawian")
        else -> println("Foreigner")
    }

}
fun myNation(stmt: String){
    var stmt1 = stmt.lowercase().split("b")
    println(stmt1)
//    val res = stmt.lowercase().split("b")
}

fun selectContainer(litres: Int){
    when(litres){
        1,2,3 -> println("bottle")
        4,5,6,7 -> println("bucket")
        8,9 -> println("big bucket")
        else -> println("jerrycan")

    }

}
fun calculate (x: Int, y:Int, sign: String): Int{
    var result = 0
    when(sign){
        "+" -> {
            result =x + y
        }
        "-" ->{
            result = x - y
        }
        "*" ->{
            result = x * y
        }
        "/" ->{
            result = x / y
        }

    }
    return result

}

//LOOPING THROUGH IN ARRAYS
fun languages(language: Array<String>){
    for(i in language){
        println(i)
    }



}

//LOOPING THROUGH IN ARRAYS
fun group(lovalace: String){
    for(i in lovalace){
        println(i)
    }

}


//SQUARING A RANGE OF NUMBERS
fun numbers(start: Int, end: Int){
    for(i in start..end){
        println(i*i)
    }
}

//FOR WHILE
fun whileL(num: Int){
    //CHECKS EVERY NUMBER BELOW 12 , PRINTS IT AND DECREMENTS IT
//    while (num>0){
//        num-1
//        println(num)
//
//    }

    do {
        println(num)
        num-1
    } while (num > 0)

    for (i in 1..100){
        val square = i * i
        if (square>1000){
            print(square)
        }
            else{
                //DO NOT GO AFTER 1000
                break
        }


    }


}
fun alpha(alphabet: String){
    var res = ""
    while(res.length<10){
        val rand  = (0..25).random()
        var newChar = alphabet[rand]
        res = "$res$newChar"
    }

}



