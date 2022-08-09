//package com.example.razorpayapplication.service;
//
//import com.razorpay.PaymentLink;
//import com.razorpay.RazorpayClient;
//import com.razorpay.RazorpayException;
//import org.json.JSONObject;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CreatePayment {
//
//    public void createPayment() throws RazorpayException {
//
//        RazorpayClient razorpay = new RazorpayClient("rzp_test_kiFLb5OlPKZj7E", "8sH4MRMhhOx9gZJx25ecvdoc");
//        JSONObject paymentLinkRequest = new JSONObject();
//        paymentLinkRequest.put("amount", 1000);
//        paymentLinkRequest.put("currency", "INR");
//        paymentLinkRequest.put("accept_partial", true);
//        paymentLinkRequest.put("first_min_partial_amount", 100);
//        paymentLinkRequest.put("expire_by", 1691097057);
//        paymentLinkRequest.put("reference_id", "ST19811274373473734394");
//        paymentLinkRequest.put("description", "Payment for policy no #23456");
//        JSONObject customer = new JSONObject();
//        customer.put("name", "+919999974533");
//        customer.put("contact", "Ajay Kumar");
//        customer.put("email", "gaurav.kumar123@example.com");
//        paymentLinkRequest.put("customer", customer);
//        JSONObject notify = new JSONObject();
//        notify.put("sms", true);
//        notify.put("email", true);
//        paymentLinkRequest.put("reminder_enable", true);
//        JSONObject notes = new JSONObject();
//        notes.put("policy_name", "Jeevan Bima");
//        paymentLinkRequest.put("notes", notes);
//        paymentLinkRequest.put("callback_url", "https://example-callback-url.com/");
//        paymentLinkRequest.put("callback_method", "get");
//        PaymentLink payment = razorpay.paymentLink.create(paymentLinkRequest);
//
//    }
//}
//
