package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.io.IOException;
import java.util.List;

public class TestFunctions {

    @Test
    public void testVisibilities() throws IOException {
        var functions = getFunctions("parser/function_visibilities.lazo");

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(0)),
                "getName", 0, 0, 1, "String");

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(1)),
                "getInternalValue", 0, 0, 1, "int");
    }

    @Test
    public void testReturnTypes() throws IOException {
        var functions = getFunctions("parser/function_return_types.lazo");

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(0)),
                "returnNothing", 0, 0, 1,
                "void"
        );

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(1)),
                "returnSingle", 0, 0, 2,
                "String"
        );

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(2)),
                "returnMultiple", 0, 0, 2,
                "int", "char", "String"
        );
    }

    @Test
    public void testParameters() throws IOException {
        var functions = getFunctions("parser/function_parameters.lazo");

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(0)),
                "params", 2, 0, 2,
                "void"
        );

        var params = new String[][]{
                {"int", "i", null},
                {"String", "s", null}
        };
        NodeUtil.assertParameters(
                getFunction(functions.get(0)).functionHead().paramList(), params);
    }

    @Test
    public void testDefaultParameters() throws IOException {
        var functions = getFunctions("parser/function_parameters.lazo");

        NodeUtil.assertFunctionDeclaration(
                getFunction(functions.get(1)),
                "defaultValue", 2, 0, 1,
                "void"
        );

        var params = new String[][]{
                {"int", "i", null},
                {"String", "s", "\"default\""}
        };
        NodeUtil.assertParameters(
                getFunction(functions.get(1)).functionHead().paramList(), params);
    }

    private List<LazoParser.ContractPartContext> getFunctions(String path) throws IOException {
        return ParserUtil.getProgramFromFile(path)
                .contractDeclaration()
                .contractPart();
    }

    private LazoParser.FunctionDeclarationContext getFunction(LazoParser.ContractPartContext contractPart) {
        return contractPart.getChild(LazoParser.FunctionDeclarationContext.class, 0);
    }
}
