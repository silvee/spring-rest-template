package com.silvee.util;

/**
 * Utility classes used for defining additional methods
 * Usually here all methods must be static
 * They should not call other Services, Assemblers, Controllers or Repositories
 */
public class UserUtil {

    private UserUtil() {

    }

    public static String convertToFullName(String name) {
        return name + "!";
    }
}