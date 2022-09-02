package first;

import java.util.HashMap;
import org.json.JSONObject;
import com.baidu.aip.imageclassify.AipImageClassify;

public class ImageRecognition {
	//设置APPID/AK/SK
    public static final String APP_ID = "25053493";
    public static final String API_KEY = "pMwi9YY1kI6AgrSrsla7bwbx";
    public static final String SECRET_KEY = "Fj4NHRM6Is63bmsZTGinKFnsPUAeGxo1";

    public static void main(String[] args) {
        //初始化
        AipImageClassify aic = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        //图片路径作为参数，此处使用相对路径，相对于项目根目录而言，即cat.jpg放在项目根目录下
        String path = "cat.jpg";
        //返回JSON格式的数据
        JSONObject res = aic.advancedGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
    }

}

