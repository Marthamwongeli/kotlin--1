fun main(){
    var words= statement("Barnie bakes brown bagels and buns")
    var nums= arrayOf(25,65,70,45,40)
    println(nums.sum())
    println(nums.count())
    println(nums.average())
    var num=calculate(49)
}
fun statement(word:String){
    println(word.indexOf('b'))


}
fun numbers(nums:Array<Int>){
    println(nums.contentToString())
}


fun calculate(num:Int){
    var volume=  4/3 * 3.14159 * num*num*num
    println(volume)
}
fun isPalindrome(word:String):Boolean {
    var check = word
    if (check ==  ) {
        println(true)
    } else {
//        println(false)
//
    }
}