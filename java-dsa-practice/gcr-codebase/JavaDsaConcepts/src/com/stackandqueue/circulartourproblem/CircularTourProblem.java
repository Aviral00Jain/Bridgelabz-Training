package com.stackandqueue.circulartourproblem;

public class CircularTourProblem {

    //petrol Pump class
    static class PetrolPump {

        int petrol;
        int distance;
        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    //find starting pump index
    public static int findStartingPump(PetrolPump[] pumps) {

        int n = pumps.length;
        int totalPetrol = 0; // total petrol - total distance
        int currPetrol = 0;  //c urrent petrol in tank
        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int petrol = pumps[i].petrol;
            int distance = pumps[i].distance;
            totalPetrol += petrol - distance;
            currPetrol += petrol - distance;
            // if current petrol is negative, reset start index
            if (currPetrol < 0) {
                startIndex = i + 1;
                currPetrol = 0;
            }
        }
        // if total petrol is less than total distance, tour not possible
        if (totalPetrol < 0) {
            return -1;
        }

        return startIndex;
    }

    // main method (Test)
    public static void main(String[] args) {

        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };
        int start = findStartingPump(pumps);
        if (start != -1) {
            System.out.println("Start at petrol pump index: " + start);
        } else {
            System.out.println("No possible circular tour");
        }

    }
}