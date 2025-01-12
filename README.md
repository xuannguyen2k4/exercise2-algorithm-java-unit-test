# BÀI TẬP 2: KIỂM THỬ NÂNG CAO VỚI THUẬT TOÁN BẤT KÌ BẰNG JAVA
## Lớp Algorithm để tìm phần tử lớn thứ hai trong mảng số nguyên
```java
public class Algorithms {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must have at least two distinct elements");
        }
        return second;
    }
}

```

## Lớp kiểm thử cho Algorithm
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlgorithmsTest {

    @Test
    public void testFindSecondLargest_ValidInput() {
        assertEquals(5, Algorithms.findSecondLargest(new int[]{1, 5, 3, 6}));
        assertEquals(4, Algorithms.findSecondLargest(new int[]{4, 6, 4, 3}));
    }

    @Test
    public void testFindSecondLargest_SingleElementArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(new int[]{1})
        );
        assertEquals("Array must have at least two elements", exception.getMessage());
    }

    @Test
    public void testFindSecondLargest_AllEqualElements() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(new int[]{5, 5, 5})
        );
        assertEquals("Array must have at least two distinct elements", exception.getMessage());
    }
    @Test
    public void testFindSecondLargest_NullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(null)
        );
        assertEquals("Array must have at least two elements", exception.getMessage());
    }

    @Test
    public void testFindSecondLargest_AllSameElements() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(new int[]{5, 5, 5, 5})
        );
        assertEquals("Array must have at least two distinct elements", exception.getMessage());
    }

    @Test
    public void testFindSecondLargest_ValidInputWithNegativeNumbers() {
        assertEquals(-2, Algorithms.findSecondLargest(new int[]{-1, -2, -3, -4}));
    }

}

```
## Hình ảnh minh họa
![image](https://github.com/user-attachments/assets/ce94d5d4-5bde-4561-a931-ee54bea6204c)

### Đo mức độ bao phủ kiểm thử (test coverage) bằng Jacoco
![image](https://github.com/user-attachments/assets/224aa63a-098f-46c7-ba1f-20c133b9f109)

## Nguồn tham khảo
https://chatgpt.com/share/6783348b-08a0-800a-9fe4-214cb5241408

## Author
[Nguyễn Thị Xuân - BIT220184]
