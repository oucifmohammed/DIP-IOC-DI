package org.mohammedoucif;

import org.springframework.context.annotation.ComponentScan;

/**
 * We use the @ComponentScan to tell Spring Context where to find the Classes we want it to control.
 */
@ComponentScan(basePackages = {
        "org.mohammedoucif.proxies",
        "org.mohammedoucif.repositories",
        "org.mohammedoucif.services"}
)
public class ProjectConfiguration {}
