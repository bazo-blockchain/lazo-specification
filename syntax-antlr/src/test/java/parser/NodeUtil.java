package parser;

import bazolang.LazoParser;
import org.junit.Assert;

public class NodeUtil {
    public static void assertVersion(LazoParser.VersionDirectiveContext versionNode, int major, int minor) {
        Assert.assertEquals(String.valueOf(major), versionNode.INTEGER(0).getText());
        Assert.assertEquals(String.valueOf(minor), versionNode.INTEGER(1).getText());
    }
}
