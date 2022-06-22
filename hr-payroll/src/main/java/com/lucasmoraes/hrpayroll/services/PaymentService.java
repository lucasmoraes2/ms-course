package com.lucasmoraes.hrpayroll.services;

import com.lucasmoraes.hrpayroll.entities.Payment;
import com.lucasmoraes.hrpayroll.entities.Worker;
import com.lucasmoraes.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
