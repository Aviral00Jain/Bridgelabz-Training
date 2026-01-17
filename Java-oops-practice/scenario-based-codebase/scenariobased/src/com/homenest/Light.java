	
package com.homenest;
class Light extends Device {

    public Light(String id) {
        super(id, 0.06);
    }

    @Override
    public void reset() {
        System.out.println("Light reset: brightness set to default");
    }
}
