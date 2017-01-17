package com.penglei.springboot_1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.MimeType;

import java.nio.charset.Charset;

/**
 * Created by hewei on 2017/1/17.
 */
@ConfigurationProperties("spring.thymeleaf")
public class ThymeleafProperties {
    private static final Charset DEFAULT_ENCODING = Charset.forName("UTF-8");
    private static final MimeType DEFAULT_CONTENT_TYPE = MimeType.valueOf("text/html");
    public static final String DEFAULT_PREFIX = "classpath:/templates/";
    public static final String DEFAULT_SUFFIX = ".html";
    private boolean checkTemplateLocation = true;
    private String prefix = "classpath:/templates/";
    private String suffix = ".html";
    private String mode = "HTML5";
    private Charset encoding;
    private MimeType contentType;
    private boolean cache;
    private Integer templateResolverOrder;
    private String[] viewNames;
    private String[] excludedViewNames;
    private boolean enabled;
}