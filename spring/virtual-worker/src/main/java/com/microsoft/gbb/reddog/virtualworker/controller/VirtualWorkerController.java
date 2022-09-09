package com.microsoft.gbb.reddog.virtualworker.controller;


import com.microsoft.gbb.reddog.virtualworker.service.VirtualWorkerService;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.web.bind.annotation.*;

@RestController
public class VirtualWorkerController {

    private final JobScheduler jobScheduler;
    private final VirtualWorkerService orderCreationJobService;

    public VirtualWorkerController(JobScheduler jobScheduler, VirtualWorkerService orderCreationJobService1) {
        this.jobScheduler = jobScheduler;
        this.orderCreationJobService = orderCreationJobService1;
    }

    @PostMapping(value = "/orders")
    @CrossOrigin(origins = "*")
    public String checkOrders() {
        jobScheduler.enqueue(orderCreationJobService::checkOrders);
        return "Job started";
    }
}
