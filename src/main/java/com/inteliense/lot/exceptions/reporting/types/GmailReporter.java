package com.inteliense.lot.exceptions.reporting.types;

import com.inteliense.lot.exceptions.types.ReportedException;

public class GmailReporter {

    private static String apiKey = null;
    private static String telnyxPhoneNumber = null;

    public static boolean hasConfiguration() {
        return (apiKey != null && telnyxPhoneNumber != null);
    }

    public static void setConfiguration(String telnyxApiKey, String telnyxPhone) {
        if(apiKey == null) apiKey = telnyxApiKey;
        if(telnyxPhoneNumber == null) telnyxPhoneNumber = telnyxPhone;
    }

    public static void report(ReportedException e) {

    }

}
