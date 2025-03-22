import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    public static void workload(List<String> trueData, String inputFilePath, String outputFilePath) throws IOException {
        long memStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long timeStart = System.currentTimeMillis();

        App.checkSize(inputFilePath);
        List<String> outputData = App.read(inputFilePath);
        App.write(outputData, outputFilePath);
        assertEquals(trueData, outputData);

        long timeEnd = System.currentTimeMillis();
        long memEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long runtime = timeEnd - timeStart;
        String timeClass = " мс";
        if (runtime >= 1000) {
            runtime /= 1000;
            timeClass = " с";
        }

        long memResult = (memEnd - memStart) / 1024;
        String memClass = " КБ\n";
        if (memResult >= 1024) {
            memResult /= 1024;
            memClass = " МБ\n";
        }

        System.out.println(
                "\nВходные данные: " + inputFilePath
                + "\nВыходные данные: " + outputData
                + "\nОжидаемый результат: " + trueData
                + "\nВремя работы: " + runtime + timeClass
                + "\nИспользованная память: " + memResult + memClass
        );
    }

    @Test
    public void test01() throws IOException {
        List<String> trueData = List.of(
                "akjhfgdghshhfuushvdfs",
                "alkjghcdysdfgsr",
                "asdfghjjklvcvx",
                "pquytrgsdjdsa",
                "qpoiuytredgfhfd",
                "qwertyuiopasdffghhj"
        );
       AppTest.workload(
               trueData,
               "static/data/test01.txt",
               "static/results/test01.txt"
       );
    }

    @Test
    public void test02() throws IOException {
        List<String> trueData = List.of(
                "#8F9CtkzG!",
                "+ZvF1uX9b2PjQw@r",
                "dV9@K2yJQ5jWqLr",
                "vW2Jm*0g%#b7",
                "Y9XpQsG7!uRt2YhBd*L",
                "Zm3U2HsA1s"
        );
        AppTest.workload(
                trueData,
                "static/data/test02.txt",
                "static/results/test02.txt"
        );
    }

    @Test
    public void test03() throws IOException {
        List<String> trueData = List.of(
               "2oFhQyJ7LzL",
               "hV3sJkL5y9",
               "pMb!1cG",
               "t9dLq8W1*v0",
               "wRk8vZ3jD7",
               "Xqz@Fg7"
        );
        AppTest.workload(
                trueData,
                "static/data/test03.txt",
                "static/results/test03.txt"
        );
    }

    @Test
    public void test04() throws IOException {
        List<String> trueData = List.of(
                "#0Y9oB",
                "bW9X2g#p",
                "Q+vX0V8l2",
                "tE1mA7dN!U",
                "u5Rp2Xq0",
                "zG4jF5Ws"
        );
        AppTest.workload(
                trueData,
                "static/data/test04.txt",
                "static/results/test04.txt"
        );
    }

    @Test
    public void test05() throws IOException {
        List<String> trueData = List.of(
                "7dN3hX5z1o",
                "9bL!FwQ2",
                "t7kL4F9Q",
                "V+5mYjS0p",
                "Wq2c8ZpB",
                "X5k+z0j6"
        );
        AppTest.workload(
                trueData,
                "static/data/test05.txt",
                "static/results/test05.txt"
        );
    }

    @Test
    public void test06() throws IOException {
        List<String> trueData = List.of(
                "2qk9R6v",
                "h7nJ6kP2w",
                "tG5mF3L8",
                "X0QhJ7tF3P1",
                "z1Y9vT@0"
        );
        AppTest.workload(
                trueData,
                "static/data/test06.txt",
                "static/results/test06.txt"
        );
    }

    @Test
    public void test07() throws IOException {
        List<String> trueData = List.of(
                "hD6@z7r8",
                "lWzQ8vB2",
                "pVt5a4M",
                "T0bG!vX",
                "U7kP5j9z2",
                "Y3k1LqW9v"
        );
        AppTest.workload(
                trueData,
                "static/data/test07.txt",
                "static/results/test07.txt"
        );
    }

    @Test
    public void test08() throws IOException {
        List<String> trueData = List.of(
                "24ySD*9mcz2Vbk#",
                "8u9o1pi34jlk@&!#fds",
                "ab2345zxsdf!@3qwe",
                "abcde12345fghijklm6789nopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=~`<>?/:;,.|[]{}",
                "asdfghjklmnbvcxzqwertyuiop",
                "asdZK123!oIjLv5",
                "PQo92#ASxlfma9sd1jkwqZ",
                "xdQ23!D$rf^vGy8L",
                "zQy3vkj1sdlf+0JKz2lm"
        );
        AppTest.workload(
                trueData,
                "static/data/test08.txt",
                "static/results/test08.txt"
        );
    }

    @Test
    public void test09() throws IOException {
        List<String> trueData = List.of(
                "!wP5xT6g2R3fMbJ1!aQ5kC3NsX7hV1zE",
                "0WfY2X8oV5d3P7nJ6wL0rF1z!Qk4mTzK",
                "2TzL8kG0WfY2X8oV5d3P7nJ6wL0rF1z!",
                "3cB8V9pD2zW4hL5xY7tA0KjU2rF1oQ3J",
                "5jQW2m3oU0KpF7v!4h9dR6J1P2TzL8kG",
                "5xY7tA0KjU2rF1oQ3JV9dA8e0L7jZ4Qy",
                "6J1P2TzL8kG0WfY2X8oV5d3P7nJ6wL0r",
                "9p2B1hXJ5y3A8Lz2mVG6qz*H0nPzJ1!m",
                "9rX1bYz5jQW2m3oU0KpF7v!4h9dR6J1P",
                "D2zW4hL5xY7tA0KjU2rF1oQ3JV9dA8e0",
                "F1z!Qk4mTzK9p2B1hXJ5y3A8Lz2mVG6q",
                "fMbJ1!aQ5kC3NsX7hV1zEL6aT9rX1bYz",
                "G6qz*H0nPzJ1!m3cB8V9pD2zW4hL5xY7",
                "J5y3A8Lz2mVG6qz*H0nPzJ1!m3cB8V9p",
                "KjU2rF1oQ3J",
                "L6aT9rX1bYz5jQW2m3oU0KpF7v!4h9dR",
                "L7jZ4Qy!wP5xT6g2R3fMbJ1!aQ5kC3Ns",
                "nJ6wL0rF1z!Qk4mTzK9p2B1hXJ5y3A8L",
                "nPzJ1!m3cB8V9pD2zW4hL5xY7tA0KjU2",
                "oU0KpF7v!4h9dR6J1P2TzL8kG0WfY2X8",
                "oV5d3P7nJ6wL0rF1z!Qk4mTzK9p2B1hX",
                "Q5kC3NsX7hV1zEL6aT9rX1bYz5jQW2m3",
                "Qk4mTzK9p2B1hXJ5y3A8Lz2mVG6qz*H0",
                "rF1oQ3JV9dA8e0L7jZ4Qy!wP5xT6g2R3",
                "tA0KjU2rF1oQ3JV9dA8e0L7jZ4Qy!wP5",
                "v!4h9dR6J1P2TzL8kG0WfY2X8oV5d3P7",
                "V9dA8e0L7jZ4Qy!wP5xT6g2R3fMbJ1!a",
                "X7hV1zEL6aT9rX1bYz5jQW2m3oU0KpF7",
                "xT6g2R3fMbJ1!aQ5kC3NsX7hV1zEL6aT",
                "z*H0nPzJ1!m3cB8V9pD2zW4hL5xY7tA0",
                "z2mVG6qz*H0nPzJ1!m3cB8V9pD2zW4hL"
        );
        AppTest.workload(
                trueData,
                "static/data/test09.txt",
                "static/results/test09.txt"
        );
    }

    @Test
    public void test10() throws IOException {
        List<String> trueData = List.of("");
        AppTest.workload(
                trueData,
                "static/data/test10.txt",
                "static/results/test10.txt"
        );
    }
}

