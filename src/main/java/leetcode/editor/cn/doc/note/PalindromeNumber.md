#### 方案一：使用StringBuilderApi
int x先转为StringBuilder类型，利用reverse()获取翻转字符串，比较翻转前后字符串是否一致

```text
解答成功:
	执行耗时:7 ms,击败了23.37% 的Java用户
	内存消耗:41 MB,击败了43.88% 的Java用户
```
#### 方案二：先转为String，左右遍历比较
```text
解答成功:
	执行耗时:6 ms,击败了41.02% 的Java用户
	内存消耗:40.8 MB,击败了58.15% 的Java用户
```