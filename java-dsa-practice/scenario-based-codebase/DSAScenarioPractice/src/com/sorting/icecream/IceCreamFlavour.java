package com.sorting.icecream;

class IceCreamFlavor {
    String name;
    int salesCount;

    public IceCreamFlavor(String name, int salesCount) {
        this.name = name;
        this.salesCount = salesCount;
    }

    
    public String toString() {
        return name + "  Sold: " + salesCount;
    }
}
