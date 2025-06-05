# 06. 파일 입출력

Python에서는 `open()` 함수를 사용하여 파일을 읽고 쓸 수 있습니다.

```python
# 쓰기
with open("sample.txt", "w", encoding="utf-8") as f:
    f.write("파일에 문자열을 씁니다.")

# 읽기
with open("sample.txt", "r", encoding="utf-8") as f:
    content = f.read()
    print(content)
```
