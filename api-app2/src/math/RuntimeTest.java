package math;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime r=Runtime.getRuntime();
        //r.exit(0);
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory()/1024.0/1024.0);
        System.out.println(r.freeMemory()/1024.0/1024.0);
        //r.exec("D:\\Dev-Cpp\\devcpp.exe");

    }
}
