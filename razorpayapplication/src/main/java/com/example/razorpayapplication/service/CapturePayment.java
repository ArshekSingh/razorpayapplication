//package com.example.razorpayapplication.service;
//
//import com.razorpay.Payment;
//import com.razorpay.RazorpayClient;
//import com.razorpay.RazorpayException;
//import org.json.JSONObject;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CapturePayment {
//
//    public void capturePayment() throws RazorpayException {
//
//        RazorpayClient razorpay = new RazorpayClient("rzp_test_kiFLb5OlPKZj7E", "8sH4MRMhhOx9gZJx25ecvdoc");
//        String paymentId = "pay_JvCekZozp8b0O1";
//        JSONObject paymentRequest = new JSONObject();
//        paymentRequest.put("amount", 1000);
//        paymentRequest.put("currency", "INR");
//        Payment payment = razorpay.payments.capture(paymentId, paymentRequest);
//        //System.out.println(payment);
//    }
//}
