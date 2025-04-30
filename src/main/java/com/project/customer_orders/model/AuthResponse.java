package com.project.customer_orders.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Surendiran M
 */

@Getter
@Setter
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }
}
