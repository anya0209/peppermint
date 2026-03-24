package com.hendisantika.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Project : spring-boot-invoice-app-system
 */
@Controller
public class LocaleController {

    @GetMapping("/locale")
    public String locale(HttpServletRequest request) {
        String lastUrl = request.getHeader("referer");

        return "redirect:".concat(lastUrl);
    }
}
