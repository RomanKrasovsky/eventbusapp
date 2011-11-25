package com.eventbusapp.client.view;

import com.eventbusapp.client.event.ClearEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Button;

public class ButtonView extends Button {

    public ButtonView(final SimpleEventBus eventBus) {
        setText("Clear");

        addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                eventBus.fireEvent(new ClearEvent());
            }
        });
    }
}
