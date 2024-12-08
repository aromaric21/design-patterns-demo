package com.cwa.domain;

import com.cwa.strategy.NotificationStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Notification {

    private String message;
    private NotificationStrategy strategy;

    public abstract void send();
}
