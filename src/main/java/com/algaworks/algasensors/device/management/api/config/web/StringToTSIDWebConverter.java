package com.algaworks.algasensors.device.management.api.config.web;

//10.6. Implementando a consulta de sensores - 3'40"

import io.hypersistence.tsid.TSID;
import org.springframework.core.convert.converter.Converter;

public class StringToTSIDWebConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(String source) {
        return TSID.from(source);
    }
}
