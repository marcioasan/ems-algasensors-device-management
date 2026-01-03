package com.algaworks.algasensors.device.management.api.client;

//11.2. Integração de REST API com RestClient do Spring

import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {
    void enableMonitoring(TSID sensorId);
    void disableMonitoring(TSID sensorId);
}
