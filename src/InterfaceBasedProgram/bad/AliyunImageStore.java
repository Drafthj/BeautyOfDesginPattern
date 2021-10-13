package InterfaceBasedProgram.bad;

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
public class AliyunImageStore {
    //...省略属性、构造函数等等
    public void createBucketIfNotExisting(String bucketName) {
        //...创建bucket代码逻辑
        //...失败会抛出异常
    }

    public String generateAccessToken() {
        //...根据accessKey/secretKey等生成access token
        return "";
    }

    public String uploadToAliyun(Image image, String bucketName, String accessToken) {
        //...上传图片到阿里云
        //...返回图片存储在阿里云上的地址（url）...
        return "";
    }

    public Image downloadFromAliyun(String url, String accessToken) {
        //...从阿里云下载图片
        return null;
    }

    public class ImageProcessingJob {
        private static final String BUCKET_NAME = "ai_images_bucket";

        public void process() {
            Image image = new Image(); //处理图片
            AliyunImageStore imageStore = new AliyunImageStore();
            imageStore.createBucketIfNotExisting(BUCKET_NAME);
            String accessToken = imageStore.generateAccessToken();
            imageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
        }
    }
}
