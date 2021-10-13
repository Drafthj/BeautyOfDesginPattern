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
public class AliyunImageStore implements ImageStore{
    @Override
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        String accessToken = generateAccessToken();
        //...上传图片到阿里云...
        //...返回图片在阿里云上的地址(url)
        return null;
    }

    @Override
    public Image download(String url) {
        String accessToken = generateAccessToken();
        //...从阿里云下载图片
        return null;
    }

    public String generateAccessToken() {
        //...根据accessKey/secretKey等生成access token
        return "";
    }
    //...省略属性、构造函数等等
    public void createBucketIfNotExisting(String bucketName) {
        //...创建bucket代码逻辑
        //...失败会抛出异常
    }
}
