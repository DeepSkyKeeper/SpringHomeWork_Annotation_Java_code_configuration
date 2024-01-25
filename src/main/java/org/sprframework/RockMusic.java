package org.sprframework;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "The show must go on";
    }
}
