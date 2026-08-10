package org.goros.myapp;

import org.goros.utils.StringUtils;

public class MainApplication {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.getClassName());

        stringUtils.getName();
    }
}
