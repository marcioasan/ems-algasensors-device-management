package com.algaworks.algasensors.device.management.api.config.jpa;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

//10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 3'

@Converter(autoApply = true) //4'
public class TSIDToLongJPAAttributeConverter implements AttributeConverter<TSID, Long> {

    @Override
    public Long convertToDatabaseColumn(TSID attribute) {
        return attribute.toLong();
    }

    @Override
    public TSID convertToEntityAttribute(Long dbData) {
        return TSID.from(dbData);
    }
}
