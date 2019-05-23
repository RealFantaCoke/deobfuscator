package com.javadeobfuscator.deobfuscator.executor.defined.types;

public class JavaFieldHandle extends JavaHandle {
    public final String clazz;
    public final String name;
    public final String desc;
    public final String type;
    public final boolean isGetter;

    public JavaFieldHandle(String clazz, String name, String desc, String type, boolean isGetter) {
        this.clazz = clazz;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.isGetter = isGetter;
    }
}
