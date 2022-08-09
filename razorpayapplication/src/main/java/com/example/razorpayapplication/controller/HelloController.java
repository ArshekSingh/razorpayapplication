package com.example.razorpayapplication.controller;


import com.example.razorpayapplication.response.RazorpayFetchResponse;
import com.example.razorpayapplication.service.FetchAllPayments;
import com.razorpay.Payment;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("details")
public class HelloController {

    @Autowired
    FetchAllPayments fetchAllPayments;

    @GetMapping("/fetch")
    public RazorpayFetchResponse fetchPayment() throws RazorpayException {
     return fetchAllPayments.fetchAll();
    }

}
