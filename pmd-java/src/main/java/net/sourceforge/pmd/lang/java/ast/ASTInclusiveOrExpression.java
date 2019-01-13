/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTInclusiveOrExpression.java */

package net.sourceforge.pmd.lang.java.ast;

/**
 * Represents a non-shortcut boolean OR-expression. This has a precedence
 * greater than {@link ASTConditionalAndExpression}, and lower than
 * {@link ASTExclusiveOrExpression}.
 *
 * <p>Note that the children of this node are not necessarily {@link ASTExclusiveOrExpression},
 * rather, they are expressions with an operator precedence greater or equal to ExclusiveOrExpression.
 *
 *
 * <pre>
 *
 * InclusiveOrExpression ::=  {@linkplain ASTExclusiveOrExpression ExclusiveOrExpression} ( "|" {@linkplain ASTExclusiveOrExpression ExclusiveOrExpression} )+
 *
 * </pre>
 */
public class ASTInclusiveOrExpression extends AbstractJavaTypeNode {
    public ASTInclusiveOrExpression(int id) {
        super(id);
    }


    public ASTInclusiveOrExpression(JavaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }


    @Override
    public <T> void jjtAccept(SideEffectingVisitor<T> visitor, T data) {
        visitor.visit(this, data);
    }
}