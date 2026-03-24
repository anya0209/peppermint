package com.hendisantika.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project : spring-boot-invoice-app-system
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageItem {
    private int number;
    private boolean actual;
}
