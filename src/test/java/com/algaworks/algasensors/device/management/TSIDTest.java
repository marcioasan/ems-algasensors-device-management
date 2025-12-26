package com.algaworks.algasensors.device.management;

import com.algaworks.algasensors.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

//9.5. Usando o TSID com Java

public class TSIDTest {

    @Test
    void shouldGenerateTSID() {
//        TSID tsid = TSID.fast();
//
//        System.setProperty("tsid.node", "7");
//        System.setProperty("tsid.node.count", "32");
//
//        TSID.Factory factory = TSID.Factory.builder().build();
//        TSID tsid = factory.generate();
//
////        TSID tsid = TSID.Factory.getTsid();
//        System.out.println(tsid);

        TSID tsid = IdGenerator.generateTSID();
        Assertions.assertThat(tsid.getInstant())
                        .isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));

        System.out.println(tsid);
        System.out.println(tsid.toLong());
        System.out.println(tsid.getInstant());
    }
}
