package br.nocclarobrasil.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "springit")
public class SpringitProperties {
    
    /**
     * This is our welcome message!
     */
    private String welcomeMessage = "Hello, World!";
    
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
    
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
