package me.denley.preferencebinder.internal;

import java.lang.annotation.ElementType;

public class InitBinding implements Binding {
    private final String name;
    private final String type;
    private final ElementType elementType;

    public InitBinding(String name, String type, ElementType elementType) {
        this.name = name;
        this.type = type;
        this.elementType = elementType;
    }

    @Override public String getName(){
        return name;
    }

    @Override public String getType(){
        return type;
    }

    @Override public ElementType getBindingType(){
        return elementType;
    }

    @Override public String getDescription() {
        return "field '" + name + "'";
    }

}