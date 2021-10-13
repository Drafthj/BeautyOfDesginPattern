package InterfaceSegregationPrinciple.group;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/24
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface RestrictedUserService {
    boolean deleteUserByCellPhone(String cellphone);
    boolean deleteUserById(long id);
}
