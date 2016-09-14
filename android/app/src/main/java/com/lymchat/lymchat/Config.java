package com.lymchat.lymchat;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tienson on 9/7/16.
 */
public class Config extends ReactContextBaseJavaModule {

    private static final String APP_KEY = "a8ea37078c9210e9869c5165e650f498";
    private static final String APP_SECRET = "b4cd7c49a295e713ed7d3690e6783086";
    private static final String GOOGLE_SIGN_CLIENT_ID = "71389590330-eqm8f8vl8kc2qmvjigjo7gmhsiqbi9pn.apps.googleusercontent.com";
    private static final String WECHAT_ID = "wx03afacf52c7da262";
    private static final String WECHAT_SECRET = "660bce6b45d58e032ccb4faba25aa10e";

    public Config(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Config";
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("app_key", APP_KEY);
        constants.put("app_secret", APP_SECRET);
        constants.put("google_signin_client_id", GOOGLE_SIGN_CLIENT_ID);
        constants.put("wechat_id", WECHAT_ID);
        constants.put("wechat_secret", WECHAT_SECRET);
        return constants;
    }
}
