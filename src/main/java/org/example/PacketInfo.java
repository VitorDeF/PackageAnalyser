package org.example;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PacketInfo {
    private int count;
    private String source;
    private String destination;
    private String protocol;
    private int length;
    private String header;
    private String payload;
    private String timestamp;

    public PacketInfo(int count, String source, String destination, String protocol, int length, String header, String payload, String timestamp) {
        this.count = count;
        this.source = source;
        this.protocol = protocol;
        this.length = length;
        this.destination = destination;
        this.header = header;
        this.payload = payload;
        this.timestamp = timestamp;
    }

    public int getCount() {return count;}
    public String getSource() {return source;}
    public String getDestination() {return destination;}
    public String getProtocol() {return protocol;}
    public int getLength() {return length;}
    public String getHeader() {return header;}
    public String getPayload() {return payload;}
    public String getTimestamp() {return timestamp;}
}
