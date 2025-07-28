package com.kristjan.springbootlibrary.utils;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ExtractJWT {

    public static String payloadJWTExtraction(String token, String extraction) { // more dynamic with our application

        token.replace("Bearer ", "");  // removing Bearer from token

        // breaking token into 3 different chunks: header, payload, signature
        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();

        // decoding the payload
        String payload = new String(decoder.decode(chunks[1]));

        // splitting payload by commas ,
        String[] entries = payload.split(",");
        Map<String, String> map = new HashMap<String, String>();  // Map bcs we want key value pair

        for (String entry : entries) {
            String[] keyValue = entry.split(":");
            if (keyValue[0].equals(extraction)) {

                int remove = 1;
                // we want only value what can be email, removing }
                if (keyValue[1].endsWith("}")) {
                    remove = 2;
                }
                // adding ending as the value
                keyValue[1] = keyValue[1].substring(0, keyValue[1].length() - remove);
                keyValue[1] = keyValue[1].substring(1);

                map.put(keyValue[0], keyValue[1]);
            }
        }
        if (map.containsKey(extraction)) {
            return map.get(extraction);
        }
        return null;
    }
}
