package com.algaworks.algasensors.device.management.domain.repository;

import com.algaworks.algasensors.device.management.domain.model.Sensor;
import com.algaworks.algasensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

//10.4. Implementando a persistência com Jakarta Persistence e Spring Data JPA - 7'
public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
