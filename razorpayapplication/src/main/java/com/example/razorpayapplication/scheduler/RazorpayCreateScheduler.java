//package com.example.razorpayapplication;
//
//import com.example.razorpayapplication.service.CreatePayment;
//import com.razorpay.RazorpayException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class RazorpayCreateScheduler {
//    @Autowired
//    private CreatePayment createPayment;
//
//    @Scheduled(fixedRate = 100000)
//    public void razorpayCreate() throws RazorpayException {
//        createPayment.createPayment();
//    }
//}
