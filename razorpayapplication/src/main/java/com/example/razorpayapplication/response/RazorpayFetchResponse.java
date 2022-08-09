package com.example.razorpayapplication.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RazorpayFetchResponse {

    private List<Item> items=new ArrayList<>();
}
