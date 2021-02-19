/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//package com.facebook.presto.kafka.util;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.kafka.common.serialization.Serializer;
//
//import java.io.UncheckedIOException;
//import java.util.Map;
//
//public class JsonEncoder
//        implements Serializer<Object>
//{
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    public JsonEncoder()
//    {
//        // constructor required by Kafka
//    }
//
//    @Override
//    public void configure(Map<String, ?> map, boolean b)
//    {
//        //
//    }
//
//    @Override
//    public byte[] serialize(String topic, Object o)
//    {
//        try {
//            return objectMapper.writeValueAsBytes(o);
//        }
//        catch (JsonProcessingException e) {
//            throw new UncheckedIOException(e);
//        }
//    }
//
//    @Override
//    public void close()
//    {
//        //
//    }
//}