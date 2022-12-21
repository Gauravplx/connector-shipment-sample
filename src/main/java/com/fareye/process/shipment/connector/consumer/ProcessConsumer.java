package com.fareye.process.shipment.connector.consumer;

import com.fareye.process.shipment.connector.Domain.ProcessDomain;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProcessConsumer {

    @Autowired
    private ObjectMapper objectMapper;
    @KafkaListener(topics = "local.public.process_12_2022",
            groupId = "groupId")
    public void listen(GenericRecord message) throws IllegalAccessException, InstantiationException {
        try {
            ProcessDomain processDomain = objectMapper.readValue(message.get("after").toString(),ProcessDomain.class);
            log.error("gaurav   " + objectMapper.writeValueAsString(processDomain));


        } catch (Exception exception) {
//            log.error("Invalid Command JSON.", exception);
        }
    }
}
