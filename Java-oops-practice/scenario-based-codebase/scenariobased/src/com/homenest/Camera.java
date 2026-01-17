
package com.homenest;
class Camera extends Device {

    public Camera(String id) {
        super(id, 0.15);
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: motion detection recalibrated");
    }
}