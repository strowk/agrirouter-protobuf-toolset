package de.saschadoemer.agrirouter.protobuf.encoder.impl;

import agrirouter.request.payload.endpoint.Capabilities;
import com.google.protobuf.Message;
import de.saschadoemer.agrirouter.protobuf.encoder.Encoder;

import java.util.Optional;

public class CapabilitiesMessageContentEncoder implements Encoder<Message> {

    @Override
    public Optional<Message> encode(String json) {
        Message.Builder builder = Capabilities.CapabilitySpecification.newBuilder();
        return this.encode(json, builder);
    }


}
