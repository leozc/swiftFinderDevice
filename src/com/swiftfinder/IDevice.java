package com.swiftfinder;

public interface IDevice {
    public void sendSignal(char[] payload);
    public void receivedSignal(char[] payload);
    public String getName();
    public String getDescription();
    public String getDeviceId();

}
