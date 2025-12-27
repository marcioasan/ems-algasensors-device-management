package com.algaworks.algasensors.device.management.domain.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

//10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 5'
@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED) //10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 8'
public class SensorId implements Serializable {

    private TSID value;

    public SensorId(TSID value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public SensorId(Long value) {
        Objects.requireNonNull(value);
        this.value = TSID.from(value);
    }
    public SensorId(String value) {
        Objects.requireNonNull(value);
        this.value = TSID.from(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
