package com.qf.dto;

import com.qf.entity.Booktype;
import com.qf.entity.Cookbook;
import com.qf.entity.Material;
import com.qf.entity.Step;

import java.util.List;

public class CookbookDTO extends Cookbook {

    List<Step> method;
    List<Material> material;
    List<Booktype> types;

    public List<Booktype> getTypes() {
        return types;
    }

    public void setTypes(List<Booktype> types) {
        this.types = types;
    }

    public List<Step> getMethod() {
        return method;
    }

    public void setMethod(List<Step> method) {
        this.method = method;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
    }
}
