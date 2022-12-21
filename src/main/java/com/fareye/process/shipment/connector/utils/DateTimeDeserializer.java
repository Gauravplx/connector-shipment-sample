package com.fareye.process.shipment.connector.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

public class DateTimeDeserializer extends JsonDeserializer<DateTime> {

    private static  final String DATE_FORMAT_ES="yyyy-MM-dd'T'HH:mm:ss.SSSZ";


    @Override
    public DateTime deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext) throws IOException, JsonProcessingException {
        String date = jsonparser.getText();
        DateTimeFormatter dtfOutMysql = DateTimeFormat.forPattern(DATE_FORMAT_ES);
        DateTime dateTimeWithCompanyTimeZone = null;
        try{
            Long millis = Long.parseLong(date);
            dateTimeWithCompanyTimeZone = new DateTime(millis).withZone(DateTimeZone.forID("GMT"));
        }catch (Exception e){
            dateTimeWithCompanyTimeZone = dtfOutMysql.parseDateTime(date).withZone(DateTimeZone.forID("GMT"));
        }
        return dateTimeWithCompanyTimeZone;
    }
}
