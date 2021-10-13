package desgin.pattern.factory.factoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/8/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactoryMap = new HashMap<>();
    static {
        cachedFactoryMap.put("json", new JsonRuleConfigParserFactory());
        cachedFactoryMap.put("properties", new PropertiesRuleConfigParserFactory());
        cachedFactoryMap.put("xml", new XmlRuleConfigParserFactory());
        cachedFactoryMap.put("yaml", new YamlRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory get(String type) {
        return cachedFactoryMap.get(type);
    }
}
