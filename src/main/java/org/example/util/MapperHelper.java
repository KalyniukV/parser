package org.example.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MapperHelper {

    private static final ObjectMapper jsonMapper = new ObjectMapper();

    static {
        jsonMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }

    public static <T> T toObject(final String content, final Class<T> type) throws IOException {
        return jsonMapper.readValue(content, type);
    }

    public static <T> T toObject(final String content, final TypeReference<T> typeRef) throws IOException {
        return jsonMapper.readValue(content, typeRef);
    }

}
