package com.network;

public interface TCPConnectionListener {
    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String value);
    void onDisconnected(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection,Exception e);
}
