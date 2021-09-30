package io.github.onograph;

import static io.github.onograph.TokenConstants.I18N_RESOURCE_BUNDLE_DEF_OVERRIDE;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.slf4j.helpers.MessageFormatter;

public class I18N {

  public static final Map<String, String> messageMap = new HashMap<>();

  public static void buildMessageMap() {

    try {
      String msgTxt = FileUtils.readFileToString(new File(I18N_RESOURCE_BUNDLE_DEF_OVERRIDE));
      Arrays.stream(msgTxt.split("\n")).forEach(line ->
      {
        int splitIndex = line.indexOf("=");
        String firstPart = line.substring(0, splitIndex);
        String secondPart = line.substring(splitIndex + 1, line.length());
        if (secondPart.charAt(0) == '"') {
          secondPart = secondPart.substring(1);
        }
        if (secondPart.charAt(secondPart.length() - 1) == '"') {
          secondPart = secondPart.substring(0, secondPart.length() - 1);
        }

        messageMap.put(firstPart, secondPart);
      });
    } catch (Exception e) {
      System.out.println(" I18N : EXCEPTION buildMessageMap() : " + e.getMessage());
    }
  }

  public static String format(String key, Object... args) {
    try {

      String messagePattern = getMessageMap().get(key);

      if (messagePattern == null) {

        return "MISSING VAL FOR KEY:" + key;
      }
      String ret = MessageFormatter.arrayFormat(messagePattern, args).getMessage();

      return ret;
    } catch (Exception e) {
      System.out.println(
          " I18N : Exception formatting message for key: " + key + ". Error:  " + e.getMessage());
    }
    return "MISSING VAL FOR KEY: " + key;
  }

  public static String format(String key) {
    String messagePattern = getMessageMap().get(key);
    if (messagePattern != null) {
      return messagePattern;
    }

    return "";
  }

  public static Map<String, String> getMessageMap() {
    if (messageMap.size() == 0) {
      buildMessageMap();
    }
    return messageMap;
  }
}
