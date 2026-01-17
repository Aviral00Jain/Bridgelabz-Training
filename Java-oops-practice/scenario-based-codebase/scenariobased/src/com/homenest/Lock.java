
package com.homenest;
class Lock extends Device {

    public Lock(String id) {
        super(id, 0.02);
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: security keys refreshed");
    }
}
