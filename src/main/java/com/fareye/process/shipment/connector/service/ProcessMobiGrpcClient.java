//package com.fareye.process.shipment.connector.service;
//
//import com.fareye.process.shipment.connector.Application;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import shipment.service.ProcessShipmentConnector;
//import shipment.service.ProcessShipmentConnectorServiceGrpc;
//
//@Service
//@Slf4j
//public class ProcessMobiGrpcClient {
//    private static final Logger log = LoggerFactory.getLogger(ProcessMobiGrpcClient.class);
//    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
//            .usePlaintext()
//            .build();
//    ProcessShipmentConnectorServiceGrpc.ProcessShipmentConnectorServiceBlockingStub stub = ProcessShipmentConnectorServiceGrpc.newBlockingStub(channel);
//    ProcessShipmentConnector.SampleResponseDTO responseDTO = stub.getSample(ProcessShipmentConnector.SampleRequestDTO.newBuilder()
//            .setReq("gaurav").build());
//
//}
