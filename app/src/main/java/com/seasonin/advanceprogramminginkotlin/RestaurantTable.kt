package com.seasonin.advanceprogramminginkotlin

object RestaurantTable {
    val customers = mutableListOf<String>()

    fun addCustomer(customerName: String) {
        customers.add(customerName)
    }
    fun removeCustomer(customerName: String) {
        customers.remove(customerName)
    }
}