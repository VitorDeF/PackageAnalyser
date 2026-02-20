package org.example;

import org.pcap4j.packet.IpV4Packet;

public class PacketInfo {
    private int count;
    private String source;
    private String destination;
    private String protocol;
    private int length;
    private byte[] packet;
    private String timestamp;

    public PacketInfo(int count, String source, String destination, String protocol, int length, byte[] packet, String timestamp) {
        this.count = count;
        this.source = source.intern();
        this.destination = destination.intern();
        this.protocol = protocol.intern();
        this.length = length;
        this.packet = packet;
        this.timestamp = timestamp;
    }

    public int getCount() {return count;}
    public String getSource() {return source;}
    public String getDestination() {return destination;}
    public String getProtocol() {return protocol;}
    public int getLength() {return length;}
    public String getHeader() {
        try {
            return IpV4Packet.newPacket(packet, 0, packet.length).getHeader().toString();
        }catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    public String getPayload() {
        try {
            return IpV4Packet.newPacket(packet, 0, packet.length).getPayload().toString();
        }catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    public String getTimestamp() {return timestamp;}
}
