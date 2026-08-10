package org.goros.utils;

import lombok.Data;

@Data
public class StringUtils {
    public String name;
    public String getClassName() {
        return this.getClass().getName();
    }
}
