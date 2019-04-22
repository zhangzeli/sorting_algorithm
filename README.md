# 排序算法  

![常见的排序算法列表](https://github.com/zhangzeli/sorting_algorithm/blob/master/src/main/resources/sorts.jpg)

## 选择排序
>[SelectionSort](https://github.com/zhangzeli/sorting_algorithm/tree/master/src/main/java/com/zzl/SelectionSort.java)
>> 不常用

## 冒泡排序

>[BubbleSort](https://github.com/zhangzeli/sorting_algorithm/tree/master/src/main/java/com/zzl/BubbleSort.java)  

>1.如果我们的数据正序，只需要走一趟即可完成排序。所需的比较次数C和记录移动次数M均达到最小值，即：Cmin=n-1;Mmin=0;所以，冒泡排序最好的时间复杂度为O(n)。  

>2.如果很不幸我们的数据是反序的，则需要进行n-1趟排序。每趟排序要进行n-i次比较(1≤i≤n-1)，且每次比较都必须移动记录三次来达到交换记录位置。在这种情况下，比较和移动次数均达到最大值:  

![常见的排序算法列表](https://github.com/zhangzeli/sorting_algorithm/blob/master/src/main/resources/bubblesort.jpg)

###算法描述
```aidl
冒泡排序的优点：每进行一趟排序，就会少比较一次，因为每进行一趟排序都会找出一个较大值。如上例：第一趟比较之后，排在最后的
一个数一定是最大的一个数，第二趟排序的时候，只需要比较除了最后一个数以外的其他的数，同样也能找出一个最大的数排在参与第二
趟比较的数后面，第三趟比较的时候，只需要比较除了最后两个数以外的其他的数，以此类推……也就是说，没进行一趟比较，每一趟少
比较一次，一定程度上减少了算法的量
```

## 插入排序

>[InsertionSort](https://github.com/zhangzeli/sorting_algorithm/tree/master/src/main/java/com/zzl/InsertionSort.java) 

>样本小且基本有序的时候效率比较高
###算法描述
```aidl
假定n是数组的长度，
首先假设第一个元素被放置在正确的位置上，这样仅需从1-n-1范围内对剩余元素进行排序。对于每次遍历，从0-i-1范围内的元素已经被排好序，
每次遍历的任务是：通过扫描前面已排序的子列表，将位置i处的元素定位到从0到i的子列表之内的正确的位置上。
将arr[i]复制为一个名为target的临时元素。
向下扫描列表，比较这个目标值target与arr[i-1]、arr[i-2]的大小，依次类推。
这个比较过程在小于或等于目标值的第一个元素(arr[j])处停止，或者在列表开始处停止（j=0）。
在arr[i]小于前面任何已排序元素时，后一个条件（j=0）为真，
因此，这个元素会占用新排序子列表的第一个位置。
在扫描期间，大于目标值target的每个元素都会向右滑动一个位置（arr[j]=arr[j-1]）。
一旦确定了正确位置j，
目标值target（即原始的arr[i]）就会被复制到这个位置。
与选择排序不同的是，插入排序将数据向右滑动，并且不会执行交换
```
###效率分析
```
稳定 
空间复杂度O(1) 
时间复杂度O(n2) 
最差情况：反序，需要移动n*(n-1)/2个元素 
最好情况：正序，不需要移动元素
数组在已排序或者是“近似排序”时，插入排序效率的最好情况运行时间为O(n)；
插入排序最坏情况运行时间和平均情况运行时间都为O(n2)。
通常，插入排序呈现出二次排序算法中的最佳性能。
对于具有较少元素（如n<=15）的列表来说，二次算法十分有效。
```

## 堆排序

## 希尔排序

## 归并排序


## 快速排序
```aidl

```

## 桶排序

### 计数排序
>算法思想 
>>某大型企业数万员工年龄排序  
>>如何快速得知高考名词

## 基数排序

