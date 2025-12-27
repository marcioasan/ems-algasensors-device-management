package com.algaworks.algasensors.device.management.api.model;
//10.5. Ajustando a representação do recurso REST com classe Model

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorOutput {
    private TSID id;
    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
    private Boolean enabled;
}
