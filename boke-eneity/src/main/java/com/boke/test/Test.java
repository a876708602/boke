package com.boke.test;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Administrator
 */
@Data
@Accessors(chain = true)
public class Test {
    private int id;
    private String name;

}
