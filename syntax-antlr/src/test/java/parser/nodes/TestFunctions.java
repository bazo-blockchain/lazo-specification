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
