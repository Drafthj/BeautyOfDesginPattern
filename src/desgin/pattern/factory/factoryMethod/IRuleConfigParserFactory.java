package desgin.pattern.factory.factoryMethod;

import desgin.pattern.factory.simpleFactory.IRuleConfigParser;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/8/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
