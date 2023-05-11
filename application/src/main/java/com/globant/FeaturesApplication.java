package com.globant;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = {"com.globant"})
public class FeaturesApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder()
        .sources(FeaturesApplication.class)
        .bannerMode(Banner.Mode.OFF)
        .web(WebApplicationType.SERVLET)
        .run(args);
  }
}
