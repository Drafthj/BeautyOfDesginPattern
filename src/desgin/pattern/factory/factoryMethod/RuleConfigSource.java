package desgin.pattern.factory.factoryMethod;

import desgin.pattern.factory.simpleFactory.IRuleConfigParser;
import desgin.pattern.factory.simpleFactory.InvalidRuleConfigException;
import desgin.pattern.factory.simpleFactory.RuleConfig;
import desgin.pattern.factory.simpleFactory.RuleConfigParserFactory;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/8/3
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory factory = RuleConfigParserFactoryMap.get(ruleConfigFileExtension);
        if (factory == null) {
            throw new InvalidRuleConfigException( "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        RuleConfig ruleConfig = factory.createParser().parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
    //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
