package com.gl.pro;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // You can add custom logic like DB/ping check here
        boolean healthy = true; // Replace with actual check
        if (healthy) {
            return Health.up().withDetail("customCheck", "All systems operational").build();
        } else {
            return Health.down().withDetail("customCheck", "Something went wrong").build();
        }
    }
}
