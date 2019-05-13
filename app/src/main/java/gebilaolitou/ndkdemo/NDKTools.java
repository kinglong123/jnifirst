package gebilaolitou.ndkdemo;

/**
 * Created by lanjl on 2019/5/13.
 */
public class NDKTools {
    static {
        System.loadLibrary("ndkdemotest-jni");
    }

    public static native String getStringFromNDK();
}
