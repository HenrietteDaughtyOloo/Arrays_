fun main() {
    
    create("Ashley", "Mellisa", "Xavier", "Junelisa")
    city()
    element()
    println(rtnThree("Florence", "Wamboi", "Rachel"))


}

         /* Create a function that takes in 4 strings and creates an array out of them then
         prints out the array (2 points)*/

fun create(x:String, y:String, z:String, u:String){
   var created= arrayOf(x,y,z,u)
println(created.contentToString())
   }

    /*Create a function that given an array below: var cities = arrayOf(“harare”, “mumbai”,
    “dodoma”, “jakarta”) prints out the names of the cities in the correct grammatical case.*/
fun city(){
   var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
             println(cities.map {  it.capitalize() })
}

        /*Create one function that given the below array:
        var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
                (i) prints out the sum of the second and fifth elements (1 point)
                (ii) prints out the index of 158 (1 point)
                (iii) prints out the elements in ascending order (2 points)*/
fun element(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
           var numbersSum = numbers[1] + numbers[4]
            println(numbersSum)

            var index = numbers.indexOf(158)
            println(index)

            println("Sorted ascending: ${numbers.sorted()}")

}

            /*Create a function that takes in 3 names and returns a string array containing
             all 3 names.*/
fun rtnThree(a:String, b:String, c:String): String {
        var nameList= arrayOf(a,b,c,)
                return (nameList.contentToString())
}
