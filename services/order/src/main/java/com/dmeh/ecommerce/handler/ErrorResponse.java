package com.dmeh.ecommerce.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
// Add OrderRepository interface
