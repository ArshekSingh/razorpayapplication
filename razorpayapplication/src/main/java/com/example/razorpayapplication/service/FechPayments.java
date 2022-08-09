//package com.example.razorpayapplication.service;
//
//import com.razorpay.Payment;
//import com.razorpay.RazorpayClient;
//import com.razorpay.RazorpayException;
//import org.springframework.stereotype.Service;
//
//@Service
//
//public class FechPayments {
//
//    public Payment FechPayments() throws RazorpayException {
//        RazorpayClient razorpay = new RazorpayClient("rzp_test_kiFLb5OlPKZj7E", "8sH4MRMhhOx9gZJx25ecvdoc");
//        String paymentId = "pay_JvCekZozp8b0O0";
//        Payment payment = razorpay.payments.fetch(paymentId);
//
//       // System.out.println(payment);
//        return payment;
//    }
//}
