package behavioral_patterns.visitor.visitor;

import behavioral_patterns.visitor.shapes.*;

/**
 * 通用访问者接口
 */
public interface Visitor {

    String export(Shape... args);

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}