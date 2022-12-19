package com.fareye.process.shipment.connector.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProcessConsumer {
    @KafkaListener(topics = "local.public.process_12_2022",
            groupId = "groupId")
    public void listen(@Payload String message,
                        @Header(KafkaHeaders.OFFSET) Long offset,
                        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                        @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long ts) throws IllegalAccessException, InstantiationException {
        try {
//            JsonAvroConverter avroConverter = new JsonAvroConverter();

            log.error("gaurav   " + message);


        } catch (Exception exception) {
//            log.error("Invalid Command JSON.", exception);
        }
    }
}
