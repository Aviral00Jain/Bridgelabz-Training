package com.ambulanceroute;

class AmbulanceRoute {

    private HospitalUnit head = null;
    private HospitalUnit current = null;
    
    
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
    }
    
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        if (current == null)
            current = head;

        HospitalUnit start = current;

        do {
            if (current.available) {
                System.out.println("Redirect patient to " + current.name);
                return;
            }
            current = current.next;
        } while (current != start);

        System.out.println("No available units at the moment");
    }
    
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        
        do {
            if (curr.name.equals(unitName)) {

                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                if (curr == head) {
                    HospitalUnit temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed ");
                return;
            }
            
            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

}

