import deob.ObfuscatedName;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ObfuscatedName("aek")
public class ReflectionCheckNode extends Node {

    @ObfuscatedName("aek.s")
    public int id;

    @ObfuscatedName("aek.c")
    public int size;

    @ObfuscatedName("aek.m")
    public byte[][][] methodArguments;

    @ObfuscatedName("aek.t")
    public int[] types;

    @ObfuscatedName("aek.l")
    public int[] errors;

    @ObfuscatedName("aek.f")
    public int[] fieldValues;

    @ObfuscatedName("aek.d")
    public Field[] fieldRequests;

    @ObfuscatedName("aek.z")
    public Method[] methodRequests;
}
