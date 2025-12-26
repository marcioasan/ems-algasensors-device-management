package com.algaworks.algasensors.device.management.api.model;

import lombok.Data;

//10.2. Implementando um microsserviço com Spring - 4'40"
@Data
public class SensorInput {
    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
}
