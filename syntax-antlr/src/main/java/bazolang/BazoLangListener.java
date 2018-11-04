// Generated from BazoLang.g4 by ANTLR 4.7.1

    package bazolang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BazoLangParser}.
 */
public interface BazoLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BazoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BazoLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BazoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BazoLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BazoLangParser#versionDirective}.
	 * @param ctx the parse tree
	 */
	void enterVersionDirective(BazoLangParser.VersionDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BazoLangParser#versionDirective}.
	 * @param ctx the parse tree
	 */
	void exitVersionDirective(BazoLangParser.VersionDirectiveContext ctx);
}