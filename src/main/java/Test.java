import com.alibaba.fastjson.JSONObject;

public class Test {
    public static void main(String[] args) {
        JSONObject o = new JSONObject();
        o.put("name", "jack");
        o.put("sex", null);
        o.put("aa", null);
        System.out.println(JSONObject.toJSONString(o));
        if(o == null) System.out.println(123);
        while(true) {

        }
    }
}
