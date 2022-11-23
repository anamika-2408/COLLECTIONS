package Collections
class Employee(id:Int,name:String,dept:String,salary:Int,age:Int){
    val id:Int=id
    val name:String=name
    val dept:String=dept
    val salary:Int=salary
    val age:Int=age
}
fun main(){
    val employees=mutableListOf<Employee>()
    employees.add(Employee(1,"ANA","SOFTWARE",65000,20))
    employees.add(Employee(2,"ANI","MARKETING",55000,21))
    employees.add(Employee(3,"PRIYA","hr",45000,22))
    for(employee in employees){
        println("${employee.id}  ${employee.name}  ${employee.dept}  ${employee.salary}  ${employee.age}")
    }
}
