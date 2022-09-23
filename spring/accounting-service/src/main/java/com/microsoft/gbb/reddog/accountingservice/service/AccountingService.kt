package com.microsoft.gbb.reddog.accountingservice.service

import com.microsoft.gbb.reddog.accountingservice.entities.OrderSummary
import com.microsoft.gbb.reddog.accountingservice.repositories.CustomerOrderRepository
import com.microsoft.gbb.reddog.accountingservice.repositories.ProductRepository
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

/**
 * Handle accounting related queries.
 */
@Slf4j
@Service
class AccountingService(productRepository: ProductRepository?,
                        customerOrderRepository: CustomerOrderRepository?) {
    // TODO: implement the following methods with Daprclient
    fun UpdateMetrics(orderSummary: OrderSummary?) {}
    fun markOrderComplete(orderSummary: OrderSummary?) {}
    fun getOrderCountOverTime(orderSummary: OrderSummary?) {}
    val uniqueStores: List<String>?
        get() = null
    val corpSalesAndProfitPerStore: Unit
        get() {}
    val corpSalesAndProfitTotal: Unit
        get() {}
    val orderMetrics: Unit
        get() {}
    val ordersByMinute: Unit
        get() {}
    val ordersByHour: Unit
        get() {}
    val ordersByDay: Unit
        get() {}
}