package com.bigdata.config;

import com.bigdata.service.SparkService;
import com.esotericsoftware.kryo.Kryo;
import org.apache.spark.serializer.KryoRegistrator;

public class MyKryoRegistrator implements KryoRegistrator {
    @Override
    public void registerClasses(Kryo kryo) {
        kryo.register(SparkAndEsBean.class);
        kryo.register(SparkService.class);

    }
}
