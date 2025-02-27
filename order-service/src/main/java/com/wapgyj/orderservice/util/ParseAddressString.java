package com.wapgyj.orderservice.util;

import com.wapgyj.orderservice.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseAddressString {
    private static final Logger logger = LoggerFactory.getLogger(ParseAddressString.class);

    public Address parseAddressString(String addressString) {
        if (addressString == null || addressString.trim().isEmpty()) {
            throw new IllegalArgumentException("Address string cannot be null or empty");
        }

        // Validate and extract content
        if (!addressString.startsWith("Address{") || !addressString.endsWith("}")) {
            logger.error("Invalid address string format: {}", addressString);
            throw new IllegalArgumentException("Address string must be wrapped in 'Address{...}'");
        }
        String content = addressString.substring(8, addressString.length() - 1);

        // Parse key-value pairs with quote handling
        List<String> parts = splitAddressContent(content);
        Map<String, String> fields = parseKeyValuePairs(parts);

        // Extract and validate required fields
        String streetAddress = getRequiredField(fields, "streetAddress");
        String city = getRequiredField(fields, "city");
        String state = getRequiredField(fields, "state");
        String country = getRequiredField(fields, "country");
        String zipCodeStr = getRequiredField(fields, "zipCode");

        // Convert and validate zipCode
        Integer zipCode = parseZipCode(zipCodeStr);

        return new Address(streetAddress, city, country, state, zipCode);
    }

    private List<String> splitAddressContent(String content) {
        List<String> parts = new ArrayList<>();
        int start = 0;
        boolean inQuote = false;

        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c == '\'') {
                inQuote = !inQuote;
            } else if (c == ',' && !inQuote) {
                parts.add(content.substring(start, i).trim());
                start = i + 1;
                // Skip whitespace after comma
                while (start < content.length() && Character.isWhitespace(content.charAt(start))) {
                    start++;
                }
            }
        }
        // Add the last part
        if (start < content.length()) {
            parts.add(content.substring(start).trim());
        }
        return parts;
    }

    private Map<String, String> parseKeyValuePairs(List<String> parts) {
        Map<String, String> fields = new HashMap<>();
        for (String part : parts) {
            int eqIndex = part.indexOf('=');
            if (eqIndex == -1) {
                logger.error("Invalid field format: {}", part);
                throw new IllegalArgumentException("Field missing '=' delimiter: " + part);
            }

            String key = part.substring(0, eqIndex).trim();
            String value = part.substring(eqIndex + 1).trim();

            // Remove surrounding quotes if present
            if (value.startsWith("'") && value.endsWith("'") && value.length() > 1) {
                value = value.substring(1, value.length() - 1);
            }
            fields.put(key, value);
        }
        return fields;
    }

    private String getRequiredField(Map<String, String> fields, String fieldName) {
        String value = fields.get(fieldName);
        if (value == null) {
            String error = "Missing required field: " + fieldName;
            logger.error(error);
            throw new IllegalArgumentException(error);
        }
        return value;
    }

    private Integer parseZipCode(String zipCodeStr) {
        try {
            return Integer.parseInt(zipCodeStr);
        } catch (NumberFormatException e) {
            String error = "Invalid zipCode format: " + zipCodeStr;
            logger.error(error);
            throw new IllegalArgumentException(error, e);
        }
    }
}