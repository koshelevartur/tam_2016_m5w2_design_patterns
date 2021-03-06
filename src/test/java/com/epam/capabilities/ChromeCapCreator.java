package com.epam.capabilities;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Artur_Koshelev.
 */
public class ChromeCapCreator extends CapCreator {
    @Override
    public DesiredCapabilities FactoryMethod() {
        capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        return capabilities;
    }
}
