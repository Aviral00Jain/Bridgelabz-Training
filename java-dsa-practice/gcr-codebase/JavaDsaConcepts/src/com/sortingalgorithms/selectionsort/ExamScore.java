package com.sortingalgorithms.selectionsort;

public class ExamScore {


        static void selectionSort(int[] scores) {

            int n = scores.length;

            for (int i = 0; i < n - 1; i++) {

                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (scores[j] < scores[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = scores[minIndex];
                scores[minIndex] = scores[i];
                scores[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] examScores = {78, 45, 90, 62, 88};

            selectionSort(examScores);

            System.out.println("Sorted Exam Scores:");
            for (int score : examScores) {
                System.out.print(score + " ");
            }
        }
    }

