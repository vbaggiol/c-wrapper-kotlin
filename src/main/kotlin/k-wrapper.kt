import kute.*


fun main(args: Array<String>) {
    println("Hello, Native World!")
    val myClass = newMyClass()
    MyClass_int_set(myClass, 22)
    val ret = MyClass_int_get(myClass)
    print("ret = $ret")
    deleteMyClass(myClass)
}