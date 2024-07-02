package com.emtronik.utility;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class OtpUtility {
   public String generateOtp() {
	   String op = Integer.toString(new Random().nextInt(999999));
	   while(op.length() < 6) {
		   op = "0" + op ;
	   }
	   return op;
   }
}
