package com.eventbusapp.client;

import com.eventbusapp.client.view.ButtonView;
import com.eventbusapp.client.view.TextBoxView;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.RootPanel;

public class EventBusApp implements EntryPoint {

    @Override
    public void onModuleLoad() {
        SimpleEventBus eventBus = new SimpleEventBus();

        RootPanel.get().add(new ButtonView(eventBus));
        RootPanel.get().add(new TextBoxView(eventBus));
    }
}
