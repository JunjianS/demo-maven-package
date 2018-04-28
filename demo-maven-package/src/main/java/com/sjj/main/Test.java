package com.sjj.main;

import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) {
        if(StringUtils.isNotBlank("test")){
            System.out.println("=========This is a test of packaging=========");
        }else {
            System.out.println("+++++++++This is a test of packaging+++++++++");
        }
    }

}
