package com.cwa.domain;

import com.cwa.singleton.NotificationManeger;
import com.cwa.strategy.NotificationStrategy;

public class MarketingNotification extends Notification{

    public MarketingNotification(String message, NotificationStrategy strategy) {
        super(message, strategy);
    }

    @Override
    public void send() {
        String formatedMessage = getStrategy().formatMessage("[MARKETING] " + getMessage());
        NotificationManeger.getInstance().notify(formatedMessage, NotificationType.MARKETING);
    }
}
