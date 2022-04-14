fun main(){
    println(isEven(4))
}
fun isEven(x:Int):Boolean{
    return(x%2==0)

    println(evenNumber("fd","hy","chosgt"))
}
//fun reStr(arr:Array<String>):List<String>{
//    return names
//}
fun evenNumber(fruit:String):String{
    var x=" "
    for (n in fruit){
        if (fruit.indexOf(n)%2==0){
            x++
        }
    }
    return x
}
