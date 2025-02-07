package com.microsoft.gbb.reddog.virtualworker.controller;


import com.microsoft.gbb.reddog.virtualworker.service.VirtualWorkerService;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.web.bind.annotation.*;

@RestController
public class VirtualWorkerController {

    private final VirtualWorkerService orderCreationJobService;

    public VirtualWorkerController(VirtualWorkerService orderCreationJobService1) {
        this.orderCreationJobService = orderCreationJobService1;
    }

    @PostMapping(value = "/orders")
    @CrossOrigin(origins = "*")
    public String checkOrders() {
        orderCreationJobService.checkOrders();
        return "WIP";
    }
}
