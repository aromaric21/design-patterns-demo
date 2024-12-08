package com.cwa.domain;

import com.cwa.singleton.NotificationManeger;
import com.cwa.strategy.NotificationStrategy;

public class InfoNotification extends Notification{

    public InfoNotification(String message, NotificationStrategy strategy) {
        super(message, strategy);
    }

    @Override
    public void send() {
        String formatedMessage = getStrategy().formatMessage("[INFO] " + getMessage());
        NotificationManeger.getInstance().notify(formatedMessage, NotificationType.INFO);
    }
}
