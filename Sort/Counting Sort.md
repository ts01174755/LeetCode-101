### Counting Sort 

此算法透過先計算每個數的統計信息，再依照統計信息進行排序處理，真是直觀但有效的做法。

```
void counting_sort()
{
    int array[5] = {3, 6, 9, 9, 1};
    int c[9 + 1] = {};
 
    // 統計數字數量
    for (int i=0; i<5; i++)
        c[array[i]]++;
 
    // 由小到大讀取lookup table，順便排序數字。
    for (int j=0, i=0; j<10 && i<5; j++)
        while (c[j] > 0)
        {
            c[j]--;
            array[i++] = j;
        }
}
```

