package com.example.razorpayapplication.service;

import com.example.razorpayapplication.mapper.FetchResponseMapper;
import com.example.razorpayapplication.response.Item;
import com.example.razorpayapplication.response.RazorpayFetchResponse;
import com.razorpay.Payment;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FetchAllPayments {

    public RazorpayFetchResponse fetchAll() throws RazorpayException {

        RazorpayClient razorpay = new RazorpayClient("rzp_test_9bS6OTCEBbOIUk", "ATwiBqhJoLo2TIy1pMkILX39");
        JSONObject params = new JSONObject();
        params.put("count", 100);
        List<Payment> payment = razorpay.payments.fetchAll(params);
        RazorpayFetchResponse payments = fetchResponseMapper.mapFromPaymentRazorpay(payment);
        System.out.println(payment);

        return payments;
    }

    @Autowired
    FetchResponseMapper fetchResponseMapper;
}
