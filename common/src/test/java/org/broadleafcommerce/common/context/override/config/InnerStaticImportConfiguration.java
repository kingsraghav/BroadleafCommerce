package org.broadleafcommerce.common.context.override.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Nick Crum ncrum
 */
@Configuration
@Import(InnerStaticImportChildConfiguration.class)
public class InnerStaticImportConfiguration {

    @Configuration
    public static class InnerStaticConfiguration {

        @Bean
        public PasswordEncoder blPasswordEncoder() {
            return NoOpPasswordEncoder.getInstance();
        }
    }
}