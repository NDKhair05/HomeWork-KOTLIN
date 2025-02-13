class Car (
    val id: Int ,
    val model: String,
    val brand : String,
    val price : Double
){
    val tax: Double
        get() = when {
            price in 10.0..30.0->price *0.02
            price in 31.0..60.0->price *0.05
            price >60.0 -> price *0.07
            else -> 0.0
        }
    fun totalPrice():Double{
        return price + tax
    }
}
class Customer(
    val id: Int,
    val name:String
)
class Payment(
val id : Int,
    val carID:Int,
    val customerId: Int,
    val price : Double
)

val cars= mutableListOf<Car>()
val customers = mutableListOf<Customer>()
val payments = mutableListOf<Payment>()

fun display (){
    print("Danh sach xe:")
    println()
    if(cars.isEmpty()){
        println("Danh sach xe trong")
    }else {
        cars.forEach {
            println("ID: ${it.id} , Model: ${it.model} , Brand: ${it.brand} , Price: ${it.price}, Tax:${it.tax}")
        }
    }
}

fun displayCustomer(){
    println("Danh sach khach hang da mua xe:")
    if(payments.isEmpty()){
        print("Danh sach mua hang trong!")
    }else {
        payments.forEach{ payment ->
            val customer = customers.find { it.id == payment.customerId }
            val car = cars.find { it.id == payment.carID}
            if (customer != null && car!=null) {
                println("${customer.name} da mua xe ${car.brand} ${car.model
                } voi gia ${car.totalPrice()}" )
            }

        }
    }
}
fun main(){
   cars.add(Car(1, "Civic", "Honda" , 25.0))
   cars.add(Car(2,"Mototruck", "Tesla", 70.0))

customers.add(Customer(1, "Nguyen Dac Khai"))
    customers.add(Customer(2,"Nguyen Van Hoang"))

    payments.add(Payment(1,1,1,cars[0].price))
    payments.add(Payment(2,2,2,cars[1].price))
    display()
    println()
    displayCustomer()
}
