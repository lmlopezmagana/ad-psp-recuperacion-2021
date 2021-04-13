package com.example.demo.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {

    public String concat(String ...args) {
        return Arrays.stream(args)
                .collect(Collectors.joining());
    }

    public String reversed(String string) {
        return new StringBuilder(string).reverse().toString();
    }


}
