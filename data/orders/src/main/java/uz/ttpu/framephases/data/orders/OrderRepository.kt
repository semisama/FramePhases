package uz.ttpu.framephases.data.orders

interface OrderRepository {
    suspend fun placeOrder(bookId: String, email: String): Result<String>
}