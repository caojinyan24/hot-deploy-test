package swa.service.impl;

import org.springframework.stereotype.Service;
import swa.annotation.ValueSetter;
import swa.service.DataLoaderService;

import java.util.Map;

/**
 * Created by jinyan on 5/26/17.
 */
@Service
public class DataLoaderServiceImpl implements DataLoaderService {
    @ValueSetter("test.properties")
    private Map<String, String> fieldVaule;

    public void print() {
        System.out.println("##############");
        System.out.println(fieldVaule);
    }
}
