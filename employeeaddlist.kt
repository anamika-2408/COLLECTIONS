fun main(args: Array<String>){
    val javabatch=mutableListOf<String>("anil","gopal","ankith","manish")
    val kotlinbatch=mutableListOf<String>("ankith","kumar","manish","rahul")
    println("javabatch $javabatch")
    println("kotlinbatch $kotlinbatch")
    javabatch.addAll(kotlinbatch)
    println("after combining $javabatch")

    javabatch.removeAll(kotlinbatch)
    println("after removing duplicate $javabatch")
    javabatch.sort()
    kotlinbatch.sort()
    println("after sorting javabatch $javabatch")
    println("after sorting kotlinbatch $kotlinbatch")

}

