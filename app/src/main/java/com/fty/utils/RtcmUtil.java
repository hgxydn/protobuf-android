package com.fty.utils;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RtcmUtil {

    static {
        System.loadLibrary("rtcm");
    }

    public static native byte[] passStructToJava();

    public static native int passObjToNative(byte[] buf, int len);

    public static <T> T parseBuf(Class<T> clz, byte [] buf) {
        T t = null;

        try {
            Method method = clz.getMethod("parseFrom", byte[].class);
            t = (T) method.invoke(null, buf);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }
}
