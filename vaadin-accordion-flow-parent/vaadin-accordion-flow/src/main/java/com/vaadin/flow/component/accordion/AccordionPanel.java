package com.vaadin.flow.component.accordion;

/*
 * #%L
 * Vaadin Accordion
 * %%
 * Copyright (C) 2018 - 2019 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file license.html distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <http://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.shared.Registration;

/**
 * An accordion panel which could be expanded or collapsed.
 */
@Tag("vaadin-accordion-panel")
public class AccordionPanel extends Details implements HasEnabled {

    /**
     * Creates an empty panel.
     */
    public AccordionPanel() {
    }

    /**
     * Creates a panel with the provided summary text and content.
     *
     * @param summary the summary
     * @param content the content
     */
    public AccordionPanel(String summary, Component content) {
        super(summary, content);
    }

    /**
     * Creates a panel with the provided summary component and content.
     *
     * @param summary the summary
     * @param content the content
     */
    public AccordionPanel(Component summary, Component content) {
        super(summary, content);
    }

    /**
     * Registers a listener to be notified when the panel is expanded or collapsed.
     *
     * @param listener the listener to be notified
     * @return a handle to the registered listener which could also be used to unregister it
     */
    public Registration addOpenedChangedListener(
            ComponentEventListener<AccordionPanelOpenedChangedEvent> listener) {

        return ComponentUtil.addListener(this, AccordionPanelOpenedChangedEvent.class, listener);
    }
}
