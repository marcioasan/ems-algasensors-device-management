package com.algaworks.algasensors.device.management.domain.model;

//10.2. Implementando um microsserviço com Spring

import io.hypersistence.tsid.TSID;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity //10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 1'
public class Sensor {
    @Id
//    @Column(columnDefinition = "BIGINT")
    @AttributeOverride(name = "value", column = @Column(name = "id", columnDefinition = "BIGINT"))  //10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 12'
    private SensorId id; //10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 7'30"
    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
    private Boolean enabled;
}
