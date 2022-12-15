package pr10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortingStudentsByGPA implements Comparator<student> {
    @Override
    public int compare(student s1, student s2) {
        return s1.getScore() - s2.getScore();
    }
    public ArrayList<student> s = new ArrayList<student>();
    public void quicksort(int low, int high)
    {
        if (s.size() == 0) return;

        if (low >= high) return;
        student pivot = s.get(low + (high - low) / 2);
        int i = low, j = high;
        while (i <= j)
        {
            while (compare(s.get(i), pivot) > 0) {
                i++;
            }

            while (compare(s.get(j), pivot) < 0) {
                j--;
            }

            if (i <= j) {
                student temp = s.get(i);
                s.set(i, s.get(j));
                s.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);

        if (high > i)
            quicksort(i, high);
    }

    public void arraySet(int n) {
        for (int i = 0; i < n; i++)
        {
            student student = new student();
            s.add(student);
        }
    }

    public void arrayOut() {
        for (int i = 0; i < s.size(); i++)
        {
            System.out.println("id: " + s.get(i).getId() + ", score: " + s.get(i).getScore());
        }
    }
    public void merge(int left, int right)
    {
        int i = left;
        int idx = 0; // индекс res
        int middle = left + (right - left) / 2;
        int j = middle + 1;
        student[] res = new student[right-left + 1];
        while (i <= middle && j <= right) {
            if (s.get(i).getId() <= s.get(j).getId()) {
                res[idx] = s.get(i);
                i++;
            }
            else {
                res[idx] = s.get(j);
                j++;
            }
            idx++;
        }

        while (i <= middle) {
            res[idx] = s.get(i);
            i++;
            idx++;
        }
        while (j <= right) {
            res[idx] = s.get(j);
            j++;
            idx++;
        }
        for (i = 0; i < idx; i++) {
            if (s.get(left + i) != res[i]) {
                s.set((left + i), res[i]);
            }
        }
    }

    public void mergesort(int left, int right)
    {
        if (left < right) {
            mergesort(left, left + (right - left) / 2);
            mergesort(left + (right - left) / 2 + 1, right);
            merge(left, right);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.arraySet(n);
        sort.arrayOut();
        sort.quicksort(0,n-1);
        System.out.println("Quick sort with score");
        sort.arrayOut();
        System.out.println("Merge sort with id");
        sort.mergesort(0, n-1);
        sort.arrayOut();
    }
}

