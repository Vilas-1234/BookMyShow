package AssignmentQ13;

import practical.System;

public class Duplicate {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1, 4, 3, 7};

            int duplicateCount = 0;
            int uniqueCount = 0;

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) {
                    duplicateCount++;
                } else {
                    uniqueCount++;
                }
            }

            System.out.println("Number of duplicates: " + duplicateCount);
            System.out.println("Number of unique elements: " + uniqueCount);
        }
    }


