package Lesson14;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    // 共有オブジェクトを保存するマップ（キー：形状名-色）
    private static final Map<String, ShapeType> shapeMap = new HashMap<>();

    // 共有オブジェクトを取得（なければ作成）
    public static ShapeType getShape(String shapeName, String color) {
        String key = shapeName + "-" + color;

        if (!shapeMap.containsKey(key)) {
            // 新しい図形タイプを作って登録
            shapeMap.put(key, new ShapeType(shapeName, color));
        }

        // 共有オブジェクトを返す
        return shapeMap.get(key);
    }
}