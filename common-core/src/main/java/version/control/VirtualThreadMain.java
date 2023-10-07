package version.control;

import com.java.version.v21.VirtualThreadService;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VirtualThreadMain {
    public static void main(String[] args) {
        VirtualThreadService virtualThreadService=new VirtualThreadService();
        virtualThreadService.method1();
    }
}
