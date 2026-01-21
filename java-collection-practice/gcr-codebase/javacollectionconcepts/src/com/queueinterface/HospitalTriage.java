package com.queueinterface;
import java.util.*;
//Create HospitalTriage to simulate a hospital triage system using PriorityQueue
public class HospitalTriage {
    //patient class with name and severity
    static class Patient {
        String name;
        int severity;
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
        @Override
        public String toString() {
            return name + "(" + severity + ")";
        }
    }

    public static void main(String[] args) {

        //create a PriorityQueue with custom comparator
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );
        //add patients to the queue
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        //  Treat patients based on severity
        
        System.out.println("treatment order:");
        while (!pq.isEmpty()) {
            Patient patient = pq.remove();
            System.out.println(patient.name);
        }
    }
}