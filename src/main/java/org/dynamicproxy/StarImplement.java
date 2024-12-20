package org.dynamicproxy;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class StarImplement implements Map,Star{
    String name;
    public StarImplement(String name){
        this.name=name;
    }

    @Override
    public void sing() {
        System.out.println(name + " is sing");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing");
    }

    @Override
    public void rap() {
        System.out.println(name + " is rapping");
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
