package sh.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegularExpressionsTest {

    @Test
    public void Test() {

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void Test2() {
        String REGEX = "\\bcat\\b";
        String INPUT = "cat cat cat cattie cat";

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    }

    @Test
    public void Test3() {
        String REGEX = "foo";
        String INPUT = "fooooooooooooooooo";

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
    }

    @Test
    public void Test4() {
        String REGEX = "dog";
        String INPUT = "The dog says meow. " + "All dogs say meow.";
        String REPLACE = "cat";

        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }

    @Test
    public void Test5() {
        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoob";
        String REPLACE = "-";

        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

}
