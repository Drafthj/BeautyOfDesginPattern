package InterfaceBasedProgram.good;

import InterfaceBasedProgram.Image;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/10
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface ImageStore {
    String upload(Image image, String bucketName);
    Image download(String url);
}
