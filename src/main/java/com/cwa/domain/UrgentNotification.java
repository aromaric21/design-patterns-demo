package com.cwa.domain;

import com.cwa.singleton.NotificationManeger;
import com.cwa.strategy.NotificationStrategy;

public class UrgentNotification extends Notification{

    public UrgentNotification(String message, NotificationStrategy strategy) {
        super(message, strategy);
    }

    @Override
    public void send() {
        String formatedMessage = getStrategy().formatMessage("[URGENT] " + getMessage());
        NotificationManeger.getInstance().notify(formatedMessage, NotificationType.URGENT);
    }
}
