package org.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * packageName    : org.config
 * fileName       : EnviromentCheck
 * author         : wonpyo
 * date           : 2025-03-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-19        wonpyo       최초 생성
 */
@Slf4j
@Component
public class EnviromentCheck {
    public final Environment environment;

    public EnviromentCheck(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    public void init() {
        String url = environment.getProperty("url");
        String name = environment.getProperty("name");

        log.info("url: {}", url);
        log.info("active-profile: {}", name);
    }
}
