package swa.service.impl;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;
import swa.annotation.ValueSetter;
import swa.service.DataLoaderService;

import java.util.Map;

/**
 * Created by jinyan on 5/26/17.
 */
@Service
public class DataLoaderServiceImpl implements DataLoaderService {
    @ValueSetter("fileName.properties")
    private Map<String, String> fieldValue = Maps.newHashMap();

    public String getValue(String key) {
        System.out.println("fieldValue:" + fieldValue);
        return fieldValue.get(key);
    }
}
