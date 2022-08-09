//package com.example.razorpayapplication;
//
//import com.example.razorpayapplication.service.FetchAllPayments;
//import com.razorpay.RazorpayException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RazorpayScheduler {
//    @Autowired
//    FetchAllPayments fetchAllPayments;
//
//
//    @Scheduled(fixedRate = 10000)
//    public void fetchPayments() throws RazorpayException {
//        fetchAllPayments.fetchAll();
//    }
//
//
//
//
//}
