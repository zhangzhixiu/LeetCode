/**
 *
 */
package com.github.zhangzhixiu.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhangzhixiu
 *
 */
public class LRUCache {

  private final Map<Integer, Integer> cache;

  @SuppressWarnings("serial")
  public LRUCache(int capacity) {
    final int c = capacity;
    cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        if (size() > c) {
          System.out.println("to remove:" + eldest.getKey() + ":" + eldest.getValue());
        }
        return size() > c;
      }
    };
  }

  public int get(int key) {
    Integer result = cache.get(key);
    return result == null ? -1 : result;
  }

  public void set(int key, int value) {
    cache.put(key, value);
  }

  void clear() {
    cache.clear();
  }
}
