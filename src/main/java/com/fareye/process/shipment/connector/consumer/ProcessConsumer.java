package com.fareye.process.shipment.connector.consumer;

import com.fareye.process.shipment.connector.Domain.ProcessDomain;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import shipment.service.ProcessShipmentConnector;
import shipment.service.ProcessShipmentConnectorServiceGrpc;

@Slf4j
@Component
public class ProcessConsumer {

    @Autowired
    private ObjectMapper objectMapper;
    @KafkaListener(topics = "local.public.process_1_2023",
            groupId = "groupId")
    public void listen(GenericRecord message) throws IllegalAccessException, InstantiationException {
        try {
            ProcessDomain processDomain = objectMapper.readValue(message.get("after").toString(),ProcessDomain.class);
            log.error("gaurav   " + objectMapper.writeValueAsString(processDomain));

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        ProcessShipmentConnectorServiceGrpc.ProcessShipmentConnectorServiceBlockingStub stub = ProcessShipmentConnectorServiceGrpc.newBlockingStub(channel);
        ProcessShipmentConnector.ProcessVersionDTO processVersionDTO = stub.getProcessVersionDetails(ProcessShipmentConnector.ProcessVersionId
                .newBuilder()
                .setProcessVersionId(processDomain.getProcessVersionId())
                .setCompanyId(processDomain.getCompanyId()).build());

//        channel.shutdown();

        log.error("gaurav  proto " + processVersionDTO.getProcess());


        } catch (Exception exception) {
            log.error("Invalid Command JSON.", exception);
        }
    }
}
