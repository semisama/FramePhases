package uz.ttpu.framephases.data.orders

object OrdersDataModule {
    fun provideRepository(): OrderRepository = FakeOrderRepository()
}