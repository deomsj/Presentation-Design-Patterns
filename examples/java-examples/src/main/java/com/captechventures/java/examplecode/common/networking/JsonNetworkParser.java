package com.captechventures.java.examplecode.common.networking;

public class JsonNetworkParser implements NetworkParser {

    @Override
    public <T extends NetworkResponse> T parseResponse(String responseBody, Class<T> tClass) {
        return null;
    }
}
