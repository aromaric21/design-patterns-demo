package com.cwa;

import com.cwa.domain.Notification;
import com.cwa.domain.NotificationType;
import com.cwa.factory.NotificationFactory;
import com.cwa.observer.EmailNotificationObserver;
import com.cwa.observer.PushNotifiactionObserver;
import com.cwa.observer.SMSNotifiactionObserver;
import com.cwa.singleton.NotificationManeger;

public class Main {
    public static void main(String[] args) {
        NotificationManeger manager = NotificationManeger.getInstance();
        manager.addObserver(new EmailNotificationObserver());
        manager.addObserver(new SMSNotifiactionObserver());
        manager.addObserver(new PushNotifiactionObserver());

        Notification urgentNotification = NotificationFactory.createNotification("System failur detcted !"
                  , NotificationType.URGENT);

        Notification infoNotification = NotificationFactory.createNotification("Daily backup completed successfully"
                , NotificationType.INFO);

        Notification marketingNotification = NotificationFactory.createNotification("New features available"
                , NotificationType.MARKETING);

        urgentNotification.send();

        System.out.println("********************************************");
        infoNotification.send();

        System.out.println("********************************************");
        marketingNotification.send();
    }

}