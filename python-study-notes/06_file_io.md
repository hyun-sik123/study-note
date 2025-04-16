# 06. 파일 입출력 (심화)

## CSV 파일 처리

```python
import csv
with open("data.csv", newline='') as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)
```

## 실습 문제

**문제**: 문자열 여러 줄을 파일에 쓰고 다시 읽어보세요.

```python
lines = ["Python", "is", "awesome"]

with open("output.txt", "w", encoding="utf-8") as f:
    for line in lines:
        f.write(line + "\n")

with open("output.txt", "r", encoding="utf-8") as f:
    print(f.read())
```
