fun main(){
    var mobile= Mobile("android", "redmi", 30)
    println(mobile)
    var Person = person("Dylan", "George", 5)
    println(Person.fName)
    println(Person.lName)
    println(Person.age)

}
 data class Mobile(var Model:String, var brand:String, var mrp:Int){
}
 data class person(var fName:String, var lName:String, var age:Int){

}







//OOP QUESTION
//1:Create a class Mobile containing the following state
//a(Model
//b(Brand
//c(MRP


//a( print out the detail of the mobile
//2:Create a class containing firstName,lastName, and age
//a(Println fullName  and age
//3:Create a class employee containing the following state
//a: Name
