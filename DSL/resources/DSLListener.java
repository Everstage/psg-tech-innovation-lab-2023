// Generated from DSL.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DSLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DSLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DSLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DSLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(DSLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(DSLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mod}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(DSLParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(DSLParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(DSLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(DSLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(DSLParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(DSLParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAdd}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAdd(DSLParser.UnaryAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAdd}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAdd(DSLParser.UnaryAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argNum}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArgNum(DSLParser.ArgNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argNum}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArgNum(DSLParser.ArgNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nested}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNested(DSLParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNested(DSLParser.NestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argVar}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArgVar(DSLParser.ArgVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argVar}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArgVar(DSLParser.ArgVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DSLParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DSLParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(DSLParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(DSLParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(DSLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(DSLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DSLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DSLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterOR(DSLParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitOR(DSLParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterAND(DSLParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitAND(DSLParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LT}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterLT(DSLParser.LTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitLT(DSLParser.LTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GTE}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterGTE(DSLParser.GTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GTE}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitGTE(DSLParser.GTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEQ}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterNEQ(DSLParser.NEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEQ}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitNEQ(DSLParser.NEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LTE}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterLTE(DSLParser.LTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LTE}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitLTE(DSLParser.LTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterEQ(DSLParser.EQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitEQ(DSLParser.EQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GT}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterGT(DSLParser.GTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link DSLParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitGT(DSLParser.GTContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(DSLParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(DSLParser.IfExprContext ctx);
}