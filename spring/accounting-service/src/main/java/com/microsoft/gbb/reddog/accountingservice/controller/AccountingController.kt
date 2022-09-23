package com.microsoft.gbb.reddog.accountingservice.controller

import com.microsoft.gbb.reddog.accountingservice.entities.CustomerOrder
import com.microsoft.gbb.reddog.accountingservice.entities.OrderSummary
import com.microsoft.gbb.reddog.accountingservice.service.AccountingService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
class AccountingController(private val accountingService: AccountingService) {
    @PostMapping(value = ["/todo"], consumes = ["application/json"], produces = ["application/json"])
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = ["*"])
    fun order(@RequestBody order: @Valid CustomerOrder?): ResponseEntity<OrderSummary> {
        return ResponseEntity.noContent().build()
    }
}