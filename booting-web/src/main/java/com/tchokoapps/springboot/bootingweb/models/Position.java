package com.tchokoapps.springboot.bootingweb.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Position {
    HOUSEKEEPING("HOUSEKEEPING"), FRONT_DESK("FRONT_DESK"), SECURITY("SECURITY"), CONCIERGE("CONCIERGE");
    private String name;

    public static Position toEnum(final String name) {
        for (Position p : values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }

        throw new IllegalArgumentException("No enum Position found for " + name);
    }

}
